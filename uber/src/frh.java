// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class frh
    implements hst
{

    static final boolean a;
    private final fqq b;

    private frh(fqq fqq1)
    {
        if (!a && fqq1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = fqq1;
            return;
        }
    }

    public static hst a(fqq fqq1)
    {
        return new frh(fqq1);
    }

    private static List b()
    {
        List list = fqq.a();
        if (list == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return list;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!frh.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
