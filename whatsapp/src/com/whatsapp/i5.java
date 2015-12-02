// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.whatsapp:
//            ContactPicker, og

class i5
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z;
    final ContactPicker a;

    i5(ContactPicker contactpicker)
    {
        a = contactpicker;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent();
        dialoginterface.putExtra(z, ContactPicker.m(a).a);
        a.setResult(-1, dialoginterface);
        a.removeDialog(0);
        a.finish();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "UqD\021}Uj".toCharArray();
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
        byte byte0 = 28;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 54;
          goto _L8
_L3:
        byte0 = 30;
          goto _L8
_L4:
        byte0 = 42;
          goto _L8
        byte0 = 101;
          goto _L8
    }
}
