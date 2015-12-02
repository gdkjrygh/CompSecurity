// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class ddm
    implements hst
{

    static final boolean a;
    private final ddl b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private ddm(ddl ddl1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && ddl1 == null)
        {
            throw new AssertionError();
        }
        b = ddl1;
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

    public static hst a(ddl ddl1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new ddm(ddl1, hzb1, hzb2, hzb3);
    }

    private cxu b()
    {
        return b.a((Application)c.a(), (hjo)d.a(), (dal)e.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddm.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
