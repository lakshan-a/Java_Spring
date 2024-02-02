package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppInitializer {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();

        AppConfig appConfig = ctx.getBean(AppConfig.class);
        System.out.println(appConfig);

        SpringBean springBean = ctx.getBean(SpringBean.class);
        System.out.println(springBean);
    }
}
