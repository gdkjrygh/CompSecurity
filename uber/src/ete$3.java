// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final etf a;
    final ete b;

    private dki b()
    {
        dki dki = etf.a(a).W();
        if (dki == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dki;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ete ete1, etf etf1)
    {
        b = ete1;
        a = etf1;
        super();
    }
}
