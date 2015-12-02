// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gaf
    implements hst
{

    static final boolean a;
    private final fzv b;

    private gaf(fzv fzv1)
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
        return new gaf(fzv1);
    }

    private cjn b()
    {
        cjn cjn = b.c();
        if (cjn == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return cjn;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!gaf.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
