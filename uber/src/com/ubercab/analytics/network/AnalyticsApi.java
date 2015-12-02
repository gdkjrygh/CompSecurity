// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.analytics.network;

import ica;
import java.util.Map;
import retrofit.Callback;

public interface AnalyticsApi
{

    public abstract ica sendAnalytics(Map map);

    public abstract void sendAnalytics(Map map, Callback callback);

    public abstract void sendAnalyticsSession(Map map, Callback callback);

    public abstract void sendMonitoring(Map map, Callback callback);
}
