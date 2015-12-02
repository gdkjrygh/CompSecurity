// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gab
    implements hst
{

    static final boolean a;
    private final fzv b;
    private final hzb c;

    private gab(fzv fzv1, hzb hzb1)
    {
        if (!a && fzv1 == null)
        {
            throw new AssertionError();
        }
        b = fzv1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(fzv fzv1, hzb hzb1)
    {
        return new gab(fzv1, hzb1);
    }

    private gbe b()
    {
        return fzv.b((fte)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!gab.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
