// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class emg
{

    private djb a;
    private emp b;

    private emg()
    {
    }

    emg(byte byte0)
    {
        this();
    }

    static emp a(emg emg1)
    {
        return emg1.b;
    }

    static djb b(emg emg1)
    {
        return emg1.a;
    }

    public final emg a(djb djb)
    {
        a = djb;
        return this;
    }

    public final emg a(emp emp)
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

    public final emy a()
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
            return new emf(this, (byte)0);
        }
    }
}
