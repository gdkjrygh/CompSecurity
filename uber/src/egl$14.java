// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final egm a;
    final egl b;

    private cyh b()
    {
        cyh cyh = egm.a(a).B();
        if (cyh == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return cyh;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(egl egl1, egm egm1)
    {
        b = egl1;
        a = egm1;
        super();
    }
}
