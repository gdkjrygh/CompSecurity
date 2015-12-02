// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ggy a;
    final ggx b;

    private chp b()
    {
        chp chp = ggy.a(a).c();
        if (chp == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return chp;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ggx ggx1, ggy ggy1)
    {
        b = ggx1;
        a = ggy1;
        super();
    }
}
