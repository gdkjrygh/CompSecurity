// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.utils.tessera;

import android.content.Context;
import android.graphics.Rect;
import com.wsi.android.framework.settings.Layer;
import com.wsi.android.framework.wxdata.controller.helpers.GeoDataUpdateListener;
import com.wsi.android.framework.wxdata.geodata.controller.GeoDataCollectionHolder;
import com.wsi.android.framework.wxdata.geodata.helpers.GeoDataType;
import com.wsi.android.framework.wxdata.geodata.items.GeoDataCollection;
import com.wsi.android.framework.wxdata.tiles.TileBindingService;
import com.wsi.android.framework.wxdata.tiles.TileCachingManager;
import com.wsi.android.framework.wxdata.utils.MapDataSettings;
import com.wsi.android.weather.ui.MapApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.wsi.android.framework.wxdata.utils.tessera:
//            OverlayDataHolderDestroyable, TileMapsHolder, TesseraDataHolder, OverlayDataPollingController, 
//            GeoFeatureHolder, LayerDisplayMode

public abstract class OverlayDataHolder
{

    protected Context appContext;
    private List destroyableMembers;
    private GeoFeatureHolder geoFeatureHolder;
    private boolean isDestroyed;
    private OverlayDataPollingController pollingController;
    protected MapDataSettings settings;
    protected TesseraDataHolder tesseraDataHolder;
    protected TileBindingService tileBindingService;
    private TileMapsHolder tileMapsHolder;

    public OverlayDataHolder(MapDataSettings mapdatasettings)
    {
        tesseraDataHolder = createTesseraDataHolder(mapdatasettings);
        tileMapsHolder = createTileMapsHolder(mapdatasettings);
        geoFeatureHolder = createGeoFeatureHolder(mapdatasettings);
        pollingController = createPollingController(mapdatasettings);
        destroyableMembers = new ArrayList();
        destroyableMembers.add(tileMapsHolder);
        destroyableMembers.add(geoFeatureHolder);
        destroyableMembers.add(pollingController);
        destroyableMembers.add(tesseraDataHolder);
        isDestroyed = false;
    }

    protected abstract GeoFeatureHolder createGeoFeatureHolder(MapDataSettings mapdatasettings);

    protected abstract OverlayDataPollingController createPollingController(MapDataSettings mapdatasettings);

    protected abstract TesseraDataHolder createTesseraDataHolder(MapDataSettings mapdatasettings);

    protected abstract TileMapsHolder createTileMapsHolder(MapDataSettings mapdatasettings);

    public void destroyInstance()
    {
        isDestroyed = true;
        for (Iterator iterator = destroyableMembers.iterator(); iterator.hasNext(); ((OverlayDataHolderDestroyable)iterator.next()).onOverlayDataHolderDestroy()) { }
        destroyableMembers.clear();
        destroyableMembers = null;
        tileBindingService = null;
        appContext = null;
        settings = null;
        tesseraDataHolder = null;
        tileMapsHolder = null;
        geoFeatureHolder = null;
        pollingController = null;
    }

    public String getActiveLayerType()
    {
        if (tileMapsHolder == null)
        {
            return null;
        } else
        {
            return tileMapsHolder.getActiveLayerId();
        }
    }

    public int getActiveTileMapSize()
    {
        return tesseraDataHolder.getTileMapsForActiveLayer().size();
    }

    public Context getAppContext()
    {
        return appContext;
    }

    public long getClosestToCurrentTimeTileTime()
    {
        return tileMapsHolder.getClosestToCurrentTimeTileTime();
    }

    GeoDataCollectionHolder getGeoDataCollectionHolder()
    {
        return tesseraDataHolder.geoDataCollectionHolder;
    }

    public String getGeoOverlayCategoryFeatureId(GeoDataType geodatatype)
    {
        return tesseraDataHolder.getGeoOverlayCategoryFeatureId(geodatatype);
    }

    int getGeoOverlayPollingPeriod(GeoDataType geodatatype)
    {
        return pollingController.getGeoOverlayPollingPeriod(geodatatype);
    }

    public int getLastFrameTileVersionIndexForLooping(int i)
    {
        return tileMapsHolder.getLastFrameTileVersionIndexForLooping(i);
    }

    public int getMaxFramesForLooping()
    {
        return tileMapsHolder.getTileMapsMaxFramesForLooping();
    }

    public long getOldestTileMapsTimeForLooping()
    {
        return tileMapsHolder.getOldestTileMapsTimeForLooping();
    }

    public String getTileMapRequestUrlForNextServer(int i, int j, int k)
    {
        return tileMapsHolder.getTileMapRequestUrlForNextServer(i, j, k);
    }

    public String getTileMapRequestUrlForNextServer(int i, int j, int k, int l)
    {
        return tileMapsHolder.getTileMapRequestUrlForNextServer(i, j, k, l);
    }

    public long getTileMapTimeByVersionIndex(int i)
    {
        return tileMapsHolder.getTileMapTimeByVersionIndex(i);
    }

    public int getTileMapsMaxZoomLevel()
    {
        return tileMapsHolder.getTileMapsMaxZoomLevel();
    }

