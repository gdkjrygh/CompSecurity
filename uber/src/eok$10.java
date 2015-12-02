// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final eol a;
    final eok b;

    private eoy b()
    {
        eoy eoy = eol.a(a).g();
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

    ct(eok eok1, eol eol1)
    {
        b = eok1;
        a = eol1;
        super();
    }
}
