// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final dyl a;
    final dyk b;

    private hjo b()
    {
        hjo hjo = dyl.b(a).g();
        if (hjo == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hjo;
        }
    }

    public final Object a()
    {
        return b();
    }

    (dyk dyk1, dyl dyl1)
    {
        b = dyk1;
        a = dyl1;
        super();
    }
}
