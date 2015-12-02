// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final erx a;
    final erw b;

    private hkm b()
    {
        hkm hkm = erx.a(a).bb();
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

    (erw erw1, erx erx1)
    {
        b = erw1;
        a = erx1;
        super();
    }
}
