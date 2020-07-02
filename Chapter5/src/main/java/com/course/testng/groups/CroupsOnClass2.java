package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups ="stu")
public class CroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2 运行 stu111");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2 运行 stu222");
    }
}

