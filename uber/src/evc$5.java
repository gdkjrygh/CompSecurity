// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final evd a;
    final evc b;

    private gmg b()
    {
        gmg gmg = evd.a(a).f();
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

    (evc evc1, evd evd1)
    {
        b = evc1;
        a = evd1;
        super();
    }
}
