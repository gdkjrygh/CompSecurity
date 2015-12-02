// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            a90, e5, App

final class ss
    implements Runnable
{

    private static final String z;
    final a90 a;
    private final boolean b;

    ss(a90 a90_1, boolean flag)
    {
        a = a90_1;
        super();
        b = flag;
    }

    public void run()
    {
        Log.i((new StringBuilder()).append(z).append(b).toString());
        e5.a(a.f).c.remove(a.e);
        if (b)
        {
            App.aG();
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "FLl5\f@Wh*\016\005@`)\fGBb.@CLse\017Kdd10WFJ \031vVb&\005VP;e".toCharArray();
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
        byte byte0 = 96;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 37;
          goto _L8
_L3:
        byte0 = 35;
          goto _L8
_L4:
        byte0 = 1;
          goto _L8
        byte0 = 69;
          goto _L8
    }
}
