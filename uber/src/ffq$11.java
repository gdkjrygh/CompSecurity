// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final ffr a;
    final ffq b;

    private dce b()
    {
        dce dce = ffr.a(a).af();
        if (dce == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dce;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(ffq ffq1, ffr ffr1)
    {
        b = ffq1;
        a = ffr1;
        super();
    }
}
