// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class dfg
    implements hst
{

    static final boolean a;
    private final dff b;

    private dfg(dff dff1)
    {
        if (!a && dff1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = dff1;
            return;
        }
    }

    public static hst a(dff dff1)
    {
        return new dfg(dff1);
    }

    private static Collection b()
    {
        return dff.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dfg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
