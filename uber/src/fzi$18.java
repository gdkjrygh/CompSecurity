// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fzj a;
    final fzi b;

    private fxs b()
    {
        fxs fxs = fzj.b(a).ab();
        if (fxs == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return fxs;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fzi fzi1, fzj fzj1)
    {
        b = fzi1;
        a = fzj1;
        super();
    }
}
