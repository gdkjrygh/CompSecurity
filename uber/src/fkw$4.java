// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fkx a;
    final fkw b;

    private dkr b()
    {
        dkr dkr = fkx.a(a).as();
        if (dkr == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dkr;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fkw fkw1, fkx fkx1)
    {
        b = fkw1;
        a = fkx1;
        super();
    }
}
