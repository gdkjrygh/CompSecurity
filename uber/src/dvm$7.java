// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final dvn a;
    final dvm b;

    private grs b()
    {
        grs grs = dvn.a(a).aK();
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

    (dvm dvm1, dvn dvn1)
    {
        b = dvm1;
        a = dvn1;
        super();
    }
}
