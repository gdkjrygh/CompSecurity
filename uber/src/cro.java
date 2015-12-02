// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cro
{

    private coh a;
    private crs b;

    private cro()
    {
    }

    cro(byte byte0)
    {
        this();
    }

    static crs a(cro cro1)
    {
        return cro1.b;
    }

    static coh b(cro cro1)
    {
        return cro1.a;
    }

    public final cro a(coh coh)
    {
        if (coh == null)
        {
            throw new NullPointerException("partnerFunnelActivityModule");
        } else
        {
            a = coh;
            return this;
        }
    }

    public final cro a(crs crs)
    {
        if (crs == null)
        {
            throw new NullPointerException("partnerFunnelApplicationComponent");
        } else
        {
            b = crs;
            return this;
        }
    }

    public final crr a()
    {
        if (a == null)
        {
            throw new IllegalStateException("partnerFunnelActivityModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("partnerFunnelApplicationComponent must be set");
        } else
        {
            return new crn(this, (byte)0);
        }
    }
}
