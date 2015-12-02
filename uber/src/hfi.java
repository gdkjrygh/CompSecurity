// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hfi
{

    private hbt a;

    private hfi()
    {
    }

    hfi(byte byte0)
    {
        this();
    }

    static hbt a(hfi hfi1)
    {
        return hfi1.a;
    }

    public final hfi a(hbt hbt)
    {
        a = hbt;
        return this;
    }

    public final hga a()
    {
        if (a == null)
        {
            throw new IllegalStateException("rdsModule must be set");
        } else
        {
            return new hfh(this, (byte)0);
        }
    }
}
