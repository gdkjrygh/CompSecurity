// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ggm a;
    final ggl b;

    private chp b()
    {
        chp chp = ggm.a(a).e();
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

    (ggl ggl1, ggm ggm1)
    {
        b = ggl1;
        a = ggm1;
        super();
    }
}
