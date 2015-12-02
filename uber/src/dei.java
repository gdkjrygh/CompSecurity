// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.ubercab.analytics.model.Device;
import com.ubercab.analytics.monitoring.model.MonitoringEvent;
import com.ubercab.analytics.network.AnalyticsApi;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.network.uspout.model.ApplicationName;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import retrofit.android.MainThreadExecutor;
import retrofit.converter.GsonConverter;

public final class dei
{

    private final Application a;

    public dei(Application application)
    {
        a = application;
    }

    protected static cig a(Application application, grs grs1, chu chu)
    {
        return new cig((AnalyticsApi)grs1.a(com/ubercab/analytics/network/AnalyticsApi), chu, Device.create(application));
    }

    protected static OkHttpClient a(Cache cache)
    {
        OkHttpClient okhttpclient = new OkHttpClient();
        a(okhttpclient, cache);
        return okhttpclient;
    }

    protected static djt a(gpt gpt)
    {
        return new djt(gpt);
    }

    protected static gqn a(Application application, gqu gqu, Cache cache, cih cih, gqy gqy, grb grb1, glg glg, djt djt1)
    {
        gqu = new gqn(gqu);
        a(((gqn) (gqu)), cache, application);
        gqu.a(gqy);
        gqu.a(cih);
        gqu.a(grb1);
        gqu.a(glg);
        gqu.a(djt1);
        return gqu;
    }

    protected static gqn a(Application application, gqu gqu, Cache cache, gqy gqy)
    {
        gqu = new gqn(gqu);
        a(((gqn) (gqu)), cache, application);
        gqu.a(gqy);
        return gqu;
    }

    protected static gqn a(Application application, gqu gqu, Cache cache, gqy gqy, djt djt1)
    {
        gqu = new gqn(gqu);
        a(((gqn) (gqu)), cache, application);
        gqu.a(gqy);
        gqu.a(djt1);
        return gqu;
    }

    protected static gqn a(Application application, gqu gqu, Cache cache, gqy gqy, grb grb1, glg glg, djt djt1)
    {
        gqu = new gqn(gqu);
        a(((gqn) (gqu)), cache, application);
        gqu.a(gqy);
        gqu.a(grb1);
        gqu.a(glg);
        gqu.a(djt1);
        return gqu;
    }

    protected static gqn a(Application application, gqu gqu, Cache cache, grb grb1, gqy gqy, glg glg)
    {
        gqu = new gqn(gqu);
        a(((gqn) (gqu)), cache, application);
        gqu.a(gqy);
        gqu.a(grb1);
        gqu.a(glg);
        return gqu;
    }

    static gqo a(gqo gqo, dal dal1, cix cix1)
    {
        return b(gqo, dal1, cix1);
    }

    protected static gqu a(gqs gqs)
    {
        return new gqr(gqs);
    }

    public static grb a()
    {
        return new grb(new grd[] {
            new gra()
        });
    }

    protected static gro a(gqn gqn1)
    {
        return new gro(gqn1);
    }

    protected static grs a(gqn gqn1, bjw bjw, ExecutorService executorservice)
    {
        return (new grt(gqn1)).a(new GsonConverter(bjw)).a(executorservice, executorservice).a();
    }

    private static void a(OkHttpClient okhttpclient, Cache cache)
    {
        okhttpclient.setConnectTimeout(30000L, TimeUnit.MILLISECONDS);
        okhttpclient.setReadTimeout(30000L, TimeUnit.MILLISECONDS);
        okhttpclient.setCache(cache);
    }

    private static void a(gqn gqn1, Cache cache, Application application)
    {
        gqn1.a(30000L, TimeUnit.MILLISECONDS);
        gqn1.b(30000L, TimeUnit.MILLISECONDS);
        gqn1.a(cache);
        duf.a(application, gqn1);
    }

    protected static Cache b(Application application)
    {
        return new Cache(application.getCacheDir(), 0xa00000L);
    }

