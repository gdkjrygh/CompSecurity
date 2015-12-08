// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.d;


public class h
{

    private long a;
    private int b;
    private int c;
    private int d;

    public h(long l, int i, int j, int k)
    {
        a = l;
        b = i;
        c = j;
        d = k;
    }

    public long a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder()).append("RequestBean [mTypeID=").append(a).append(", mPageID=").append(b).append(", mAccess=").append(c).append(", mItp=").append(d).append("]").toString();
    }
}
