// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Hashtable;

// Referenced classes of package com.whatsapp.protocol:
//            c, ci, cu, cp, 
//            c_

class a_ extends c
{

    private static final String z;
    final ci a;
    final cu b;
    final Runnable c;

    a_(cu cu1, Runnable runnable, ci ci1)
    {
        b = cu1;
        c = runnable;
        a = ci1;
        super();
    }

    public void a(int i)
    {
        if (a != null)
        {
            a.a(i);
        }
    }

    public void a(c_ c_, String s)
    {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable1 = new Hashtable();
        cu.a(b, c_, hashtable, hashtable1, z);
        cu.a(b).c(s, hashtable, hashtable1);
        if (c != null)
        {
            c.run();
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "<\0134".toCharArray();
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
        byte byte0 = 100;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 93;
          goto _L8
_L3:
        byte0 = 111;
          goto _L8
_L4:
        byte0 = 80;
          goto _L8
        byte0 = 119;
          goto _L8
    }
}
