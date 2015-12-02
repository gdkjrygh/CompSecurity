// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fkp a;
    final fko b;

    private doy b()
    {
        doy doy = fkp.a(a).aT();
        if (doy == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return doy;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fko fko1, fkp fkp1)
    {
        b = fko1;
        a = fkp1;
        super();
    }
}
