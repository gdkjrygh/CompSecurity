// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final etn a;
    final etm b;

    private cev b()
    {
        cev cev = etn.a(a).d();
        if (cev == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return cev;
        }
    }

    public final Object a()
    {
        return b();
    }

    (etm etm1, etn etn1)
    {
        b = etm1;
        a = etn1;
        super();
    }
}
