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

}
