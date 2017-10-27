package com.prodiver.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaojw
 * Date: 2017/10/27
 * Time: 16:10
 *
 * @author: zhaojw
 */
public class ProdiverApplication {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:dubbo/dubbo-provider.xml");
        context.start();

        System.out.println(" Application run ");

        System.in.read(); // 按任意键退出
    }
}
