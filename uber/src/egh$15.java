// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final egi a;
    final egh b;

    private dqw b()
    {
        dqw dqw = egi.a(a).aY();
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

    ct(egh egh1, egi egi1)
    {
        b = egh1;
        a = egi1;
        super();
    }
}
