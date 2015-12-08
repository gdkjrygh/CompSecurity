// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            cb, cl, c, cj, 
//            cm

final class cc
    implements Runnable
{

    private cl a;
    private cb b;

    cc(cb cb1, cl cl1)
    {
        b = cb1;
        a = cl1;
        super();
    }

    public final void run()
    {
        cb.b();
        (new StringBuilder("Mock executing ")).append(a.n()).append(" request: ").append(a.g());
        b.a();
        String s = a.e();
        if (c.a(s))
        {
            throw new RuntimeException((new StringBuilder("Blank mock value for ")).append(a.i()).toString());
        }
        a.i().a();
        (new StringBuilder("mock response:")).append(s);
        a.b(s);
        cb.a(a);
        if (!a.a())
        {
            try
            {
                cb.b();
                (new StringBuilder("sleep for [")).append(b.b).append(" ms].");
                Thread.sleep(b.b);
                cb.b();
                (new StringBuilder("end [")).append(b.b).append(" ms] sleep");
            }
            catch (InterruptedException interruptedexception)
            {
                a.i().a();
            }
            b.a.a(a);
        }
    }
}
