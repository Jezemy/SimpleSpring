package ioc.factory.support;

import ioc.BeansException;
import ioc.factory.config.BeanDefinition;

/**
 * @author wangzhiming
 * @date 2023/5/17 14:21
 */
public class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        return null;
    }

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
