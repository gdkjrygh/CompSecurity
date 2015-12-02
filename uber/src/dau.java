// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.crash.CrashlineClient;
import com.ubercab.crash.model.App;
import com.ubercab.crash.model.Crash;
import com.ubercab.crash.model.MetaData;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.network.uspout.model.Message;
import java.util.List;
import java.util.Map;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class dau extends gky
{

    private final cyy a;
    private final UspoutClient b;
    private final CrashlineClient c;
    private final chp d;
    private final ici e;

    public dau(gkx gkx, cyy cyy, UspoutClient uspoutclient, CrashlineClient crashlineclient, chp chp, ici ici)
    {
        super(gkx);
        a = cyy;
        b = uspoutclient;
        c = crashlineclient;
        d = chp;
        e = ici;
    }

    static CrashlineClient a(dau dau1)
    {
        return dau1.c;
    }

    private ica a(Crash crash)
    {
        return ica.a(new icc(crash) {

            final Crash a;
            final dau b;

            private void a(ick ick1)
            {
                if (a.isExperimentOn(dbf.I.toString()))
                {
                    dau.c(b).a(AnalyticsEvent.create("lifecycle").setName(dcz.b));
                    dau.c(b).a(new chs(this, ick1) {

                        final ick a;
                        final _cls4 b;

                        public final void a()
                        {
                            Log.i(dau.getSimpleName(), "onCompleted analytics observable");
                            a.a();
                        }

                        public final void b()
                        {
                            Log.i(dau.getSimpleName(), "onError analytics observable");
                            a.a(new Throwable("AnalyticsClient: failed sending analytics event."));
                        }

            
            {
                b = _pcls4;
                a = ick1;
                super();
            }
                    });
                    return;
                } else
                {
                    Log.i(dau.getSimpleName(), "onCompleted analytics observable");
                    ick1.a();
                    return;
                }
            }

            public final void call(Object obj)
            {
                a((ick)obj);
            }

            
            {
                b = dau.this;
                a = crash;
                super();
            }
        });
    }

    private ica a(Crash crash, MetaData metadata, Map map)
    {
        return ica.a(new icc(crash, metadata, map) {

            final Crash a;
            final MetaData b;
            final Map c;
            final dau d;

            private void a(ick ick1)
            {
                if (a.isExperimentOn(dbf.K.toString()))
                {
                    App app = App.create(b.getAppType().getAppName(), b.getAppId(), b.getCrashedVersion(), cyy.a(), b.getBuildSku());
                    List list = null;
                    if (c.containsKey("crashline_network_logs"))
                    {
                        list = (List)c.get("crashline_network_logs");
                    }
                    List list1 = null;
                    if (c.containsKey("crashline_analytics_logs"))
                    {
                        list1 = (List)c.get("crashline_analytics_logs");
                    }
                    dau.a(d).a(c.get("crash_uuid").toString(), b.getTimestamp(), b.getCommitHash(), app, b.getDevice(), b.getUserUuid(), b.getLatitude(), b.getLongitude(), b.getCity(), b.getCarrier(), a.getStackTrace(), list, b.getExperiments(), list1, new Callback(this, ick1) {

                        final ick a;
                        final _cls2 b;

                        private void a()
                        {
                            Log.i(dau.getSimpleName(), "onCompleted CrashLine observable");
                            a.a();
                        }

                        public final void failure(RetrofitError retrofiterror)
                        {
                            Log.i(dau.getSimpleName(), "onError Crashline observable");
                            a.a(retrofiterror);
                        }

                        public final void success(Object obj, Response response)
                        {
                            a();
                        }

            
            {
                b = _pcls2;
                a = ick1;
                super();
            }
                    });
                    return;
                } else
                {
                    Log.i(dau.getSimpleName(), "onCompleted CrashLine observable");
                    ick1.a();
                    return;
                }
            }

            public final void call(Object obj)
            {
                a((ick)obj);
            }

            
            {
                d = dau.this;
                a = crash;
                b = metadata;
                c = map;
                super();
            }
        });
    }

    static UspoutClient b(dau dau1)
    {
        return dau1.b;
    }

    private ica b(Crash crash, MetaData metadata, Map map)
    {
        return ica.a(new icc(crash, map, metadata) {

            final Crash a;
            final Map b;
            final MetaData c;
            final dau d;

            private void a(ick ick1)
            {
                if (a.isExperimentOn(dbf.J.toString()))
                {
                    dau.b(d).a(new Callback(this, ick1) {

                        final ick a;
                        final _cls3 b;

                        private void a()
                        {
                            Log.i(dau.getSimpleName(), "onCompleted uSpout observable");
                            a.a();
                        }

                        public final void failure(RetrofitError retrofiterror)
                        {
                            Log.i(dau.getSimpleName(), "onError uSpout observable");
                            a.a(retrofiterror);
                        }

                        public final void success(Object obj, Response response)
                        {
                            a();
                        }

            
            {
                b = _pcls3;
                a = ick1;
                super();
            }
                    }, new Message[] {
                        Message.create(b, c.getTimestamp().longValue(), c.getLatitude(), c.getLongitude())
                    });
                    return;
                } else
                {
                    Log.i(dau.getSimpleName(), "onCompleted uSpout observable");
                    ick1.a();
                    return;
                }
            }

            public final void call(Object obj)
            {
                a((ick)obj);
            }

            
            {
                d = dau.this;
                a = crash;
                b = map;
                c = metadata;
                super();
            }
        });
    }

    static chp c(dau dau1)
    {
        return dau1.d;
    }

    protected final void a(MetaData metadata, Map map, Crash crash, gkz gkz)
    {
        if (metadata != null)
        {
            ica.a(a(crash).b(e), b(crash, metadata, map).b(e), a(crash, metadata, map).b(e)).a(ico.a()).a(new icg(gkz, crash) {

                final gkz a;
                final Crash b;
                final dau c;

                public final void a()
                {
                    Log.i(dau.getSimpleName(), "onCompleted uploadCrashReport mergedObservable.");
                    a.a(b);
                }

                public final volatile void a(Object obj)
                {
                }

                public final void a(Throwable throwable)
                {
                    Log.i(dau.getSimpleName(), "onError uploadCrashReport mergedObservable");
                    a.a();
                }

            
            {
                c = dau.this;
                a = gkz1;
                b = crash;
                super();
            }
            });
        }
    }
}
