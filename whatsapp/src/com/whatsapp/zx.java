// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            dw, RegisterName

class zx
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final dw a;

    zx(dw dw1)
    {
        a = dw1;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent(z[0], Uri.parse(z[1]));
        a.d.startActivity(view);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\027mk^\027\037g!E\026\002faXV\027`{E\027\030-Ye=!";
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
                obj = "\036w{\\\013L, N\024\031d![\020\027w|M\b\006-lC\025Ybk_";
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
    //                   2 168
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 120;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 118;
          goto _L9
_L5:
        byte0 = 3;
          goto _L9
_L6:
        byte0 = 15;
          goto _L9
        byte0 = 44;
          goto _L9
    }
}
