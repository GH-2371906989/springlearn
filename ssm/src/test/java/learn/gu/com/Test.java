package learn.gu.com;

import com.alibaba.fastjson.JSON;
import learn.gu.com.mapper.RuledrlMapper;
import learn.gu.com.pojo.Ruledrl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @Autowired
    RuledrlMapper ruledrlMapper;

    @org.junit.Test
    public void t1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Ruledrl getdrl = ruledrlMapper.getdrl(1);
        RuledrlMapper ruledrlMapper = context.getBean("ruledrlMapper", RuledrlMapper.class);
        System.out.println(JSON.toJSONString(ruledrlMapper.getdrl(1)));
    }
}
