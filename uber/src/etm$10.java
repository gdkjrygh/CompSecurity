// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final etn a;
    final etm b;

    private hkj b()
    {
        hkj hkj = etn.a(a).j();
        if (hkj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hkj;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(etm etm1, etn etn1)
    {
        b = etm1;
        a = etn1;
        super();
    }
}
