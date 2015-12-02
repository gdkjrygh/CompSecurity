// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fdt
{

    private djb a;
    private dfp b;

    private fdt()
    {
    }

    fdt(byte byte0)
    {
        this();
    }

    static dfp a(fdt fdt1)
    {
        return fdt1.b;
    }

    static djb b(fdt fdt1)
    {
        return fdt1.a;
    }

    public final fdt a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            b = dfp;
            return this;
        }
    }

    public final fdt a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fee a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new fds(this, (byte)0);
        }
    }
}
