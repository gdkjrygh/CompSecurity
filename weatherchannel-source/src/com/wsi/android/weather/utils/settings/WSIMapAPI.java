// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils.settings;

import com.wsi.android.framework.settings.helpers.MeasurementUnits;
import com.wsi.android.framework.settings.helpers.PollingUnit;
import com.wsi.android.framework.settings.helpers.SweepingRadarGrid;
import com.wsi.android.framework.wxdata.utils.tessera.LayerDisplayMode;
import com.wsi.android.weather.ui.LayerItem;
import java.util.List;

// Referenced classes of package com.wsi.android.weather.utils.settings:
//            GeoOverlayManager

public interface WSIMapAPI
{

    public static final long LAYER_TIME_UNDEFINED = 0L;
    public static final int LEGEND_IMAGE_RESOURCE_UNDEFINED = -1;

    public abstract boolean checkActiveLayerHasLegend()
        throws IllegalStateException;

    public abstract boolean checkActiveLayerSupportsFutureMode();

    public abstract boolean checkActiveLayerSupportsLooping();

    public abstract LayerItem getActiveLayer();

    public abstract LayerDisplayMode getActiveLayerDisplayMode();

    public abstract int getActiveLayerPollingInterval();

    public abstract PollingUnit getActiveLayerPollingIntervalUnit();

    public abstract int getActiveLayerTransparency()
        throws IllegalStateException;

    public abstract GeoOverlayManager[] getAvailableGeoOverlays();

    public abstract List getAvailableLayers();

    public abstract SweepingRadarGrid getCurrentSweepingRadarGrid();

    public abstract int getLegendImageResourceIdForActiveLayer();

    public abstract MeasurementUnits getMeasurementUnits();

    public abstract boolean isActiveLayerInLoopingMode();

    public abstract boolean isFutureModeSupported();

    public abstract boolean isSweepingRadarEnabledForActiveLayer();

    public abstract void setActiveLayer(String s);

    public abstract void setActiveLayerDisplayMode(LayerDisplayMode layerdisplaymode);

    public abstract void setActiveLayerPollingInterval(int i, PollingUnit pollingunit)
        throws IllegalArgumentException;

    public abstract void setActiveLayerTransparency(int i)
        throws IllegalArgumentException;

    public abstract void setCurrentSweepingRadarGridType(SweepingRadarGrid sweepingradargrid);

    public abstract void setMeasurementUnits(MeasurementUnits measurementunits);

    public abstract void startLoopingForActiveLayer()
        throws IllegalStateException;

    public abstract void stopLoopingForActiveLayer()
        throws IllegalStateException;
}
