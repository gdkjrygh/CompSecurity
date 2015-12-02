// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ggk a;
    final ggj b;

    private hoc b()
    {
        hoc hoc = ggk.a(a).S();
        if (hoc == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hoc;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ggj ggj1, ggk ggk1)
    {
        b = ggj1;
        a = ggk1;
        super();
    }
}
