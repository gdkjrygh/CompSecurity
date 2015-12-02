// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eme
{

    private djb a;
    private emp b;

    private eme()
    {
    }

    eme(byte byte0)
    {
        this();
    }

    static emp a(eme eme1)
    {
        return eme1.b;
    }

    static djb b(eme eme1)
    {
        return eme1.a;
    }

    public final eme a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eme a(emp emp)
    {
        if (emp == null)
        {
            throw new NullPointerException("passwordResetActivityComponent");
        } else
        {
            b = emp;
            return this;
        }
    }

    public final emw a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("passwordResetActivityComponent must be set");
        } else
        {
            return new emd(this, (byte)0);
        }
    }
}
