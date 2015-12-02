// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fzj
{

    private fzv a;
    private fzq b;
    private fqp c;

    private fzj()
    {
    }

    fzj(byte byte0)
    {
        this();
    }

    static fzv a(fzj fzj1)
    {
        return fzj1.a;
    }

    static fqp b(fzj fzj1)
    {
        return fzj1.c;
    }

    static fzq c(fzj fzj1)
    {
        return fzj1.b;
    }

    public final fzj a(fqp fqp)
    {
        if (fqp == null)
        {
            throw new NullPointerException("tripActivityComponent");
        } else
        {
            c = fqp;
            return this;
        }
    }

    public final fzj a(fzq fzq)
    {
        if (fzq == null)
        {
            throw new NullPointerException("mapFragmentModule");
        } else
        {
            b = fzq;
            return this;
        }
    }

    public final fzj a(fzv fzv)
    {
        a = fzv;
        return this;
    }

    public final fzu a()
    {
        if (a == null)
        {
            throw new IllegalStateException("mapLayerModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("mapFragmentModule must be set");
        }
        if (c == null)
        {
            throw new IllegalStateException("tripActivityComponent must be set");
        } else
        {
            return new fzi(this, (byte)0);
        }
    }
}
