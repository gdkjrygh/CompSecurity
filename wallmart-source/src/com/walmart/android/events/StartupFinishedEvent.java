// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.events;

import com.walmart.android.data.AppConfig;

public class StartupFinishedEvent
{

    public final AppConfig appConfigResult;
    public final Boolean loginResult;

    public StartupFinishedEvent(AppConfig appconfig, Boolean boolean1)
    {
        appConfigResult = appconfig;
        loginResult = boolean1;
    }
}
