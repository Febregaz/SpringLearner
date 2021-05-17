package spring.test.annotationversion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.test.annotationversion.Services.HomeServices;

@ComponentScan
@Configuration
public class Appconfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        HomeServices homeServices = context.getBean(HomeServices.class);
        homeServices.printHome();
    }

}
