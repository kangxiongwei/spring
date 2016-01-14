package com.springinaction.knights;

/**
 * Created by IntelliJ IDEA
 * Author: kangxiongwei1
 * Date: 2016/1/14 12:14
 */
public class RescueDamselQuest implements Quest {


    @Override
    public void embark() {
        System.out.println("I am "+this.getClass().getName());
    }
}
