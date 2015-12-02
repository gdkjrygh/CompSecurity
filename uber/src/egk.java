// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class egk
{

    private djb a;
    private dfp b;

    private egk()
    {
    }

    egk(byte byte0)
    {
        this();
    }

    static dfp a(egk egk1)
    {
        return egk1.b;
    }

    static djb b(egk egk1)
    {
        return egk1.a;
    }

    public final egk a(dfp dfp)
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

    public final egk a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ehu a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new egj(this, (byte)0);
        }
    }
}
