// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fkz a;
    final fky b;

    private dod b()
    {
        dod dod = fkz.a(a).i();
        if (dod == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dod;
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
