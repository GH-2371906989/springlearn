package learn.gu.com.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("learn.gu.com.mapper")
public class SpringConfig {
}
