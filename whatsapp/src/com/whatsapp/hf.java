// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            App, og, aoz, z3, 
//            dx

final class hf
    implements Runnable
{

    final og a;
    final dx b;
    final Activity c;
    final boolean d;
    final Handler e;

    hf(og og1, boolean flag, Handler handler, dx dx, Activity activity)
    {
        a = og1;
        d = flag;
        e = handler;
        b = dx;
        c = activity;
        super();
    }

    public void run()
    {
        java.util.ArrayList arraylist = App.ah.a(a.a, d);
        e.post(new z3(this, arraylist));
    }
}
