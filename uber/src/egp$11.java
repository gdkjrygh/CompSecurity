// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final egq a;
    final egp b;

    private fte b()
    {
        fte fte = egq.a(a).ay();
        if (fte == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return fte;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(egp egp1, egq egq1)
    {
        b = egp1;
        a = egq1;
        super();
    }
}
