// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class dje
    implements hst
{

    static final boolean a;
    private final djb b;
    private final hzb c;
    private final hzb d;

    private dje(djb djb1, hzb hzb1, hzb hzb2)
    {
        if (!a && djb1 == null)
        {
            throw new AssertionError();
        }
        b = djb1;
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

    public static hst a(djb djb1, hzb hzb1, hzb hzb2)
    {
        return new dje(djb1, hzb1, hzb2);
    }

    private Collection b()
    {
        Collection collection = djb.a((daa)c.a(), (czz)d.a());
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
        if (!dje.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
