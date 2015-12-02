// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final edq a;
    final edp b;

    private hjm b()
    {
        hjm hjm = edq.a(a).aV();
        if (hjm == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hjm;
        }
    }

    public final Object a()
    {
        return b();
    }

    (edp edp1, edq edq1)
    {
        b = edp1;
        a = edq1;
        super();
    }
}
