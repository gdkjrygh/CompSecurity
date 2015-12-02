// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dvi
    implements hst
{

    static final boolean a;
    private final dvh b;

    private dvi(dvh dvh1)
    {
        if (!a && dvh1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = dvh1;
            return;
        }
    }

    public static hst a(dvh dvh1)
    {
        return new dvi(dvh1);
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
        if (!dvi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
