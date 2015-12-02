// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.net.wifi.WifiManager;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, AccountInfoActivity, akm

class ab4
    implements android.view.View.OnClickListener
{

    private static final String z;
    final AccountInfoActivity a;

    ab4(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public void onClick(View view)
    {
        int i = App.am;
        if (!AccountInfoActivity.l(a)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        view = (WifiManager)a.getSystemService(z);
        if (view != null)
        {
            if (!view.isWifiEnabled());
        }
        if (!AccountInfoActivity.i(a))
        {
            break; /* Loop/switch isn't completed */
        }
        AccountInfoActivity.a(a, AccountInfoActivity.c(a), new akm(this));
        if (i == 0) goto _L1; else goto _L3
_L3:
        if (!AccountInfoActivity.d(a))
        {
            break; /* Loop/switch isn't completed */
        }
        AccountInfoActivity.o(a);
        if (i == 0) goto _L1; else goto _L4
_L4:
        a.showDialog(8);
        return;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\"\\\006'".toCharArray();
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
        byte byte0 = 54;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 85;
          goto _L8
_L3:
        byte0 = 53;
          goto _L8
_L4:
        byte0 = 96;
          goto _L8
        byte0 = 78;
          goto _L8
    }
}
