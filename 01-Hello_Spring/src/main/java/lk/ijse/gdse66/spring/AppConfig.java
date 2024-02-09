package lk.ijse.gdse66.spring;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringBeanFour;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "lk.ijse.gdse66.spring.bean")
//@ComponentScan(basePackageClasses = {SpringBeanThree.class, SpringBeanFour.class})
@Configuration
@ComponentScan

public class AppConfig {
//    public AppConfig(){
//        System.out.println("appConfig instance is created");
//    }

    public JavaBean getJavaBean(){
        return new JavaBean();
    }
}
