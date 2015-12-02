// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dzd
{

    private diw a;
    private dfp b;

    private dzd()
    {
    }

    dzd(byte byte0)
    {
        this();
    }

    static dfp a(dzd dzd1)
    {
        return dzd1.b;
    }

    static diw b(dzd dzd1)
    {
        return dzd1.a;
    }

    public final dzd a(dfp dfp)
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

    public final dzd a(diw diw)
    {
        a = diw;
        return this;
    }

    public final dzg a()
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
            return new dzc(this, (byte)0);
        }
    }
}
