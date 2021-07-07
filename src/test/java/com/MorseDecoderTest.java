package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseDecoderTest {
    @Test
    public void MorseDecoderTestA(){
        MorseDecoder morseDecoder= new MorseDecoder();
        assertEquals(morseDecoder.decode(".-"), "A");
    }
    @Test
    public void MorseDecoderTestB(){
        MorseDecoder morseDecoder= new MorseDecoder();
        assertEquals(morseDecoder.decode("-..."),"B");
    }


}
