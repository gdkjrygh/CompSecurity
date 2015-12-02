// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class emk
{

    private djb a;
    private emp b;

    private emk()
    {
    }

    emk(byte byte0)
    {
        this();
    }

    static emp a(emk emk1)
    {
        return emk1.b;
    }

    static djb b(emk emk1)
    {
        return emk1.a;
    }

    public final emk a(djb djb)
    {
        a = djb;
        return this;
    }

    public final emk a(emp emp)
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

    public final ene a()
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
            return new emj(this, (byte)0);
        }
    }
}
