// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fpx a;
    final fpw b;

    private eww b()
    {
        eww eww = fpx.a(a).L();
        if (eww == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return eww;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fpw fpw1, fpx fpx1)
    {
        b = fpw1;
        a = fpx1;
        super();
    }
}
