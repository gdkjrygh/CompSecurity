// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final dzn a;
    final dzm b;

    private hkr b()
    {
        hkr hkr = dzn.a(a).aP();
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

    ct(dzm dzm1, dzn dzn1)
    {
        b = dzm1;
        a = dzn1;
        super();
    }
}
