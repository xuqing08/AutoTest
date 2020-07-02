package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite 运行了----");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite 运行了---");
    }

    @BeforeTest
    public void beforeMethod(){
        System.out.println("before Test");
    }
    @AfterTest
    public void afterMethod(){
        System.out.println("after Test");
    }
}
