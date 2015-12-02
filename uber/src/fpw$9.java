// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fpx a;
    final fpw b;

    private hku b()
    {
        hku hku = fpx.a(a).aS();
        if (hku == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hku;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fpw fpw1, fpx fpx1)
    {
        b = fpw1;
        a = fpx1;
        super();
    }
}
