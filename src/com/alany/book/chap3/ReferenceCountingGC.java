package com.alany.book.chap3;

/**
 * @author: yinxing
 * @date: 2019/3/3
 */
public class ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    /**
     * 这个成员属性的唯一意义就是占用内存，以便GC日志中看清楚是否被回收过
     */
    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        // 假设这行发生GC，objA 和 objB是否会被回收?（会被回收）
        System.gc();
    }

    public static void main(String[] args) {
        ReferenceCountingGC.testGC();
    }

}
