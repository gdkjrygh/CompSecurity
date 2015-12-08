// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils.settings;

import com.wsi.android.framework.settings.Layer;
import com.wsi.android.framework.settings.OverlayCategory;
import com.wsi.android.framework.wxdata.geodata.controller.GeoFeature;
import com.wsi.android.framework.wxdata.geodata.helpers.GeoDataType;
import com.wsi.android.framework.wxdata.tiles.tessera.TileMap;
import com.wsi.android.framework.wxdata.utils.MapDataSettings;
import com.wsi.android.framework.wxdata.utils.tessera.OverlayDataHolder;
import com.wsi.android.framework.wxdata.ws.WSIServerConnector;

// Referenced classes of package com.wsi.android.weather.utils.settings:
//            Tessera

public static abstract class <init> extends Enum
{

    private static final TESSERA_3_0 $VALUES[];
    public static final TESSERA_3_0 TESSERA_2_0;
    public static final TESSERA_3_0 TESSERA_3_0;
    private final String versionPtrn;

    public static <init> getVersionFromString(String s)
    {
        <init> a_3C_init>[] = values();
        int j = a_3C_init>.length;
        for (int i = 0; i < j; i++)
        {
            <init> <init>1 = a_3C_init>[i];
            if (s != null && !"".equals(s) && s.matches(<init>1.versionPtrn))
            {
                return <init>1;
            }
        }

        return null;
    }

    public static versionPtrn valueOf(String s)
    {
        return (versionPtrn)Enum.valueOf(com/wsi/android/weather/utils/settings/Tessera$Version, s);
    }

    public static versionPtrn[] values()
    {
        return (versionPtrn[])$VALUES.clone();
    }

    public abstract OverlayDataHolder createOverlayDataHolder(MapDataSettings mapdatasettings);

    public abstract String getGeoFeatureIdentifier(OverlayCategory overlaycategory);

    public abstract String getGeoFeatureIdentifier(GeoFeature geofeature);

    public abstract String getGeoFeatureIdentifier(GeoDataType geodatatype);

    public abstract int getGeoFeaturesPoolSize();

    public abstract String getLayerIdentifier(Layer layer);

    public abstract String getLayerTileMapIdentifier(TileMap tilemap);

    public abstract int getTesseraLayerSettingsPoolSize();

    public abstract int getTileMapsPoolSize();

    public abstract boolean isFutureSupported();

    public abstract boolean isServerConnectionAvailable(WSIServerConnector wsiserverconnector, MapDataSettings mapdatasettings);

    static 
    {
    /* block-local class not found */
    class _cls1 {}

        TESSERA_2_0 = new _cls1("TESSERA_2_0", 0, "2\\.0");
    /* block-local class not found */
    class _cls2 {}

        TESSERA_3_0 = new _cls2("TESSERA_3_0", 1, "3\\.0");
        $VALUES = (new .VALUES[] {
            TESSERA_2_0, TESSERA_3_0
        });
    }

    private aType(String s, int i, String s1)
    {
        super(s, i);
        versionPtrn = s1;
    }

    versionPtrn(String s, int i, String s1, versionPtrn versionptrn)
    {
        this(s, i, s1);
    }
}
