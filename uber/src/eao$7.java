// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final eap a;
    final eao b;

    private fta b()
    {
        fta fta = eap.a(a).ax();
        if (fta == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return fta;
        }
    }

    public final Object a()
    {
        return b();
    }

    (eao eao1, eap eap1)
    {
        b = eao1;
        a = eap1;
        super();
    }
}
