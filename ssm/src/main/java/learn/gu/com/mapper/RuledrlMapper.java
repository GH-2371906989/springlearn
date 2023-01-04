package learn.gu.com.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import learn.gu.com.pojo.Ruledrl;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 谷欢
* @description 针对表【ruledrl】的数据库操作Mapper
* @createDate 2022-12-13 15:52:30
* @Entity generator.domain.Ruledrl
*/
@Mapper
public interface RuledrlMapper extends BaseMapper<Ruledrl> {
    Ruledrl getdrl(int id);

}
