// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fkz
{

    private djb a;
    private fls b;

    private fkz()
    {
    }

    fkz(byte byte0)
    {
        this();
    }

    static fls a(fkz fkz1)
    {
        return fkz1.b;
    }

    static djb b(fkz fkz1)
    {
        return fkz1.a;
    }

    public final fkz a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fkz a(fls fls)
    {
        if (fls == null)
        {
            throw new NullPointerException("signupActivityComponent");
        } else
        {
            b = fls;
            return this;
        }
    }

    public final fmn a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("signupActivityComponent must be set");
        } else
        {
            return new fky(this, (byte)0);
        }
    }
}
