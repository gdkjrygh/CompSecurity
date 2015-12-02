// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final eov a;
    final eou b;

    private daj b()
    {
        daj daj = eov.a(a).aa();
        if (daj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return daj;
        }
    }

    public final Object a()
    {
        return b();
    }

    (eou eou1, eov eov1)
    {
        b = eou1;
        a = eov1;
        super();
    }
}
