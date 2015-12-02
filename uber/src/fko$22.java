// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fkp a;
    final fko b;

    private dao b()
    {
        dao dao = fkp.a(a).aA();
        if (dao == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dao;
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
