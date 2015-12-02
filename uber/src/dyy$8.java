// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final dyz a;
    final dyy b;

    private hkr b()
    {
        hkr hkr = dyz.a(a).aP();
        if (hkr == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hkr;
        }
    }

    public final Object a()
    {
        return b();
    }

    (dyy dyy1, dyz dyz1)
    {
        b = dyy1;
        a = dyz1;
        super();
    }
}
