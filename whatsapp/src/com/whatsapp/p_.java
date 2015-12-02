// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CheckBox;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            App, abl, hd

final class p_
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final hd a;
    final Activity b;
    final int c;
    final CheckBox d;
    final boolean e;
    final String f;
    final Collection g;

    p_(Activity activity, int i, CheckBox checkbox, boolean flag, String s, Collection collection, hd hd1)
    {
        b = activity;
        c = i;
        d = checkbox;
        e = flag;
        f = s;
        g = collection;
        a = hd1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            b.removeDialog(c);
            boolean flag;
            if (d != null && d.isChecked())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag != e)
            {
                App.au.getSharedPreferences(z[1], 0).edit().putBoolean(z[0], flag).commit();
            }
            App.a(f, g, flag);
            if (g.size() == 1)
            {
                App.b(b.getBaseContext(), 0x7f0e0251, 0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.b(b.getBaseContext(), String.format(App.j.a(0x7f0d0015, g.size()), new Object[] {
                Integer.valueOf(g.size())
            }), 0);
        }
        a.a();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "Fg#u\177Rp*vTSJ+vD_t";
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
                obj = "Uz+=W^t2`AFe\031cRSs#aEXv#`";
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
        byte byte0 = 32;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 54;
          goto _L9
_L5:
        byte0 = 21;
          goto _L9
_L6:
        byte0 = 70;
          goto _L9
        byte0 = 19;
          goto _L9
    }
}
