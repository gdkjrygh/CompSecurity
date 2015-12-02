// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.analytics.monitoring.model;


// Referenced classes of package com.ubercab.analytics.monitoring.model:
//            Shape_MonitoringEvent

public abstract class MonitoringEvent
{

    public MonitoringEvent()
    {
    }

    public static MonitoringEvent create()
    {
        return new Shape_MonitoringEvent();
    }

    public abstract String getApiCommandPath();

    public abstract String getHostname();

    public abstract String getMessageType();

    public abstract String getMethod();

    public abstract String getPath();

    public abstract String getResponseType();

    public abstract long getRoundtripTimeMs();

    public abstract int getStatusCode();

    public abstract MonitoringEvent setApiCommandPath(String s);

    public abstract MonitoringEvent setHostname(String s);

    public abstract MonitoringEvent setMessageType(String s);

    public abstract MonitoringEvent setMethod(String s);

    public abstract MonitoringEvent setPath(String s);

    public abstract MonitoringEvent setResponseType(String s);

    public abstract MonitoringEvent setRoundtripTimeMs(long l);

    public abstract MonitoringEvent setStatusCode(int i);
}
