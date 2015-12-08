// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.util.Log;
import com.wsi.android.framework.settings.GeoOverlay;
import com.wsi.android.framework.settings.GeoOverlays;
import com.wsi.android.framework.settings.Layer;
import com.wsi.android.framework.settings.LayerTransparency;
import com.wsi.android.framework.settings.LoopingRestrictions;
import com.wsi.android.framework.settings.OverlayCategory;
import com.wsi.android.framework.settings.Polling;
import com.wsi.android.framework.settings.RasterLayers;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.settings.helpers.MeasurementUnits;
import com.wsi.android.framework.settings.helpers.PollingUnit;
import com.wsi.android.framework.settings.helpers.SpeedUnit;
import com.wsi.android.framework.settings.helpers.SweepingRadarGrid;
import com.wsi.android.framework.settings.helpers.TemperatureUnit;
import com.wsi.android.framework.settings.helpers.WarningStyle;
import com.wsi.android.framework.settings.helpers.WarningTypeSelector;
import com.wsi.android.framework.ui.settings.MapUISettings;
import com.wsi.android.framework.ui.utils.ResourceUtils;
import com.wsi.android.framework.wxdata.geodata.helpers.GeoDataType;
import com.wsi.android.framework.wxdata.utils.MapDataSettings;
import com.wsi.android.framework.wxdata.utils.tessera.LayerDisplayMode;
import com.wsi.android.framework.wxdata.ws.NetworkConnectionType;
import com.wsi.android.framework.wxdata.ws.WSIServerConnector;
import com.wsi.android.weather.ui.LayerItem;
import com.wsi.android.weather.ui.MapApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.wsi.android.weather.utils.settings:
//            AppSettings, Tessera, GeoOverlayManager, GeoOverlayManagerImpl, 
//            WarningStyleSettings, MapSkinSettings

