// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            ListChatInfo, og, App, Main

class ef
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z;
    final ListChatInfo a;

    ef(ListChatInfo listchatinfo)
    {
        a = listchatinfo;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Log.i(z);
        App.k(ListChatInfo.d(a).a);
        App.n(ListChatInfo.d(a).a);
        dialoginterface = (new Intent(App.au.getApplicationContext(), Main.g())).addFlags(0x24000000);
        a.startActivity(dialoginterface);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ")CiW3&B{W3,D|LC*DyO\005&AEO\t$\\\177d\036*_j".toCharArray();
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
        byte byte0 = 108;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 69;
          goto _L8
_L3:
        byte0 = 42;
          goto _L8
_L4:
        byte0 = 26;
          goto _L8
        byte0 = 35;
          goto _L8
    }
}
