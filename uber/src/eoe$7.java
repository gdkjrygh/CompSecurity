// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

final class ang.Object
    implements hst
{

    final eof a;
    final eoe b;

    private Application b()
    {
        Application application = eof.a(a).b();
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

    (eoe eoe1, eof eof1)
    {
        b = eoe1;
        a = eof1;
        super();
    }
}
