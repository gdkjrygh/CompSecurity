// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fgv
{

    private diw a;
    private dfp b;

    private fgv()
    {
    }

    fgv(byte byte0)
    {
        this();
    }

    static dfp a(fgv fgv1)
    {
        return fgv1.b;
    }

    static diw b(fgv fgv1)
    {
        return fgv1.a;
    }

    public final fgv a(dfp dfp)
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

    public final fgv a(diw diw)
    {
        a = diw;
        return this;
    }

    public final fhf a()
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
            return new fgu(this, (byte)0);
        }
    }
}
