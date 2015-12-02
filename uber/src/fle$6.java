// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final flf a;
    final fle b;

    private hoc b()
    {
        hoc hoc = flf.a(a).au();
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

    (fle fle1, flf flf1)
    {
        b = fle1;
        a = flf1;
        super();
    }
}
