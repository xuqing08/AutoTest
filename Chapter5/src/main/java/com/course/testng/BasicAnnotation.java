package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("test1:这是测试方法1");
    }
    @Test
    public void testCase2(){
        System.out.println("test2:这是测试2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod:这是测试前");
    }
    @AfterMethod
    public void Method(){
        System.out.println("AfterMethod:这是测试后");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass:这是在类运行前的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass:这是在类运行后的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite套件");
    }

}