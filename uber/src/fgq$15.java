// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fgr a;
    final fgq b;

    private hkp b()
    {
        hkp hkp = fgr.a(a).bd();
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

    ct(fgq fgq1, fgr fgr1)
    {
        b = fgq1;
        a = fgr1;
        super();
    }
}
