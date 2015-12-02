// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fhr
{

    private djb a;
    private dfp b;

    private fhr()
    {
    }

    fhr(byte byte0)
    {
        this();
    }

    static dfp a(fhr fhr1)
    {
        return fhr1.b;
    }

    static djb b(fhr fhr1)
    {
        return fhr1.a;
    }

    public final fhr a(dfp dfp)
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

    public final fhr a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fif a()
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
            return new fhq(this, (byte)0);
        }
    }
}
