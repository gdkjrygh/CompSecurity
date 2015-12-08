// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.utils;

import android.content.Context;
import com.wsi.android.framework.settings.GeoOverlay;
import com.wsi.android.framework.settings.GeoOverlays;
import com.wsi.android.framework.settings.Layer;
import com.wsi.android.framework.settings.OverlayCategory;
import com.wsi.android.framework.wxdata.geodata.helpers.GeoDataType;
import com.wsi.android.weather.utils.settings.Tessera;
import java.util.Set;

public interface MapDataSettings
{

    public abstract GeoOverlays getAdditionalOverlays();

    public abstract Context getAppContext();

    public abstract String getCategoryFeatureId(GeoDataType geodatatype);

    public abstract int getFrameLimitForLooping();

    public abstract GeoOverlay getGeoOverlay(GeoDataType geodatatype);

    public abstract String getLayerTilesUrl();

    public abstract GeoOverlays getOverlays();

    public abstract Tessera getTesseraConfiguration();

    public abstract String getTokenMemeberId();

    public abstract String getTokenSharedKey();

    public abstract Set getUnidentifiableLayers();

    public abstract boolean isLayerIdentifiable(Layer layer);

    public abstract boolean isOverlayEnabled(GeoDataType geodatatype);

    public abstract void setGeoOverlayEnabled(GeoOverlay geooverlay, boolean flag, OverlayCategory overlaycategory);
}
