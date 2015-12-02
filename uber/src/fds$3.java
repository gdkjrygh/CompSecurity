// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fdt a;
    final fds b;

    private fei b()
    {
        fei fei = fdt.a(a).ao();
        if (fei == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return fei;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fds fds1, fdt fdt1)
    {
        b = fds1;
        a = fdt1;
        super();
    }
}
