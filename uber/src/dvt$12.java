// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final dvu a;
    final dvt b;

    private dqw b()
    {
        dqw dqw = dvu.a(a).aY();
        if (dqw == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dqw;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(dvt dvt1, dvu dvu1)
    {
        b = dvt1;
        a = dvu1;
        super();
    }
}
