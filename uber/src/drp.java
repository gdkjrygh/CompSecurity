// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class drp
    implements hst
{

    static final boolean a;
    private final drn b;
    private final hzb c;

    private drp(drn drn1, hzb hzb1)
    {
        if (!a && drn1 == null)
        {
            throw new AssertionError();
        }
        b = drn1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(drn drn1, hzb hzb1)
    {
        return new drp(drn1, hzb1);
    }

    private hoc b()
    {
        return drn.a((Application)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!drp.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
