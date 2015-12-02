// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.net.wifi.WifiManager;

// Referenced classes of package com.whatsapp:
//            AccountInfoActivity, App

class a37
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z;
    final AccountInfoActivity a;

    a37(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(7);
        i;
        JVM INSTR tableswitch -2 -1: default 32
    //                   -2 32
    //                   -1 40;
           goto _L1 _L1 _L2
_L1:
        AccountInfoActivity.o(a);
        return;
_L2:
        dialoginterface = (WifiManager)a.getSystemService(z);
        if (dialoginterface != null)
        {
            dialoginterface.setWifiEnabled(false);
            if (App.am == 0);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "[;x{".toCharArray();
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
        byte byte0 = 125;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 44;
          goto _L8
_L3:
        byte0 = 82;
          goto _L8
_L4:
        byte0 = 30;
          goto _L8
        byte0 = 18;
          goto _L8
    }
}
