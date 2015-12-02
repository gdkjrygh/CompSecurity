// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fld
{

    private diw a;
    private dfp b;

    private fld()
    {
    }

    fld(byte byte0)
    {
        this();
    }

    static dfp a(fld fld1)
    {
        return fld1.b;
    }

    static diw b(fld fld1)
    {
        return fld1.a;
    }

    public final fld a(dfp dfp)
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

    public final fld a(diw diw)
    {
        a = diw;
        return this;
    }

    public final fmr a()
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
            return new flc(this, (byte)0);
        }
    }
}
