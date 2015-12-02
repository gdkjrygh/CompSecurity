// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final elr a;
    final elq b;

    private gqd b()
    {
        gqd gqd = elr.a(a).aG();
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

    (elq elq1, elr elr1)
    {
        b = elq1;
        a = elr1;
        super();
    }
}
