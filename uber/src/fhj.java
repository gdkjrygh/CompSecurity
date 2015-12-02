// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fhj
{

    private djb a;
    private dfp b;

    private fhj()
    {
    }

    fhj(byte byte0)
    {
        this();
    }

    static dfp a(fhj fhj1)
    {
        return fhj1.b;
    }

    static djb b(fhj fhj1)
    {
        return fhj1.a;
    }

    public final fhj a(dfp dfp)
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

    public final fhj a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fhu a()
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
            return new fhi(this, (byte)0);
        }
    }
}
