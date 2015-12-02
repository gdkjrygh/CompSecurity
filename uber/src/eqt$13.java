// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final equ a;
    final eqt b;

    private dcs b()
    {
        dcs dcs = equ.a(a).an();
        if (dcs == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dcs;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(eqt eqt1, equ equ1)
    {
        b = eqt1;
        a = equ1;
        super();
    }
}
