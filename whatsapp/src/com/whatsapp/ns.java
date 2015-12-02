// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            App, k, fi, an

class ns
    implements Runnable
{

    private static final String z;
    final long a;
    final an b;
    final String c;
    final String d;
    final String e;

    ns(an an, String s, long l, String s1, String s2)
    {
        b = an;
        d = s;
        a = l;
        e = s1;
        c = s2;
        super();
    }

    public void run()
    {
        App.az.a(d, a, e);
        App.d(c, d, z);
        App.au.ab().post(new fi(this));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\b<\027\0046\b".toCharArray();
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
        byte byte0 = 67;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 123;
          goto _L8
_L3:
        byte0 = 72;
          goto _L8
_L4:
        byte0 = 118;
          goto _L8
        byte0 = 112;
          goto _L8
    }
}
