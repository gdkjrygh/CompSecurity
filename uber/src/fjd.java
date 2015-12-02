// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fjd
{

    private final Exception a;
    private final String b;
    private final String c;
    private final int d;
    private final long e;
    private final String f;

    public fjd(int i, String s, String s1, String s2, long l)
    {
        this(i, s, s1, s2, l, null);
    }

    public fjd(int i, String s, String s1, String s2, long l, Exception exception)
    {
        a = exception;
        b = s1;
        c = s2;
        d = i;
        e = l;
        f = s;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final long d()
    {
        return e;
    }

    public final String e()
    {
        return f;
    }

    public final boolean f()
    {
        return a == null;
    }
}
