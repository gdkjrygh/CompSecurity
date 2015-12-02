// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final dyz a;
    final dyy b;

    private dpb b()
    {
        dpb dpb = dyz.a(a).aW();
        if (dpb == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dpb;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(dyy dyy1, dyz dyz1)
    {
        b = dyy1;
        a = dyz1;
        super();
    }
}
