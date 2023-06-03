package com.example.cousre.topic02;


public class Task46_NameEncoderDecoder {
    public String encode(String name) {
        String encodedName = name.replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
        return "NOTFORYOU" + encodedName + "YESNOTFORYOU";
    }

    public String decode(String name) {
        String decodedName = name.replace("5", "a")
                .replace("4", "o")
                .replace("3", "i")
                .replace("2", "u")
                .replace("1", "e")
                .replace("YESNOTFORYOU", "")
                .replace("NOTFORYOU", "");
        return decodedName;
    }
}

