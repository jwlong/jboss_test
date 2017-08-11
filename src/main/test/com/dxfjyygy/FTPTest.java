package com.dxfjyygy;

import com.dxfjyygy.util.FTPUtils;
import junit.framework.TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by longjinwen on 10/08/2017.
 */
public class FTPTest extends TestCase {
    public void test1(){
        System.out.println("hello1");
    }
    public void test2() throws FileNotFoundException {
        String hostName = "192.168.15.22";
        int port = 21;
        String userName = "jasonwang" ;
        String  passwd = "smlep123";
        String path = "storage" ;
        String fileName = "mmm.zip";
        String localFileName =  "D://11111.zip" ;
        File file = new File(localFileName);
        InputStream inputStream = new FileInputStream(file);
        FTPUtils.uploadFile(hostName,port,userName,passwd,path,fileName,inputStream);
    }
}
