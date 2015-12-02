// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.whatsapp:
//            App, LocationPicker2, t3

class a8b
    implements android.view.View.OnLongClickListener
{

    private static final String z[];
    final LocationPicker2 a;

    a8b(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public boolean onLongClick(View view)
    {
        int i = App.am;
        LocationPicker2.c(a);
        JVM INSTR tableswitch 1 3: default 36
    //                   1 70
    //                   2 110
    //                   3 150;
           goto _L1 _L2 _L3 _L4
_L1:
        LocationPicker2.c(a, false);
        LocationPicker2.a(a, LocationPicker2.d(a), LocationPicker2.u(a), null, false);
        return false;
_L2:
        LocationPicker2.a(a, 2);
        t3.a(1);
        t3.a(3);
        Toast.makeText(a.getApplicationContext(), z[0], 1).show();
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        LocationPicker2.a(a, 3);
        t3.a(1);
        t3.a(2);
        Toast.makeText(a.getApplicationContext(), z[2], 1).show();
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        LocationPicker2.a(a, 1);
        t3.a(2);
        t3.a(3);
        Toast.makeText(a.getApplicationContext(), z[1], 1).show();
        if (true) goto _L1; else goto _L5
_L5:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "!j',P\032x*xG\035=\b7F\000n?-R\000x";
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
                obj = "!j',P\032x*xG\035=\t7\\\025q+";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "!j',P\032x*xG\035=\b9P\027\177!7X";
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
        byte byte0 = 51;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 114;
          goto _L9
_L5:
        byte0 = 29;
          goto _L9
_L6:
        byte0 = 78;
          goto _L9
        byte0 = 88;
          goto _L9
    }
}
