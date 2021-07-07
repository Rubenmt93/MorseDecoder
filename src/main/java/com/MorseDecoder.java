package com;

public class MorseDecoder {


    public Object decode(String s) {
        if(s.equals(".-")){

            return "A";
        }
        if(s.equals("-...")){
            return "B";
        }
        if(s.equals("-.-.")){
            return "C";
        }
        return null;
    }
}
