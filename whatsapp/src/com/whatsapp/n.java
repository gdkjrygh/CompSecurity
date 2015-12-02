// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            h_, td, App

class n
    implements Runnable
{

    final td a;

    n(td td1)
    {
        a = td1;
        super();
    }

    public void run()
    {
        h_ h_1 = new h_(this, td.g(a), false);
        td.b(a).removeCallbacks(td.d(a));
        td.b(a).postDelayed(td.d(a), td.i(a));
        App.a(h_1);
        td.c(a);
    }
}
