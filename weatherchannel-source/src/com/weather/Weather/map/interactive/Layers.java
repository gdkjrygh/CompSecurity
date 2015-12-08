// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.weather.Weather.map.interactive.fragments.TwcMapSettingsFragment;
import com.wsi.android.framework.ui.map.GeoPointInterface;
import com.wsi.android.framework.ui.map.MapViewInterface;
import com.wsi.android.weather.ui.LayerItem;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.Weather.map.interactive:
//            Region

public class Layers
{

    private static final ImmutableMap ALL_LAYERS;
    public static final ImmutableMap CLOUDS;
    private static final ImmutableMap FIRE_WEATHER_INDEX;
    private static final ImmutableMap RADAR;
    private static final ImmutableMap ROAD_WEATHER;
    private static final ImmutableMap SNOW_COVER;
    private static final ImmutableMap TRUEPOINT_DEWPOINT;
    private static final ImmutableMap TRUEPOINT_FEELS_LIKE;
    private static final ImmutableMap TRUEPOINT_OBS_TEMP;
    private static final ImmutableMap TRUEPOINT_PRECIP;
    private static final ImmutableMap TRUEPOINT_SNOWFALL;
    private static final ImmutableMap TRUEPOINT_TEMP_CHANGE;
    private static final ImmutableMap TRUEPOINT_UV;
    private static final ImmutableMap TRUEPOINT_WIND_SPEED;
    private static final ImmutableMap WATERTEMP;

    private Layers()
    {
    }

    public static String getDefaultLayer(GeoPointInterface geopointinterface, List list)
    {
        String s = getLayerForPoint(RADAR, geopointinterface, list);
        Object obj = s;
        if (s == null)
        {
            geopointinterface = getLayerForPoint(CLOUDS, geopointinterface, list);
            obj = geopointinterface;
            if (geopointinterface == null)
            {
                obj = ((LayerItem)list.get(0)).getName();
            }
        }
        return ((String) (obj));
    }

