// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fkp a;
    final fko b;

    private dkr b()
    {
        dkr dkr = fkp.a(a).as();
        if (dkr == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dkr;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fko fko1, fkp fkp1)
    {
        b = fko1;
        a = fkp1;
        super();
    }
}
