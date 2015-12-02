// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fxy
{

    private diw a;
    private dfp b;

    private fxy()
    {
    }

    fxy(byte byte0)
    {
        this();
    }

    static dfp a(fxy fxy1)
    {
        return fxy1.b;
    }

    static diw b(fxy fxy1)
    {
        return fxy1.a;
    }

    public final fxy a(dfp dfp)
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

    public final fxy a(diw diw)
    {
        a = diw;
        return this;
    }

    public final fya a()
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
            return new fxx(this, (byte)0);
        }
    }
}
