// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fzj a;
    final fzi b;

    private czf b()
    {
        czf czf = fzj.b(a).N();
        if (czf == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return czf;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fzi fzi1, fzj fzj1)
    {
        b = fzi1;
        a = fzj1;
        super();
    }
}
