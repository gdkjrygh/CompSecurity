// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dzb
{

    private diw a;
    private dfp b;

    private dzb()
    {
    }

    dzb(byte byte0)
    {
        this();
    }

    static dfp a(dzb dzb1)
    {
        return dzb1.b;
    }

    static diw b(dzb dzb1)
    {
        return dzb1.a;
    }

    public final dzb a(dfp dfp)
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

    public final dzb a(diw diw)
    {
        a = diw;
        return this;
    }

    public final dze a()
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
            return new dza(this, (byte)0);
        }
    }
}
