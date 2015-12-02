// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final erx a;
    final erw b;

    private hkr b()
    {
        hkr hkr = erx.a(a).aP();
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

    ct(erw erw1, erx erx1)
    {
        b = erw1;
        a = erx1;
        super();
    }
}
