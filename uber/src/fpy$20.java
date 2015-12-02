// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fpz a;
    final fpy b;

    private dkn b()
    {
        dkn dkn = fpz.a(a).J();
        if (dkn == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dkn;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fpy fpy1, fpz fpz1)
    {
        b = fpy1;
        a = fpz1;
        super();
    }
}
