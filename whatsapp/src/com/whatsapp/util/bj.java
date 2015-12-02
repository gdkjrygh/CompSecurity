// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.EditText;

// Referenced classes of package com.whatsapp.util:
//            a5, Log

final class bj
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final Activity a;
    final CheckBox b;
    final EditText c;
    final CheckBox d;

    bj(EditText edittext, CheckBox checkbox, CheckBox checkbox1, Activity activity)
    {
        c = edittext;
        d = checkbox;
        b = checkbox1;
        a = activity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            dialoginterface = c.getText();
            if (d.isChecked())
            {
                a5.a(z[0]);
                if (!Log.f)
                {
                    break label0;
                }
            }
            a5.a(z[1]);
        }
        a5.a(b.isChecked());
        a5.b(dialoginterface, a);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "ZU#?&kS%";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "F[?/'i[!.";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 84;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 10;
          goto _L9
_L5:
        byte0 = 58;
          goto _L9
_L6:
        byte0 = 81;
          goto _L9
        byte0 = 75;
          goto _L9
    }
}
