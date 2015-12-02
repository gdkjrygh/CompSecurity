// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import com.whatsapp.mk;
import com.whatsapp.protocol.ci;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            av

class k
    implements ci
{

    private static final String z;
    final av a;

    k(av av)
    {
        a = av;
        super();
    }

    public void a(int i)
    {
        Log.e(z);
        mk.h();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "c;;\020\006l$\"\024Liy,\022Fn&\002\016@o\020*\tE~2".toCharArray();
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
        byte byte0 = 41;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 27;
          goto _L8
_L3:
        byte0 = 86;
          goto _L8
_L4:
        byte0 = 75;
          goto _L8
        byte0 = 96;
          goto _L8
    }
}
