// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import d;

// Referenced classes of package com.whatsapp:
//            ViewSharedContactActivity

class q6
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final ViewSharedContactActivity a;

    q6(ViewSharedContactActivity viewsharedcontactactivity)
    {
        a = viewsharedcontactactivity;
        super();
    }

    public void onClick(View view)
    {
        if (ViewSharedContactActivity.a(a))
        {
            ViewSharedContactActivity.a(a, view);
            return;
        } else
        {
            view = ((d)(d)view.getTag()).a;
            view = (new StringBuilder()).append(z[0]).append(view).toString();
            view = new Intent(z[1], Uri.parse(view));
            a.startActivity(view);
            return;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "0\021p\tfbJ+\024t(\026*\036z7\002h\034;;\niVx9\025wFde";
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
                obj = "9\013`\013z1\001*\020{,\000j\r;9\006p\020z6KR0P\017";
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
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 21;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 88;
          goto _L9
_L5:
        byte0 = 101;
          goto _L9
_L6:
        byte0 = 4;
          goto _L9
        byte0 = 121;
          goto _L9
    }
}
