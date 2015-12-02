// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ema
{

    private djb a;
    private emm b;
    private emp c;

    private ema()
    {
    }

    ema(byte byte0)
    {
        this();
    }

    static emp a(ema ema1)
    {
        return ema1.c;
    }

    static djb b(ema ema1)
    {
        return ema1.a;
    }

    static emm c(ema ema1)
    {
        return ema1.b;
    }

    public final ema a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ema a(emm emm1)
    {
        b = emm1;
        return this;
    }

    public final ema a(emp emp)
    {
        if (emp == null)
        {
            throw new NullPointerException("passwordResetActivityComponent");
        } else
        {
            c = emp;
            return this;
        }
    }

    public final eml a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            b = new emm();
        }
        if (c == null)
        {
            throw new IllegalStateException("passwordResetActivityComponent must be set");
        } else
        {
            return new elz(this, (byte)0);
        }
    }
}
