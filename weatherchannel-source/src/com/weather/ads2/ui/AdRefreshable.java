// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;

import com.weather.ads2.config.AdConfigUnit;
import com.weather.ads2.targeting.AdRefreshEvent;
import java.util.Map;

public interface AdRefreshable
{

    public abstract void clearPendingAdRequest();

    public abstract void destroy();

    public abstract AdConfigUnit getAdConfiguration();

    public abstract boolean isConfigured();

    public abstract void pause();

    public abstract void recordImpression();

    public abstract void refreshAd(AdRefreshEvent adrefreshevent);

    public abstract void resume();

    public abstract void setAdConfiguration(AdConfigUnit adconfigunit);

    public abstract void setAdSlotName(String s);

    public abstract void setSingleUseAdParameters(Map map);
}
