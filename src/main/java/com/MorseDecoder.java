package com;

import java.util.HashMap;
import java.util.Map;

public class MorseDecoder {
    private static final Map<String,String> MorseCode = new HashMap<>(){{
    put(".-", "A");
    put(".-", "A");
    put("-...", "B");
    put("-.-.", "C");
    put("-..", "D");
    put(".", "E");
    put("..-.", "F");
    put("--.", "G");
    put("....", "H");
    put("..", "I");
    put(".---", "J");
    put("-.-", "K");
    put(".-..", "L");
    put("--", "M");
    put("-.", "N");
    put("---", "O");
    put(".--.", "P");
    put("--.-", "Q");
    put(".-.", "R");
    put("...", "S");
    put("-", "T");
    put("..-", "U");
    put("...-", "V");
    put(".--", "W");
    put("-..-", "X");
    put("-.--", "Y");
    put("--..", "Z");}};

    public Object decode(String s) {
        return MorseCode.get(s);
    }
}

