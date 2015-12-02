// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class e
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final ImagePreview a;

    e(ImagePreview imagepreview)
    {
        a = imagepreview;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent();
        view.putParcelableArrayListExtra(z[0], ImagePreview.s(a));
        view.putExtra(z[1], ImagePreview.o(a));
        view.putExtra(z[4], ImagePreview.h(a));
        view.putExtra(z[2], ImagePreview.v(a));
        view.putExtra(z[3], ImagePreview.k(a));
        a.setResult(1, view);
        a.finish();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "@'9xnH-scoU,3~/D1)x`\017\032\tXD`\004";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "S&)kuH&3y";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "B;2zsD*)y";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "B(-~hN'.";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "B;2ztS .";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 214
    //                   1 221
    //                   2 228
    //                   3 235;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_235;
_L3:
        byte byte1 = 1;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 33;
          goto _L9
_L5:
        byte1 = 73;
          goto _L9
_L6:
        byte1 = 93;
          goto _L9
        byte1 = 10;
          goto _L9
    }
}
