// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.contact.n;

// Referenced classes of package com.whatsapp:
//            App, aoc, ContactPicker, hs, 
//            s3

class kk
    implements Runnable
{

    final n a;
    final aoc b;

    kk(aoc aoc1, n n1)
    {
        b = aoc1;
        a = n1;
        super();
    }

    public void run()
    {
        int i;
        i = App.am;
        b.a.setSupportProgressBarIndeterminateVisibility(false);
        ContactPicker.c(b.a);
        ContactPicker.b(b.a);
        hs.a[a.ordinal()];
        JVM INSTR tableswitch 1 6: default 84
    //                   1 85
    //                   2 118
    //                   3 134
    //                   4 134
    //                   5 157
    //                   6 173;
           goto _L1 _L2 _L3 _L4 _L4 _L5 _L6
_L1:
        return;
_L2:
        App.ay.c(true);
        App.au.a(System.currentTimeMillis());
        App.b(b.a, 0x7f0e009c, 0);
        if (i == 0) goto _L1; else goto _L3
_L3:
        b.a.a(0x7f0e009a);
        if (i == 0) goto _L1; else goto _L4
_L4:
        b.a.a(0x7f0e0099);
        App.ay.a(true);
        if (i == 0) goto _L1; else goto _L5
_L5:
        b.a.a(0x7f0e009b);
        if (i == 0) goto _L1; else goto _L6
_L6:
        b.a.showDialog(4);
        App.ay.a(true);
        return;
    }
}
