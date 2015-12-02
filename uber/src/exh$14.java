// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final exi a;
    final exh b;

    private hjk b()
    {
        hjk hjk = exi.a(a).aU();
        if (hjk == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hjk;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(exh exh1, exi exi1)
    {
        b = exh1;
        a = exi1;
        super();
    }
}
