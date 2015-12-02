// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggo
{

    private ggf a;
    private djb b;
    private dfp c;

    private ggo()
    {
    }

    ggo(byte byte0)
    {
        this();
    }

    static dfp a(ggo ggo1)
    {
        return ggo1.c;
    }

    static djb b(ggo ggo1)
    {
        return ggo1.b;
    }

    static ggf c(ggo ggo1)
    {
        return ggo1.a;
    }

    public final gge a()
    {
        if (a == null)
        {
            a = new ggf();
        }
        if (b == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (c == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new ggn(this, (byte)0);
        }
    }

    public final ggo a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            c = dfp;
            return this;
        }
    }

    public final ggo a(djb djb)
    {
        b = djb;
        return this;
    }
}
