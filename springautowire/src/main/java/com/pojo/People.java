package com.pojo;

import com.utils.ApplicationContextUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class People {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    @Value("张三")
    private String name;

    public static void main(String[] args) {
        ApplicationContextUtils.test(()->{
            People people = ApplicationContextUtils.getBean(People.class);
            people.getDog().shout();
        });
    }
}
