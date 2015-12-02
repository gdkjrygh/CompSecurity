// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gcs
{

    private dfe a;
    private dff b;
    private dph c;
    private dfp d;

    private gcs()
    {
    }

    gcs(byte byte0)
    {
        this();
    }

    static dfp a(gcs gcs1)
    {
        return gcs1.d;
    }

    static dff b(gcs gcs1)
    {
        return gcs1.b;
    }

    static dfe c(gcs gcs1)
    {
        return gcs1.a;
    }

    static dph d(gcs gcs1)
    {
        return gcs1.c;
    }

    public final gcs a(dfe dfe)
    {
        a = dfe;
        return this;
    }

    public final gcs a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            d = dfp;
            return this;
        }
    }

    public final gcv a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (b == null)
        {
            b = new dff();
        }
        if (c == null)
        {
            c = new dph();
        }
        if (d == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new gcr(this, (byte)0);
        }
    }
}
