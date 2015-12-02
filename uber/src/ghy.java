// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ghy
{

    private diw a;
    private dfp b;

    private ghy()
    {
    }

    ghy(byte byte0)
    {
        this();
    }

    static dfp a(ghy ghy1)
    {
        return ghy1.b;
    }

    static diw b(ghy ghy1)
    {
        return ghy1.a;
    }

    public final ghy a(dfp dfp)
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

    public final ghy a(diw diw)
    {
        a = diw;
        return this;
    }

    public final ghz a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderDialogFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new ghx(this, (byte)0);
        }
    }
}
