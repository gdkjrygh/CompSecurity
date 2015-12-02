// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fdx a;
    final fdw b;

    private fei b()
    {
        fei fei = fdx.a(a).ao();
        if (fei == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return fei;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fdw fdw1, fdx fdx1)
    {
        b = fdw1;
        a = fdx1;
        super();
    }
}
