// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ebm a;
    final ebl b;

    private gmg b()
    {
        gmg gmg = ebm.a(a).f();
        if (gmg == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return gmg;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ebl ebl1, ebm ebm1)
    {
        b = ebl1;
        a = ebm1;
        super();
    }
}
