// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fkn a;
    final fkm b;

    private gmg b()
    {
        gmg gmg = fkn.a(a).f();
        if (gmg == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return gmg;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fkm fkm1, fkn fkn1)
    {
        b = fkm1;
        a = fkn1;
        super();
    }
}
