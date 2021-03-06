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
    put("--..", "Z");
    put("-----", "0");
    put(".----", "1");
    put("..---", "2");
    put("...--", "3");
    put("....-", "4");
    put(".....", "5");
    put("-....", "6");
    put("--...", "7");
    put("---..", "8");
    put("----.", "9");
    put(".-.-.-", ".");
    put("--..--", ",");
    put("..--..", "?");
    put(".----.", "'");
    put("-.-.--", "!");
    put("-..-.", "/");
    put("-.--.", "(");
    put("-.--.-", ")");
    put(".-...", "&");
    put("---...", ",");
    put("-.-.-.", ";");
    put("-...-", "=");
    put(".-.-.", "+");
    put("-....-", "-");
    put("..--.-", "_");
    put(".-..-.", "\"");
    put("...-..-", "$");
    put(".--.-.", "@");
    put("...---...", "SOS");}};
    public String decode(String s) {
        return MorseCode.get(s);
    }

    public String decodeWord(String word) {
      String result="";
      String[] arrayWord =word.split(" ");
      for (int i=0; i< arrayWord.length; i++){
          result+=decode(arrayWord[i]);
        }
      return result;
    }
}

