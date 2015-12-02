// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            ij, nf, App

class ake
    implements Runnable
{

    private static final String z;
    final ij a;
    private String b;
    private String c;

    ake(ij ij1, String s, String s1)
    {
        a = ij1;
        super();
        b = s;
        c = s1;
    }

    public void run()
    {
        if ((nf)ij.a(a).get(b) != null)
        {
            Log.i((new StringBuilder()).append(z).append(b).append(" ").append(c).toString());
            a.a(b, c);
            App.s(b);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\005\032ZPF\033\013ZND\007GKJN\020\007JW\f".toCharArray();
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
        byte byte0 = 35;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 117;
          goto _L8
_L3:
        byte0 = 104;
          goto _L8
_L4:
        byte0 = 63;
          goto _L8
        byte0 = 35;
          goto _L8
    }
}
