// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ehm a;
    final ehl b;

    private chp b()
    {
        chp chp = ehm.a(a).e();
        if (chp == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return chp;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ehl ehl1, ehm ehm1)
    {
        b = ehl1;
        a = ehm1;
        super();
    }
}
