// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fdz a;
    final fdy b;

    private fei b()
    {
        fei fei = fdz.a(a).ao();
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

    ct(fdy fdy1, fdz fdz1)
    {
        b = fdy1;
        a = fdz1;
        super();
    }
}
