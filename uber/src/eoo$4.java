// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final eop a;
    final eoo b;

    private dce b()
    {
        dce dce = eop.a(a).af();
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

    (eoo eoo1, eop eop1)
    {
        b = eoo1;
        a = eop1;
        super();
    }
}
