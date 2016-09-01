package com.xlw.test;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;
import java.util.Properties;

/**
 * Created by Administrator on 2016/8/29 0029.
 */
public class SystemInfo {

    public static void main(String[] args) {
        for (int i = 0; i < 10000000; i++) {
        }
        System.out.println(getEMS());
        System.out.println("finish");
    }

    public static String getEMS() {
        StringBuffer sb=new StringBuffer();
        OperatingSystemMXBean osmb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();


        final StringBuffer append = sb.append("系统物理内存总计：" + osmb.getTotalPhysicalMemorySize()
                / 1024 / 1024 + "MB<br>");
        sb.append("系统可用内存总计：" + osmb.getFreePhysicalMemorySize()
                / 1024 / 1024 + "MB");
        return sb.toString();
    }

}
