// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            DescribeProblemActivity

class x5
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final DescribeProblemActivity a;

    x5(DescribeProblemActivity describeproblemactivity)
    {
        a = describeproblemactivity;
        super();
    }

    public void onClick(View view)
    {
        view = z[1];
        view = new Intent(z[0], Uri.parse(view));
        a.startActivity(view);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "0\036-\030,8\024g\003-%\025'\036m0\023=\003,?^\037#\006\006";
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
                obj = "9\004=\0320k_f\0354&^>\002\"%\003(\0323\177\023&\007l7\0218E";
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
        byte byte0 = 67;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 81;
          goto _L9
_L5:
        byte0 = 112;
          goto _L9
_L6:
        byte0 = 73;
          goto _L9
        byte0 = 106;
          goto _L9
    }
}
