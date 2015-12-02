// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import com.ubercab.rider.realtime.request.body.AnalyticsEventBody;
import ica;

public interface NotificationsApi
{

    public abstract ica getSettings();

    public abstract ica postAnalyticsEvent(AnalyticsEventBody analyticseventbody);
}
