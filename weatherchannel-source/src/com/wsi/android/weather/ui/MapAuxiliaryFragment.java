// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ZoomControls;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.ui.map.WSIMapView;
import com.wsi.android.framework.ui.overlay.ManagableOverlay;
import com.wsi.android.framework.ui.overlay.OverlayController;
import com.wsi.android.framework.ui.overlay.TileOverlayController;
import com.wsi.android.framework.ui.overlay.WSITiledOverlay;
import com.wsi.android.framework.ui.overlay.WeatherTileChangeListener;
import com.wsi.android.framework.ui.overlay.geodata.GeoDataOverlay;
import com.wsi.android.framework.ui.overlay.loopingmode.LoopTileOverlayController;
import com.wsi.android.framework.ui.overlay.loopingmode.LoopTileUpdateMessageHandller;
import com.wsi.android.framework.ui.overlay.staticmode.StaticTileOverlayController;
import com.wsi.android.framework.ui.overlay.staticmode.StaticTileUpdateMessageHandler;
import com.wsi.android.framework.ui.overlay.sweepingradar.WSISweepingRadarOverlay;
import com.wsi.android.framework.ui.utils.ComponentsProvider;
import com.wsi.android.framework.ui.utils.DialogHelper;
import com.wsi.android.framework.wxdata.controller.WeatherTileProvider;
import com.wsi.android.framework.wxdata.controller.helpers.GeoDataUpdateListener;
import com.wsi.android.framework.wxdata.geodata.helpers.GeoDataType;
import com.wsi.android.framework.wxdata.geodata.items.ww.WatchWarningBoxCollection;
import com.wsi.android.framework.wxdata.utils.tessera.OverlayDataHolder;
import com.wsi.android.framework.wxdata.ws.WSIServerConnector;
import com.wsi.android.weather.utils.settings.MapSettingsAccessor;
import com.wsi.android.weather.utils.settings.MapSkinSettings;
import com.wsi.android.weather.utils.settings.Tessera;
import com.wsi.android.weather.utils.settings.WSIMapAPI;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.wsi.android.weather.ui:
//            MapAppFragment, MapApplication, MapActivityWithAPI, WSIMapActivity

