// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;

// Referenced classes of package com.whatsapp:
//            App, PhotoView, od

class a87
    implements Runnable
{

    final int a;
    final od b;
    final Bitmap c;
    final PhotoView d;

    a87(od od, int i, PhotoView photoview, Bitmap bitmap)
    {
        b = od;
        a = i;
        d = photoview;
        c = bitmap;
        super();
    }

    public void run()
    {
        int i = App.am;
        a;
        JVM INSTR tableswitch 3 8: default 48
    //                   3 83
    //                   4 48
    //                   5 48
    //                   6 69
    //                   7 48
    //                   8 97;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L4
_L1:
        d.setRotation(0.0F, false);
_L5:
        d.a(c);
        return;
_L3:
        d.setRotation(90F, false);
        if (i == 0) goto _L5; else goto _L2
_L2:
        d.setRotation(180F, false);
        if (i == 0) goto _L5; else goto _L4
_L4:
        d.setRotation(270F, false);
        if (i == 0) goto _L5; else goto _L1
    }
}
