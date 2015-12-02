// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final gde a;
    final gdd b;

    private cgh b()
    {
        cgh cgh = gde.a(a).y();
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

    (gdd gdd1, gde gde1)
    {
        b = gdd1;
        a = gde1;
        super();
    }
}
