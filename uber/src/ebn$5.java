// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ebo a;
    final ebn b;

    private cgh b()
    {
        cgh cgh = ebo.a(a).Z();
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

    (ebn ebn1, ebo ebo1)
    {
        b = ebn1;
        a = ebo1;
        super();
    }
}
