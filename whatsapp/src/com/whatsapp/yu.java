// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.PendingIntent;
import android.os.Bundle;
import com.android.vending.billing.IInAppBillingService;

// Referenced classes of package com.whatsapp:
//            _7, dc, akd, aus, 
//            App

class yu
    implements _7
{

    private static final String z[];
    final String a;
    final dc b;
    final String c;

    yu(dc dc1, String s, String s1)
    {
        b = dc1;
        a = s;
        c = s1;
        super();
    }

    public void a()
    {
label0:
        {
            Object obj = dc.e(b).a.getBuyIntent(3, dc.a(b), a, z[1], c);
            int i = dc.a(b, ((Bundle) (obj)));
            if (i == 0)
            {
                obj = (PendingIntent)((Bundle) (obj)).getParcelable(z[0]);
                dc.a().a(((PendingIntent) (obj)));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            dc.a().a(i);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "+[\032\"\037'Z\0063\002";
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
                obj = "\000`\"\r&";
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
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 86;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 105;
          goto _L9
_L5:
        byte0 = 14;
          goto _L9
_L6:
        byte0 = 67;
          goto _L9
        byte0 = 125;
          goto _L9
    }
}
