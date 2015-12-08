// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.controller.helpers;

import com.wsi.android.framework.wxdata.geodata.helpers.GeoDataType;
import com.wsi.android.framework.wxdata.geodata.items.ww.WatchWarningBoxCollection;
import java.util.List;

public interface GeoDataUpdateListener
{

    public abstract void onGeoDataTypeDisabled(GeoDataType geodatatype);

    public abstract void onGeoDataUpdateFailed(GeoDataType geodatatype);

    public abstract void onPreGeoDataUpdate(GeoDataType geodatatype);

    public abstract void onUpdateEarthquakes(List list);

    public abstract void onUpdateHurricanes(List list);

    public abstract void onUpdateStormCells(List list);

    public abstract void onUpdateTrafficIncidents(List list);

    public abstract void onUpdateWatchWarningBoxes(WatchWarningBoxCollection watchwarningboxcollection);
}
