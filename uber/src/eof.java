// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eof
{

    private djb a;
    private eni b;

    private eof()
    {
    }

    eof(byte byte0)
    {
        this();
    }

    static eni a(eof eof1)
    {
        return eof1.b;
    }

    static djb b(eof eof1)
    {
        return eof1.a;
    }

    public final enk a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("addPaymentActivityComponent must be set");
        } else
        {
            return new eoe(this, (byte)0);
        }
    }

    public final eof a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eof a(eni eni)
    {
        if (eni == null)
        {
            throw new NullPointerException("addPaymentActivityComponent");
        } else
        {
            b = eni;
            return this;
        }
    }
}
