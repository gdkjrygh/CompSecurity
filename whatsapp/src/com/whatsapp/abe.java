// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            App, aoa, qa, p5

class abe
    implements Runnable
{

    final p5 a;
    final qa b;

    abe(p5 p5_1, qa qa1)
    {
        a = p5_1;
        b = qa1;
        super();
    }

    public void run()
    {
        int i = App.am;
        aoa.a[b.ordinal()];
        JVM INSTR tableswitch 1 5: default 48
    //                   1 49
    //                   2 62
    //                   3 75
    //                   4 115
    //                   5 128;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        App.b(App.au, 0x7f0e03d4, 0);
        if (i == 0) goto _L1; else goto _L3
_L3:
        App.a(App.au, 0x7f0e015f, 0);
        if (i == 0) goto _L1; else goto _L4
_L4:
        if (a.k.w != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        App.a(App.au, 0x7f0e0159, 0);
        if (i == 0) goto _L1; else goto _L7
_L7:
        App.a(App.au, 0x7f0e0156, 0);
        if (i == 0) goto _L1; else goto _L5
_L5:
        App.a(App.au, 0x7f0e0163, 0);
        if (i == 0) goto _L1; else goto _L6
_L6:
        App.a(App.au, 0x7f0e02a4, 0);
        return;
    }
}
