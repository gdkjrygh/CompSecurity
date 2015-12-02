// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final gii a;
    final gih b;

    private djx b()
    {
        djx djx = gii.a(a).A();
        if (djx == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return djx;
        }
    }

    public final Object a()
    {
        return b();
    }

    (gih gih1, gii gii1)
    {
        b = gih1;
        a = gii1;
        super();
    }
}
