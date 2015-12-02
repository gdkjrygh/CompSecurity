// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fkt a;
    final fks b;

    private hkp b()
    {
        hkp hkp = fkt.a(a).bd();
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

    ct(fks fks1, fkt fkt1)
    {
        b = fks1;
        a = fkt1;
        super();
    }
}
