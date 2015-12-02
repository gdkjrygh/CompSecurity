// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fol a;
    final fok b;

    private gju b()
    {
        gju gju = fol.a(a).H();
        if (gju == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return gju;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fok fok1, fol fol1)
    {
        b = fok1;
        a = fol1;
        super();
    }
}
