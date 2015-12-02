// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fkt a;
    final fks b;

    private dce b()
    {
        dce dce = fkt.a(a).af();
        if (dce == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dce;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fks fks1, fkt fkt1)
    {
        b = fks1;
        a = fkt1;
        super();
    }
}
