package lk.ijse.gdse66.spring;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringBeanFour;
import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppInitializer {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        ctx.registerShutdownHook();

        /*Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM about to shutdown");
                ctx.close();
            }
        }));*/

        /*AppConfig appConfig = ctx.getBean(AppConfig.class);
        System.out.println(appConfig);*/

        /*SpringBean springBean = ctx.getBean(SpringBean.class);
        System.out.println(springBean);

        SpringBean sb = (SpringBean) ctx.getBean("sb");
        System.out.println(sb);

        SpringBeanThree springBean3 = ctx.getBean(SpringBeanThree.class);
        System.out.println(springBean3);*/

        /*SpringBean2 springBean2 = ctx.getBean(SpringBean2.class);
        System.out.println(springBean2);

        ctx.close();

        System.out.println(ctx);
        System.out.println(springBean);
        springBean.myMethod();*/

        /*boolean beanDefinition = ctx.containsBeanDefinition("getJavaBean");
        System.out.println(beanDefinition);

        boolean springBeanFour = ctx.containsBeanDefinition("SpringBeanFour");
        System.out.println(springBeanFour);

        boolean springBean = ctx.containsBeanDefinition("SpringBean");
        System.out.println(springBean);

        JavaBean javaBean = (JavaBean) ctx.getBean("javaBean");
        System.out.println(javaBean);*/

        /*SpringBeanFour beanFour = ctx.getBean(SpringBeanFour.class);
        System.out.println(beanFour);

        SpringBeanFour beanFour2 = ctx.getBean(SpringBeanFour.class);
        System.out.println(beanFour2);

        System.out.println("------------------------------------------------");

        JavaBean javaBean = ctx.getBean(JavaBean.class);
        System.out.println(javaBean);

        JavaBean javaBean2 = ctx.getBean(JavaBean.class);
        System.out.println(javaBean2);*/

        boolean isExist = ctx.containsBeanDefinition("javaBean");
        System.out.println(isExist);

        boolean isExist2 = ctx.containsBeanDefinition("springBeanFour");
        System.out.println(isExist2);

    }
}
