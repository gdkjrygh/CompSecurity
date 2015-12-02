// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fkp a;
    final fko b;

    private hjk b()
    {
        hjk hjk = fkp.a(a).aU();
        if (hjk == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hjk;
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
