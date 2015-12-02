// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ffr a;
    final ffq b;

    private dal b()
    {
        dal dal = ffr.a(a).ap();
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

    (ffq ffq1, ffr ffr1)
    {
        b = ffq1;
        a = ffr1;
        super();
    }
}
