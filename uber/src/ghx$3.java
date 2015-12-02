// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ghy a;
    final ghx b;

    private czf b()
    {
        czf czf = ghy.a(a).am();
        if (czf == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return czf;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ghx ghx1, ghy ghy1)
    {
        b = ghx1;
        a = ghy1;
        super();
    }
}
