// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fof a;
    final foe b;

    private dcs b()
    {
        dcs dcs = fof.a(a).an();
        if (dcs == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dcs;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(foe foe1, fof fof1)
    {
        b = foe1;
        a = fof1;
        super();
    }
}
