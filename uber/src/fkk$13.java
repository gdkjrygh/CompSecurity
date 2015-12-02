// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fkl a;
    final fkk b;

    private dcs b()
    {
        dcs dcs = fkl.a(a).an();
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

    ct(fkk fkk1, fkl fkl1)
    {
        b = fkk1;
        a = fkl1;
        super();
    }
}
