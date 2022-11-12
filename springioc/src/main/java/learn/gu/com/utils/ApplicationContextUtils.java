package learn.gu.com.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtils implements ApplicationContextAware {

    public static ApplicationContext app = null;

    public static ApplicationContext getApplicationContext() {
        return app;
    }

    public static <T> T getBean(Class<T> clazz) {
        return app.getBean(clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        app = applicationContext;
    }

    public static void test(TODO todo) {
        try (ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml")) {
            app = classPathXmlApplicationContext;
            todo.doIt();
        }
    }

    @FunctionalInterface
    public interface TODO {

        void doIt();

    }

}
