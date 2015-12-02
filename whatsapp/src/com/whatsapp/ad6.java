// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.whatsapp:
//            LocationPicker, App, t3

class ad6
    implements android.view.View.OnLongClickListener
{

    private static final String z[];
    final LocationPicker a;

    ad6(LocationPicker locationpicker)
    {
        a = locationpicker;
        super();
    }

    public boolean onLongClick(View view)
    {
label0:
        {
            boolean flag;
            if (!LocationPicker.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            LocationPicker.a(flag);
            if (LocationPicker.b() || !App.ar())
            {
                t3.a(1);
                Toast.makeText(a.getApplicationContext(), z[1], 1).show();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            t3.a(2);
            Toast.makeText(a.getApplicationContext(), z[0], 1).show();
        }
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "$'o\017]\0375b[J\030pA\024Q\020<c";
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
                obj = "$'o\017]\0375b[J\030p@\024K\005#w\016_\0055";
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
        char c = obj[j];
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
        byte byte0 = 62;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 119;
          goto _L9
_L5:
        byte0 = 80;
          goto _L9
_L6:
        byte0 = 6;
          goto _L9
        byte0 = 123;
          goto _L9
    }
}
