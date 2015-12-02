// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final emk a;
    final emj b;

    private emu b()
    {
        emu emu = emk.a(a).e();
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

    (emj emj1, emk emk1)
    {
        b = emj1;
        a = emk1;
        super();
    }
}
