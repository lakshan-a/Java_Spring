package lk.ijse.gdse66.spring;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringBeanFour;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@ComponentScan(basePackages = "lk.ijse.gdse66.spring.bean")
//@ComponentScan(basePackageClasses = {SpringBeanThree.class, SpringBeanFour.class})

@Configuration
@ComponentScan(basePackages = "com.edu.ijse")

public class AppConfig {

    /*public AppConfig(){
        System.out.println("appConfig instance is created");
    }*/

    @Scope("javaBean")
    @Bean(name = "javaBean")
    public JavaBean getJavaBean(){
        return new JavaBean();
    }
}
