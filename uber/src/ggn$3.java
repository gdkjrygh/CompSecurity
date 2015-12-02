// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ggo a;
    final ggn b;

    private grs b()
    {
        grs grs = ggo.a(a).aK();
        if (grs == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return grs;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ggn ggn1, ggo ggo1)
    {
        b = ggn1;
        a = ggo1;
        super();
    }
}
