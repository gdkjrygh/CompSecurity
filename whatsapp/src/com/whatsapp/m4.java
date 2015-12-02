// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;

// Referenced classes of package com.whatsapp:
//            App, Conversation, nh

class m4
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z;
    final Conversation a;

    m4(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            if (!App.i())
            {
                Log.w(z);
                App.b(a.getBaseContext(), 0x7f0e02ad, 0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Conversation.k(a, true);
            a.showDialog(107);
            x.a(new nh(this));
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "y\017V}\034h\023Y\177\020u\016\027o\020{\fWlVx\fWh\0225\016W&\027\177\024Od\013qM[j\027t\017L&\033v\017[`".toCharArray();
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
        byte byte0 = 121;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 26;
          goto _L8
_L3:
        byte0 = 96;
          goto _L8
_L4:
        byte0 = 56;
          goto _L8
        byte0 = 11;
          goto _L8
    }
}
