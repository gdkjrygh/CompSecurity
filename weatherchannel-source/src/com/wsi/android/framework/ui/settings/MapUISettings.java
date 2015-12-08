// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.settings;

import com.wsi.android.framework.settings.Layer;
import com.wsi.android.framework.settings.RasterLayers;
import com.wsi.android.framework.settings.helpers.SpeedUnit;
import com.wsi.android.framework.settings.helpers.SweepingRadarGrid;
import com.wsi.android.framework.settings.helpers.TemperatureUnit;
import com.wsi.android.framework.settings.helpers.WarningStyle;
import com.wsi.android.framework.settings.helpers.WarningTypeSelector;
import com.wsi.android.framework.wxdata.utils.tessera.LayerDisplayMode;
import com.wsi.android.weather.utils.settings.MapSkinSettings;

public interface MapUISettings
{

    public abstract Layer getCurrentLayer();

    public abstract LayerDisplayMode getCurrentLayerDisplayMode();

    public abstract int getCurrentLayerTransparency();

    public abstract SpeedUnit getCurrentSpeedUnits();

    public abstract SweepingRadarGrid getCurrentSweepingRadarGrid();

    public abstract TemperatureUnit getCurrentTemperatureUnits();

    public abstract RasterLayers getLayers();

    public abstract MapSkinSettings getSkinSettings();

    public abstract WarningStyle getWarningStyle(WarningTypeSelector warningtypeselector);

    public abstract void setCurrentLayer(Layer layer);

    public abstract void setCurrentLayerDisplayMode(LayerDisplayMode layerdisplaymode);

    public abstract void setCurrentLayerTransparency(int i);

    public abstract void setCurrentSpeedUnits(SpeedUnit speedunit);

    public abstract void setCurrentSweepingRadarGrid(SweepingRadarGrid sweepingradargrid);

    public abstract void setCurrentTemperatureUnits(TemperatureUnit temperatureunit);
}
