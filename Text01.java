package com.hp.day09;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 * @author Xiloer
 *
 */
public class Text01 {
    public static void main(String[] args) {
            File file = new File("/myfile.txt");
           //名字
           String name =  file.getName();
           System.out.println("name = " + name);
           long length =  file.length();
           System.out.println("length = " + length);
           SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           System.out.println(df.format(file.lastModified()));


    }
}