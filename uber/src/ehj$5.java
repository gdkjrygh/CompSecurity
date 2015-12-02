// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ehk a;
    final ehj b;

    private dkv b()
    {
        dkv dkv = ehk.a(a).az();
        if (dkv == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dkv;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ehj ehj1, ehk ehk1)
    {
        b = ehj1;
        a = ehk1;
        super();
    }
}
