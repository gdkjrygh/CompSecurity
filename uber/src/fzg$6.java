// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fzh a;
    final fzg b;

    private czf b()
    {
        czf czf = fzh.a(a).am();
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

    (fzg fzg1, fzh fzh1)
    {
        b = fzg1;
        a = fzh1;
        super();
    }
}
