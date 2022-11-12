package learn.gu.com;
import com.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
    @Test
    public void T1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
        System.out.println(people);
    }
}
