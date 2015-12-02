// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class diz
    implements hst
{

    static final boolean a;
    private final diw b;
    private final hzb c;
    private final hzb d;

    private diz(diw diw1, hzb hzb1, hzb hzb2)
    {
        if (!a && diw1 == null)
        {
            throw new AssertionError();
        }
        b = diw1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hst a(diw diw1, hzb hzb1, hzb hzb2)
    {
        return new diz(diw1, hzb1, hzb2);
    }

    private Collection b()
    {
        Collection collection = diw.a((czy)c.a(), (czx)d.a());
        if (collection == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return collection;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!diz.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
