// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, Advanced

class asu
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final Advanced a;

    asu(Advanced advanced)
    {
        a = advanced;
        super();
    }

    public void onClick(View view)
    {
        App.q(z[0]);
        Advanced.a(android.provider.ContactsContract.RawContacts.CONTENT_URI, z[2]);
        App.q(z[1]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "7MdWI!Y~\007\0136_`I";
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
                obj = "7MdWI!Y~\007\f=\\";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "!Y~\t\035+L";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 105;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 83;
          goto _L9
_L5:
        byte0 = 56;
          goto _L9
_L6:
        byte0 = 9;
          goto _L9
        byte0 = 39;
          goto _L9
    }
}
