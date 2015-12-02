// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.whatsapp.util:
//            d

final class i
    implements ThreadFactory
{

    private static final String z;
    private final AtomicInteger a = new AtomicInteger(1);

    i()
    {
    }

    public Thread newThread(Runnable runnable)
    {
        return new Thread(new d(this, runnable), (new StringBuilder()).append(z).append(a.getAndIncrement()).toString());
    }

    static 
    {
        char ac[];
        int j;
        int k;
        ac = "\006+i\016b\0203xZF>1c\037cq`".toCharArray();
        k = ac.length;
        j = 0;
_L7:
        char c;
        if (k <= j)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[j];
        j % 5;
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
        byte byte0 = 17;
_L8:
        ac[j] = (char)(byte0 ^ c);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 81;
          goto _L8
_L3:
        byte0 = 67;
          goto _L8
_L4:
        byte0 = 8;
          goto _L8
        byte0 = 122;
          goto _L8
    }
}
