// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dja
    implements hst
{

    static final boolean a;
    private final diw b;

    private dja(diw diw1)
    {
        if (!a && diw1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = diw1;
            return;
        }
    }

    public static hst a(diw diw1)
    {
        return new dja(diw1);
    }

    private cyz b()
    {
        cyz cyz = b.a();
        if (cyz == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return cyz;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dja.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