public class MapSettingsAccessor
    implements MapDataSettings, MapUISettings, android.content.SharedPreferences.OnSharedPreferenceChangeListener
{
    public static interface SettingsChangeListener
    {

        public abstract boolean onSettingsChanged(String s, SharedPreferences sharedpreferences);
    }


    protected final String TAG = getClass().getSimpleName();
    protected AppSettings appSettings;
    private final String layerDisplayModeKey;
    private final String layerKey;
    private HashSet listeners;
    protected MapApplication mapApp;
    protected MapSkinSettings skinSettings;
    protected final String speedUnitKey;
    private final String sweepingRadarGridKey;
    protected final String temperatureUnitKey;
    private Set transparencyListeners;
    protected WarningStyleSettings warningStyleSettings;

    public MapSettingsAccessor(MapApplication mapapplication, MapSkinSettings mapskinsettings, WarningStyleSettings warningstylesettings)
        throws NullPointerException
    {
        listeners = new HashSet(1);
        transparencyListeners = new HashSet();
        skinSettings = mapskinsettings;
        warningStyleSettings = warningstylesettings;
        mapApp = mapapplication;
        layerKey = mapapplication.getString(com.wsi.android.weather.R.string.layer_type);
        layerDisplayModeKey = mapapplication.getString(com.wsi.android.weather.R.string.layer_time_display_mode);
        sweepingRadarGridKey = mapapplication.getString(com.wsi.android.weather.R.string.sweeping_radar_grid);
        temperatureUnitKey = mapapplication.getString(com.wsi.android.weather.R.string.temperature_units);
        speedUnitKey = mapapplication.getString(com.wsi.android.weather.R.string.wind_speed_units);
        getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    private void fixPreferenceValue(Context context, SharedPreferences sharedpreferences, int i, int j)
    {
        sharedpreferences = sharedpreferences.edit();
        sharedpreferences.putString(context.getString(i), context.getString(j));
        sharedpreferences.commit();
    }

    private String getCategoryFeatureId(GeoOverlay geooverlay, GeoDataType geodatatype)
    {
        geooverlay = geooverlay.getDefaultCategory();
        if (geooverlay != null)
        {
            geooverlay = appSettings.getTessera().getVersion().getGeoFeatureIdentifier(geooverlay);
        } else
        {
            geooverlay = null;
        }
        return getPrefernceValue((new StringBuilder()).append("overlay_cat_").append(geodatatype.getId()).toString(), geooverlay);
    }

    private String getGeoOverlayCategoryKey(GeoOverlay geooverlay)
    {
        return (new StringBuilder()).append("overlay_cat_").append(geooverlay.getType().getId()).toString();
    }

    private String getGeoOverlayKey(GeoOverlay geooverlay)
    {
        return (new StringBuilder()).append("overlay_").append(geooverlay.getType().getId()).toString();
    }

    private boolean isOverlayEnabled(GeoOverlay geooverlay, GeoDataType geodatatype)
    {
        if (geodatatype.isCategoryBased())
        {
            geooverlay = getCategoryFeatureId(geooverlay, geodatatype);
            geodatatype = appSettings.getTessera().getVersion().getGeoFeatureIdentifier(OverlayCategory.getNone(getAppContext()));
            return geooverlay != null && !geodatatype.equals(geooverlay);
        } else
        {
            return getPreferenceBooleanValue((new StringBuilder()).append("overlay_").append(geodatatype.getId()).toString(), geooverlay.isOnByDefault());
        }
    }

    private void putPreference(SharedPreferences sharedpreferences, String s, String s1)
    {
        if (s1 != null)
        {
            sharedpreferences.edit().putString(s, s1).commit();
            return;
        } else
        {
            sharedpreferences.edit().remove(s).commit();
            return;
        }
    }

    private void putPreference(SharedPreferences sharedpreferences, String s, boolean flag)
    {
        sharedpreferences.edit().putBoolean(s, flag).commit();
    }

    public void addOnCurrentLayerTransparencyChangedListener(OnCurrentLayerTransparencyChangedListener oncurrentlayertransparencychangedlistener)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("addOnCurrentLayerTransparencyChangedListener: l = ").append(oncurrentlayertransparencychangedlistener).toString());
        }
        transparencyListeners.add(oncurrentlayertransparencychangedlistener);
    }

    public void addSettingsChangeListener(SettingsChangeListener settingschangelistener)
    {
        listeners.add(settingschangelistener);
    }

    public boolean checkCurrentLayerHasLegend()
    {
        boolean flag1 = false;
        Layer layer = getCurrentLayer();
        boolean flag = flag1;
        if (layer != null)
        {
            String s = layer.getLegendImageName(this);
            flag = flag1;
            if (layer.isShowLegend())
            {
                flag = flag1;
                if (s != null)
                {
                    flag = flag1;
                    if (s.trim().length() != 0)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public boolean checkCurrentLayerSupportsFutureMode()
    {
        Layer layer = getCurrentLayer();
        return layer != null && layer.isFutureLayerSupported();
    }

    public boolean checkCurrentLayerSupportsLooping()
    {
        Layer layer = getCurrentLayer();
        return layer != null && layer.isShowLoop();
    }

    public LayerItem getActiveLayer()
    {
        Layer layer = getCurrentLayer();
        if (layer == null)
        {
            return null;
        } else
        {
            return new LayerItem(layer.getName(), Integer.parseInt(layer.getTesseraID()), layer.getEnglishName());
        }
    }

    public GeoOverlays getAdditionalOverlays()
    {
        return appSettings.getAdditionalOverlays();
    }

    public Context getAppContext()
    {
        return mapApp;
    }

    public List getAvailableLayers()
    {
        Object obj = getLayers();
        ArrayList arraylist = new ArrayList(((RasterLayers) (obj)).size());
        Layer layer;
        for (obj = ((RasterLayers) (obj)).values().iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new LayerItem(layer.getName(), Integer.parseInt(layer.getTesseraID()), layer.getEnglishName())))
        {
            layer = (Layer)((Iterator) (obj)).next();
        }

        return arraylist;
    }

    public String getCategoryFeatureId(GeoDataType geodatatype)
    {
        return getCategoryFeatureId((GeoOverlay)appSettings.getOverlays().get(geodatatype), geodatatype);
    }

    public Layer getCurrentLayer()
    {
        String s;
label0:
        {
            SharedPreferences sharedpreferences = getSharedPreferences();
            String s1 = sharedpreferences.getString(layerKey, null);
            if ("NONE".equals(s1))
            {
                return null;
            }
            if (s1 != null)
            {
                s = s1;
                if (appSettings.getLayers().containsKey(s1))
                {
                    break label0;
                }
            }
            s = appSettings.getTessera().getVersion().getLayerIdentifier((Layer)appSettings.getLayers().values().iterator().next());
            sharedpreferences.edit().putString(layerKey, s).commit();
        }
        return (Layer)appSettings.getLayers().get(s);
    }

    public LayerDisplayMode getCurrentLayerDisplayMode()
    {
        LayerDisplayMode layerdisplaymode1;
        SharedPreferences sharedpreferences;
        sharedpreferences = getSharedPreferences();
        layerdisplaymode1 = null;
        LayerDisplayMode layerdisplaymode = LayerDisplayMode.valueOf(sharedpreferences.getString(layerDisplayModeKey, null));
_L2:
        layerdisplaymode1 = layerdisplaymode;
        if (layerdisplaymode == null)
        {
            layerdisplaymode1 = LayerDisplayMode.PAST;
            sharedpreferences.edit().putString(layerDisplayModeKey, layerdisplaymode1.toString()).commit();
        }
        return layerdisplaymode1;
        Exception exception;
        exception;
        exception = layerdisplaymode1;
        if (ConfigInfo.DEBUG)
        {
            Log.w(TAG, (new StringBuilder()).append("Invalid value of layer display mode identifier, will use ").append(null).append(" display mode").toString());
            exception = layerdisplaymode1;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int getCurrentLayerPollingInterval()
    {
        Layer layer = getCurrentLayer();
        if (layer != null && layer.getPolling() != null)
        {
            return layer.getPolling().getPollingInterval();
        } else
        {
            return -1;
        }
    }

    public PollingUnit getCurrentLayerPollingIntervalUnit()
    {
        Layer layer = getCurrentLayer();
        if (layer != null && layer.getPolling() != null)
        {
            return getCurrentLayer().getPolling().getPollingUnit();
        } else
        {
            return PollingUnit.UNDEFINED;
        }
    }

    public int getCurrentLayerTransparency()
    {
        return mapApp.getSettingsAccessor().getCurrentLayer().getTransparency().getTransparencyValue();
    }

    public MeasurementUnits getCurrentMeasurementUnits()
    {
        MeasurementUnits ameasurementunits[] = MeasurementUnits.values();
        int j = ameasurementunits.length;
        for (int i = 0; i < j; i++)
        {
            MeasurementUnits measurementunits1 = ameasurementunits[i];
            if (measurementunits1.isCurrentMeasurementUnits(this))
            {
                return measurementunits1;
            }
        }

        MeasurementUnits measurementunits = appSettings.getMeasurementUnits();
        measurementunits.setMeasurementUnits(this);
        return measurementunits;
    }

    public SpeedUnit getCurrentSpeedUnits()
    {
        Context context = getAppContext();
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String s = sharedpreferences.getString(context.getResources().getString(com.wsi.android.weather.R.string.wind_speed_units), context.getString(getDefaultWindSpeedUnit().getValueResId()));
        if (s.equals(context.getString(com.wsi.android.weather.R.string.settings_speed_unit_kph_key_old)))
        {
            fixPreferenceValue(context, sharedpreferences, com.wsi.android.weather.R.string.wind_speed_units, SpeedUnit.KPH.getValueResId());
            return SpeedUnit.KPH;
        }
        if (s.equals(context.getString(com.wsi.android.weather.R.string.settings_speed_unit_mph_key_old)))
        {
            fixPreferenceValue(context, sharedpreferences, com.wsi.android.weather.R.string.wind_speed_units, SpeedUnit.MPH.getValueResId());
            return SpeedUnit.MPH;
        } else
        {
            return SpeedUnit.getUnitFromStringByKey(context, s);
        }
    }

    public SweepingRadarGrid getCurrentSweepingRadarGrid()
    {
        SharedPreferences sharedpreferences = getSharedPreferences();
        Context context = getAppContext();
        return SweepingRadarGrid.getGridTypeFromStringByKey(context, sharedpreferences.getString(sweepingRadarGridKey, context.getString(SweepingRadarGrid.NONE.getValueResId())));
    }

    public TemperatureUnit getCurrentTemperatureUnits()
    {
        Context context = getAppContext();
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String s = sharedpreferences.getString(temperatureUnitKey, context.getString(getDefaultTemperatureUnit().getValueResId()));
        if (s.equals(context.getString(com.wsi.android.weather.R.string.settings_temp_unit_f_key_old)))
        {
            fixPreferenceValue(context, sharedpreferences, com.wsi.android.weather.R.string.temperature_units, TemperatureUnit.F.getValueResId());
            return TemperatureUnit.F;
        }
        if (s.equals(context.getString(com.wsi.android.weather.R.string.settings_temp_unit_c_key_old)))
        {
            fixPreferenceValue(context, sharedpreferences, com.wsi.android.weather.R.string.temperature_units, TemperatureUnit.C.getValueResId());
            return TemperatureUnit.C;
        } else
        {
            return TemperatureUnit.getUnitFromStringByKey(context, s);
        }
    }

    public TemperatureUnit getDefaultTemperatureUnit()
    {
        return appSettings.getTemperatureUnit();
    }

    public SpeedUnit getDefaultWindSpeedUnit()
    {
        return appSettings.getWindUnit();
    }

    public int getFrameLimitForLooping()
    {
        NetworkConnectionType networkconnectiontype;
        LoopingRestrictions loopingrestrictions;
        networkconnectiontype = WSIServerConnector.getConnector().getConnectionType(getAppContext());
        loopingrestrictions = appSettings.getLoopingRestrictions();
        if (loopingrestrictions == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.wsi.android.framework.wxdata.ws.NetworkConnectionType[networkconnectiontype.ordinal()];
        JVM INSTR tableswitch 1 2: default 52
    //                   1 54
    //                   2 59;
           goto _L2 _L3 _L4
_L2:
        return -1;
_L3:
        return loopingrestrictions.getWifi();
_L4:
        return loopingrestrictions.getWifi();
    }

    public GeoOverlay getGeoOverlay(GeoDataType geodatatype)
    {
        GeoOverlay geooverlay = (GeoOverlay)appSettings.getOverlays().get(geodatatype);
        if (geooverlay == null)
        {
            return (GeoOverlay)appSettings.getAdditionalOverlays().get(geodatatype);
        } else
        {
            return geooverlay;
        }
    }

    public GeoOverlayManager[] getGeoOverlayManagers()
    {
        GeoOverlay ageooverlay[] = (GeoOverlay[])getOverlays().values().toArray(new GeoOverlay[0]);
        GeoOverlayManager ageooverlaymanager[] = new GeoOverlayManager[ageooverlay.length];
        for (int i = 0; i < ageooverlaymanager.length; i++)
        {
            ageooverlaymanager[i] = new GeoOverlayManagerImpl(ageooverlay[i], this);
        }

        return ageooverlaymanager;
    }

    public String getLayerTilesUrl()
    {
        return appSettings.getLayerTilesUrl();
    }

    public RasterLayers getLayers()
    {
        return appSettings.getLayers();
    }

    public int getLegendImageResourceIdForCurrentLayer()
    {
        int i = -1;
        Layer layer = getCurrentLayer();
        if (layer != null)
        {
            i = ResourceUtils.getDrawableId(layer.getLegendImageName(this), -1);
        }
        return i;
    }

    public Layer getNoneLayer()
    {
        Layer layer = new Layer();
        layer.putLocalizedName(null, mapApp.getString(com.wsi.android.weather.R.string.settings_none_layer_selected));
        layer.setUrl("NONE");
        layer.setTesseraID("NONE");
        return layer;
    }

    public OverlayCategory getOverlayActiveCategory(GeoOverlay geooverlay)
    {
        ArrayList arraylist = geooverlay.getCategories();
        String s = getGeoOverlayCategoryKey(geooverlay);
        geooverlay = geooverlay.getDefaultCategory();
        Object obj = geooverlay;
        if (geooverlay == null)
        {
            obj = OverlayCategory.getNone(getAppContext());
        }
        Object obj1 = getTesseraConfiguration().getVersion();
        s = getSharedPreferences().getString(s, ((Tessera.Version) (obj1)).getGeoFeatureIdentifier(((OverlayCategory) (obj))));
        boolean flag1 = false;
        Iterator iterator = arraylist.iterator();
        boolean flag;
        do
        {
            geooverlay = ((GeoOverlay) (obj));
            flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            geooverlay = (OverlayCategory)iterator.next();
            if (!s.equals(((Tessera.Version) (obj1)).getGeoFeatureIdentifier(geooverlay)))
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        obj = geooverlay;
        if (!flag)
        {
            HashSet hashset = new HashSet();
            hashset.addAll(Arrays.asList(Tessera.Version.values()));
            hashset.remove(obj1);
            obj1 = arraylist.iterator();
            boolean flag2;
            do
            {
                obj = geooverlay;
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                OverlayCategory overlaycategory = (OverlayCategory)((Iterator) (obj1)).next();
                Iterator iterator1 = hashset.iterator();
                do
                {
                    obj = geooverlay;
                    flag2 = flag;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    if (!s.equals(((Tessera.Version)iterator1.next()).getGeoFeatureIdentifier(overlaycategory)))
                    {
                        continue;
                    }
                    flag2 = true;
                    obj = overlaycategory;
                    break;
                } while (true);
                geooverlay = ((GeoOverlay) (obj));
                flag = flag2;
            } while (!flag2);
        }
        return ((OverlayCategory) (obj));
    }

    public GeoOverlays getOverlays()
    {
        return appSettings.getOverlays();
    }

    public boolean getPreferenceBooleanValue(String s, boolean flag)
    {
        return getSharedPreferences().getBoolean(s, flag);
    }

    public String getPrefernceValue(String s, String s1)
    {
        return getSharedPreferences().getString(s, s1);
    }

    protected SharedPreferences getSharedPreferences()
    {
        return PreferenceManager.getDefaultSharedPreferences(getAppContext());
    }

    public MapSkinSettings getSkinSettings()
    {
        return skinSettings;
    }

    public Tessera getTesseraConfiguration()
    {
        return appSettings.getTessera();
    }

    public String getTokenMemeberId()
    {
        return appSettings.getTokenMemeberId();
    }

    public String getTokenSharedKey()
    {
        return appSettings.getTokenSharedKey();
    }

    public Set getUnidentifiableLayers()
    {
        return appSettings.getUnidentifiableLayers();
    }

    public WarningStyle getWarningStyle(WarningTypeSelector warningtypeselector)
    {
        return warningStyleSettings.getStyle(warningtypeselector);
    }

    public WarningStyleSettings getWarningStyleSettings()
    {
        return warningStyleSettings;
    }

    public boolean isFutureModeSupported()
    {
        return getTesseraConfiguration().getVersion().isFutureSupported();
    }

    public boolean isLayerIdentifiable(Layer layer)
    {
        return appSettings.isLayerIdentifiable(layer);
    }

    public boolean isOverlayEnabled(GeoDataType geodatatype)
    {
        GeoOverlay geooverlay;
        if (appSettings.getOverlays().containsKey(geodatatype))
        {
            geooverlay = (GeoOverlay)appSettings.getOverlays().get(geodatatype);
        } else
        if (appSettings.getAdditionalOverlays().containsKey(geodatatype))
        {
            geooverlay = (GeoOverlay)appSettings.getAdditionalOverlays().get(geodatatype);
        } else
        {
            return false;
        }
        return isOverlayEnabled(geooverlay, geodatatype);
    }

    public boolean isSweepingRadarEnabledForCurrentLayer()
    {
        Layer layer = getCurrentLayer();
        if (layer == null)
        {
            return false;
        } else
        {
            return layer.isSweepingRadarEnabled();
        }
    }

    protected void onPreferencesChanged(SharedPreferences sharedpreferences, String s)
    {
        if (s == null || "".equals(s) || sharedpreferences == null)
        {
            return;
        }
        for (Iterator iterator = listeners.iterator(); iterator.hasNext() && !((SettingsChangeListener)iterator.next()).onSettingsChanged(s, sharedpreferences);) { }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        onPreferencesChanged(sharedpreferences, s);
    }

    public void removeOnCurrentLayerTransparencyChangedListener(OnCurrentLayerTransparencyChangedListener oncurrentlayertransparencychangedlistener)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("removeOnCurrentLayerTransparencyChangedListener: l = ").append(oncurrentlayertransparencychangedlistener).toString());
        }
        transparencyListeners.remove(oncurrentlayertransparencychangedlistener);
    }

    public void removeSettingsChangeListener(SettingsChangeListener settingschangelistener)
    {
        listeners.remove(settingschangelistener);
    }

    public void setActiveLayer(String s)
    {
        Object obj = null;
        Layer layer;
        if (s != null)
        {
            Iterator iterator = getLayers().values().iterator();
            do
            {
                layer = obj;
                if (!iterator.hasNext())
                {
                    break;
                }
                layer = (Layer)iterator.next();
            } while (!layer.getName().equals(s));
        } else
        {
            layer = getNoneLayer();
        }
        setCurrentLayer(layer);
    }

    public void setAppSettings(AppSettings appsettings)
    {
        appSettings = appsettings;
    }

    public void setCurrentLayer(Layer layer)
    {
        Object obj = getCurrentLayer();
        if (obj != null && ((Layer) (obj)).hasAdditionalOverlays())
        {
            for (obj = ((Layer) (obj)).getAdditionalOverlays().iterator(); ((Iterator) (obj)).hasNext(); setGeoOverlayEnabled((GeoOverlay)((Iterator) (obj)).next(), false, null)) { }
        }
        SharedPreferences sharedpreferences = getSharedPreferences();
        if (layer == null)
        {
            obj = null;
        } else
        {
            obj = appSettings.getTessera().getVersion().getLayerIdentifier(layer);
        }
        if (sharedpreferences.edit().putString(layerKey, ((String) (obj))).commit()) goto _L2; else goto _L1
_L1:
        Log.e(TAG, (new StringBuilder()).append("Failed to set current layer; filed to set layer ").append(layer).toString());
_L4:
        return;
_L2:
        if (layer != null && layer.hasAdditionalOverlays())
        {
            layer = layer.getAdditionalOverlays().iterator();
            while (layer.hasNext()) 
            {
                setGeoOverlayEnabled((GeoOverlay)layer.next(), true, null);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setCurrentLayerDisplayMode(LayerDisplayMode layerdisplaymode)
    {
        if (!getSharedPreferences().edit().putString(layerDisplayModeKey, layerdisplaymode.toString()).commit() && ConfigInfo.DEBUG)
        {
            Log.e(TAG, (new StringBuilder()).append("Failed to set current layer display mode; failed to set value ").append(layerdisplaymode).toString());
        }
    }

    public void setCurrentLayerPollingInterval(int i, PollingUnit pollingunit)
    {
        Layer layer = getCurrentLayer();
        if (layer != null && -1 < i && PollingUnit.UNDEFINED != pollingunit)
        {
            layer.setPolling(new Polling(pollingunit, i));
        }
    }

    public void setCurrentLayerTransparency(int i)
    {
        if (i >= 0 && 100 >= i)
        {
            mapApp.getSettingsAccessor().getCurrentLayer().getTransparency().setTransparencyValue(i);
    /* block-local class not found */
    class OnCurrentLayerTransparencyChangedListener {}

            for (Iterator iterator = transparencyListeners.iterator(); iterator.hasNext(); ((OnCurrentLayerTransparencyChangedListener)iterator.next()).onLayerTransparencyChanged()) { }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Target transparency ").append(i).append(" is out of range [0; 100]").toString());
        }
    }

    public void setCurrentMeasurementUnits(MeasurementUnits measurementunits)
    {
        if (measurementunits != null)
        {
            measurementunits.setMeasurementUnits(this);
            return;
        }
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "setCurrentMeasurementUnits: settings measurement units to default value");
        }
        appSettings.getMeasurementUnits().setMeasurementUnits(this);
    }

    public void setCurrentSpeedUnits(SpeedUnit speedunit)
    {
        Context context = getAppContext();
        if (!PreferenceManager.getDefaultSharedPreferences(context).edit().putString(speedUnitKey, context.getResources().getString(speedunit.getValueResId())).commit() && ConfigInfo.DEBUG)
        {
            Log.e(TAG, (new StringBuilder()).append("Failed to set current speed units; failed to set value  ").append(speedunit).toString());
        }
    }

    public void setCurrentSweepingRadarGrid(SweepingRadarGrid sweepingradargrid)
    {
        if (isSweepingRadarEnabledForCurrentLayer())
        {
            putPreference(getSharedPreferences(), sweepingRadarGridKey, getAppContext().getString(sweepingradargrid.getValueResId()));
        }
    }

    public void setCurrentTemperatureUnits(TemperatureUnit temperatureunit)
    {
        Context context = getAppContext();
        if (!PreferenceManager.getDefaultSharedPreferences(context).edit().putString(temperatureUnitKey, context.getResources().getString(temperatureunit.getValueResId())).commit() && ConfigInfo.DEBUG)
        {
            Log.e(TAG, (new StringBuilder()).append("Failed to set current temperature units; failed to set value  ").append(temperatureunit).toString());
        }
    }

    public void setGeoOverlayEnabled(GeoOverlay geooverlay, boolean flag, OverlayCategory overlaycategory)
    {
        if (geooverlay != null)
        {
            if (geooverlay.getType().isCategoryBased())
            {
                if (flag)
                {
                    if (overlaycategory != null && geooverlay.getCategories().contains(overlaycategory))
                    {
                        putPreference(getSharedPreferences(), getGeoOverlayCategoryKey(geooverlay), getTesseraConfiguration().getVersion().getGeoFeatureIdentifier(overlaycategory));
                        return;
                    }
                } else
                {
                    putPreference(getSharedPreferences(), getGeoOverlayKey(geooverlay), flag);
                    return;
                }
            } else
            {
                putPreference(getSharedPreferences(), getGeoOverlayKey(geooverlay), flag);
                return;
            }
        }
    }

    /* member class not found */
    class _cls1 {}

}
