// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fdv
{

    private djb a;
    private dfp b;

    private fdv()
    {
    }

    fdv(byte byte0)
    {
        this();
    }

    static dfp a(fdv fdv1)
    {
        return fdv1.b;
    }

    static djb b(fdv fdv1)
    {
        return fdv1.a;
    }

    public final fdv a(dfp dfp)
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

    public final fdv a(djb djb)
    {
        a = djb;
        return this;
    }

    public final feg a()
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
            return new fdu(this, (byte)0);
        }
    }
}
