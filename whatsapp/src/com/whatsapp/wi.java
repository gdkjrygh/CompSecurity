// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;

// Referenced classes of package com.whatsapp:
//            ir, pr, MediaData, aui

class wi
    implements ir
{

    private static final String z;
    final pr a;

    wi(pr pr1)
    {
        a = pr1;
        super();
    }

    public String a()
    {
        return a.i().file.getName();
    }

    public InputStream b()
    {
        Log.i(z);
        pr.a(a, new aui(this, a.i().file));
        return pr.b(a);
    }

    public long c()
    {
        return -1L;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "_>\004p%G>\031voD4\tz!\\!\001|!M~\nv4@?\035f4Z%\037v!D".toCharArray();
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
        byte byte0 = 64;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 41;
          goto _L8
_L3:
        byte0 = 81;
          goto _L8
_L4:
        byte0 = 109;
          goto _L8
        byte0 = 19;
          goto _L8
    }
}
