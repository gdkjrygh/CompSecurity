// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fba a;
    final faz b;

    private dal b()
    {
        dal dal = fba.a(a).ap();
        if (dal == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dal;
        }
    }

    public final Object a()
    {
        return b();
    }

    (faz faz1, fba fba1)
    {
        b = faz1;
        a = fba1;
        super();
    }
}
