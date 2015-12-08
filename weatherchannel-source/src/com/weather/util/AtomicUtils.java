// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import java.util.concurrent.atomic.AtomicInteger;

public final class AtomicUtils
{

    private AtomicUtils()
    {
    }

    public static void setIfHigher(AtomicInteger atomicinteger, int i)
    {
        int j;
        do
        {
            j = atomicinteger.get();
        } while (i > j && !atomicinteger.compareAndSet(j, i));
    }
}
