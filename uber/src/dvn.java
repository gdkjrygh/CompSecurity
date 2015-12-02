// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dvn
{

    private dvh a;
    private dff b;
    private dfe c;
    private dph d;
    private dfp e;

    private dvn()
    {
    }

    dvn(byte byte0)
    {
        this();
    }

    static dfp a(dvn dvn1)
    {
        return dvn1.e;
    }

    static dff b(dvn dvn1)
    {
        return dvn1.b;
    }

    static dfe c(dvn dvn1)
    {
        return dvn1.c;
    }

    static dph d(dvn dvn1)
    {
        return dvn1.d;
    }

    static dvh e(dvn dvn1)
    {
        return dvn1.a;
    }

    public final dvg a()
    {
        if (a == null)
        {
            throw new IllegalStateException("alipayAuthorizationActivityModule must be set");
        }
        if (b == null)
        {
            b = new dff();
        }
        if (c == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (d == null)
        {
            d = new dph();
        }
        if (e == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new dvm(this, (byte)0);
        }
    }

    public final dvn a(dfe dfe)
    {
        c = dfe;
        return this;
    }

    public final dvn a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            e = dfp;
            return this;
        }
    }

    public final dvn a(dvh dvh)
    {
        a = dvh;
        return this;
    }
}
