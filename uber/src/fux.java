// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fux
{

    private diw a;
    private dfp b;

    private fux()
    {
    }

    fux(byte byte0)
    {
        this();
    }

    static dfp a(fux fux1)
    {
        return fux1.b;
    }

    static diw b(fux fux1)
    {
        return fux1.a;
    }

    public final fur a()
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
            return new fuw(this, (byte)0);
        }
    }

    public final fux a(dfp dfp)
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

    public final fux a(diw diw)
    {
        a = diw;
        return this;
    }
}
