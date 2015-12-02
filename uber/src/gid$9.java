// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final gie a;
    final gid b;

    private dpb b()
    {
        dpb dpb = gie.a(a).aW();
        if (dpb == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dpb;
        }
    }

    public final Object a()
    {
        return b();
    }

    (gid gid1, gie gie1)
    {
        b = gid1;
        a = gie1;
        super();
    }
}
