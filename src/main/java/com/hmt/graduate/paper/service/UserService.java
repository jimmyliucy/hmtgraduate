package com.hmt.graduate.paper.service;


import com.hmt.graduate.paper.entity.UserDTO;
import com.hmt.graduate.paper.entity.UserRolesVO;
import com.hmt.graduate.paper.entity.UserSearchDTO;
import com.hmt.graduate.paper.pojo.User;
import com.hmt.graduate.paper.utils.PageDataResult;

public interface UserService {
	/**
	 * 分页查询用户列表
	 * @param page
	 * @param limit
	 * @return
	 */
	PageDataResult getUsers(UserSearchDTO userSearch, int page, int limit);

	/**
	 *	设置用户【新增或更新】
	 * @param user
	 * @param roleIds
	 * @return
	 */
	String setUser(User user, String roleIds);

	/**
	 * 设置用户是否离职
	 * @param id
	 * @param isJob
	 * @param insertUid
	 * @return
	 */
	String setJobUser(Integer id, Integer isJob, Integer insertUid,
                      Integer version);

	/**
	 * 删除用户
	 * @param id
	 * @param isDel
	 * @return
	 */
	String setDelUser(Integer id, Integer isDel, Integer insertUid,
                      Integer version);

	/**
	 * 查询用户数据
	 * @param id
	 * @return
	 */
	UserRolesVO getUserAndRoles(Integer id);

	/**
	 * 发送短信验证码
	 * @param user
	 * @return
	 */
	String sendMsg(UserDTO user);

	/**
	 * 根据手机号查询用户数据
	 * @param mobile
	 * @return
	 */
	User findUserByMobile(String mobile);

	/**
	 * 根据手机号发送短信验证码
	 * @param mobile
	 * @return
	 */
	String sendMessage(int userId, String mobile);

	/**
	 * 修改用户手机号
	 * @param id
	 * @param password
	 * @return
	 */
	int updatePwd(Integer id, String password);

	/**
	 * 锁定用户
	 * @param id
	 * @param isLock  0:解锁；1：锁定
	 * @return
	 */
	int setUserLockNum(Integer id, int isLock);
}