public class MapAuxiliaryFragment extends MapAppFragment
    implements WeatherTileChangeListener, GeoDataUpdateListener, com.wsi.android.weather.utils.settings.MapSettingsAccessor.SettingsChangeListener
{

    private static final int DIALOG_GEO_DATA_UPDATE_FAILED = 2;
    private static final int DIALOG_TILE_UPDATE_FAILED = 1;
    private static final String KEY_IS_ANIMATE_TO_SWEEPING_RADAR_POSITION = "is_animate_to_sweeping_radar_position";
    private static final String KEY_IS_LOOPING_MODE_ENABLED = "is_looping_mode_enabled";
    protected final String TAG = getClass().getSimpleName();
    private Runnable animateToSweepingRadarPositionRunnable;
    private long currentTileTime;
    private GeoDataOverlay geoDataOverlay;
    private boolean initialized;
    private boolean isAnimateToSweepingRadarPosition;
    private boolean isLoopingModeEnabled;
    protected WSIMapAPI mapApi;
    protected View mapFragmentContent;
    protected WSIMapView mapView;
    private OverlayController overlayController;
    private OverlayDataHolder overlayDataHolder;
    private WSISweepingRadarOverlay sweepingRadarOverlay;
    private TileOverlayController tileController;
    private WeatherTileProvider tileProvider;
    private WSITiledOverlay tiledOverlay;
    private Handler uiThreadHandler;
    protected boolean webMode;
    private ZoomControls zoomControls;

    public MapAuxiliaryFragment()
    {
        uiThreadHandler = new Handler();
        webMode = false;
        isAnimateToSweepingRadarPosition = true;
        animateToSweepingRadarPositionRunnable = new _cls1();
    }

    private void animateToSweepArmPositionIfNecessary()
    {
        if (mapApp.getSettingsAccessor().isSweepingRadarEnabledForCurrentLayer())
        {
            if (isAnimateToSweepingRadarPosition)
            {
                uiThreadHandler.post(animateToSweepingRadarPositionRunnable);
            }
            return;
        } else
        {
            isAnimateToSweepingRadarPosition = true;
            return;
        }
    }

    private Dialog createGeoDataUpdateFailedDialog()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setMessage(getString(com.wsi.android.weather.R.string.failed_update_geo_overlay_data_mes));
        builder.setCancelable(true);
        if (overlayDataHolder != null)
        {
            builder.setPositiveButton(com.wsi.android.weather.R.string.button_retry, new _cls6());
        }
        builder.setNegativeButton(com.wsi.android.weather.R.string.button_cancel, new _cls7());
        return builder.create();
    }

    private Dialog createTileUpdateFailedDialog()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setMessage(getString(com.wsi.android.weather.R.string.failed_get_weather_tiles_mes));
        builder.setCancelable(true);
        builder.setPositiveButton(com.wsi.android.weather.R.string.button_retry, new _cls4());
        builder.setNegativeButton(com.wsi.android.weather.R.string.button_cancel, new _cls5());
        return builder.create();
    }

    private void destroyInstances()
    {
        overlayController.onDestroy();
        tileController.onDestroy();
        mapView.onDestroy();
        geoDataOverlay.onDestroy();
        sweepingRadarOverlay.onDestroy();
        tiledOverlay.onDestroy();
    }

    private HashMap getTiles()
    {
        if (tiledOverlay != null)
        {
            return tiledOverlay.getTiles();
        } else
        {
            return null;
        }
    }

    private void initLoopingMode()
    {
        if (tiledOverlay == null)
        {
            return;
        } else
        {
            removeManagableOverlay(geoDataOverlay);
            overlayController.invalidate();
            performChangeModeCleanUp();
            LoopTileUpdateMessageHandller looptileupdatemessagehandller = new LoopTileUpdateMessageHandller(tiledOverlay, this);
            MapSettingsAccessor mapsettingsaccessor = mapApp.getSettingsAccessor();
            mapsettingsaccessor.removeOnCurrentLayerTransparencyChangedListener(tileController);
            tileController = new LoopTileOverlayController(tiledOverlay.getTiles(), mapView, looptileupdatemessagehandller, mapsettingsaccessor, mapsettingsaccessor.getTesseraConfiguration().getVersion());
            tileController.setDataLayer(tileProvider);
            tiledOverlay.setTileController(tileController);
            tileController.updateLayerDisplayModeFromSettings();
            tileController.updateLayerFromSettings();
            mapsettingsaccessor.addOnCurrentLayerTransparencyChangedListener(tileController);
            return;
        }
    }

    private void initStaticMode()
    {
        if (tiledOverlay == null)
        {
            return;
        }
        MapSettingsAccessor mapsettingsaccessor = mapApp.getSettingsAccessor();
        if (tileController != null && tileController.getClass().equals(com/wsi/android/framework/ui/overlay/staticmode/StaticTileOverlayController))
        {
            mapsettingsaccessor.addOnCurrentLayerTransparencyChangedListener(tileController);
            tileController.updateLayerFromSettings();
            return;
        } else
        {
            performChangeModeCleanUp();
            StaticTileUpdateMessageHandler statictileupdatemessagehandler = new StaticTileUpdateMessageHandler(tiledOverlay, this);
            mapsettingsaccessor.removeOnCurrentLayerTransparencyChangedListener(tileController);
            tileController = new StaticTileOverlayController(tiledOverlay.getTiles(), mapView, statictileupdatemessagehandler, mapsettingsaccessor, mapsettingsaccessor.getTesseraConfiguration().getVersion());
            tileController.setDataLayer(tileProvider);
            tiledOverlay.setTileController(tileController);
            tileController.updateLayerDisplayModeFromSettings();
            tileController.updateLayerFromSettings();
            addManagableOverlay(geoDataOverlay);
            mapsettingsaccessor.addOnCurrentLayerTransparencyChangedListener(tileController);
            return;
        }
    }

    private void initZoomControlls()
    {
        ViewGroup viewgroup = (ViewGroup)mapFragmentContent.findViewById(getZoomControllsViewGroupId());
        PackageManager packagemanager = getActivity().getPackageManager();
        if (packagemanager != null && packagemanager.hasSystemFeature("android.hardware.touchscreen.multitouch"))
        {
            if (viewgroup != null)
            {
                viewgroup.setVisibility(8);
            }
        } else
        if (viewgroup != null)
        {
            zoomControls = (ZoomControls)mapView.getZoomControls();
            viewgroup.addView(zoomControls);
            return;
        }
    }

    private void notifyWSIMapAPIInstanceFragmentInFront()
    {
        ((MapActivityWithAPI)getActivity()).setMapAuxiliaryFragment(this);
    }

    private void notifyWSIMapAPIInstanceFragmentNotInFront()
    {
        if (webMode)
        {
            return;
        } else
        {
            ((WSIMapActivity)getActivity()).setMapAuxiliaryFragment(null);
            return;
        }
    }

    private void performChangeModeCleanUp()
    {
        if (tileController != null)
        {
            tileController.cleanUp();
        }
    }

    private void releaseInstances()
    {
        overlayDataHolder = null;
        overlayController = null;
        tileProvider = null;
        tileController = null;
        mapView = null;
        zoomControls = null;
        geoDataOverlay = null;
        sweepingRadarOverlay = null;
        tiledOverlay = null;
        mapFragmentContent = null;
        animateToSweepingRadarPositionRunnable = null;
        uiThreadHandler = null;
        mapApp = null;
        componentsProvider = null;
        dialogHelper = null;
        layoutParams = null;
    }

    protected void addManagableOverlay(ManagableOverlay managableoverlay)
    {
        overlayController.addOverlay(managableoverlay);
    }

    public Dialog createDialog(int i, Bundle bundle)
    {
        super.createDialog(i, bundle);
        switch (i)
        {
        default:
            if (ConfigInfo.DEBUG)
            {
                Log.w(TAG, (new StringBuilder()).append("createDialog: unknown id  = ").append(i).toString());
            }
            return null;

        case 1: // '\001'
            return createTileUpdateFailedDialog();

        case 2: // '\002'
            return createGeoDataUpdateFailedDialog();
        }
    }

    protected View doCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("doCreateView: inflater = ").append(layoutinflater).append("; container = ").append(viewgroup).append("; savedInstanceState = ").append(bundle).toString());
        }
        mapFragmentContent = getActivity().findViewById(getMapFragmentContentViewId());
        onPreMapViewInit();
        initMap();
        return null;
    }

    protected void generateContentLayoutParams()
    {
        layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    protected int getLayout()
    {
        return 0;
    }

    protected int getMapFragmentContentViewId()
    {
        return -1;
    }

    protected int getMapViewId()
    {
        return com.wsi.android.weather.R.id.mapview;
    }

    public String getScreenName()
    {
        return "Map";
    }

    protected int getZoomControllsViewGroupId()
    {
        return -1;
    }

    protected void initGeoFeaturesPolling()
    {
        overlayDataHolder.initGeoFeaturesPolling();
    }

    protected void initMap()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "initMap: intializing WSI map view...");
        }
        MapSettingsAccessor mapsettingsaccessor = mapApp.getSettingsAccessor();
        overlayDataHolder = mapsettingsaccessor.getTesseraConfiguration().getVersion().createOverlayDataHolder(mapsettingsaccessor);
        overlayDataHolder.setAppContext(mapApp);
        tileProvider = new WeatherTileProvider(mapsettingsaccessor, mapApp, overlayDataHolder);
        mapsettingsaccessor.addSettingsChangeListener(this);
        mapView = (WSIMapView)mapFragmentContent.findViewById(getMapViewId());
        mapView.setViewMode(mapsettingsaccessor.getSkinSettings().getMapViewType());
        mapView.fixTileTextSize();
        initZoomControlls();
        initOverlaysAndZoomController();
        onInitMapView();
        initialized = true;
    }

    protected void initOverlaysAndZoomController()
    {
        if (overlayController == null)
        {
            overlayController = new OverlayController(getActivity(), mapView);
            mapView.setOverlayController(overlayController);
            mapView.getOverlays().add(overlayController);
        } else
        {
            overlayController.removeAllOverlays();
        }
        if (sweepingRadarOverlay == null)
        {
            sweepingRadarOverlay = new WSISweepingRadarOverlay(mapView, mapApp.getSettingsAccessor());
        }
        if (geoDataOverlay == null)
        {
            geoDataOverlay = new GeoDataOverlay(mapView, getResources(), mapApp.getSettingsAccessor(), componentsProvider.getNavigator());
        }
        tiledOverlay = new WSITiledOverlay(mapView, getTiles());
        addManagableOverlay(tiledOverlay);
        addManagableOverlay(sweepingRadarOverlay);
        if (zoomControls != null)
        {
            zoomControls.setOnZoomInClickListener(overlayController.getZoomIn());
            zoomControls.setOnZoomOutClickListener(overlayController.getZoomOut());
        }
    }

    protected boolean isLoopingModeEnabled()
    {
        return isLoopingModeEnabled;
    }

    protected boolean isTileControllerInitialized()
    {
        return tileController != null;
    }

    public void onCreate(Bundle bundle)
    {
        mapApi = ((MapActivityWithAPI)getActivity()).getMapAPI();
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("onCreateView: inflater = ").append(layoutinflater).append("; container = ").append(viewgroup).append("; savedInstanceState = ").append(bundle).toString());
        }
        if (mapFragmentContent == null)
        {
            doCreateView(layoutinflater, viewgroup, bundle);
        }
        return null;
    }

    public void onCurrentTileIndexChanged(int i, int j)
    {
    }

    public void onCurrentTileTimeChanged(long l)
    {
        while (!isAdded() || currentTileTime == l) 
        {
            return;
        }
        currentTileTime = l;
    }

    public void onDestroy()
    {
        super.onDestroy();
        mapApp.getSettingsAccessor().removeSettingsChangeListener(this);
        if (!initialized)
        {
            return;
        } else
        {
            overlayDataHolder.stopGeoFeaturesPolling();
            tileProvider.stop(true, true);
            destroyInstances();
            releaseInstances();
            return;
        }
    }

    protected void onFirstTimeAppeared()
    {
        super.onFirstTimeAppeared();
        while (!initialized || webMode) 
        {
            return;
        }
        overlayDataHolder.initGeoFeaturesPolling();
    }

    public void onGeoDataTypeDisabled(GeoDataType geodatatype)
    {
    }

    public void onGeoDataUpdateFailed(GeoDataType geodatatype)
    {
        uiThreadHandler.post(new _cls3());
    }

    protected void onInitMapView()
    {
    }

    public void onPause()
    {
        super.onPause();
        if (webMode)
        {
            return;
        } else
        {
            notifyWSIMapAPIInstanceFragmentNotInFront();
            return;
        }
    }

    public void onPreGeoDataUpdate(GeoDataType geodatatype)
    {
        dialogHelper.dismissDialog(2);
    }

    protected void onPreMapViewInit()
    {
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle != null)
        {
            isLoopingModeEnabled = bundle.getBoolean("is_looping_mode_enabled");
            isAnimateToSweepingRadarPosition = bundle.getBoolean("is_animate_to_sweeping_radar_position");
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_looping_mode_enabled", isLoopingModeEnabled);
        bundle.putBoolean("is_animate_to_sweeping_radar_position", isAnimateToSweepingRadarPosition);
    }

    public boolean onSettingsChanged(String s, SharedPreferences sharedpreferences)
    {
        if (s.startsWith("overlay_") || s.startsWith("overlay_cat_"))
        {
            overlayDataHolder.updateGeoOverlaysConfiguration();
            return true;
        } else
        {
            return false;
        }
    }

    public void onStart()
    {
        super.onStart();
        notifyWSIMapAPIInstanceFragmentInFront();
        if (webMode)
        {
            return;
        }
        tileProvider.resumePolling();
        overlayDataHolder.registerGeoDataUpdateListener(geoDataOverlay);
        overlayDataHolder.registerGeoDataUpdateListener(this);
        sweepingRadarOverlay.updateSweepingRadarOverlay();
        if (isLoopingModeEnabled)
        {
            initLoopingMode();
        } else
        {
            initStaticMode();
        }
        animateToSweepArmPositionIfNecessary();
    }

    public void onStop()
    {
        super.onStop();
        if (webMode)
        {
            return;
        } else
        {
            uiThreadHandler.removeCallbacks(animateToSweepingRadarPositionRunnable);
            tileProvider.suspendPolling();
            overlayDataHolder.unregisterGeoDataUpdateListener(geoDataOverlay);
            overlayDataHolder.unregisterGeoDataUpdateListener(this);
            mapApp.getSettingsAccessor().removeOnCurrentLayerTransparencyChangedListener(tileController);
            updateTileLayerMode(false);
            WSIServerConnector.getConnector().resetTessera30LastTimeDataUpdatedDate();
            return;
        }
    }

    public void onTileUpdateFailed()
    {
        if (uiThreadHandler != null)
        {
            uiThreadHandler.post(new _cls2());
        }
    }

    public void onUpdateEarthquakes(List list)
    {
    }

    public void onUpdateHurricanes(List list)
    {
    }

    public void onUpdateStormCells(List list)
    {
    }

    public void onUpdateTrafficIncidents(List list)
    {
    }

    public void onUpdateWatchWarningBoxes(WatchWarningBoxCollection watchwarningboxcollection)
    {
    }

    protected void removeManagableOverlay(ManagableOverlay managableoverlay)
    {
        overlayController.removeOverlay(managableoverlay);
    }

    public void setWebMode(boolean flag)
    {
        webMode = flag;
    }

    protected void updateLayerTileTimeDisplayModeFromSettings()
    {
        tileController.updateLayerDisplayModeFromSettings();
    }

    protected void updateTileLayerMode(boolean flag)
    {
        if (flag && !isLoopingModeEnabled)
        {
            initLoopingMode();
            isLoopingModeEnabled = true;
        } else
        if (!flag && isLoopingModeEnabled)
        {
            initStaticMode();
            isLoopingModeEnabled = false;
            return;
        }
    }


/*
    static boolean access$002(MapAuxiliaryFragment mapauxiliaryfragment, boolean flag)
    {
        mapauxiliaryfragment.isAnimateToSweepingRadarPosition = flag;
        return flag;
    }

*/



    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}

}
