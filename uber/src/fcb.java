// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fcb
{

    private diw a;
    private dfp b;

    private fcb()
    {
    }

    fcb(byte byte0)
    {
        this();
    }

    static dfp a(fcb fcb1)
    {
        return fcb1.b;
    }

    static diw b(fcb fcb1)
    {
        return fcb1.a;
    }

    public final fcb a(dfp dfp)
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

    public final fcb a(diw diw)
    {
        a = diw;
        return this;
    }

    public final fcm a()
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
            return new fca(this, (byte)0);
        }
    }
}
