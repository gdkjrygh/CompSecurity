// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final dwi a;
    final dwh b;

    private dcr b()
    {
        dcr dcr = dwi.a(a).aZ();
        if (dcr == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dcr;
        }
    }

    public final Object a()
    {
        return b();
    }

    (dwh dwh1, dwi dwi1)
    {
        b = dwh1;
        a = dwi1;
        super();
    }
}
