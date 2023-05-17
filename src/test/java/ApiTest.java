import bean.UserService;
import ioc.BeanDefinition;
import ioc.BeanFactory;
import org.junit.Test;

/**
 * @author wangzhiming
 * @date 2023/5/8 16:07
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1 初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
