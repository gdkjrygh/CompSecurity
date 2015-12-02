// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ggu a;
    final ggt b;

    private dpg b()
    {
        dpg dpg = ggu.a(a).F();
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

    (ggt ggt1, ggu ggu1)
    {
        b = ggt1;
        a = ggu1;
        super();
    }
}
