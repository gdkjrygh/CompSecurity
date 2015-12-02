// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ezh
{

    private final ezi a;
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;

    public ezh(ezi ezi, String s)
    {
        e = "";
        f = s;
        a = ezi;
    }

    final ezh a(String s)
    {
        e = s;
        return this;
    }

    public final ezh a(boolean flag)
    {
        d = flag;
        return this;
    }

    public final ezi a()
    {
        return a;
    }

    public final String b()
    {
        return e;
    }

    public final String c()
    {
        return f;
    }

    public final boolean d()
    {
        return b;
    }

    public final boolean e()
    {
        return c;
    }

    public final boolean f()
    {
        return d;
    }

    final ezh g()
    {
        b = true;
        return this;
    }

    public final ezh h()
    {
        c = true;
        return this;
    }
}
