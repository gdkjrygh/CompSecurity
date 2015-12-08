// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils.settings;

import com.wsi.android.framework.settings.GeoOverlay;
import com.wsi.android.framework.settings.helpers.PollingUnit;

public interface GeoOverlayManager
{

    public abstract String getActiveCategory()
        throws UnsupportedOperationException;

    public abstract String[] getCategories()
        throws UnsupportedOperationException;

    public abstract String getName();

    public abstract GeoOverlay getOverlay();

    public abstract int getPollingInterval();

    public abstract PollingUnit getPollingIntervalUnit();

    public abstract int getTypeId();

    public abstract boolean isCategoryBased();

    public abstract boolean isTurnedOn();

    public abstract void setActiveCategory(String s)
        throws UnsupportedOperationException;

    public abstract void setPollingInterval(int i, PollingUnit pollingunit)
        throws IllegalArgumentException;

    public abstract void turnOffOverlay();

    public abstract void turnOnOverlay();
}
