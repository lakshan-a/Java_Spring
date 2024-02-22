package lk.ijse.api.SpringConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Configuration
@ComponentScan("lk.ijse.api.SpringConfiguration.bean")
@ImportResource("classpath:context.xml")
@Import({DAOConfig.class, BOConfig.class})
//@ImportResource("file:src/main/resources/context.xml")
public class AppConfig {

}
