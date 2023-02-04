import com.lzw.entity.User;
import com.lzw.service.Interface.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Component // 不添加该注解，会造成Autowired注解失效
@RunWith(SpringJUnit4ClassRunner.class) // 设置junit的运行环境的扩展
@ContextConfiguration(locations = {"classpath:spring.xml"}) // 添加spring的核心配置文件
public class TestUser {

    @Autowired
    private UserService userService;
    @Test
    public void testUser(){
        List<User> allUser = userService.getAllUser();
        System.out.println(allUser);
    }
}
