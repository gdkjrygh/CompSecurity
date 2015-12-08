// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils;

import com.wsi.android.framework.settings.ConfigurationManager;
import com.wsi.android.framework.ui.overlay.BitmapRecycler;

public class DataLayerAccessor
{

    protected ConfigurationManager configManager;

    public DataLayerAccessor(ConfigurationManager configurationmanager)
    {
        configManager = configurationmanager;
    }

    public ConfigurationManager getConfigManager()
    {
        return configManager;
    }

    protected void onPreStopBitmapRecycler()
    {
    }

    public void shutdown()
    {
        configManager.stop();
        onPreStopBitmapRecycler();
        BitmapRecycler.getRecycler().stop();
    }
}
