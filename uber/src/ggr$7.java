// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ggs a;
    final ggr b;

    private dpg b()
    {
        dpg dpg = ggs.a(a).ba();
        if (dpg == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dpg;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ggr ggr1, ggs ggs1)
    {
        b = ggr1;
        a = ggs1;
        super();
    }
}
