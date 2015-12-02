// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fjl a;
    final fjk b;

    private dpg b()
    {
        dpg dpg = fjl.a(a).i();
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

    ct(fjk fjk1, fjl fjl1)
    {
        b = fjk1;
        a = fjl1;
        super();
    }
}
