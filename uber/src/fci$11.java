// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fcj a;
    final fci b;

    private dak b()
    {
        dak dak = fcj.a(a).aj();
        if (dak == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dak;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fci fci1, fcj fcj1)
    {
        b = fci1;
        a = fcj1;
        super();
    }
}
