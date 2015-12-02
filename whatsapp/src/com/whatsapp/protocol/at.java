// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Hashtable;

// Referenced classes of package com.whatsapp.protocol:
//            c, ci, cu, cp, 
//            c_

class at extends c
{

    private static final String z;
    final cu a;
    final Runnable b;
    final ci c;

    at(cu cu1, Runnable runnable, ci ci1)
    {
        a = cu1;
        b = runnable;
        c = ci1;
        super();
    }

    public void a(int i)
    {
        if (c != null)
        {
            c.a(i);
        }
    }

    public void a(c_ c_, String s)
    {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable1 = new Hashtable();
        cu.a(a, c_, hashtable, hashtable1, z);
        cu.a(a).b(s, hashtable, hashtable1);
        if (b != null)
        {
            b.run();
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "G\007tK)P".toCharArray();
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
        byte byte0 = 95;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 53;
          goto _L8
_L3:
        byte0 = 98;
          goto _L8
_L4:
        byte0 = 25;
          goto _L8
        byte0 = 36;
          goto _L8
    }
}
