// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

final class ang.Object
    implements hst
{

    final dxu a;
    final dxt b;

    private Application b()
    {
        Application application = dxu.a(a).C();
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

    (dxt dxt1, dxu dxu1)
    {
        b = dxt1;
        a = dxu1;
        super();
    }
}
