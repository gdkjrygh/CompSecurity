// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final egm a;
    final egl b;

    private gqd b()
    {
        gqd gqd = egm.a(a).aG();
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

    (egl egl1, egm egm1)
    {
        b = egl1;
        a = egm1;
        super();
    }
}
