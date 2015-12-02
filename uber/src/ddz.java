// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class ddz
    implements hst
{

    static final boolean a;
    private final ddn b;
    private final hzb c;

    private ddz(ddn ddn1, hzb hzb1)
    {
        if (!a && ddn1 == null)
        {
            throw new AssertionError();
        }
        b = ddn1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(ddn ddn1, hzb hzb1)
    {
        return new ddz(ddn1, hzb1);
    }

    private hoi b()
    {
        return ddn.a((Application)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddz.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
