// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.ui;

import android.app.Dialog;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.adobe.mobile.Config;
import com.google.android.maps.MapActivity;
import com.wsi.android.framework.settings.ConfigurationManager;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.settings.helpers.MeasurementUnits;
import com.wsi.android.framework.settings.helpers.PollingUnit;
import com.wsi.android.framework.settings.helpers.SweepingRadarGrid;
import com.wsi.android.framework.ui.utils.ComponentsProvider;
import com.wsi.android.framework.ui.utils.DialogHelper;
import com.wsi.android.framework.ui.utils.Navigator;
import com.wsi.android.framework.wxdata.utils.tessera.LayerDisplayMode;
import com.wsi.android.weather.utils.DataLayerAccessor;
import com.wsi.android.weather.utils.WSIMapActivityNavigationManager;
import com.wsi.android.weather.utils.settings.GeoOverlayManager;
import com.wsi.android.weather.utils.settings.MapSettingsAccessor;
import com.wsi.android.weather.utils.settings.WSIMapAPI;
import java.util.List;

// Referenced classes of package com.wsi.android.weather.ui:
//            MapActivityWithAPI, MapApplication, MapAuxiliaryFragment, LayerItem

public class WSIMapActivity extends MapActivity
    implements MapActivityWithAPI, ComponentsProvider, com.wsi.android.framework.ui.utils.Navigator.OnNavigationListener, com.wsi.android.framework.ui.utils.DialogHelper.DialogHolder
{
    private static class WSIMapAPIImpl
        implements WSIMapAPI
    {

        private MapAuxiliaryFragment mapFragment;
        private MapSettingsAccessor settingsAccessor;

        public boolean checkActiveLayerHasLegend()
            throws IllegalStateException
        {
            return settingsAccessor.checkCurrentLayerHasLegend();
        }

        public boolean checkActiveLayerSupportsFutureMode()
        {
            return settingsAccessor.checkCurrentLayerSupportsFutureMode();
        }

        public boolean checkActiveLayerSupportsLooping()
        {
            return settingsAccessor.checkCurrentLayerSupportsLooping();
        }

        public LayerItem getActiveLayer()
        {
            return settingsAccessor.getActiveLayer();
        }

        public LayerDisplayMode getActiveLayerDisplayMode()
        {
            return settingsAccessor.getCurrentLayerDisplayMode();
        }

        public int getActiveLayerPollingInterval()
        {
            return settingsAccessor.getCurrentLayerPollingInterval();
        }

        public PollingUnit getActiveLayerPollingIntervalUnit()
        {
            return settingsAccessor.getCurrentLayerPollingIntervalUnit();
        }

        public int getActiveLayerTransparency()
        {
            return settingsAccessor.getCurrentLayerTransparency();
        }

        public GeoOverlayManager[] getAvailableGeoOverlays()
        {
            return settingsAccessor.getGeoOverlayManagers();
        }

        public List getAvailableLayers()
        {
            return settingsAccessor.getAvailableLayers();
        }

        public SweepingRadarGrid getCurrentSweepingRadarGrid()
        {
            return settingsAccessor.getCurrentSweepingRadarGrid();
        }

        public int getLegendImageResourceIdForActiveLayer()
        {
            return settingsAccessor.getLegendImageResourceIdForCurrentLayer();
        }

        public MeasurementUnits getMeasurementUnits()
        {
            return settingsAccessor.getCurrentMeasurementUnits();
        }

        public boolean isActiveLayerInLoopingMode()
        {
            if (mapFragment != null)
            {
                return mapFragment.isLoopingModeEnabled();
            } else
            {
                return false;
            }
        }

        public boolean isFutureModeSupported()
        {
            return settingsAccessor.isFutureModeSupported();
        }

        public boolean isSweepingRadarEnabledForActiveLayer()
        {
            return settingsAccessor.isSweepingRadarEnabledForCurrentLayer();
        }

        public void setActiveLayer(String s)
        {
            settingsAccessor.setActiveLayer(s);
            if (mapFragment != null)
            {
                mapFragment.updateTileLayerMode(mapFragment.isLoopingModeEnabled());
            }
        }

        public void setActiveLayerDisplayMode(LayerDisplayMode layerdisplaymode)
        {
            settingsAccessor.setCurrentLayerDisplayMode(layerdisplaymode);
            if (mapFragment != null)
            {
                mapFragment.updateLayerTileTimeDisplayModeFromSettings();
            }
        }

        public void setActiveLayerPollingInterval(int i, PollingUnit pollingunit)
            throws IllegalArgumentException
        {
            settingsAccessor.setCurrentLayerPollingInterval(i, pollingunit);
        }

        public void setActiveLayerTransparency(int i)
            throws IllegalArgumentException
        {
            settingsAccessor.setCurrentLayerTransparency(i);
        }

        public void setCurrentSweepingRadarGridType(SweepingRadarGrid sweepingradargrid)
        {
            settingsAccessor.setCurrentSweepingRadarGrid(sweepingradargrid);
        }

        public void setMeasurementUnits(MeasurementUnits measurementunits)
        {
            settingsAccessor.setCurrentMeasurementUnits(measurementunits);
        }

        public void startLoopingForActiveLayer()
            throws IllegalStateException
        {
            if (mapFragment != null)
            {
                mapFragment.updateTileLayerMode(true);
                return;
            } else
            {
                throw new IllegalStateException("WSI Map view should be visible to start looping for the active layer");
            }
        }

        public void stopLoopingForActiveLayer()
            throws IllegalStateException
        {
            if (mapFragment != null)
            {
                mapFragment.updateTileLayerMode(false);
                return;
            } else
            {
                throw new IllegalStateException("WSI Map View should be visible to stop looping for the active layer");
            }
        }


/*
        static MapAuxiliaryFragment access$002(WSIMapAPIImpl wsimapapiimpl, MapAuxiliaryFragment mapauxiliaryfragment)
        {
            wsimapapiimpl.mapFragment = mapauxiliaryfragment;
            return mapauxiliaryfragment;
        }

*/

        public WSIMapAPIImpl(MapSettingsAccessor mapsettingsaccessor)
        {
            mapFragment = null;
            settingsAccessor = mapsettingsaccessor;
        }
    }


    public static final String MAP_FRAGMENT_TAG = "map_auxiliary_fragment";
    public static final String MAP_GEO_CALLOUT_FRAGMENT_TAG = "map_geo_callout_fragment";
    protected final String TAG = getClass().getSimpleName();
    protected final DialogHelper dialogHelper = new DialogHelper(this);
    protected boolean externalScreenStarted;
    private WSIMapAPIImpl mapAPI;
    protected MapApplication mapApp;
    protected Navigator navigator;

    public WSIMapActivity()
    {
    }

    private void releaseInstances()
    {
        navigator = null;
        mapApp = null;
    }

    public Dialog createDialog(int i, Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.w(TAG, (new StringBuilder()).append("createDialog: unknown id  = ").append(i).toString());
        }
        return null;
    }

    protected WSIMapActivityNavigationManager createNavigator()
    {
        return new WSIMapActivityNavigationManager(this);
    }

    public ConfigurationManager getConfigManager()
    {
        return mapApp.getConfigManager();
    }

    protected int getContentViewLayoutId()
    {
        return -1;
    }

    public WSIMapAPI getMapAPI()
    {
        return mapAPI;
    }

    public Navigator getNavigator()
    {
        return navigator;
    }

    protected void initComponents()
    {
        mapApp = (MapApplication)getApplication();
        navigator = createNavigator();
        navigator.registerNavigationListener(this);
    }

    public boolean isRouteDisplayed()
    {
        return false;
    }

    public void navigateToOrClose(int i)
    {
    }

    public void onBackPressed()
    {
        if (navigator.popBackStack())
        {
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onCreate");
        }
        initComponents();
        mapAPI = new WSIMapAPIImpl(mapApp.getSettingsAccessor());
        super.onCreate(bundle);
        setContentView(getContentViewLayoutId());
        if (bundle != null)
        {
            navigator.onRestoreInstanceState(bundle);
        }
    }

    protected void onDestroy()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onDestroy");
        }
        super.onDestroy();
        dialogHelper.onDestroy();
        navigator.destroy();
        mapApp.getDataLayerAccessor().shutdown();
        releaseInstances();
    }

    public void onNavigation(int i)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("onNavigation: destination = ").append(i).toString());
        }
    }

    protected void onPause()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onPause");
        }
        super.onPause();
        Config.pauseCollectingLifecycleData();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        dialogHelper.onRestoreInstanceState(bundle);
    }

    protected void onResume()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onResume");
        }
        super.onResume();
        Config.collectLifecycleData();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onSaveInstanceState");
        }
        super.onSaveInstanceState(bundle);
        dialogHelper.onSaveInstanceState(bundle);
        navigator.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onStart");
        }
        super.onStart();
        dialogHelper.onStart();
        if (externalScreenStarted)
        {
            externalScreenStarted = false;
        }
    }

    protected void onStop()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onStop");
        }
        super.onStop();
        dialogHelper.onStop();
    }

    public void prepareDialog(int i, Dialog dialog, Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(getClass().getSimpleName(), (new StringBuilder()).append("prepareDialog: id  = ").append(i).append("; d = ").append(dialog).toString());
        }
    }

    public void setMapAuxiliaryFragment(MapAuxiliaryFragment mapauxiliaryfragment)
    {
        mapAPI.mapFragment = mapauxiliaryfragment;
    }

    public void showedDialog(int i, Dialog dialog, Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(getClass().getSimpleName(), (new StringBuilder()).append("showedDialog: id  = ").append(i).append("; d = ").append(dialog).toString());
        }
    }

    public void startActivity(Intent intent)
    {
        externalScreenStarted = true;
        super.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        externalScreenStarted = true;
        super.startActivityForResult(intent, i);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i)
    {
        externalScreenStarted = true;
        super.startActivityFromFragment(fragment, intent, i);
    }
}
