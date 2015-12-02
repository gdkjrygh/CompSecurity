// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gde
{

    private diw a;
    private fqp b;

    private gde()
    {
    }

    gde(byte byte0)
    {
        this();
    }

    static fqp a(gde gde1)
    {
        return gde1.b;
    }

    static diw b(gde gde1)
    {
        return gde1.a;
    }

    public final gde a(diw diw)
    {
        a = diw;
        return this;
    }

    public final gde a(fqp fqp)
    {
        if (fqp == null)
        {
            throw new NullPointerException("tripActivityComponent");
        } else
        {
            b = fqp;
            return this;
        }
    }

    public final gdf a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderDialogFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("tripActivityComponent must be set");
        } else
        {
            return new gdd(this, (byte)0);
        }
    }
}
