// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final emg a;
    final emf b;

    private dkf b()
    {
        dkf dkf = emg.a(a).d();
        if (dkf == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dkf;
        }
    }

    public final Object a()
    {
        return b();
    }

    (emf emf1, emg emg1)
    {
        b = emf1;
        a = emg1;
        super();
    }
}
