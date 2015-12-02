// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.whatsapp:
//            ChangeNumber

class al7
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final ChangeNumber a;

    al7(ChangeNumber changenumber)
    {
        a = changenumber;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(109);
        dialoginterface = new Intent(z[1], Uri.parse(z[0]));
        a.startActivity(dialoginterface);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "U+\003\"\003\007pX?\037_6\0337^I(\036&\004X-Y1\037Pp\0003/N+\026&\005N";
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
                obj = "\\1\023 \037T;Y;\036I:\031&^\\<\003;\037Sq!\0335j";
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
        byte byte0 = 112;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 61;
          goto _L9
_L5:
        byte0 = 95;
          goto _L9
_L6:
        byte0 = 119;
          goto _L9
        byte0 = 82;
          goto _L9
    }
}
