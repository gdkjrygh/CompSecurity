// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ecs
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private ecs()
    {
    }

    ecs(byte byte0)
    {
        this();
    }

    static dfp a(ecs ecs1)
    {
        return ecs1.d;
    }

    static dff b(ecs ecs1)
    {
        return ecs1.a;
    }

    static dfe c(ecs ecs1)
    {
        return ecs1.b;
    }

    static dph d(ecs ecs1)
    {
        return ecs1.c;
    }

    public final ecs a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final ecs a(dfp dfp)
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

    public final ecv a()
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
            return new ecr(this, (byte)0);
        }
    }
}
