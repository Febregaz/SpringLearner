package spring.test.annotationversion.Services;

import org.springframework.stereotype.Component;

/**************************************************
 版本：V1.0
 创建时间：17/5/2021
 作者：Aragami
 修订记录：
 版本       日期       作者       修订内容
 V1.0    20201229     LYZ      
 ***************************************************/
@Component
public class AwayServices {

    public void printAway(){
        System.out.println("Away");
    }

}
