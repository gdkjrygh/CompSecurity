// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            Tracker, EasyTracker, ExceptionParser, Transaction

class sampleRate
    implements Tracker
{

    private boolean anonymizeIp;
    private String appId;
    private String appInstallerId;
    private ExceptionParser exceptionParser;
    private double sampleRate;
    final EasyTracker this$0;
    private boolean useSecure;

    public boolean anonymizeIpEnabled()
    {
        return anonymizeIp;
    }

    public void close()
    {
    }

    public Map constructEvent(String s, String s1, String s2, Long long1)
    {
        return new HashMap();
    }

    public Map constructException(String s, boolean flag)
    {
        return new HashMap();
    }

    public Map constructRawException(String s, Throwable throwable, boolean flag)
    {
        return new HashMap();
    }

    public Map constructSocial(String s, String s1, String s2)
    {
        return new HashMap();
    }

    public Map constructTiming(String s, long l, String s1, String s2)
    {
        return new HashMap();
    }

    public Map constructTransaction(Transaction transaction)
    {
        return new HashMap();
    }

    public String get(String s)
    {
        return "";
    }

    public String getAppId()
    {
        return appId;
    }

    public String getAppInstallerId()
    {
        return appInstallerId;
    }

    public ExceptionParser getExceptionParser()
    {
        return exceptionParser;
    }

    public double getSampleRate()
    {
        return sampleRate;
    }

    public String getTrackingId()
    {
        return "";
    }

    public boolean getUseSecure()
    {
        return useSecure;
    }

    public void send(String s, Map map)
    {
    }

    public void set(String s, String s1)
    {
    }

    public void setAnonymizeIp(boolean flag)
    {
        anonymizeIp = flag;
    }

    public void setAppId(String s)
    {
        appId = s;
    }

    public void setAppInstallerId(String s)
    {
        appInstallerId = s;
    }

    public void setAppName(String s)
    {
    }

    public void setAppScreen(String s)
    {
    }

    public void setAppVersion(String s)
    {
    }

    public void setCampaign(String s)
    {
    }

    public void setCustomDimension(int i, String s)
    {
    }

    public void setCustomDimensionsAndMetrics(Map map, Map map1)
    {
    }

    public void setCustomMetric(int i, Long long1)
    {
    }

    public void setExceptionParser(ExceptionParser exceptionparser)
    {
        exceptionParser = exceptionparser;
    }

    public void setReferrer(String s)
    {
    }

    public void setSampleRate(double d)
    {
        sampleRate = d;
    }

    public void setStartSession(boolean flag)
    {
    }

    public void setUseSecure(boolean flag)
    {
        useSecure = flag;
    }

    public void trackEvent(String s, String s1, String s2, Long long1)
    {
    }

    public void trackException(String s, Throwable throwable, boolean flag)
    {
    }

    public void trackException(String s, boolean flag)
    {
    }

    public void trackSocial(String s, String s1, String s2)
    {
    }

    public void trackTiming(String s, long l, String s1, String s2)
    {
    }

    public void trackTransaction(Transaction transaction)
    {
    }

    public void trackView()
    {
    }

    public void trackView(String s)
    {
    }

    ()
    {
        this$0 = EasyTracker.this;
        super();
        sampleRate = 100D;
    }
}
