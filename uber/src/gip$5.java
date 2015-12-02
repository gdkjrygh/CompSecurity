// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final giq a;
    final gip b;

    private giz b()
    {
        giz giz = giq.a(a).U();
        if (giz == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return giz;
        }
    }

    public final Object a()
    {
        return b();
    }

    (gip gip1, giq giq1)
    {
        b = gip1;
        a = giq1;
        super();
    }
}
