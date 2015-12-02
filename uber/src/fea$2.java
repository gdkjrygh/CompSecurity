// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final feb a;
    final fea b;

    private chp b()
    {
        chp chp = feb.a(a).e();
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

    (fea fea1, feb feb1)
    {
        b = fea1;
        a = feb1;
        super();
    }
}
