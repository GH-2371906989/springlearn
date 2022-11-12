package learn.gu.com;


import learn.gu.com.dao.UserDaoImpl;
import learn.gu.com.pojo.Hello;
import learn.gu.com.pojo.Student;
import learn.gu.com.service.UserService;
import learn.gu.com.service.UserServiceImpl;
import learn.gu.com.utils.ApplicationContextUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void T1(){
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        System.out.println(userService.getName());
    }
    @Test
    public void T2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Hello hello = context.getBean("hello", Hello.class);
        System.out.println(hello);
    }
    @Test
    public void T3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
