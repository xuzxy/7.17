package com.hp.day09;


import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Xiloer
 *
 */
public class Text06 {
    public static void main(String[] args) {
      String[] list =  new File("D:\\").list();
        for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i]);
        }

    }
}
