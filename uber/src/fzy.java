// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fzy
    implements hst
{

    static final boolean a;
    private final fzv b;

    private fzy(fzv fzv1)
    {
        if (!a && fzv1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = fzv1;
            return;
        }
    }

    public static hst a(fzv fzv1)
    {
        return new fzy(fzv1);
    }

    private static gau b()
    {
        return fzv.f();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fzy.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
