// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class ftr
    implements hst
{

    static final boolean a;
    private final fto b;
    private final hzb c;
    private final hzb d;

    private ftr(fto fto1, hzb hzb1, hzb hzb2)
    {
        if (!a && fto1 == null)
        {
            throw new AssertionError();
        }
        b = fto1;
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

    public static hst a(fto fto1, hzb hzb1, hzb hzb2)
    {
        return new ftr(fto1, hzb1, hzb2);
    }

    private ftn b()
    {
        return fto.a((RiderActivity)c.a(), (dal)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ftr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
