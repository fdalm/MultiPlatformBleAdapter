package com.polidea.multiplatformbleadapter.utils;

import java.nio.charset.StandardCharsets;

public class UTF8Converter {
    public static String encode(byte[] bytes) {
        return new String(bytes, StandardCharsets.UTF_8);
    }
    public static byte[] decode(String textUtf8) {

        return textUtf8.getBytes(StandardCharsets.UTF_8);
    }
}
