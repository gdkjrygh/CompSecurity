// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fhl a;
    final fhk b;

    private gqd b()
    {
        gqd gqd = fhl.a(a).aG();
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

    (fhk fhk1, fhl fhl1)
    {
        b = fhk1;
        a = fhl1;
        super();
    }
}
