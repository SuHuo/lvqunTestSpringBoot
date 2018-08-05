package com.lq.test.lvqunTestSpringBoot;

public class Main {
    public static void main(String[] args) {
        JobSend jobSend = new JobSend();
        jobSend.doTask("fhh");

        String str = "ABC_001";
        String sub = str.substring(1,3);

        int index = str.indexOf("C");
        if (index != -1) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }
    }
}
