// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.net.Uri;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            QuickContactActivity, og, dh, App

class a_k
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final QuickContactActivity a;

    a_k(QuickContactActivity quickcontactactivity)
    {
        a = quickcontactactivity;
        super();
    }

    public void onClick(View view)
    {
        App.a(a, Uri.parse((new StringBuilder()).append(z[0]).append(QuickContactActivity.b(a).z.a()).toString()), a.getString(0x7f0e0442, new Object[] {
            z[1]
        }));
        QuickContactActivity.a(a, false);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "0!]7fy";
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
                obj = "+8Z3zyc\0014a\"8]\"y3bM,dl(Bl";
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
        byte byte0 = 9;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 67;
          goto _L9
_L5:
        byte0 = 76;
          goto _L9
_L6:
        byte0 = 46;
          goto _L9
        byte0 = 67;
          goto _L9
    }
}
