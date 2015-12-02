// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fzh a;
    final fzg b;

    private fta b()
    {
        fta fta = fzh.a(a).ax();
        if (fta == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return fta;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fzg fzg1, fzh fzh1)
    {
        b = fzg1;
        a = fzh1;
        super();
    }
}
