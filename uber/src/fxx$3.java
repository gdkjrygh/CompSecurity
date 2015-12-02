// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderApplication;

final class ang.Object
    implements hst
{

    final fxy a;
    final fxx b;

    private RiderApplication b()
    {
        RiderApplication riderapplication = fxy.a(a).ag();
        if (riderapplication == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return riderapplication;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fxx fxx1, fxy fxy1)
    {
        b = fxx1;
        a = fxy1;
        super();
    }
}
