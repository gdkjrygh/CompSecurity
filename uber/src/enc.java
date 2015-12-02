// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class enc
    implements hst
{

    static final boolean a;
    private final enb b;

    private enc(enb enb1)
    {
        if (!a && enb1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = enb1;
            return;
        }
    }

    public static hst a(enb enb1)
    {
        return new enc(enb1);
    }

    private cgh b()
    {
        cgh cgh = b.a();
        if (cgh == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return cgh;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!enc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
