// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderApplication;

public final class ely
    implements cqn
{

    private dal a;
    private RiderApplication b;

    public ely(dal dal1, RiderApplication riderapplication)
    {
        a = dal1;
        b = riderapplication;
    }

    public final String a()
    {
        return a.Z();
    }

    public final void a(String s)
    {
        a.r(s);
    }

    public final void a(boolean flag)
    {
        a.g(flag);
    }

    public final void b(String s)
    {
        a.s(s);
    }

    public final boolean b()
    {
        return a.aa();
    }

    public final void c()
    {
        a.ab();
    }

    public final void d()
    {
        throw new RuntimeException();
    }
}
