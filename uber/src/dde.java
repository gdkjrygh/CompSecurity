// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class dde
    implements hst
{

    static final boolean a;
    private final ddc b;
    private final hzb c;

    private dde(ddc ddc1, hzb hzb1)
    {
        if (!a && ddc1 == null)
        {
            throw new AssertionError();
        }
        b = ddc1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(ddc ddc1, hzb hzb1)
    {
        return new dde(ddc1, hzb1);
    }

    private dcv b()
    {
        return ddc.a((Application)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dde.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
