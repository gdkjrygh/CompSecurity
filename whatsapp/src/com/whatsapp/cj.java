// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.whatsapp:
//            App, AccountInfoActivity

final class cj
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z;
    final Activity a;

    cj(Activity activity)
    {
        a = activity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        int j = App.am;
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 42
    //                   1 77
    //                   2 84;
           goto _L1 _L2 _L3 _L4
_L1:
        a.removeDialog(116);
        return;
_L2:
        dialoginterface = new Intent(a, com/whatsapp/AccountInfoActivity);
        dialoginterface.putExtra(z, true);
        a.startActivity(dialoginterface);
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        App.r();
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        dialoginterface = new Intent(a, com/whatsapp/AccountInfoActivity);
        a.startActivity(dialoginterface);
        if (true) goto _L1; else goto _L5
_L5:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\003\003\b".toCharArray();
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
        byte byte0 = 88;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 97;
          goto _L8
_L3:
        byte0 = 118;
          goto _L8
_L4:
        byte0 = 113;
          goto _L8
        byte0 = 58;
          goto _L8
    }
}
