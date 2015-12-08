// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Message;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            cm, bb, ax, av, 
//            cj, cl, x, ch, 
//            b, c, bd

public class aw
    implements cm
{

    private static final String a = com/paypal/android/sdk/onetouch/core/aw.getSimpleName();
    private final b b;
    private ax c;
    private av d;
    private final bb e = new bb();
    private ch f;

    public aw(b b1, av av1, c c1)
    {
        b = b1;
        d = av1;
        c = new ax(this);
    }

    static void a(aw aw1, cl cl1)
    {
        aw1.e.a(cl1, 0L);
    }

    public final String a()
    {
        return d.a();
    }

    public final String a(cj cj1)
    {
        (new StringBuilder("environment:")).append(d).append(" environment.getEndpoints():").append(d.b());
        if (d != null && d.b() != null)
        {
            cj1 = (String)d.b().get(cj1.a());
            (new StringBuilder("returning:")).append(cj1);
            return cj1;
        } else
        {
            return null;
        }
    }

    public final void a(bd bd)
    {
        e.a(bd);
    }

    public final void a(ch ch1)
    {
        if (f != null)
        {
            throw new IllegalStateException();
        } else
        {
            f = ch1;
            return;
        }
    }

    public final void a(cl cl1)
    {
        cl.l();
        x.a().e();
        if (!cl1.a())
        {
            Message message = new Message();
            message.what = 2;
            message.obj = cl1;
            c.sendMessage(message);
        }
    }

    public final b b()
    {
        return b;
    }

    public final void b(cl cl1)
    {
        f.a(cl1);
    }

}
