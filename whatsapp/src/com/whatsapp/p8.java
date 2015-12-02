// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public class p8
{

    public long a;
    public long b;
    public long c;
    public long d;

    public p8()
    {
    }

    public int a()
    {
        if (c > 0L)
        {
            return 8;
        }
        if (a > 0L)
        {
            return 13;
        }
        return d <= 0L ? 4 : 5;
    }

    public long a(int i)
    {
        i;
        JVM INSTR lookupswitch 3: default 36
    //                   5: 38
    //                   8: 66
    //                   13: 52;
           goto _L1 _L2 _L3 _L4
_L1:
        return 0L;
_L2:
        if (d > 0L)
        {
            return d;
        }
_L4:
        if (a > 0L)
        {
            return a;
        }
_L3:
        if (c <= 0L) goto _L1; else goto _L5
_L5:
        return c;
    }
}
