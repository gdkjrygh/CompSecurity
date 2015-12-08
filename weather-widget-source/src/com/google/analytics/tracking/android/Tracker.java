// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            Transaction, ExceptionParser

public interface Tracker
{

    public abstract boolean anonymizeIpEnabled();

    public abstract void close();

    public abstract Map constructEvent(String s, String s1, String s2, Long long1);

    public abstract Map constructException(String s, boolean flag);

    public abstract Map constructRawException(String s, Throwable throwable, boolean flag)
        throws IOException;

    public abstract Map constructSocial(String s, String s1, String s2);

    public abstract Map constructTiming(String s, long l, String s1, String s2);

    public abstract Map constructTransaction(Transaction transaction);

    public abstract String get(String s);

    public abstract String getAppId();

    public abstract String getAppInstallerId();

    public abstract ExceptionParser getExceptionParser();

    public abstract double getSampleRate();

    public abstract String getTrackingId();

    public abstract boolean getUseSecure();

    public abstract void send(String s, Map map);

    public abstract void set(String s, String s1);

    public abstract void setAnonymizeIp(boolean flag);

    public abstract void setAppId(String s);

    public abstract void setAppInstallerId(String s);

    public abstract void setAppName(String s);

    public abstract void setAppScreen(String s);

    public abstract void setAppVersion(String s);

    public abstract void setCampaign(String s);

    public abstract void setCustomDimension(int i, String s);

    public abstract void setCustomDimensionsAndMetrics(Map map, Map map1);

    public abstract void setCustomMetric(int i, Long long1);

    public abstract void setExceptionParser(ExceptionParser exceptionparser);

    public abstract void setReferrer(String s);

    public abstract void setSampleRate(double d);

    public abstract void setStartSession(boolean flag);

    public abstract void setUseSecure(boolean flag);

    public abstract void trackEvent(String s, String s1, String s2, Long long1);

    public abstract void trackException(String s, Throwable throwable, boolean flag);

    public abstract void trackException(String s, boolean flag);

    public abstract void trackSocial(String s, String s1, String s2);

    public abstract void trackTiming(String s, long l, String s1, String s2);

    public abstract void trackTransaction(Transaction transaction);

    public abstract void trackView();

    public abstract void trackView(String s);
}
