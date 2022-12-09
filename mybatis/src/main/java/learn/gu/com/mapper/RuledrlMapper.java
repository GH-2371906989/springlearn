package learn.gu.com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import learn.gu.com.pojo.Ruledrl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 谷欢
* @description 针对表【ruledrl】的数据库操作Mapper
* @createDate 2022-12-09 10:28:41
* @Entity generator.domain.Ruledrl
*/
@Mapper
public interface RuledrlMapper  {

    Ruledrl selectOne(@Param("id") int id);

}
