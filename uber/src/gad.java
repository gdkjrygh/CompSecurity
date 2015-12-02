// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gad
    implements hst
{

    static final boolean a;
    private final fzv b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private gad(fzv fzv1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && fzv1 == null)
        {
            throw new AssertionError();
        }
        b = fzv1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        } else
        {
            e = hzb3;
            return;
        }
    }

    public static hst a(fzv fzv1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new gad(fzv1, hzb1, hzb2, hzb3);
    }

    private gbi b()
    {
        return fzv.a((cjf)c.a(), (Context)d.a(), (cjn)e.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!gad.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
