package ioc.factory;

import ioc.BeansException;

/**
 * @author wangzhiming
 * @date 2023/5/17 14:13
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}