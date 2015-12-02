// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fnt
{

    private djb a;
    private dfp b;

    private fnt()
    {
    }

    fnt(byte byte0)
    {
        this();
    }

    static dfp a(fnt fnt1)
    {
        return fnt1.b;
    }

    static djb b(fnt fnt1)
    {
        return fnt1.a;
    }

    public final fnt a(dfp dfp)
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

    public final fnt a(djb djb)
    {
        a = djb;
        return this;
    }

    public final foa a()
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
            return new fns(this, (byte)0);
        }
    }
}
