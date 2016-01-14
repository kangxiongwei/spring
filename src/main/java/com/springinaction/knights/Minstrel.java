package com.springinaction.knights;

/**
 * Created by IntelliJ IDEA
 * Author: kangxiongwei1
 * Date: 2016/1/14 16:31
 *
 * AOP切面 吟游诗人
 *
 */
public class Minstrel {

    public void singBeforeQuest(){
        System.out.println("Fa la la; The knight is so brave!");
    }

    public void singAfterQuest(){
        System.out.println("Tee hee he; The brave knight did embark on a quest!");
    }

}
