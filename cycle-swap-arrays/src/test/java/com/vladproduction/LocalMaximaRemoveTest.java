package com.vladproduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LocalMaximaRemoveTest {

    @Test
    public void testCycleSwapSimpleCase() {
        int[] array = new int[]{1, 3, 2, 7, 4};
        LocalMaximaRemove.cycleSwap(array);
        assertArrayEquals(new int[]{4, 1, 3, 2, 7}, array);
        LocalMaximaRemove.cycleSwap(array);
        assertArrayEquals(new int[]{7, 4, 1, 3, 2}, array);
        LocalMaximaRemove.cycleSwap(array);
        assertArrayEquals(new int[]{2, 7, 4, 1, 3}, array);
    }

    @Test
    public void testCycleSwapSimpleCaseShift2() {
        int[] array = new int[]{1, 3, 2, 7, 4};
        LocalMaximaRemove.cycleSwap(array, 2);
        assertArrayEquals(new int[]{7, 4, 1, 3, 2}, array);
    }

    @Test
    public void testCycleSwapSimpleCaseShift5() {
        int[] array = new int[]{1, 3, 2, 7, 4};
        LocalMaximaRemove.cycleSwap(array, 5);
        assertArrayEquals(new int[]{1, 3, 2, 7, 4}, array);
    }

    @Test
    public void testCycleSwapEmptyCase() {
        int[] array = new int[]{};
        LocalMaximaRemove.cycleSwap(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testCycleSwapEmptyCaseShift() {
        int[] array = new int[]{};
        LocalMaximaRemove.cycleSwap(array, 5);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testCycleSwap9Case() {
        int[] array = new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        LocalMaximaRemove.cycleSwap(array);
        assertArrayEquals(new int[]{9, 1, 2, 3, 4, 5, 5, 6, 7, 8}, array);
        LocalMaximaRemove.cycleSwap(array);
        assertArrayEquals(new int[]{8, 9, 1, 2, 3, 4, 5, 5, 6, 7}, array);
        LocalMaximaRemove.cycleSwap(array);
        assertArrayEquals(new int[]{7, 8, 9, 1, 2, 3, 4, 5, 5, 6}, array);
    }

    @Test
    public void testCycleSwap9CaseShift() {
        int[] array = new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        LocalMaximaRemove.cycleSwap(array, 3);
        assertArrayEquals(new int[]{7, 8, 9, 1, 2, 3, 4, 5, 5, 6}, array);
        LocalMaximaRemove.cycleSwap(array, 5);
        assertArrayEquals(new int[]{3, 4, 5, 5, 6, 7, 8, 9, 1, 2}, array);
    }
}
