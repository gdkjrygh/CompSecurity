// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gai
    implements hst
{

    static final boolean a;
    private final fzv b;

    private gai(fzv fzv1)
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
        return new gai(fzv1);
    }

    private eer b()
    {
        eer eer = b.d();
        if (eer == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return eer;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!gai.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
