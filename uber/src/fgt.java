// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fgt
{

    private djb a;
    private dfp b;

    private fgt()
    {
    }

    fgt(byte byte0)
    {
        this();
    }

    static dfp a(fgt fgt1)
    {
        return fgt1.b;
    }

    static djb b(fgt fgt1)
    {
        return fgt1.a;
    }

    public final fgt a(dfp dfp)
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

    public final fgt a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fhd a()
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
            return new fgs(this, (byte)0);
        }
    }
}
