package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    /*
    把参数传到一个方法里
     */
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o=new Object[][]{
                {"zhangsan",10},
                {"lisi",11},
                {"wangwu",12}
        };
        return o;
    }

    /*
    通过方法名传递参数
     */
   @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法：name="+name+";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法：name="+name+";age="+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodProviderData(Method method){
        Object[][] res=null;
        if(method.getName().equals("test1")){
            res=new Object[][]{
                    {"ZHANGSAN",20},
                    {"LISI",30},
            };
        }else if(method.getName().equals("test2")){
            res=new Object[][]{
                    {"WANGWU",40},
                    {"ZHAOLIU",50}
            };
        }
        return res;

    }

}