    private static gqo b(gqo gqo, dal dal1, cix cix1)
    {
        gqo = (new gqp(gqo)).a("User-Agent", b()).a("X-Uber-Origin", (new StringBuilder("android-")).append(cyy.b()).toString());
        if (dal1.v())
        {
            gqo.a("X-Uber-Token", dal1.u());
        }
        if (dal1.A())
        {
            gqo.a("X-Uber-Id", dal1.z());
        }
        if (cix1.d() != null)
        {
            gqo.a("X-Uber-Device-Location-Latitude", cix1.d().toString());
        }
        if (cix1.e() != null)
        {
            gqo.a("X-Uber-Device-Location-Longitude", cix1.e().toString());
        }
        return gqo.b();
    }

    protected static grs b(gqn gqn1, bjw bjw, ExecutorService executorservice)
    {
        return (new grt(gqn1)).a(new GsonConverter(bjw)).a(executorservice, new MainThreadExecutor()).a();
    }

    private static String b()
    {
        return (new StringBuilder()).append(cyy.b()).append("/android/").append(cyy.a()).toString();
    }

    protected static grs c(gqn gqn1, bjw bjw, ExecutorService executorservice)
    {
        return (new grt(gqn1)).a(new GsonConverter(bjw)).a(executorservice, new MainThreadExecutor()).a();
    }

    protected static grs d(gqn gqn1, bjw bjw, ExecutorService executorservice)
    {
        return (new grt(gqn1)).a(new GsonConverter(bjw)).a(executorservice, new MainThreadExecutor()).a();
    }

    protected final cih a(cig cig1, bjw bjw)
    {
        return new cih(cig1, bjw) {

            final bjw a;
            final dei b;

            protected final void a(MonitoringEvent monitoringevent, gqo gqo1)
            {
                Object obj = new HashMap();
                obj = (Map)a.a(gqo1.e(), obj.getClass());
                gqo1 = (String)((Map) (obj)).get("messageType");
                obj = (String)((Map) (obj)).get("apiUrl");
                if (!TextUtils.isEmpty(gqo1))
                {
                    monitoringevent.setMessageType(gqo1);
                }
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    monitoringevent.setApiCommandPath(((String) (obj)));
                }
            }

            
            {
                b = dei.this;
                a = bjw1;
                super(cig1);
            }
        };
    }

    public final UspoutClient a(dal dal1, gqn gqn1, ExecutorService executorservice)
    {
        return new UspoutClient(a, dal1, ApplicationName.RIDER, gqn1, executorservice);
    }

    protected final gqd a(Application application, hzb hzb, bjw bjw, ExecutorService executorservice)
    {
        return new gqd(application, new gqf(hzb) {

            final hzb a;
            final dei b;

            private gqn b()
            {
                return (gqn)a.a();
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dei.this;
                a = hzb1;
                super();
            }
        }, bjw, executorservice, executorservice);
    }

    final gqs a(Application application)
    {
        return new gqs(application.getSharedPreferences(".network", 0)) {

            final SharedPreferences a;
            final dei b;

            public final String a()
            {
                return a.getString("hostname", null);
            }

            public final void a(String s)
            {
                a.edit().putString("hostname", s).apply();
            }

            
            {
                b = dei.this;
                a = sharedpreferences;
                super();
            }
        };
    }

    protected final gqy a(cyy cyy1, dal dal1, cix cix1)
    {
        return new gqy(cyy1, dal1, cix1) {

            final cyy a;
            final dal b;
            final cix c;
            final dei d;

            public final gqq a(gqo gqo1, gqz gqz1)
            {
                gqo1 = dei.a(gqo1, b, c);
                ijg.a(gqo1.toString(), new Object[0]);
                gqo1 = gqz1.a(gqo1);
                ijg.a(gqo1.toString(), new Object[0]);
                return gqo1;
            }

            
            {
                d = dei.this;
                a = cyy1;
                b = dal1;
                c = cix1;
                super();
            }
        };
    }
}
