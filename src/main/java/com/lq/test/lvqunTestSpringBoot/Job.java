package com.lq.test.lvqunTestSpringBoot;

public abstract class Job {

    protected void doTask(String taskName){
        System.out.println("this is protected method");
    }

//    private void doTask(Integer taskName){}
}
