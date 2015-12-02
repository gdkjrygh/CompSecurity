// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fkj a;
    final fki b;

    private dkr b()
    {
        dkr dkr = fkj.a(a).as();
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

    ct(fki fki1, fkj fkj1)
    {
        b = fki1;
        a = fkj1;
        super();
    }
}
