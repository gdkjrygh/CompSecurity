// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ak;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            App, k, Advanced, oh, 
//            aby

class lp
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final Advanced a;

    lp(Advanced advanced)
    {
        a = advanced;
        super();
    }

    public void onClick(View view)
    {
        App.az.c();
        ak.a(new File(a.getFilesDir(), z[1]));
        ak.a(new File(App.aK, z[0]));
        App.az.f().a(0, 0);
        (new aby(null)).start();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\016%5qj22zGj=#/ef-";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "\037!;cb,$";
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
    //                   0 156
    //                   1 162
    //                   2 168
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 3;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 94;
          goto _L9
_L5:
        byte0 = 87;
          goto _L9
_L6:
        byte0 = 90;
          goto _L9
        byte0 = 23;
          goto _L9
    }
}
