// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class fts
    implements hst
{

    static final boolean a;
    private final fto b;
    private final hzb c;

    private fts(fto fto1, hzb hzb1)
    {
        if (!a && fto1 == null)
        {
            throw new AssertionError();
        }
        b = fto1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(fto fto1, hzb hzb1)
    {
        return new fts(fto1, hzb1);
    }

    private ftz b()
    {
        return fto.a((RiderActivity)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fts.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
