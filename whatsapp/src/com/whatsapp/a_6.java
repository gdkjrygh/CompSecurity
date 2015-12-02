// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            tt, e5, App, kr, 
//            aoz

class a_6
    implements Runnable
{

    final e5 a;
    final String b;

    a_6(e5 e5_1, String s)
    {
        a = e5_1;
        b = s;
        super();
    }

    public void run()
    {
        long l = tt.a(b);
        e5.a(a).aq.a(l, null);
        e5.a(a).ab().post(new kr(this, App.ah.d(b)));
    }
}
