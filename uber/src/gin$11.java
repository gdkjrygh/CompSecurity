// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final gio a;
    final gin b;

    private dkn b()
    {
        dkn dkn = gio.a(a).ai();
        if (dkn == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dkn;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(gin gin1, gio gio1)
    {
        b = gin1;
        a = gio1;
        super();
    }
}
