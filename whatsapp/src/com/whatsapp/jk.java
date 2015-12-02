// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            ContactInfo, og, ViewProfilePhoto, App

class jk
    implements android.view.View.OnClickListener
{

    private static final String z;
    final ContactInfo a;

    jk(ContactInfo contactinfo)
    {
        a = contactinfo;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (ContactInfo.a(a).C)
            {
                view = new Intent(a, com/whatsapp/ViewProfilePhoto);
                view.putExtra(z, ContactInfo.a(a).a);
                a.startActivity(view);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.b(a, 0x7f0e02b0, 0);
            App.a(ContactInfo.a(a).a, ContactInfo.a(a).q, 2);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "ny7".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 14;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 4;
          goto _L8
_L3:
        byte0 = 16;
          goto _L8
_L4:
        byte0 = 83;
          goto _L8
        byte0 = 63;
          goto _L8
    }
}
