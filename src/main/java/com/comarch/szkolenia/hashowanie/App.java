package com.comarch.szkolenia.hashowanie;

import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {
        String hash = DigestUtils.md5Hex("admin3345");
        System.out.println(hash);
    }
}
