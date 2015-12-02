// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final exi a;
    final exh b;

    private hkr b()
    {
        hkr hkr = exi.a(a).aP();
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

    (exh exh1, exi exi1)
    {
        b = exh1;
        a = exi1;
        super();
    }
}
