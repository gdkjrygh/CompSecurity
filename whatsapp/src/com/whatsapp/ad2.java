// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            VerifySms, App

class ad2
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final int a;
    final VerifySms b;

    ad2(VerifySms verifysms, int i)
    {
        b = verifysms;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.removeDialog(a);
        VerifySms.c(0);
        VerifySms.t(b);
        App.d(b, 1);
        VerifySms.a(b, z[1]);
        VerifySms.c(b, null);
        b.b(z[0]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\r\000o\020\b\002Hi\024\t";
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
                obj = "\r\000o\020\b\002Hn\024\035";
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
        byte byte0 = 110;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 123;
          goto _L9
_L5:
        byte0 = 101;
          goto _L9
_L6:
        byte0 = 29;
          goto _L9
        byte0 = 121;
          goto _L9
    }
}
