package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "lk.ijse.gdse66.spring.bean")
@ComponentScan(basePackageClasses = SpringBean.class)
@Configuration

public class AppConfig {
    public AppConfig(){
        System.out.println("appConfig instance is created");
    }
}
