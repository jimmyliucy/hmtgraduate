package com.hmt.graduate.paper.shiro;

import com.hmt.graduate.paper.pojo.Permission;
import com.hmt.graduate.paper.pojo.Role;
import com.hmt.graduate.paper.pojo.User;
import com.hmt.graduate.paper.service.AuthService;
import com.hmt.graduate.paper.service.UserServiceImpl;
import com.hmt.graduate.paper.utils.ParamProperties;
import com.hmt.graduate.paper.utils.RedisUtil;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hmt.graduate.paper.dao.UserMapper;
import java.util.List;

@Service
public class ShiroRealm extends AuthorizingRealm {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private AuthService authService;
	@Autowired
	private RedisUtil redisUtil;
	@Autowired
	private ParamProperties paramProperties;

	/**
	 * 授予角色和权限，使用redis缓存
	 */
	//@Cacheable(value = "catCache", key = "#root.caches[0].name + ':' + #id")，只能用于public方法
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principalCollection) {
		// 1，授权
		logger.debug("授予角色和权限");
		// 2，添加权限 角色 和 用户信息
		// Simple POJO implementation of the AuthorizationInfo interface that stores roles and permissions as internal attributes.
		SimpleAuthorizationInfo authorizationInfo = null;
		// 3，获取当前登陆用户
		Subject subject = SecurityUtils.getSubject();
		// 4,获取身份，即主体的标识属性，可以是任何东西
		User user = (User) subject.getPrincipal();
		Integer userId = user.getId();
		// 5，在Redis缓存中是否存在或已登录
		String redisCachePrefix=paramProperties.getShiroRedisCachePrefix();
		authorizationInfo = (SimpleAuthorizationInfo) redisUtil.get(redisCachePrefix+userId);
		logger.debug("---- redis缓存中userId:{}获取到的权限----authorizationInfo:{}",userId,authorizationInfo);
		if(authorizationInfo==null){
			logger.debug("---- userId:{}没有缓存 ----",userId);
			authorizationInfo=new SimpleAuthorizationInfo();
			// 1，如果缓存没有的话
			List<Role> roles = this.authService.getRoleByUser(userId);
				if (null != roles && roles.size() > 0) {
					for (Role role : roles) {
						// Adds (assigns) a role to those associated with the account.
						authorizationInfo.addRole(role.getCode());
						// 查找角色对应的权限数据
						List<Permission> perms = this.authService.findPermsByRoleId(role
								.getId());
						if (null != perms && perms.size() > 0) {
							// 授权角色下所有权限
							for (Permission perm : perms) {
								authorizationInfo.addStringPermission(perm
										.getCode());
							}
						}
					}
				}
			// 2 放入缓存
			redisUtil.set(redisCachePrefix+userId,authorizationInfo,paramProperties.getDefaultExpiration());
		}
		logger.info("---- user:{}获取到以下权限 ----",user);
		logger.info(authorizationInfo.getStringPermissions().toString());
		logger.info("---------------- Shiro 权限获取成功 ----------------------");
		return authorizationInfo;
	}

	/**
	 * 登录认证--令牌登陆
	 * @param authenticationToken
	 * @return AuthenticationInfo
	 * @throws AuthenticationException
	 */
	@Override
	public AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authenticationToken)
			throws AuthenticationException {
		//UsernamePasswordToken用于存放提交的登录信息--令牌（用户名+密码）
		UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
		logger.info("用户登录认证：验证当前Subject时获取到token为：" + ReflectionToStringBuilder
				.toString(token, ToStringStyle.MULTI_LINE_STYLE));
		String mobile = token.getUsername();
		// 调用数据层
		User user = userMapper.findUserByMobile(mobile);

		logger.debug("用户登录认证！用户信息user：" + user);
		if (user == null) {
			// 用户不存在
			return null;
		} else {
			// 密码存在
			// 第一个参数 ，登陆后，需要在session保存数据
			// 第二个参数，查询到密码(加密规则要和自定义的HashedCredentialsMatcher中的HashAlgorithmName散列算法一致)
			// 第三个参数 ，realm名字
			return new SimpleAuthenticationInfo(user, user.getPassword(),
					getName());
//			return new SimpleAuthenticationInfo(user, "123456",
//					getName());
		}
	}

}
