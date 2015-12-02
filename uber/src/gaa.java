// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gaa
    implements hst
{

    static final boolean a;
    private final fzv b;

    private gaa(fzv fzv1)
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
        return new gaa(fzv1);
    }

    private static gbd b()
    {
        return fzv.g();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!gaa.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
