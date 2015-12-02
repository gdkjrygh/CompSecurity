// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ggq a;
    final ggp b;

    private dri b()
    {
        dri dri = ggq.a(a).at();
        if (dri == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dri;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ggp ggp1, ggq ggq1)
    {
        b = ggp1;
        a = ggq1;
        super();
    }
}
