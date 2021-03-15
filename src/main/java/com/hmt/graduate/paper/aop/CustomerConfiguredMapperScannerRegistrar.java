//package com.hmt.graduate.paper.aop;
//
//import com.hmt.graduate.paper.annotation.NamedMapper;
//import org.apache.ibatis.annotations.Mapper;
//import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
//import org.mybatis.spring.mapper.ClassPathMapperScanner;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.support.BeanDefinitionRegistry;
//import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
//import org.springframework.core.io.ResourceLoader;
//import org.springframework.core.type.AnnotationMetadata;
//import org.springframework.util.StringUtils;
//
//import java.util.List;
//
//public class CustomerConfiguredMapperScannerRegistrar extends MybatisAutoConfiguration.AutoConfiguredMapperScannerRegistrar {
//
//    private static final Logger logger = LoggerFactory.getLogger(CustomerConfiguredMapperScannerRegistrar.class);
//
//    private BeanFactory beanFactory;
//
//    private ResourceLoader resourceLoader;
//
//    @Override
//    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//        logger.debug("Searching for mappers annotated with @Mapper");
//
//        ClassPathMapperScanner scanner = new ClassPathMapperScanner(registry);
//
//        try {
//            if (this.resourceLoader != null) {
//                scanner.setResourceLoader(this.resourceLoader);
//            }
//
//            List<String> packages = AutoConfigurationPackages.get(this.beanFactory);
//            if (logger.isDebugEnabled()) {
//                for (String pkg : packages) {
//                    System.out.println("=============="+pkg);
//                    logger.debug("Using Customer base package '{}'", pkg);
//                }
//            }
//
//            scanner.setAnnotationClass(NamedMapper.class);
//            scanner.registerFilters();
//            scanner.doScan(StringUtils.toStringArray(packages));
//        } catch (IllegalStateException ex) {
//            logger.debug("Could not determine auto-configuration package, automatic mapper scanning disabled.", ex);
//        }logger.debug("Searching for mappers annotated with @Mapper");
//
//    }
//
//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        this.beanFactory = beanFactory;
//    }
//
//    @Override
//    public void setResourceLoader(ResourceLoader resourceLoader) {
//        this.resourceLoader = resourceLoader;
//    }
//}
