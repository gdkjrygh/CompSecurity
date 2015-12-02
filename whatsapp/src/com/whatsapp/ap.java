// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, js, Advanced

class ap
    implements android.view.View.OnClickListener
{

    private static final String z;
    final Advanced a;

    ap(Advanced advanced)
    {
        a = advanced;
        super();
    }

    public void onClick(View view)
    {
        App.q(z);
        (new Thread(new js(this))).start();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "/Pl}b)".toCharArray();
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
    //                   0 85
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 5;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 74;
          goto _L8
_L3:
        byte0 = 49;
          goto _L8
_L4:
        byte0 = 24;
          goto _L8
        byte0 = 93;
          goto _L8
    }
}
