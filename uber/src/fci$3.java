// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fcj a;
    final fci b;

    private hko b()
    {
        hko hko = fcj.a(a).bc();
        if (hko == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hko;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fci fci1, fcj fcj1)
    {
        b = fci1;
        a = fcj1;
        super();
    }
}
