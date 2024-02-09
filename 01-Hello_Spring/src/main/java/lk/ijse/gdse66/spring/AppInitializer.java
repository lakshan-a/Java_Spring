package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppInitializer {

    public static void main(String[] args) {

         /*  Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM about to shutdown");
                ctx.close();
            }
        }));*/

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();

//        AppConfig appConfig = ctx.getBean(AppConfig.class);
//        System.out.println(appConfig);

/*        SpringBean springBean = ctx.getBean(SpringBean.class);
        System.out.println(springBean);

//

        SpringBean sb = (SpringBean) ctx.getBean("sb");
        System.out.println(sb);

        SpringBeanThree springBean3 = ctx.getBean(SpringBeanThree.class);
        System.out.println(springBean3);*/





//        ctx.registerShutdownHook();

        /*SpringBean2 springBean2 = ctx.getBean(SpringBean2.class);
        System.out.println(springBean2);

        ctx.close();

        System.out.println(ctx);
        System.out.println(springBean);
        springBean.myMethod();*/


    }
}
