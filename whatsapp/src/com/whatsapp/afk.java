// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.whatsapp:
//            bj, asw, VerifySms

class afk extends Handler
{

    private static final String z;
    final VerifySms a;

    private afk(VerifySms verifysms)
    {
        a = verifysms;
        super();
    }

    afk(VerifySms verifysms, VerifySms._cls1 _pcls1)
    {
        this(verifysms);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            asw.a(new bj(a), new String[] {
                (String)message.obj, z
            });
            break;
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "'\013eL\0040\n".toCharArray();
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
        byte byte0 = 109;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 85;
          goto _L8
_L3:
        byte0 = 110;
          goto _L8
_L4:
        byte0 = 17;
          goto _L8
        byte0 = 62;
          goto _L8
    }
}
