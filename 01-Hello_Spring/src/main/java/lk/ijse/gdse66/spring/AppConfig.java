package lk.ijse.gdse66.spring;

import com.edu.ijse.SpringBean4;
import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "lk.ijse.gdse66.spring.bean")
@ComponentScan(basePackageClasses = {SpringBean3.class, SpringBean4.class})
@Configuration

public class AppConfig {
    public AppConfig(){
        System.out.println("appConfig instance is created");
    }
}
