package spring.test.xmlversion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.test.xmlversion.home.HomeService;

/**************************************************
 版本：V1.0
 创建时间：2021/5/12
 作者：LYZ
 修订记录：
 版本       日期       作者       修订内容
 V1.0    20201229     LYZ      实现插入排序与希尔排序
 ***************************************************/
public class StartApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HomeService homeService = context.getBean(HomeService.class);
        homeService.printHome();
    }

}
