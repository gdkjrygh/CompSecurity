// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fnv a;
    final fnu b;

    private gqd b()
    {
        gqd gqd = fnv.a(a).aG();
        if (gqd == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return gqd;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fnu fnu1, fnv fnv1)
    {
        b = fnu1;
        a = fnv1;
        super();
    }
}
