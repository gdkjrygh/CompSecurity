// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final dzb a;
    final dza b;

    private dzi b()
    {
        dzi dzi = dzb.a(a).J();
        if (dzi == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dzi;
        }
    }

    public final Object a()
    {
        return b();
    }

    (dza dza1, dzb dzb1)
    {
        b = dza1;
        a = dzb1;
        super();
    }
}
