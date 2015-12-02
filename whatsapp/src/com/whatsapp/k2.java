// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.List;

// Referenced classes of package com.whatsapp:
//            k6, App

public class k2 extends k6
{

    private static final String z;
    List b;

    public k2(List list)
    {
        b = list;
    }

    public String a()
    {
        return (new StringBuilder()).append(z).append(b.size()).toString();
    }

    public void c()
    {
        App.b(b);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\002mM2\024\035ks2\017\000?q>\016\035k(q".toCharArray();
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
        byte byte0 = 123;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 115;
          goto _L8
_L3:
        byte0 = 31;
          goto _L8
_L4:
        byte0 = 18;
          goto _L8
        byte0 = 81;
          goto _L8
    }
}
