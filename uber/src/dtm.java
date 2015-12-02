// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dtm
{

    private diw a;
    private dfp b;

    private dtm()
    {
    }

    dtm(byte byte0)
    {
        this();
    }

    static dfp a(dtm dtm1)
    {
        return dtm1.b;
    }

    static diw b(dtm dtm1)
    {
        return dtm1.a;
    }

    public final dtk a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderDialogFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new dtl(this, (byte)0);
        }
    }

    public final dtm a(dfp dfp)
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

    public final dtm a(diw diw)
    {
        a = diw;
        return this;
    }
}
