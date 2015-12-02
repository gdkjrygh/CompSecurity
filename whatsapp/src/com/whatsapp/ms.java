// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Environment;
import android.view.View;
import com.whatsapp.util.c1;

// Referenced classes of package com.whatsapp:
//            Conversation, ali, App

class ms
    implements android.view.View.OnClickListener
{

    private static final String z;
    final Conversation a;

    ms(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            Conversation.ae(a).dismiss();
            if (!Environment.getExternalStorageState().equals(z))
            {
                a.showDialog(15);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            c1.a(23, a);
            Conversation.a0 = false;
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\022\007=+\027\032\f".toCharArray();
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
        byte byte0 = 99;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 127;
          goto _L8
_L3:
        byte0 = 104;
          goto _L8
_L4:
        byte0 = 72;
          goto _L8
        byte0 = 69;
          goto _L8
    }
}
