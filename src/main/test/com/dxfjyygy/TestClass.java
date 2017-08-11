package com.dxfjyygy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by longjinwen on 18/07/2017.
 */
public class TestClass {
    @Test
    public void test(){
        voidMethod1();
    }
    @Test
    public  void test2(){
        Object o =  null;
        List<Object> list =  new ArrayList<Object>();
        for(int i = 0 ;i<4;i++){
             o = new Object();
             list.add(o);
        }
        System.out.println(list.size());
    }
    public void  voidMethod1(){
        return;
    }

    public static void main(String[] args) {

    }
}
