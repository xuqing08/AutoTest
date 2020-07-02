package com.course.testng;

import org.testng.annotations.Test;
//依赖测试应用场景：比如付款成功，依赖登陆
public class DependTest {
    @Test
    public void test1(){
        System.out.println("run test1");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("run test2");
    }

}
