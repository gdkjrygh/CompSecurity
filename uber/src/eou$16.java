// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final eov a;
    final eou b;

    private hkm b()
    {
        hkm hkm = eov.a(a).bb();
        if (hkm == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hkm;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(eou eou1, eov eov1)
    {
        b = eou1;
        a = eov1;
        super();
    }
}
