// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eup
{

    private diw a;
    private dfp b;

    private eup()
    {
    }

    eup(byte byte0)
    {
        this();
    }

    static dfp a(eup eup1)
    {
        return eup1.b;
    }

    static diw b(eup eup1)
    {
        return eup1.a;
    }

    public final eup a(dfp dfp)
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

    public final eup a(diw diw)
    {
        a = diw;
        return this;
    }

    public final euu a()
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
            return new euo(this, (byte)0);
        }
    }
}
