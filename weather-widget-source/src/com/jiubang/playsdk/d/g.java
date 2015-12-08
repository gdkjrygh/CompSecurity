// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.d;


public class g
{

    private long a;
    private int b;
    private int c;
    private int d;

    public g(long l, int i, int j, int k)
    {
        a = l;
        b = i;
        c = j;
        d = k;
    }

    public int a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder()).append("RequestBean [mTypeID=").append(a).append(", mPageID=").append(b).append(", mAccess=").append(c).append(", mItp=").append(d).append("]").toString();
    }
}
