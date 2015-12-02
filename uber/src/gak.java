// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gak
    implements hst
{

    static final boolean a;
    private final fzv b;

    private gak(fzv fzv1)
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
        return new gak(fzv1);
    }

    private static cjz b()
    {
        return fzv.b();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!gak.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
