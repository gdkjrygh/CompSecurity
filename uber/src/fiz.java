// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fiz
{

    private final Exception a;
    private final String b;
    private final String c;
    private final String d;

    public fiz(String s, String s1, String s2)
    {
        this(s, s1, s2, null);
    }

    public fiz(String s, String s1, String s2, Exception exception)
    {
        a = exception;
        b = s1;
        c = s2;
        d = s;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final boolean d()
    {
        return a == null;
    }
}
