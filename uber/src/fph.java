// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fph
{

    private diw a;
    private fpl b;
    private dfp c;

    private fph()
    {
    }

    fph(byte byte0)
    {
        this();
    }

    static dfp a(fph fph1)
    {
        return fph1.c;
    }

    static diw b(fph fph1)
    {
        return fph1.a;
    }

    static fpl c(fph fph1)
    {
        return fph1.b;
    }

    public final fph a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            c = dfp;
            return this;
        }
    }

    public final fph a(diw diw)
    {
        a = diw;
        return this;
    }

    public final fph a(fpl fpl1)
    {
        b = fpl1;
        return this;
    }

    public final fpk a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderDialogFragmentModule must be set");
        }
        if (b == null)
        {
            b = new fpl();
        }
        if (c == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new fpg(this, (byte)0);
        }
    }
}
