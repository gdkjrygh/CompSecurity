// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class flu
    implements hst
{

    static final boolean a;
    private final flt b;

    private flu(flt flt1)
    {
        if (!a && flt1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = flt1;
            return;
        }
    }

    public static hst a(flt flt1)
    {
        return new flu(flt1);
    }

    private iu b()
    {
        return b.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!flu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
