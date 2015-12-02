// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.vendor.google.now.GoogleNowApi;
import com.ubercab.client.core.vendor.google.now.RtNowApi;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import retrofit.android.MainThreadExecutor;

public final class dxb
{

    private static final long a;

    public dxb()
    {
    }

    static GoogleNowApi a(ExecutorService executorservice)
    {
        gqn gqn1 = new gqn("https://accounts.google.com/");
        a(gqn1);
        return (GoogleNowApi)(new grt(gqn1)).a(executorservice, new MainThreadExecutor()).a().a(com/ubercab/client/core/vendor/google/now/GoogleNowApi);
    }

    static RtNowApi a(grs grs1)
    {
        return (RtNowApi)grs1.a(com/ubercab/client/core/vendor/google/now/RtNowApi);
    }

    static dwx a(gmg gmg, GoogleNowApi googlenowapi, RtNowApi rtnowapi, dal dal)
    {
        return new dwy(gmg, googlenowapi, rtnowapi, dal);
    }

    private static void a(gqn gqn1)
    {
        gqn1.a(a, TimeUnit.MILLISECONDS);
        gqn1.b(a, TimeUnit.MILLISECONDS);
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(30L);
    }
}
