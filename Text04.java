package com.hp.day09;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Xiloer
 *
 */
public class Text04 {

    public static void main(String[] args) {
        File list = new File("D:\\");
        File[] files = list.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("file = " + file);
            }
        }

    }
}




