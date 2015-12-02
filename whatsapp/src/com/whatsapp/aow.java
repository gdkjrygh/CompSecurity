// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.whatsapp:
//            UserFeedbackActivity

class aow
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final UserFeedbackActivity a;

    aow(UserFeedbackActivity userfeedbackactivity)
    {
        a = userfeedbackactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(123);
        dialoginterface = new Intent(z[0], Uri.parse(z[1]));
        a.startActivity(dialoginterface);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "e\034DYgm\026\016Bfp\027N_&e\021TBgj\\vbMS";
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
                obj = "l\006T[{>]\017Fgf\033LN&p\005I_|a\000\016Hgi]WJWw\006A_}w";
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
    //                   1 162
    //                   2 168
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 8;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 4;
          goto _L9
_L5:
        byte0 = 114;
          goto _L9
_L6:
        byte0 = 32;
          goto _L9
        byte0 = 43;
          goto _L9
    }
}
