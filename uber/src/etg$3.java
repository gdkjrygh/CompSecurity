// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

final class ang.Object
    implements hst
{

    final eth a;
    final etg b;

    private Application b()
    {
        Application application = eth.a(a).b();
        if (application == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return application;
        }
    }

    public final Object a()
    {
        return b();
    }

    (etg etg1, eth eth1)
    {
        b = etg1;
        a = eth1;
        super();
    }
}
