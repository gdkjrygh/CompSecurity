// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            App, k, a1c, an

class xb
    implements Runnable
{

    private static final String z;
    final String a;
    final String b;
    final an c;

    xb(an an, String s, String s1)
    {
        c = an;
        b = s;
        a = s1;
        super();
    }

    public void run()
    {
        App.az.g(b);
        App.d(a, b, z);
        App.au.ab().post(new a1c(this));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "{c\027\177b{".toCharArray();
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
        byte byte0 = 23;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 8;
          goto _L8
_L3:
        byte0 = 23;
          goto _L8
_L4:
        byte0 = 118;
          goto _L8
        byte0 = 11;
          goto _L8
    }
}
