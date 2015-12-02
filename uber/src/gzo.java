// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gzo extends RuntimeException
{

    private final gzt a;
    private final int b;
    private final String c;

    private gzo(gzt gzt, int i, String s, Throwable throwable)
    {
        super(s, throwable);
        a = gzt;
        b = i;
        c = s;
    }

    public static gzo a(gzt gzt, String s)
    {
        return new gzo(gzt, gzp.a, s, null);
    }

    public static gzo a(String s)
    {
        return new gzo(null, gzp.b, s, null);
    }

    public static gzo a(String s, Throwable throwable)
    {
        return new gzo(null, gzp.d, s, throwable);
    }

    public static gzo b(String s)
    {
        return new gzo(null, gzp.c, s, null);
    }

    public static gzo b(String s, Throwable throwable)
    {
        return new gzo(null, gzp.f, s, throwable);
    }

    public static gzo c(String s)
    {
        return new gzo(null, gzp.e, s, null);
    }

    public final gzt a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final String getMessage()
    {
        return c;
    }
}
