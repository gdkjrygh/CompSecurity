// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final esz a;
    final esy b;

    private dqt b()
    {
        dqt dqt = esz.a(a).aM();
        if (dqt == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dqt;
        }
    }

    public final Object a()
    {
        return b();
    }

    (esy esy1, esz esz1)
    {
        b = esy1;
        a = esz1;
        super();
    }
}
