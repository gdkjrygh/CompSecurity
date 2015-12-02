// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.bd;
import java.util.Set;
import org.whispersystems.aa;

// Referenced classes of package com.whatsapp:
//            App

class r5
    implements Runnable
{

    private static final String z;
    final byte a[];
    final bd b;
    final bd c[];
    final int d;
    final App e;

    r5(App app, byte abyte0[], int i, bd abd[], bd bd)
    {
        e = app;
        a = abyte0;
        d = i;
        c = abd;
        b = bd;
        super();
    }

    public void run()
    {
        e.c.remove((new StringBuilder()).append(App.k()).append(z).toString());
        App.a(a, aa.a(d), (byte)5, c, b);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\026o\004;\0137hY-\023&2D)\027".toCharArray();
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
        byte byte0 = 99;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 86;
          goto _L8
_L3:
        byte0 = 28;
          goto _L8
_L4:
        byte0 = 42;
          goto _L8
        byte0 = 76;
          goto _L8
    }
}
