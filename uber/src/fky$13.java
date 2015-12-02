// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fkz a;
    final fky b;

    private dce b()
    {
        dce dce = fkz.a(a).k();
        if (dce == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dce;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fky fky1, fkz fkz1)
    {
        b = fky1;
        a = fkz1;
        super();
    }
}
