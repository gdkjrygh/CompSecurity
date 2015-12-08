// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.weather.util.app.AbstractTwcApplication;
import com.wsi.android.framework.ui.map.WSIMapView;
import com.wsi.android.framework.wxdata.utils.tessera.LayerDisplayMode;
import com.wsi.android.framework.wxdata.utils.tessera.OverlayDataHolder;
import com.wsi.android.weather.ui.MapApplication;
import com.wsi.android.weather.ui.MapAuxiliaryFragment;
import com.wsi.android.weather.utils.settings.MapSettingsAccessor;
import com.wsi.android.weather.utils.settings.Tessera;
import com.wsi.android.weather.utils.settings.WSIMapAPI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.weather.Weather.map.interactive.fragments:
//            LegendUtil

public class TwcMapAuxiliaryFragment extends MapAuxiliaryFragment
{

    private static final int DIALOG_LAYER_TRANSPARENCY_SETTINGS = 1;
    private static final String KEY_IS_CURRENT_LAYER_LEGEND_VISIBLE = "current_layer_legend_visible";
    private static final String KEY_IS_CURRENT_LAYER_TIME_VISIBLE = "current_layer_time_visible";
    private ImageView currentLayerLegend;
    private SeekBar currentLayerProgress;
    private TextView currentLayerTime;
    private boolean isLayerLegendShown;
    private boolean isLayerTimeShown;
    private final SimpleDateFormat layerTimeFormat;
    private boolean looping;
    private LinearLayout mediaControls;
    private OverlayDataHolder overlayDataHolder;
    private ImageView playPauseButton;
    private boolean startLoopingOnResume;
    private boolean stopLoopingOnResume;
    private boolean trafficPaused;

    public TwcMapAuxiliaryFragment()
    {
        String s;
        if (DateFormat.is24HourFormat(AbstractTwcApplication.getRootContext()))
        {
            s = "H:mm zz";
        } else
        {
            s = "h:mm a zz";
        }
        layerTimeFormat = new SimpleDateFormat(s, Locale.getDefault());
        currentLayerTime = null;
        currentLayerLegend = null;
        currentLayerProgress = null;
        playPauseButton = null;
        mediaControls = null;
        isLayerTimeShown = true;
        isLayerLegendShown = true;
    }

