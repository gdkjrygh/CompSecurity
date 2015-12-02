// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final equ a;
    final eqt b;

    private dqw b()
    {
        dqw dqw = equ.a(a).aY();
        if (dqw == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dqw;
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
