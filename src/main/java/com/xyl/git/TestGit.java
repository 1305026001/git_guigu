package com.xyl.git;

import java.time.ZonedDateTime;
import java.util.UUID;

public class TestGit {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("hello git,当地的现在时间是 : " + now);

        String str = UUID.randomUUID().toString();
        System.out.println(str);
    }
}
