import bean.UserService;
import ioc.factory.config.BeanDefinition;
import ioc.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author wangzhiming
 * @date 2023/5/8 16:07
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 1 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3 首次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4 第二次获取bean
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
        System.out.println(userService.equals(userService_singleton));
    }
}
