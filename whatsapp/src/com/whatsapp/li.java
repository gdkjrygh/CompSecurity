// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class li
{

    private static final String z;
    private final boolean a;

    public li(boolean flag)
    {
        a = flag;
    }

    public boolean a()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z).append(a).append('}').toString();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\035HtQ\020\036FuQ/\"Cfw\n,IdQ\031=HtQ\020\036FuQ/\"Cf\t".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 98;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 77;
          goto _L8
_L3:
        byte0 = 39;
          goto _L8
_L4:
        byte0 = 3;
          goto _L8
        byte0 = 52;
          goto _L8
    }
}
