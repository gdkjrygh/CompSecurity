// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final emg a;
    final emf b;

    private emu b()
    {
        emu emu = emg.a(a).e();
        if (emu == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return emu;
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
