// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class dro
    implements hst
{

    static final boolean a;
    private final drn b;
    private final hzb c;
    private final hzb d;

    private dro(drn drn1, hzb hzb1, hzb hzb2)
    {
        if (!a && drn1 == null)
        {
            throw new AssertionError();
        }
        b = drn1;
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

    public static hst a(drn drn1, hzb hzb1, hzb hzb2)
    {
        return new dro(drn1, hzb1, hzb2);
    }

    private euz b()
    {
        return drn.a((Application)c.a(), (gju)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dro.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
