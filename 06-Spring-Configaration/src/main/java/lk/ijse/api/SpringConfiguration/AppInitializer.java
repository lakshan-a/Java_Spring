package lk.ijse.api.SpringConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

    }
}
