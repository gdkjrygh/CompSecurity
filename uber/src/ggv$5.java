// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ggw a;
    final ggv b;

    private dpg b()
    {
        dpg dpg = ggw.a(a).F();
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

    (ggv ggv1, ggw ggw1)
    {
        b = ggv1;
        a = ggw1;
        super();
    }
}
