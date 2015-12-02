// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.ubercab.crash.CrashlineClient;
import com.ubercab.crash.model.App;
import com.ubercab.crash.model.Crash;
import com.ubercab.crash.model.MetaData;
import java.util.List;
import java.util.Map;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

final class ang.Object
    implements icc
{

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
            dau.a(d).a(c.get("crash_uuid").toString(), b.getTimestamp(), b.getCommitHash(), app, b.getDevice(), b.getUserUuid(), b.getLatitude(), b.getLongitude(), b.getCity(), b.getCarrier(), a.getStackTrace(), list, b.getExperiments(), list1, new Callback(ick1) {

                final ick a;
                final dau._cls2 b;

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
                b = dau._cls2.this;
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

    (dau dau1, Crash crash, MetaData metadata, Map map)
    {
        d = dau1;
        a = crash;
        b = metadata;
        c = map;
        super();
    }
}
