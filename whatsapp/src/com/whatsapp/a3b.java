// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            CorruptInstallationActivity

class a3b
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final CorruptInstallationActivity a;

    a3b(CorruptInstallationActivity corruptinstallationactivity)
    {
        a = corruptinstallationactivity;
        super();
    }

    public void onClick(View view)
    {
        a.startActivity(new Intent(z[0], Uri.parse(z[1])));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "g\005!V\bo\017kM\tr\016+PIg\b1M\bhE\001a+C?\0";
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
                obj = "v\n&O\006a\016\177G\bkE2L\006r\030$T\027";
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
        byte byte0 = 103;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 6;
          goto _L9
_L5:
        byte0 = 107;
          goto _L9
_L6:
        byte0 = 69;
          goto _L9
        byte0 = 36;
          goto _L9
    }
}
