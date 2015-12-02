// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.view.View;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, DeleteAccountConfirmation

class cc
    implements android.view.View.OnClickListener
{

    private static final String z;
    final DeleteAccountConfirmation a;

    cc(DeleteAccountConfirmation deleteaccountconfirmation)
    {
        a = deleteaccountconfirmation;
        super();
    }

    public void onClick(View view)
    {
        if (!App.i())
        {
            Log.i(z);
            a.showDialog(2);
            return;
        } else
        {
            a.showDialog(1);
            DeleteAccountConfirmation.a(a).sendEmptyMessageDelayed(0, 60000L);
            App.am();
            return;
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "q\1772==p{=;=vu0> gwq6&8y16'py*1?|n'".toCharArray();
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
        byte byte0 = 73;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 21;
          goto _L8
_L3:
        byte0 = 26;
          goto _L8
_L4:
        byte0 = 94;
          goto _L8
        byte0 = 88;
          goto _L8
    }
}
