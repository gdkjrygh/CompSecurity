// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final exy a;
    final exx b;

    private eyy b()
    {
        eyy eyy = exy.a(a).al();
        if (eyy == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return eyy;
        }
    }

    public final Object a()
    {
        return b();
    }

    (exx exx1, exy exy1)
    {
        b = exx1;
        a = exy1;
        super();
    }
}
