// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            RegisterPhone, CountryPicker, a8z, App

class atq extends bv
{

    private static final String z[];
    final RegisterPhone b;

    atq(RegisterPhone registerphone)
    {
        b = registerphone;
        super();
    }

    public void a(View view)
    {
label0:
        {
            Log.i((new StringBuilder()).append(z[0]).append(RegisterPhone.a(b)).append(z[1]).append(b.r).toString());
            if (RegisterPhone.a(b) == null && b.r == null)
            {
                view = new Intent(b, com/whatsapp/CountryPicker);
                view.putExtra(CountryPicker.c, b.u.d.getText().toString());
                b.startActivityForResult(view, 0);
                b.u.b.removeTextChangedListener(b.u.h);
                RegisterPhone.a(b, true);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.i((new StringBuilder()).append(z[3]).append(RegisterPhone.a(b)).append(z[2]).append(b.r).toString());
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\bNiB0\016N|\0043\022D`Nl\031D{E7\bR~B \021N|\004 \026Bm@&\036\013`\026";
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
                obj = "Z[3";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Z[3";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\bNiB0\016N|\0043\022D`Nl\031D{E7\bR~B \021N|\004 \026Bm@&\036\004jB\"\026Di\0065\023XgI/\037\004}@*\n\013`\026";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 67;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 122;
          goto _L9
_L5:
        byte0 = 43;
          goto _L9
_L6:
        byte0 = 14;
          goto _L9
        byte0 = 43;
          goto _L9
    }
}
