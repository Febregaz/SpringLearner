package spring.test.xmlversion.home;

import org.junit.Test;
import spring.test.xmlversion.away.AwayService;

/**************************************************
 版本：V1.0
 创建时间：2021/5/12
 作者：LYZ
 修订记录：
 版本       日期       作者       修订内容
 V1.0    20201229     LYZ      调用方
 ***************************************************/
public class HomeService {

    AwayService awayService;

    public void setAwayService(AwayService awayService){
        this.awayService = awayService;
    }

    public void printHome(){
        System.out.println("Home");
        awayService.printAway();
    }

}
