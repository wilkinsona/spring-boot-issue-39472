package com.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static void main(String[] args) {

        String regx = "^com.ebao";

        Pattern compile = Pattern.compile(regx);

        Matcher matcher = compile.matcher("com.ebao.pub.util.StringUtil");

        boolean b = matcher.find();
        System.out.println(b);


    }
}
