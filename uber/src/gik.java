// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gik
{

    private diw a;
    private dfp b;

    private gik()
    {
    }

    gik(byte byte0)
    {
        this();
    }

    static dfp a(gik gik1)
    {
        return gik1.b;
    }

    static diw b(gik gik1)
    {
        return gik1.a;
    }

    public final gik a(dfp dfp)
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

    public final gik a(diw diw)
    {
        a = diw;
        return this;
    }

    public final gix a()
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
            return new gij(this, (byte)0);
        }
    }
}
