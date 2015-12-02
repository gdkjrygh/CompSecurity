// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final foj a;
    final foi b;

    private hji b()
    {
        hji hji = foj.a(a).aQ();
        if (hji == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hji;
        }
    }

    public final Object a()
    {
        return b();
    }

    (foi foi1, foj foj1)
    {
        b = foi1;
        a = foj1;
        super();
    }
}
