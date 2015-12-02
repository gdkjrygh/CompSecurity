// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fal
{

    private diw a;
    private dfp b;

    private fal()
    {
    }

    fal(byte byte0)
    {
        this();
    }

    static dfp a(fal fal1)
    {
        return fal1.b;
    }

    static diw b(fal fal1)
    {
        return fal1.a;
    }

    public final fal a(dfp dfp)
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

    public final fal a(diw diw)
    {
        a = diw;
        return this;
    }

    public final fap a()
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
            return new fak(this, (byte)0);
        }
    }
}
