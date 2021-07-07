package com;

public class MorseDecoder {


    public Object decode(String s) {
        switch (s){
            case ".-":
                return "A";
            case "-...":
                return "B";
            case "-.-.":
                return "C";
            default:
                return null;
        }

    }
}



