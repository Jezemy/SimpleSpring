package ioc.factory.support;

import ioc.factory.config.BeanDefinition;

/**
 * @author wangzhiming
 * @date 2023/5/17 14:26
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}