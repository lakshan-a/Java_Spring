package lk.ijse.api.spring;


import lk.ijse.api.spring.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/9/2024
 */

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Boy boy1 = ctx.getBean(Boy.class);
        System.out.println(boy1);

        System.out.println("--------------------");
        Boy boy2 = ctx.getBean(Boy.class);
        System.out.println(boy2);
    }
}
