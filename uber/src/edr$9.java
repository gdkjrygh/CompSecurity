// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final eds a;
    final edr b;

    private dao b()
    {
        dao dao = eds.a(a).aA();
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

    (edr edr1, eds eds1)
    {
        b = edr1;
        a = eds1;
        super();
    }
}
