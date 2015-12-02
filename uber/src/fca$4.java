// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fcb a;
    final fca b;

    private hko b()
    {
        hko hko = fcb.a(a).bc();
        if (hko == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hko;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fca fca1, fcb fcb1)
    {
        b = fca1;
        a = fcb1;
        super();
    }
}
