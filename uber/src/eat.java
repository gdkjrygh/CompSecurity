// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eat
{

    private diw a;
    private dfp b;

    private eat()
    {
    }

    eat(byte byte0)
    {
        this();
    }

    static dfp a(eat eat1)
    {
        return eat1.b;
    }

    static diw b(eat eat1)
    {
        return eat1.a;
    }

    public final eat a(dfp dfp)
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

    public final eat a(diw diw)
    {
        a = diw;
        return this;
    }

    public final eba a()
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
            return new eas(this, (byte)0);
        }
    }
}
