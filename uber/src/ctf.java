// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ctf
{

    private crs a;

    private ctf()
    {
    }

    ctf(byte byte0)
    {
        this();
    }

    static crs a(ctf ctf1)
    {
        return ctf1.a;
    }

    public final ctf a(crs crs)
    {
        if (crs == null)
        {
            throw new NullPointerException("partnerFunnelApplicationComponent");
        } else
        {
            a = crs;
            return this;
        }
    }

    public final cth a()
    {
        if (a == null)
        {
            throw new IllegalStateException("partnerFunnelApplicationComponent must be set");
        } else
        {
            return new cte(this, (byte)0);
        }
    }
}
