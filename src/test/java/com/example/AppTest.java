package com.example;
import org.junit.Assert;
import org.junit.Test;
public class AppTest{
    public void testAdd(){
        App app=new App();
        int result=app.add(2,3);
        System.out.println("running 2+3="+result);
        Assert.assertEquals(5,result);
    }
}