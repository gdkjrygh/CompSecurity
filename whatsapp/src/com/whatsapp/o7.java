// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            ar, FaqItemActivity, vw, SearchFAQ

class o7
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final vw a;
    final ar b;

    o7(ar ar1, vw vw1)
    {
        b = ar1;
        a = vw1;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent(b.a, com/whatsapp/FaqItemActivity);
        view.putExtra(z[2], a.b);
        view.putExtra(z[0], a.c);
        view.putExtra(z[1], a.d);
        b.a.startActivityForResult(view, 1);
        b.a.overridePendingTransition(0x7f040002, 0x7f040003);
        SearchFAQ.a(b.a, a.d.substring(a.d.lastIndexOf('/') + 1));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\013?~\030\"\006$";
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
                obj = "\035\"|";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\0349d\000\"";
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
        byte byte0 = 71;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 104;
          goto _L9
_L5:
        byte0 = 80;
          goto _L9
_L6:
        byte0 = 16;
          goto _L9
        byte0 = 108;
          goto _L9
    }
}
