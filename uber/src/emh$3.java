// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final emi a;
    final emh b;

    private dkf b()
    {
        dkf dkf = emi.a(a).d();
        if (dkf == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dkf;
        }
    }

    public final Object a()
    {
        return b();
    }

    (emh emh1, emi emi1)
    {
        b = emh1;
        a = emi1;
        super();
    }
}
