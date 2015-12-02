// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.view.View;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            ConversationRowMedia, App

class at_ extends bv
{

    private static final String z;
    final ConversationRowMedia b;

    at_(ConversationRowMedia conversationrowmedia)
    {
        b = conversationrowmedia;
        super();
    }

    public void a(View view)
    {
label0:
        {
            if (b.C.l != null)
            {
                App.a((Activity)b.getContext(), b.C);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.e(z);
            App.b(b.getContext(), 0x7f0e020f, 0);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "m!\005bAz`\017cY`,\004mJ.-\016hGo`\006i]}!\fi\016y)\037d\016`/KaKj)\n,Oz4\noFk$".toCharArray();
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
        byte byte0 = 46;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 14;
          goto _L8
_L3:
        byte0 = 64;
          goto _L8
_L4:
        byte0 = 107;
          goto _L8
        byte0 = 12;
          goto _L8
    }
}
