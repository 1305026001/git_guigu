package com.xyl.git;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

public class TestGit {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("hello git1,当地的现在时间是 : " + now);

        String str = UUID.randomUUID().toString();
        System.out.println("hello git2,"+str);


        System.out.println("hello git3,"+Runtime.getRuntime().availableProcessors());

        System.out.println("hello git4"+new Date());

        System.out.println("push commit");
    }
}
