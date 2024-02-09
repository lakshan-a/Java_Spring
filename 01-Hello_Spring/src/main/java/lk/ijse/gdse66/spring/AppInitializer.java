package lk.ijse.gdse66.spring;

import com.edu.ijse.JavaBean;
import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

         /*  Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM about to shutdown");
                ctx.close();
            }
        }));*/



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

        ctx.registerShutdownHook();
   /*     boolean beanDefinition = ctx.containsBeanDefinition("getJavaBean");
        System.out.println(beanDefinition);

        boolean springBeanFour = ctx.containsBeanDefinition("SpringBeanFour");
        System.out.println(springBeanFour);

        boolean springBean = ctx.containsBeanDefinition("SpringBean");
        System.out.println(springBean);*/

        /*JavaBean javaBean = (JavaBean) ctx.getBean("javaBean");
        System.out.println(javaBean);*/



    }
}
