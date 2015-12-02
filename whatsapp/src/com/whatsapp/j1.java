// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import a;
import android.content.Intent;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            ViewSharedContactActivity, App

class j1
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final ViewSharedContactActivity a;

    j1(ViewSharedContactActivity viewsharedcontactactivity)
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
            view = PhoneNumberUtils.stripSeparators(((a)(a)view.getTag()).a);
            view = new Intent(z[0], Uri.parse((new StringBuilder()).append(z[1]).append(view).toString()));
            view.setFlags(0x10000000);
            App.a(a, view);
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
        obj = "|lo\037%tf%\004$ige\031d|a\177\004%s,O$\013Q";
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
                obj = "iggWe2";
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
        byte byte0 = 74;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 29;
          goto _L9
_L5:
        byte0 = 2;
          goto _L9
_L6:
        byte0 = 11;
          goto _L9
        byte0 = 109;
          goto _L9
    }
}
