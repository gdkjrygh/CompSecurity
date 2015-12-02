// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fuv
{

    private diw a;
    private dfp b;

    private fuv()
    {
    }

    fuv(byte byte0)
    {
        this();
    }

    static dfp a(fuv fuv1)
    {
        return fuv1.b;
    }

    static diw b(fuv fuv1)
    {
        return fuv1.a;
    }

    public final fup a()
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
            return new fuu(this, (byte)0);
        }
    }

    public final fuv a(dfp dfp)
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

    public final fuv a(diw diw)
    {
        a = diw;
        return this;
    }
}
