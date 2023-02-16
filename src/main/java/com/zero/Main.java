package com.zero;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            String encode = URLEncoder.encode("@Sarce2727", "UTF-8");
            System.out.println(encode);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}