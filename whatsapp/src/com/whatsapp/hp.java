// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.view.View;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            ConversationRowVoiceNote, App

class hp
    implements android.view.View.OnClickListener
{

    private static final String z;
    final ConversationRowVoiceNote a;

    hp(ConversationRowVoiceNote conversationrowvoicenote)
    {
        a = conversationrowvoicenote;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (a.C.l != null)
            {
                App.a((Activity)a.getContext(), a.C);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.e(z);
            App.b(a.getContext(), 0x7f0e020f, 0);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\177?6.eh~</}r27!n<3=$c}~5%yo??%*k7,(*r1x-ox79`kh*9#by:".toCharArray();
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
        byte byte0 = 10;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 28;
          goto _L8
_L3:
        byte0 = 94;
          goto _L8
_L4:
        byte0 = 88;
          goto _L8
        byte0 = 64;
          goto _L8
    }
}
