// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fba a;
    final faz b;

    private dqw b()
    {
        dqw dqw = fba.a(a).aY();
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

    ct(faz faz1, fba fba1)
    {
        b = faz1;
        a = fba1;
        super();
    }
}
