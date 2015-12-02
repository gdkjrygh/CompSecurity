// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fjj a;
    final fji b;

    private hjm b()
    {
        hjm hjm = fjj.a(a).aV();
        if (hjm == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return hjm;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fji fji1, fjj fjj1)
    {
        b = fji1;
        a = fjj1;
        super();
    }
}
