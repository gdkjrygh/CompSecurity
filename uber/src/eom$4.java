// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final eon a;
    final eom b;

    private hku b()
    {
        hku hku = eon.a(a).aS();
        if (hku == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hku;
        }
    }

    public final Object a()
    {
        return b();
    }

    (eom eom1, eon eon1)
    {
        b = eom1;
        a = eon1;
        super();
    }
}
