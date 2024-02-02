package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean;
import lk.ijse.gdse66.spring.bean.SpringBean2;
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

        SpringBean2 springBean2 = ctx.getBean(SpringBean2.class);
        System.out.println(springBean2);

//        ctx.close();

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM about to shutdown");
            }
        }));


    }
}
