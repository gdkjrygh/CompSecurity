// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;

// Referenced classes of package com.whatsapp:
//            c9, fo, AccountInfoActivity, App

class fw
    implements c9
{

    private static final String z;
    final fo a;

    fw(fo fo1)
    {
        a = fo1;
        super();
    }

    public void a()
    {
label0:
        {
            if (a.a.getIntent().getStringExtra(z) != null)
            {
                a.a.finish();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            AccountInfoActivity.a(a.a);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "Gs)".toCharArray();
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
        byte byte0 = 29;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 45;
          goto _L8
_L3:
        byte0 = 26;
          goto _L8
_L4:
        byte0 = 77;
          goto _L8
        byte0 = 58;
          goto _L8
    }
}
