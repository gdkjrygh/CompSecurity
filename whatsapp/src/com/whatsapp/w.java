// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CheckBox;
import com.whatsapp.fieldstats.ar;
import com.whatsapp.fieldstats.z;
import com.whatsapp.notification.p;

// Referenced classes of package com.whatsapp:
//            App, Conversation, og, mk, 
//            k4

class w
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final Conversation a;
    final CheckBox b;
    final int c[];
    final int d[];

    w(Conversation conversation, int ai[], int ai1[], CheckBox checkbox)
    {
        a = conversation;
        c = ai;
        d = ai1;
        b = checkbox;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        App.au.getSharedPreferences(z[1], 0).edit().putInt(z[0], c[0]).commit();
        long l = (long)d[c[0]] * 60L * 1000L;
        if (mk.c(a.aD.a))
        {
            dialoginterface = new ar();
            dialoginterface.b = Double.valueOf(l);
            dialoginterface.a = Double.valueOf(mk.a(a.aD.a).g());
            com.whatsapp.fieldstats.z.a(a, dialoginterface);
        }
        p.a(a, a.aD.a, l + System.currentTimeMillis(), b.isChecked());
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "FG\024'1GS\02361YC\0136\r^O\b=";
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
                obj = "II\n}\031BG\023 \017ZV8#\034O@\002!\013DE\002 ";
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
        byte byte0 = 110;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 42;
          goto _L9
_L5:
        byte0 = 38;
          goto _L9
_L6:
        byte0 = 103;
          goto _L9
        byte0 = 83;
          goto _L9
    }
}
