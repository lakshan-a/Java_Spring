package lk.ijse.api.RunTimeInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collection;
import java.util.Map;

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

        Map<String,String> map = System.getenv();
        System.out.println(map);
        for (String keys : map.keySet()){
            System.out.println(keys + "=" + map.get(keys));
        }

    }

}
