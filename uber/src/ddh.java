// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class ddh
    implements hst
{

    static final boolean a;
    private final ddc b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private ddh(ddc ddc1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && ddc1 == null)
        {
            throw new AssertionError();
        }
        b = ddc1;
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

    public static hst a(ddc ddc1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new ddh(ddc1, hzb1, hzb2, hzb3);
    }

    private chv b()
    {
        return ddc.a((Application)c.a(), (cev)d.a(), (dal)e.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddh.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