    private static String getLayer(List list, Integer integer)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            LayerItem layeritem = (LayerItem)iterator.next();
            if (layeritem.getId() == integer.intValue())
            {
                return layeritem.getName();
            }
        }

        return ((LayerItem)list.get(0)).getName();
    }

    public static String getLayerForPoint(ImmutableMap immutablemap, GeoPointInterface geopointinterface, List list)
    {
        for (immutablemap = immutablemap.entrySet().iterator(); immutablemap.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)immutablemap.next();
            if (((Region)entry.getValue()).containsPoint(geopointinterface))
            {
                return getLayer(list, (Integer)entry.getKey());
            }
        }

        return null;
    }

    public static String getMatchingLayerForPoint(LayerItem layeritem, GeoPointInterface geopointinterface, List list)
    {
        Object obj = null;
        if (layeritem != null)
        {
            obj = (ImmutableMap)ALL_LAYERS.get(Integer.valueOf(layeritem.getId()));
        }
        layeritem = ((LayerItem)list.get(0)).getName();
        if (obj != null)
        {
            layeritem = getLayerForPoint(((ImmutableMap) (obj)), geopointinterface, list);
        }
        obj = layeritem;
        if (layeritem == null)
        {
            obj = getDefaultLayer(geopointinterface, list);
        }
        return ((String) (obj));
    }

    public static void getVisibleLayers(List list, MapViewInterface mapviewinterface, List list1)
    {
        int i = 0;
        int l = list1.size();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            LayerItem layeritem = (LayerItem)list.next();
            int j = layeritem.getId();
            ImmutableMap immutablemap = (ImmutableMap)ALL_LAYERS.get(Integer.valueOf(j));
            if (immutablemap != null && ((Region)immutablemap.get(Integer.valueOf(j))).isVisible(mapviewinterface))
            {
                if (i < l)
                {
                    list1.set(i, layeritem.getName());
                } else
                {
                    list1.add(layeritem.getName());
                }
                i++;
            }
        } while (true);
        int k;
        if (i < l)
        {
            list1.set(i, TwcMapSettingsFragment.getNoneLayerLabel());
        } else
        {
            list1.add(TwcMapSettingsFragment.getNoneLayerLabel());
        }
        for (k = i + 1; k < l; k++)
        {
            list1.remove(i + 1);
        }

    }

    static 
    {
        RADAR = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(39), Region.CONUS).put(Integer.valueOf(46), Region.HAWAII).put(Integer.valueOf(44), Region.ALASKA).put(Integer.valueOf(45), Region.AUSTRAILIA).put(Integer.valueOf(48), Region.EUROPE).build();
        CLOUDS = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(40), Region.CONUS).put(Integer.valueOf(42), Region.SOUTH_AFRICA).put(Integer.valueOf(49), Region.TROPICS).put(Integer.valueOf(41), Region.EUROPE).put(Integer.valueOf(105), Region.WHOLE_WORLD).build();
        WATERTEMP = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(110), Region.WHOLE_WORLD).build();
        TRUEPOINT_OBS_TEMP = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(90), Region.CONUS).put(Integer.valueOf(139), Region.EUROPE).build();
        TRUEPOINT_FEELS_LIKE = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(91), Region.CONUS).put(Integer.valueOf(143), Region.EUROPE).build();
        TRUEPOINT_WIND_SPEED = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(94), Region.CONUS).put(Integer.valueOf(148), Region.EUROPE).build();
        TRUEPOINT_DEWPOINT = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(95), Region.CONUS).put(Integer.valueOf(150), Region.EUROPE).build();
        TRUEPOINT_UV = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(97), Region.CONUS).put(Integer.valueOf(152), Region.EUROPE).build();
        TRUEPOINT_PRECIP = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(92), Region.CONUS).put(Integer.valueOf(145), Region.EUROPE).build();
        TRUEPOINT_TEMP_CHANGE = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(96), Region.CONUS).put(Integer.valueOf(151), Region.EUROPE).build();
        TRUEPOINT_SNOWFALL = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(93), Region.CONUS).put(Integer.valueOf(147), Region.EUROPE).build();
        ROAD_WEATHER = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(52), Region.CONUS).build();
        FIRE_WEATHER_INDEX = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(56), Region.CONUS).build();
        SNOW_COVER = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(53), Region.CONUS).build();
        ALL_LAYERS = (new com.google.common.collect.ImmutableMap.Builder()).put(Integer.valueOf(39), RADAR).put(Integer.valueOf(46), RADAR).put(Integer.valueOf(44), RADAR).put(Integer.valueOf(45), RADAR).put(Integer.valueOf(48), RADAR).put(Integer.valueOf(40), CLOUDS).put(Integer.valueOf(42), CLOUDS).put(Integer.valueOf(49), CLOUDS).put(Integer.valueOf(41), CLOUDS).put(Integer.valueOf(105), CLOUDS).put(Integer.valueOf(110), WATERTEMP).put(Integer.valueOf(90), TRUEPOINT_OBS_TEMP).put(Integer.valueOf(139), TRUEPOINT_OBS_TEMP).put(Integer.valueOf(91), TRUEPOINT_FEELS_LIKE).put(Integer.valueOf(143), TRUEPOINT_FEELS_LIKE).put(Integer.valueOf(94), TRUEPOINT_WIND_SPEED).put(Integer.valueOf(148), TRUEPOINT_WIND_SPEED).put(Integer.valueOf(95), TRUEPOINT_DEWPOINT).put(Integer.valueOf(150), TRUEPOINT_DEWPOINT).put(Integer.valueOf(97), TRUEPOINT_UV).put(Integer.valueOf(152), TRUEPOINT_UV).put(Integer.valueOf(92), TRUEPOINT_PRECIP).put(Integer.valueOf(145), TRUEPOINT_PRECIP).put(Integer.valueOf(96), TRUEPOINT_TEMP_CHANGE).put(Integer.valueOf(151), TRUEPOINT_TEMP_CHANGE).put(Integer.valueOf(93), TRUEPOINT_SNOWFALL).put(Integer.valueOf(147), TRUEPOINT_SNOWFALL).put(Integer.valueOf(52), ROAD_WEATHER).put(Integer.valueOf(56), FIRE_WEATHER_INDEX).put(Integer.valueOf(53), SNOW_COVER).build();
    }
}
