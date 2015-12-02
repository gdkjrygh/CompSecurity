// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dto
{

    private diw a;
    private dfp b;

    private dto()
    {
    }

    dto(byte byte0)
    {
        this();
    }

    static dfp a(dto dto1)
    {
        return dto1.b;
    }

    static diw b(dto dto1)
    {
        return dto1.a;
    }

    public final dto a(dfp dfp)
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

    public final dto a(diw diw)
    {
        a = diw;
        return this;
    }

    public final dtq a()
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
            return new dtn(this, (byte)0);
        }
    }
}
