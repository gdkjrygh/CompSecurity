// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fpz a;
    final fpy b;

    private fqc b()
    {
        fqc fqc = fpz.a(a).v();
        if (fqc == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return fqc;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fpy fpy1, fpz fpz1)
    {
        b = fpy1;
        a = fpz1;
        super();
    }
}
