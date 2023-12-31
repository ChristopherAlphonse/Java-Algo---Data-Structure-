package com.algorithm;

public class BitMapping {

    int mask = 0x0f;
    int value = 0x55;

    public static void main(String[] args) {
        BitMapping bitMap = new BitMapping();
        System.out.println(bitMap.performBitMapping());
    }

    public int performBitMapping() {
        return mask & value;
    }

}
