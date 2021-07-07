package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseDecoderTest {
    final MorseDecoder morseDecoder= new MorseDecoder();
    @Test
    public void MorseDecoderTestA(){
        assertEquals(morseDecoder.decode(".-"), "A");
    }
    @Test
    public void MorseDecoderTestB(){
        assertEquals(morseDecoder.decode("-..."),"B");
    }
    @Test
    public void MorseDecoderTestC(){
        assertEquals(morseDecoder.decode("-.-."),"C");
    }
    @Test
    public void getMorseDecoderTestAlphaBet() {
        assertEquals(morseDecoder.decode(".-"),"A");
        assertEquals(morseDecoder.decode("-..."),"B");
        assertEquals(morseDecoder.decode("-.-."),"C");
        assertEquals(morseDecoder.decode("-.."),"D");
        assertEquals(morseDecoder.decode("."),"E");
        assertEquals(morseDecoder.decode("..-."),"F");
        assertEquals(morseDecoder.decode("--."),"G");
        assertEquals(morseDecoder.decode("...."),"H");
        assertEquals(morseDecoder.decode(".."),"I");
        assertEquals(morseDecoder.decode("-.-"),"K");
        assertEquals(morseDecoder.decode(".-.."),"L");
        assertEquals(morseDecoder.decode("--"),"M");
        assertEquals(morseDecoder.decode("-."), "N");
        assertEquals(morseDecoder.decode("---"), "O");
        assertEquals(morseDecoder.decode(".--."), "P");
        assertEquals(morseDecoder.decode("--.-"), "Q");
        assertEquals(morseDecoder.decode(".-."), "R");
        assertEquals(morseDecoder.decode("..."), "S");
        assertEquals(morseDecoder.decode("-"), "T");
        assertEquals(morseDecoder.decode("..-"), "U");
        assertEquals(morseDecoder.decode("...-"), "V");
        assertEquals(morseDecoder.decode(".--"), "W");
        assertEquals(morseDecoder.decode("-..-"), "X");
        assertEquals(morseDecoder.decode("-.--"), "Y");
        assertEquals(morseDecoder.decode("--.."), "Z");
    }

    @Test
    public void getMorseDecoderTestFailed() {
        assertEquals(morseDecoder.decode("#"), null);
    }
}
