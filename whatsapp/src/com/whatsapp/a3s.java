// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            ContactPickerHelp, App, mu, asw

class a3s
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private static final String z[];
    final ContactPickerHelp a;

    a3s(ContactPickerHelp contactpickerhelp)
    {
        a = contactpickerhelp;
        super();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
label0:
        {
            if (a.l)
            {
                a.l = false;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            StringBuilder stringbuilder = (new StringBuilder()).append(z[1]);
            if (flag)
            {
                compoundbutton = z[0];
            } else
            {
                compoundbutton = z[2];
            }
            Log.i(stringbuilder.append(compoundbutton).toString());
            App.c(a, a.i.isChecked());
            asw.a(new mu(a, null), new Void[0]);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "evi$zcz";
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
                obj = "eqb3pejd\"}v1o%>ere$zcz#";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "spo/teui#";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 17;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 6;
          goto _L9
_L5:
        byte0 = 30;
          goto _L9
_L6:
        byte0 = 12;
          goto _L9
        byte0 = 71;
          goto _L9
    }
}
