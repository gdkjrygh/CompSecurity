// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.network.uspout.UspoutClient;
import java.util.concurrent.ExecutorService;

public final class dfd
    implements hst
{

    static final boolean a;
    private final dei b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private dfd(dei dei1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && dei1 == null)
        {
            throw new AssertionError();
        }
        b = dei1;
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

    public static hst a(dei dei1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new dfd(dei1, hzb1, hzb2, hzb3);
    }

    private UspoutClient b()
    {
        return b.a((dal)c.a(), (gqn)d.a(), (ExecutorService)e.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dfd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
