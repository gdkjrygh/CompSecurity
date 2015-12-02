// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            App, Advanced

class cw
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z;
    final Advanced a;

    cw(Advanced advanced)
    {
        a = advanced;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        App.q(z);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\005[\027\002!\034B\001".toCharArray();
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
        byte byte0 = 85;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 117;
          goto _L8
_L3:
        byte0 = 52;
          goto _L8
_L4:
        byte0 = 100;
          goto _L8
        byte0 = 107;
          goto _L8
    }
}
