// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


public class c5
{

    private static final String z;
    public int a;
    public String b;
    public long c;
    public long d;
    public int e;

    public c5(String s, int i)
    {
        this(s, i, 0L);
        if (i == 5)
        {
            throw new IllegalArgumentException(z);
        } else
        {
            return;
        }
    }

    public c5(String s, int i, int j, long l)
    {
        b = s;
        a = i;
        d = l;
        e = j;
    }

    public c5(String s, int i, long l)
    {
        this(s, i, 0, l);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "#`1\034l\032L\025<l\034P\024,%\034P\026y8\007X\000*8\017X\025".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 76;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 110;
          goto _L8
_L3:
        byte0 = 53;
          goto _L8
_L4:
        byte0 = 101;
          goto _L8
        byte0 = 89;
          goto _L8
    }
}
