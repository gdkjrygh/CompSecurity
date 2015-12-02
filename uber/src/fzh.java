// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fzh
{

    private djb a;
    private fzq b;
    private dfp c;

    private fzh()
    {
    }

    fzh(byte byte0)
    {
        this();
    }

    static dfp a(fzh fzh1)
    {
        return fzh1.c;
    }

    static djb b(fzh fzh1)
    {
        return fzh1.a;
    }

    static fzq c(fzh fzh1)
    {
        return fzh1.b;
    }

    public final fzh a(dfp dfp)
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

    public final fzh a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fzh a(fzq fzq)
    {
        if (fzq == null)
        {
            throw new NullPointerException("mapFragmentModule");
        } else
        {
            b = fzq;
            return this;
        }
    }

    public final fzp a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("mapFragmentModule must be set");
        }
        if (c == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new fzg(this, (byte)0);
        }
    }
}
