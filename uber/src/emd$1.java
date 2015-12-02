// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final eme a;
    final emd b;

    private cev b()
    {
        cev cev = eme.a(a).c();
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

    (emd emd1, eme eme1)
    {
        b = emd1;
        a = eme1;
        super();
    }
}
