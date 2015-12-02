// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final dxw a;
    final dxv b;

    private dak b()
    {
        dak dak = dxw.a(a).aj();
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

    (dxv dxv1, dxw dxw1)
    {
        b = dxv1;
        a = dxw1;
        super();
    }
}
