// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fhn a;
    final fhm b;

    private dkc b()
    {
        dkc dkc = fhn.a(a).P();
        if (dkc == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dkc;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fhm fhm1, fhn fhn1)
    {
        b = fhm1;
        a = fhn1;
        super();
    }
}
