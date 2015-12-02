// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Set;

// Referenced classes of package com.whatsapp:
//            ch, e5, App

class p3
    implements Runnable
{

    private static final String z;
    final ch a;

    p3(ch ch1)
    {
        a = ch1;
        super();
    }

    public void run()
    {
        e5.a(a.a).c.remove((new StringBuilder()).append(App.k()).append(z).toString());
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\033l6\036\034:kk\b\004+1v\f\0".toCharArray();
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
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 116;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 91;
          goto _L8
_L3:
        byte0 = 31;
          goto _L8
_L4:
        byte0 = 24;
          goto _L8
        byte0 = 105;
          goto _L8
    }
}
