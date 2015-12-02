// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.squareup.okhttp.OkHttpClient;
import java.util.concurrent.ExecutorService;

public final class dhg
    implements hst
{

    static final boolean a;
    private final dfq b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private dhg(dfq dfq1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && dfq1 == null)
        {
            throw new AssertionError();
        }
        b = dfq1;
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

    public static hst a(dfq dfq1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new dhg(dfq1, hzb1, hzb2, hzb3);
    }

    private cgh b()
    {
        cgh cgh = dfq.a((OkHttpClient)c.a(), (Application)d.a(), (ExecutorService)e.a());
        if (cgh == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return cgh;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dhg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
