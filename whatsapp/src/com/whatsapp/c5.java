// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Address;
import android.text.Html;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            a1w, LocationPicker2, PlaceInfo

class c5
    implements Runnable
{

    private static final String z[];
    final a1w a;
    final Address b;
    final StringBuilder c;

    c5(a1w a1w1, Address address, StringBuilder stringbuilder)
    {
        a = a1w1;
        b = address;
        c = stringbuilder;
        super();
    }

    public void run()
    {
        if (b.getMaxAddressLineIndex() > 0)
        {
            LocationPicker2.w(a.a).name = b.getAddressLine(0);
        }
        LocationPicker2.w(a.a).address = c.toString();
        LocationPicker2.n(a.a).setText(Html.fromHtml((new StringBuilder()).append(z[0]).append(a.a.getString(0x7f0e0379)).append(z[1]).append(c.toString()).toString()));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "U\027^";
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
                obj = "UZ\002.n\013\007O.";
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
        byte byte0 = 82;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 105;
          goto _L9
_L5:
        byte0 = 117;
          goto _L9
_L6:
        byte0 = 96;
          goto _L9
        byte0 = 16;
          goto _L9
    }
}
