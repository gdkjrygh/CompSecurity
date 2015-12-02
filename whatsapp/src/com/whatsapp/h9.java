// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import c;

// Referenced classes of package com.whatsapp:
//            ViewSharedContactActivity

class h9
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final c a;
    final ViewSharedContactActivity b;

    h9(ViewSharedContactActivity viewsharedcontactactivity, c c1)
    {
        b = viewsharedcontactactivity;
        a = c1;
        super();
    }

    public void onClick(View view)
    {
        if (ViewSharedContactActivity.a(b))
        {
            ViewSharedContactActivity.a(b, view);
        }
        if (a.b.equals(z[0]))
        {
            view = new Intent(z[1], Uri.parse(view.getTag().toString()));
            b.startActivity(view);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\nlN";
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
                obj = ">Pfh~6Z,s\177+[ln?>]vs~1\020TST\b";
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
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 17;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 95;
          goto _L9
_L5:
        byte0 = 62;
          goto _L9
_L6:
        byte0 = 2;
          goto _L9
        byte0 = 26;
          goto _L9
    }
}
