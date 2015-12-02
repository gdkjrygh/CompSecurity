// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fpz a;
    final fpy b;

    private hku b()
    {
        hku hku = fpz.a(a).k();
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

    (fpy fpy1, fpz fpz1)
    {
        b = fpy1;
        a = fpz1;
        super();
    }
}
