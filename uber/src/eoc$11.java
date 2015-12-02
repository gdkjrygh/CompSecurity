// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final eod a;
    final eoc b;

    private eyy b()
    {
        eyy eyy = eod.a(a).al();
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

    ct(eoc eoc1, eod eod1)
    {
        b = eoc1;
        a = eod1;
        super();
    }
}
