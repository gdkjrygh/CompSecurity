// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final gig a;
    final gif b;

    private dpg b()
    {
        dpg dpg = gig.a(a).ba();
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

    ct(gif gif1, gig gig1)
    {
        b = gif1;
        a = gig1;
        super();
    }
}
