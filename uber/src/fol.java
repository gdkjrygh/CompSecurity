// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fol
{

    private djb a;
    private dfp b;

    private fol()
    {
    }

    fol(byte byte0)
    {
        this();
    }

    static dfp a(fol fol1)
    {
        return fol1.b;
    }

    static djb b(fol fol1)
    {
        return fol1.a;
    }

    public final fol a(dfp dfp)
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

    public final fol a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fov a()
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
            return new fok(this, (byte)0);
        }
    }
}
