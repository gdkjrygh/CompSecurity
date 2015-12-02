// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gac
    implements hst
{

    static final boolean a;
    private final fzv b;
    private final hzb c;

    private gac(fzv fzv1, hzb hzb1)
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
        return new gac(fzv1, hzb1);
    }

    private gbf b()
    {
        return fzv.a((fte)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!gac.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
