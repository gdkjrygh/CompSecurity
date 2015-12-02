// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final eor a;
    final eoq b;

    private eoy b()
    {
        eoy eoy = eor.a(a).g();
        if (eoy == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return eoy;
        }
    }

    public final Object a()
    {
        return b();
    }

    (eoq eoq1, eor eor1)
    {
        b = eoq1;
        a = eor1;
        super();
    }
}
