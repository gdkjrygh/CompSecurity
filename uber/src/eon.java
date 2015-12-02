// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eon
{

    private djb a;
    private dfp b;

    private eon()
    {
    }

    eon(byte byte0)
    {
        this();
    }

    static dfp a(eon eon1)
    {
        return eon1.b;
    }

    static djb b(eon eon1)
    {
        return eon1.a;
    }

    public final eon a(dfp dfp)
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

    public final eon a(djb djb)
    {
        a = djb;
        return this;
    }

    public final epg a()
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
            return new eom(this, (byte)0);
        }
    }
}
