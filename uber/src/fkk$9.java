// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fkl a;
    final fkk b;

    private dpb b()
    {
        dpb dpb = fkl.a(a).aW();
        if (dpb == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dpb;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fkk fkk1, fkl fkl1)
    {
        b = fkk1;
        a = fkl1;
        super();
    }
}
