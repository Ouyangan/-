package com.roadmap.algorithm;

import org.junit.jupiter.api.Test;

class AlgorithmTest {
    @Test
    public void twoSumTest() {
        TwoSum1 twoSum1 = new TwoSum1();
        int[] ints = twoSum1.twoSum(new int[]{1, 2, 3, 5}, 8);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}