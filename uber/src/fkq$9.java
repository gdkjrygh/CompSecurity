// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fkr a;
    final fkq b;

    private dkr b()
    {
        dkr dkr = fkr.a(a).n();
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

    (fkq fkq1, fkr fkr1)
    {
        b = fkq1;
        a = fkr1;
        super();
    }
}
