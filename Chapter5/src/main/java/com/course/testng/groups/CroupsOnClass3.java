package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class CroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3 运行teacher111");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3 运行teacher222");
    }

}
