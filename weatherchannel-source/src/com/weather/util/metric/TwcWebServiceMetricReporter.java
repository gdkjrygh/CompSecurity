// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import android.content.Context;
import android.net.TrafficStats;
import com.google.common.base.Preconditions;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.DeviceUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.net.HttpRequest;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.util.metric:
//            MetricReporter, TimerMetric, MetricBuildInfo, MetricDeviceInfo, 
//            MetricRegistry, MetricRegistryVisitor

public class TwcWebServiceMetricReporter
    implements MetricReporter
{
    public static class Builder
    {

        String baseUrl;
        private final MetricBuildInfo buildInfo;
        private final MetricDeviceInfo deviceInfo;
        private Executor executor;
        private final MetricRegistry registry;

        public TwcWebServiceMetricReporter build()
        {
            boolean flag1 = true;
            boolean flag;
            if (registry != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "registry is a required parameter");
            if (executor != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "executor is a required parameter");
            if (buildInfo != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "buildInfo is a required parameter");
            if (deviceInfo != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "deviceInfo is a required parameter");
            return new TwcWebServiceMetricReporter(this);
        }

        public Builder setBaseUrl(String s)
        {
            baseUrl = (String)Preconditions.checkNotNull(s);
            return this;
        }

        public Builder setExecutor(Executor executor1)
        {
            executor = (Executor)Preconditions.checkNotNull(executor1);
            return this;
        }





        public Builder(MetricRegistry metricregistry, MetricBuildInfo metricbuildinfo, MetricDeviceInfo metricdeviceinfo)
        {
            baseUrl = "http://ec2-52-91-207-14.compute-1.amazonaws.com";
            registry = (MetricRegistry)Preconditions.checkNotNull(metricregistry);
            buildInfo = (MetricBuildInfo)Preconditions.checkNotNull(metricbuildinfo);
            deviceInfo = (MetricDeviceInfo)Preconditions.checkNotNull(metricdeviceinfo);
        }
    }


    public static final String DEFAULT_URL_BASE = "http://ec2-52-91-207-14.compute-1.amazonaws.com";
    public static final String DEFAULT_URL_PATH_POST_METRICS = "/minorityreports/api/parse.php";
    private static final String TAG = com/weather/util/metric/TwcWebServiceMetricReporter.getName();
    private final MetricBuildInfo buildInfo;
    private final MetricDeviceInfo deviceInfo;
    private final Executor executor;
    private final MetricRegistry registry;
    SortedSet timers;
    private final String url;

    public TwcWebServiceMetricReporter(Builder builder)
    {
        timers = new TreeSet();
        registry = builder.registry;
        executor = builder.executor;
        buildInfo = builder.buildInfo;
        deviceInfo = builder.deviceInfo;
        url = (new StringBuilder()).append(builder.baseUrl).append("/minorityreports/api/parse.php").toString();
    }

    public String getJson(Context context)
        throws JSONException
    {
        Object obj;
        JSONObject jsonobject;
        JSONObject jsonobject1;
        JSONObject jsonobject3;
        JSONObject jsonobject4;
        Preconditions.checkNotNull(context);
        obj = new JSONArray();
        if (timers != null && !timers.isEmpty())
        {
            Iterator iterator = timers.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                TimerMetric timermetric = (TimerMetric)iterator.next();
                if (timermetric.hasFinished())
                {
                    JSONObject jsonobject2 = new JSONObject();
                    jsonobject2.put("name", timermetric.getName());
                    jsonobject2.put("start_time", timermetric.getInitialStartTime().getTime());
                    jsonobject2.put("duration_ms", timermetric.getElapsedTime());
                    ((JSONArray) (obj)).put(jsonobject2);
                }
            } while (true);
        }
        jsonobject = new JSONObject();
        jsonobject.put("timers", obj);
        jsonobject1 = new JSONObject();
        jsonobject1.put("build_num", buildInfo.getJenkinsJobNumber());
        jsonobject1.put("app_version", buildInfo.getAppVersionName());
        jsonobject1.put("build_type", buildInfo.getBuildType());
        jsonobject1.put("svc_commit", buildInfo.getAppCommitHash());
        jsonobject3 = new JSONObject();
        jsonobject3.put("deviceId", deviceInfo.getDeviceId());
        jsonobject3.put("platform", deviceInfo.getPlatform());
        jsonobject3.put("manufacturer", deviceInfo.getManufacturer());
        jsonobject3.put("model", deviceInfo.getModel());
        jsonobject3.put("os_version", deviceInfo.getAndroidOsVersion());
        jsonobject4 = new JSONObject();
        jsonobject4.put("carrier", DeviceUtils.getCarrierInfo(context));
        jsonobject4.put("carrier_network_speed", DeviceUtils.getNetworkClass(context));
        obj = com.weather.util.device.DeviceUtils.NetworkType.UNKNOWN.toString();
        if (!DeviceUtils.isOnWifi(context)) goto _L2; else goto _L1
_L1:
        obj = com.weather.util.device.DeviceUtils.NetworkType.WIFI.toString();
_L4:
        jsonobject4.put("network_type", obj);
        context = new JSONObject();
        context.put("device", jsonobject3);
        context.put("network", jsonobject4);
        obj = new JSONObject();
        ((JSONObject) (obj)).put("mobile", context);
        ((JSONObject) (obj)).put("build", jsonobject1);
        context = new JSONObject();
        context.put("metrics", jsonobject);
        context.put("session", obj);
        return context.toString();
_L2:
        if (DeviceUtils.isOnMobile(context))
        {
            obj = com.weather.util.device.DeviceUtils.NetworkType.MOBILE.toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void refreshMetricData()
    {
        timers.clear();
        registry.visit(new MetricRegistryVisitor() {

            final TwcWebServiceMetricReporter this$0;

            public void visit(SortedSet sortedset)
            {
                timers.addAll(sortedset);
            }

            
            {
                this$0 = TwcWebServiceMetricReporter.this;
                super();
            }
        });
    }

    public void report()
    {
        report(AbstractTwcApplication.getRootContext(), true);
    }

    public void report(final Context context, final boolean setTrafficStats)
    {
        Preconditions.checkNotNull(context);
        refreshMetricData();
        executor.execute(new Runnable() {

            final TwcWebServiceMetricReporter this$0;
            final Context val$context;
            final boolean val$setTrafficStats;

            public void run()
            {
                sendMetrics(context, setTrafficStats);
            }

            
            {
                this$0 = TwcWebServiceMetricReporter.this;
                context = context1;
                setTrafficStats = flag;
                super();
            }
        });
    }

    public boolean sendMetrics(Context context, boolean flag)
    {
        Context context1;
        Context context2;
        Context context3;
        String s;
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        s = null;
        if (flag)
        {
            TrafficStats.setThreadStatsTag(57346);
        }
        context2 = s;
        context3 = obj;
        context1 = obj1;
        String s1 = getJson(context);
        context2 = s;
        context3 = obj;
        context1 = obj1;
        context = HttpRequest.post(url).trustAllHosts().contentType("application/json", "UTF-8").send(s1);
        context2 = context;
        context3 = context;
        context1 = context;
        boolean flag2 = context.success();
        context2 = context;
        context3 = context;
        context1 = context;
        s = (new StringBuilder()).append(" url=").append(url).append(", jsonRequestBody=").append(s1).append(", code=").append(context.code()).append(", body=").append(context.body()).toString();
        if (!flag2) goto _L2; else goto _L1
_L1:
        context2 = context;
        context3 = context;
        context1 = context;
        LogUtil.v(TAG, LoggingMetaTags.TWC_METRICS, "metrics posted to server %s", new Object[] {
            s
        });
_L3:
        boolean flag1;
        if (context != null)
        {
            try
            {
                context.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        flag1 = flag2;
        if (flag)
        {
            TrafficStats.setThreadStatsTag(57346);
            flag1 = flag2;
        }
_L4:
        return flag1;
_L2:
        context2 = context;
        context3 = context;
        context1 = context;
        LogUtil.w(TAG, LoggingMetaTags.TWC_METRICS, "metrics posted to server failed %s", new Object[] {
            s
        });
          goto _L3
        context;
        context1 = context2;
        LogUtil.w(TAG, LoggingMetaTags.TWC_METRICS, "metrics posted to server failed with exception. e=%s", new Object[] {
            (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getMessage()).toString()
        });
        flag1 = false;
        if (context2 != null)
        {
            try
            {
                context2.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (flag)
        {
            TrafficStats.setThreadStatsTag(57346);
            return false;
        }
          goto _L4
        context;
        context1 = context3;
        LogUtil.w(TAG, LoggingMetaTags.TWC_METRICS, "metrics posted to server failed with exception. e=%s", new Object[] {
            (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getMessage()).toString()
        });
        flag1 = false;
        if (context3 != null)
        {
            try
            {
                context3.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (!flag) goto _L4; else goto _L5
_L5:
        TrafficStats.setThreadStatsTag(57346);
        return false;
        context;
        if (context1 != null)
        {
            try
            {
                context1.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        }
        if (flag)
        {
            TrafficStats.setThreadStatsTag(57346);
        }
        throw context;
    }

}
