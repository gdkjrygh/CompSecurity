// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final foh a;
    final fog b;

    private grs b()
    {
        grs grs = foh.a(a).aJ();
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

    ct(fog fog1, foh foh1)
    {
        b = fog1;
        a = foh1;
        super();
    }
}
