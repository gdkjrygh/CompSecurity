// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final edq a;
    final edp b;

    private efa b()
    {
        efa efa = edq.a(a).T();
        if (efa == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return efa;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(edp edp1, edq edq1)
    {
        b = edp1;
        a = edq1;
        super();
    }
}
