package lk.ijse.gdse66.api;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitalizer {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext("context.xml");
    }
}
