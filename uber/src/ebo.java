// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ebo
{

    private diw a;
    private dfp b;

    private ebo()
    {
    }

    ebo(byte byte0)
    {
        this();
    }

    static dfp a(ebo ebo1)
    {
        return ebo1.b;
    }

    static diw b(ebo ebo1)
    {
        return ebo1.a;
    }

    public final ebo a(dfp dfp)
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

    public final ebo a(diw diw)
    {
        a = diw;
        return this;
    }

    public final ecf a()
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
            return new ebn(this, (byte)0);
        }
    }
}