    public String getUrlByGeoFeatureId(String s, Rect rect)
    {
        if (geoFeatureHolder != null)
        {
            synchronized (geoFeatureHolder)
            {
                s = geoFeatureHolder.getUrlByFeatureId(s, rect);
            }
            return s;
        } else
        {
            return null;
        }
        s;
        geofeatureholder;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void initGeoFeaturesPolling()
    {
        pollingController.initGeoFeaturesPolling();
    }

    public boolean isDestroyed()
    {
        return isDestroyed;
    }

    boolean isGeoOverlayEnabled(GeoDataType geodatatype)
    {
        return pollingController.isGeoOverlayEnabled(geodatatype);
    }

    protected abstract boolean isTilesDataExpired();

    void notifyOnGeoDataDisabled(GeoDataType geodatatype)
    {
        if (!isDestroyed())
        {
            pollingController.notifyOnGeoDataDisabled(geodatatype);
        }
    }

    void notifyOnGeoDataUpdateFailed(GeoDataType geodatatype)
    {
        if (!isDestroyed())
        {
            pollingController.notifyOnGeoDataUpdateFailed(geodatatype);
        }
    }

    void notifyOnGeoDataUpdated(GeoDataType geodatatype, GeoDataCollection geodatacollection)
    {
        if (!isDestroyed())
        {
            pollingController.notifyOnGeoDataUpdated(geodatatype, geodatacollection);
        }
    }

    void notifyOnPreGeoDataUpdate(GeoDataType geodatatype)
    {
        if (!isDestroyed())
        {
            pollingController.notifyOnPreGeoDataUpdate(geodatatype);
        }
    }

    void onDataRetrievingFinished(GeoDataType geodatatype)
    {
        if (!isDestroyed())
        {
            pollingController.onDataRetrievingFinished(geodatatype);
        }
    }

    public void registerGeoDataUpdateListener(GeoDataUpdateListener geodataupdatelistener)
    {
        pollingController.registerGeoDataUpdateListener(geodataupdatelistener);
    }

    public void releaseTileMapsPollingThread()
    {
        synchronized (pollingController)
        {
            pollingController.releaseTileMapsPollingThread();
        }
        return;
        exception;
        overlaydatapollingcontroller;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void resumeTileMapsPolling()
    {
        synchronized (pollingController)
        {
            pollingController.resumeTileMapsPolling();
        }
        return;
        exception;
        overlaydatapollingcontroller;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void scheduleGeoDataPollingUpdates(GeoDataType geodatatype)
    {
        if (!isDestroyed())
        {
            pollingController.scheduleGeoDataPollingUpdates(geodatatype);
        }
    }

    public void scheduleGeoDataPollingUpdatesNow(GeoDataType geodatatype)
    {
        if (!isDestroyed())
        {
            pollingController.schedulePollingUpdatesNow(geodatatype);
        }
    }

    public void setActiveLayer(Layer layer)
    {
        tileMapsHolder.setActiveLayer(layer, true);
    }

    public void setAppContext(Context context)
    {
        appContext = context;
        context = (MapApplication)appContext;
        tesseraDataHolder.setTileMapsPool(context.getTileMapsPool());
        tesseraDataHolder.setGeoFeaturesPool(context.getGeoFeaturesPool());
        tesseraDataHolder.setTesseraLayerSettingsPool(context.getTesseraLayerSettingsPool());
    }

    public void setLayerDisplayMode(LayerDisplayMode layerdisplaymode)
    {
        tileMapsHolder.setLayerDisplayMode(layerdisplaymode);
    }

    public void setTileBindingService(TileBindingService tilebindingservice)
    {
        tileBindingService = tilebindingservice;
    }

    public void stopGeoFeaturesPolling()
    {
        pollingController.stopGeoFeaturesPolling();
    }

    void stopServerActivityIndicationForGeoDataType(GeoDataType geodatatype)
    {
        pollingController.stopServerActivityIndicationForGeoDataType(geodatatype);
    }

    public void suspendTileMapsPolling()
    {
        synchronized (pollingController)
        {
            pollingController.suspendTileMapsPolling();
        }
        return;
        exception;
        overlaydatapollingcontroller;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void unregisterGeoDataUpdateListener(GeoDataUpdateListener geodataupdatelistener)
    {
        pollingController.unregisterGeoDataUpdateListener(geodataupdatelistener);
    }

    public void updateActiveTiles(Layer layer)
    {
        this;
        JVM INSTR monitorenter ;
        if (layer == null) goto _L2; else goto _L1
_L1:
        if (layer.equals(tileMapsHolder.getActiveLayer())) goto _L2; else goto _L3
_L3:
        boolean flag1;
        tileBindingService.getCacheManager().cleanAll();
        flag1 = pollingController.updateTileMapsPolling(layer);
        boolean flag;
        flag = flag1;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        flag = flag1;
        if (!isTilesDataExpired())
        {
            flag = false;
        }
        tileMapsHolder.setActiveLayer(layer, flag);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isTilesDataExpired())
        {
            tileMapsHolder.setActiveLayer(layer, true);
        }
        if (true) goto _L5; else goto _L4
_L4:
        layer;
        throw layer;
    }

    public void updateGeoFeaturesFromServer()
    {
        if (geoFeatureHolder != null)
        {
            synchronized (geoFeatureHolder)
            {
                geoFeatureHolder.updateFeaturesFromServer();
            }
            return;
        } else
        {
            return;
        }
        exception;
        geofeatureholder;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void updateGeoOverlays()
    {
        pollingController.updateGeoOverlays(false);
    }

    public void updateGeoOverlays(boolean flag)
    {
        pollingController.updateGeoOverlays(flag);
    }

    public void updateGeoOverlaysConfiguration()
    {
        pollingController.updateGeoOverlaysConfiguration();
    }

    public void updateTileMapsFromServer()
    {
        synchronized (tileMapsHolder)
        {
            tileMapsHolder.updateTileMapsFromServer();
        }
        return;
        exception;
        tilemapsholder;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
