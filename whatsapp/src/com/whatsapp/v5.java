// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Environment;
import android.view.View;
import com.whatsapp.util.c1;

// Referenced classes of package com.whatsapp:
//            Conversation, ali, App

class v5
    implements android.view.View.OnLongClickListener
{

    private static final String z;
    final Conversation a;

    v5(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public boolean onLongClick(View view)
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
            c1.a(21, a);
            Conversation.a0 = false;
        }
        return true;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "gu[\024go~".toCharArray();
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
        byte byte0 = 19;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 10;
          goto _L8
_L3:
        byte0 = 26;
          goto _L8
_L4:
        byte0 = 46;
          goto _L8
        byte0 = 122;
          goto _L8
    }
}
