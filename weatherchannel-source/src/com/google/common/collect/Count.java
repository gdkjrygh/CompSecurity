// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

final class Count
    implements Serializable
{

    private int value;

    Count(int i)
    {
        value = i;
    }

    public int addAndGet(int i)
    {
        i = value + i;
        value = i;
        return i;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof Count) && ((Count)obj).value == value;
    }

    public int get()
    {
        return value;
    }

    public int getAndAdd(int i)
    {
        int j = value;
        value = j + i;
        return j;
    }

    public int getAndSet(int i)
    {
        int j = value;
        value = i;
        return j;
    }

    public int hashCode()
    {
        return value;
    }

    public void set(int i)
    {
        value = i;
    }

    public String toString()
    {
        return Integer.toString(value);
    }
}
