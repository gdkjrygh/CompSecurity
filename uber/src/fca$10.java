// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fcb a;
    final fca b;

    private cgh b()
    {
        cgh cgh = fcb.a(a).Z();
        if (cgh == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return cgh;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fca fca1, fcb fcb1)
    {
        b = fca1;
        a = fcb1;
        super();
    }
}
