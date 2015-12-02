// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dvw
{

    private djb a;
    private dfp b;

    private dvw()
    {
    }

    dvw(byte byte0)
    {
        this();
    }

    static dfp a(dvw dvw1)
    {
        return dvw1.b;
    }

    static djb b(dvw dvw1)
    {
        return dvw1.a;
    }

    public final dvr a()
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
            return new dvv(this, (byte)0);
        }
    }

    public final dvw a(dfp dfp)
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

    public final dvw a(djb djb)
    {
        a = djb;
        return this;
    }
}
