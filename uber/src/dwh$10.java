// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

final class ng.Object
    implements hst
{

    final dwi a;
    final dwh b;

    private Application b()
    {
        Application application = dwi.a(a).C();
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

    ct(dwh dwh1, dwi dwi1)
    {
        b = dwh1;
        a = dwi1;
        super();
    }
}
