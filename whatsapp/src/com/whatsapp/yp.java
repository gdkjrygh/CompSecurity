// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, Conversation, vk, ContactInfo

class yp
    implements android.view.View.OnClickListener
{

    private static final String z;
    final vk a;
    final ContactInfo b;

    yp(ContactInfo contactinfo, vk vk1)
    {
        b = contactinfo;
        a = vk1;
        super();
    }

    public void onClick(View view)
    {
        view = (new Intent(App.au.getApplicationContext(), com/whatsapp/Conversation)).putExtra(z, vk.d(a)).addFlags(0x14000000);
        b.startActivity(view);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "b\004\024".toCharArray();
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
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 109;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 8;
          goto _L8
_L3:
        byte0 = 109;
          goto _L8
_L4:
        byte0 = 112;
          goto _L8
        byte0 = 22;
          goto _L8
    }
}
