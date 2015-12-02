// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dil
    implements hst
{

    static final boolean a;
    private final dfq b;
    private final hzb c;

    private dil(dfq dfq1, hzb hzb1)
    {
        if (!a && dfq1 == null)
        {
            throw new AssertionError();
        }
        b = dfq1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(dfq dfq1, hzb hzb1)
    {
        return new dil(dfq1, hzb1);
    }

    private hck b()
    {
        hck hck = dfq.a((dal)c.a());
        if (hck == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return hck;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dil.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