    private void configureUIForCurrentLayer()
    {
        if (mapApi.getActiveLayer() == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (!mapApi.checkActiveLayerSupportsFutureMode())
        {
            updateDisplayMode(LayerDisplayMode.PAST);
        }
        stopLooping();
        android.graphics.drawable.BitmapDrawable bitmapdrawable;
        int i;
        if (mapApi.checkActiveLayerSupportsLooping())
        {
            mediaControls.setVisibility(0);
            currentLayerProgress.setProgress(0);
            stopLooping();
        } else
        {
            mediaControls.setVisibility(8);
        }
        if (!mapApi.checkActiveLayerHasLegend())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (!currentLayerLegend.isShown())
        {
            break MISSING_BLOCK_LABEL_121;
        }
        i = mapApi.getLegendImageResourceIdForActiveLayer();
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        bitmapdrawable = LegendUtil.getDrawable(getActivity(), i);
        currentLayerLegend.setImageDrawable(bitmapdrawable);
        return;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        currentLayerLegend.setImageResource(0);
        return;
        currentLayerLegend.setImageResource(0);
        return;
        currentLayerLegend.setVisibility(8);
        return;
        currentLayerTime.setText(0x7f070502);
        currentLayerLegend.setVisibility(8);
        return;
    }

    private void iniUIWidgets()
    {
        initActivityUIWidgets();
        initFragmentUIWidgets();
    }

    private void initActivityUIWidgets()
    {
    }

    private void initFragmentUIWidgets()
    {
        currentLayerTime = (TextView)mapFragmentContent.findViewById(0x7f0d0125);
        int i = 0x7f0d0123;
        PackageManager packagemanager = getActivity().getPackageManager();
        if (packagemanager == null || !packagemanager.hasSystemFeature("android.hardware.touchscreen.multitouch"))
        {
            i = 0x7f0d0122;
        }
        currentLayerLegend = (ImageView)mapFragmentContent.findViewById(i);
        currentLayerProgress = (SeekBar)mapFragmentContent.findViewById(0x7f0d0128);
        playPauseButton = (ImageView)mapFragmentContent.findViewById(0x7f0d0127);
        mediaControls = (LinearLayout)mapFragmentContent.findViewById(0x7f0d0126);
        playPauseButton.setOnClickListener(new _cls1());
        currentLayerProgress.setEnabled(false);
    }

    private void setupUIWidgets()
    {
        int i = 0;
        if (mapApi.getActiveLayer() != null && isLayerLegendShown)
        {
            int j = mapApi.getLegendImageResourceIdForActiveLayer();
            TextView textview;
            if (j != -1)
            {
                try
                {
                    android.graphics.drawable.BitmapDrawable bitmapdrawable = LegendUtil.getDrawable(getActivity(), j);
                    currentLayerLegend.setImageDrawable(bitmapdrawable);
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    currentLayerLegend.setImageResource(0);
                }
            } else
            {
                currentLayerLegend.setImageResource(0);
            }
            currentLayerLegend.setVisibility(0);
        } else
        {
            currentLayerLegend.setVisibility(8);
        }
        textview = currentLayerTime;
        if (!isLayerTimeShown)
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    private void startLooping()
    {
        try
        {
            mapApi.startLoopingForActiveLayer();
            looping = true;
            if (!webMode && mapView.isTraffic())
            {
                trafficPaused = true;
                mapView.setTraffic(false);
            }
            changeToPauseButton();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            startLoopingOnResume = true;
        }
    }

    private void stopLooping()
    {
        try
        {
            mapApi.stopLoopingForActiveLayer();
            looping = false;
            if (!webMode && trafficPaused)
            {
                trafficPaused = false;
                mapView.setTraffic(true);
            }
            changeToPlayButton();
            currentLayerProgress.setProgress(0);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            stopLoopingOnResume = true;
        }
    }

    private void updateDisplayMode(LayerDisplayMode layerdisplaymode)
    {
        mapApi.setActiveLayerDisplayMode(layerdisplaymode);
    }

    public void changeToPauseButton()
    {
        playPauseButton.setImageResource(0x7f0200ae);
    }

    public void changeToPlayButton()
    {
        playPauseButton.setImageResource(0x7f0200af);
    }

    public Dialog createDialog(int i, Bundle bundle)
    {
        Log.w(TAG, (new StringBuilder()).append("createDialog: unknown id  = ").append(i).toString());
        return super.createDialog(i, bundle);
    }

    public int getActiveTileMapSize()
    {
        return overlayDataHolder.getActiveTileMapSize();
    }

    protected int getMapFragmentContentViewId()
    {
        return 0x7f0d011e;
    }

    protected int getMapViewId()
    {
        return 0x7f0d011f;
    }

    public int getMaxFramesForLooping()
    {
        return overlayDataHolder.getMaxFramesForLooping();
    }

    public long getTileMapTimeByVersionIndex(int i)
    {
        return overlayDataHolder.getTileMapTimeByVersionIndex(i);
    }

    public String getTileUrl(int i, int j, int k)
    {
        return overlayDataHolder.getTileMapRequestUrlForNextServer(i, j, k);
    }

    public String getTileUrl(int i, int j, int k, int l)
    {
        return overlayDataHolder.getTileMapRequestUrlForNextServer(i, j, k, l);
    }

    protected int getZoomControllsViewGroupId()
    {
        return 0x7f0d0121;
    }

    protected void initMap()
    {
        if (webMode)
        {
            MapSettingsAccessor mapsettingsaccessor = mapApp.getSettingsAccessor();
            overlayDataHolder = mapsettingsaccessor.getTesseraConfiguration().getVersion().createOverlayDataHolder(mapsettingsaccessor);
            overlayDataHolder.setAppContext(mapApp);
            mapsettingsaccessor.addSettingsChangeListener(this);
            return;
        } else
        {
            super.initMap();
            return;
        }
    }

    public boolean isLooping()
    {
        return looping;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        iniUIWidgets();
        setHasOptionsMenu(true);
        setupUIWidgets();
        return null;
    }

    public void onCurrentTileIndexChanged(int i, int j)
    {
        currentLayerProgress.setMax(j);
        currentLayerProgress.setProgress(i);
    }

    public void onCurrentTileTimeChanged(long l)
    {
        if (currentLayerTime != null)
        {
            TextView textview = currentLayerTime;
            String s;
            if (l == 0L)
            {
                s = getString(0x7f070502);
            } else
            {
                s = layerTimeFormat.format(new Date(l));
            }
            textview.setText(s);
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle != null)
        {
            isLayerTimeShown = bundle.getBoolean("current_layer_time_visible");
            isLayerLegendShown = bundle.getBoolean("current_layer_legend_visible");
        }
    }

    public void onResume()
    {
        super.onResume();
        try
        {
            if (startLoopingOnResume)
            {
                startLoopingOnResume = false;
                startLooping();
            }
            if (stopLoopingOnResume)
            {
                stopLoopingOnResume = false;
                stopLooping();
            }
            return;
        }
        catch (Throwable throwable)
        {
            Log.e(TAG, "Error in OnResume", throwable);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("current_layer_time_visible", isLayerTimeShown);
        bundle.putBoolean("current_layer_legend_visible", isLayerLegendShown);
    }

    public boolean onSettingsChanged(String s, SharedPreferences sharedpreferences)
    {
        if (webMode) goto _L2; else goto _L1
_L1:
        super.onSettingsChanged(s, sharedpreferences);
_L4:
        return false;
_L2:
        if (s.startsWith("overlay_") || s.startsWith("overlay_cat_"))
        {
            overlayDataHolder.updateGeoOverlaysConfiguration();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onStart()
    {
        super.onStart();
        configureUIForCurrentLayer();
    }

    public void setActiveLayer()
    {
        com.wsi.android.framework.settings.Layer layer = mapApp.getSettingsAccessor().getCurrentLayer();
        overlayDataHolder.setActiveLayer(layer);
    }

    public void setLayerDisplayMode(LayerDisplayMode layerdisplaymode)
    {
        overlayDataHolder.setLayerDisplayMode(layerdisplaymode);
    }

    public void startLooping(LayerDisplayMode layerdisplaymode)
    {
        updateDisplayMode(layerdisplaymode);
        startLoopingOnResume = true;
    }

    public void turnOffAnimation()
    {
        if (looping)
        {
            playPauseButton.performClick();
            stopLooping();
        }
    }

    public void updateGeoLayer()
    {
        overlayDataHolder.updateGeoOverlaysConfiguration();
    }




/*
    static boolean access$202(TwcMapAuxiliaryFragment twcmapauxiliaryfragment, boolean flag)
    {
        twcmapauxiliaryfragment.startLoopingOnResume = flag;
        return flag;
    }

*/



    /* member class not found */
    class _cls1 {}

}
