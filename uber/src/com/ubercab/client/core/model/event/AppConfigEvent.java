// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;

import com.ubercab.client.core.model.AppConfig;

public final class AppConfigEvent
{

    private final AppConfig mAppConfig;

    public AppConfigEvent(AppConfig appconfig)
    {
        mAppConfig = appconfig;
    }

    public final AppConfig getAppConfig()
    {
        return mAppConfig;
    }
}
