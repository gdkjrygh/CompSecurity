// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;


public class MemoryHelper
{

    private static final String a = "MemoryHelper";
    private static long b = 0L;
    private static long c = 0L;
    private static long d = 0L;
    private static long e = 0L;

    public MemoryHelper()
    {
    }

    public static long getTotalFreeMemory()
    {
        b = Runtime.getRuntime().maxMemory();
        c = Runtime.getRuntime().freeMemory();
        d = Runtime.getRuntime().totalMemory();
        e = d - c;
        return b - e;
    }

    public static float getTotalFreeMemoryAsPctOfMax()
    {
        return (float)getTotalFreeMemory() / (float)b;
    }

}
