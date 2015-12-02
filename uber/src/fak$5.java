// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fal a;
    final fak b;

    private hkp b()
    {
        hkp hkp = fal.a(a).bd();
        if (hkp == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hkp;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fak fak1, fal fal1)
    {
        b = fak1;
        a = fal1;
        super();
    }
}
