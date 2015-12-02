// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dwa
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private dwa()
    {
    }

    dwa(byte byte0)
    {
        this();
    }

    static dfp a(dwa dwa1)
    {
        return dwa1.d;
    }

    static dff b(dwa dwa1)
    {
        return dwa1.a;
    }

    static dfe c(dwa dwa1)
    {
        return dwa1.b;
    }

    static dph d(dwa dwa1)
    {
        return dwa1.c;
    }

    public final dwa a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final dwa a(dfp dfp)
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

    public final dwd a()
    {
        if (a == null)
        {
            a = new dff();
        }
        if (b == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
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
            return new dvz(this, (byte)0);
        }
    }
}
