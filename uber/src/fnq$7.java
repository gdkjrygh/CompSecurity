// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fnr a;
    final fnq b;

    private hkp b()
    {
        hkp hkp = fnr.a(a).bd();
        if (hkp == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hkp;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fnq fnq1, fnr fnr1)
    {
        b = fnq1;
        a = fnr1;
        super();
    }
}
