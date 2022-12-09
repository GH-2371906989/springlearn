package learn.gu.com;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import learn.gu.com.mapper.RuledrlMapper;
import learn.gu.com.pojo.Ruledrl;
import learn.gu.com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class test {
    public static void main(String[] args) {
        SqlSession openSession = MybatisUtils.getOpenSession();
        RuledrlMapper mapper = openSession.getMapper(RuledrlMapper.class);

        Ruledrl ruledrl = mapper.selectOne(1);
        System.out.println(JSON.toJSONString(ruledrl));
    }
}
