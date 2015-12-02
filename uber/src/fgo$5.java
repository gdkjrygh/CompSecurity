// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fgp a;
    final fgo b;

    private hoi b()
    {
        hoi hoi = fgp.a(a).p();
        if (hoi == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hoi;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fgo fgo1, fgp fgp1)
    {
        b = fgo1;
        a = fgp1;
        super();
    }
}
