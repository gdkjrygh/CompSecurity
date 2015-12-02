// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            VerifySms

class km
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final int a;
    final VerifySms b;

    km(VerifySms verifysms, int i)
    {
        b = verifysms;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.removeDialog(a);
        VerifySms verifysms = b;
        if (a == 26)
        {
            dialoginterface = z[0];
        } else
        {
            dialoginterface = z[1];
        }
        verifysms.b(dialoginterface);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "rw~} }?y9";
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
                obj = "rw~} }?nd";
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
        byte byte0 = 70;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 4;
          goto _L9
_L5:
        byte0 = 18;
          goto _L9
_L6:
        byte0 = 12;
          goto _L9
        byte0 = 20;
          goto _L9
    }
}
