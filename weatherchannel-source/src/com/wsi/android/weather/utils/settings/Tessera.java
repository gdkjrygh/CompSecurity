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

public class Tessera
{
    public static abstract class Version extends Enum
    {

        private static final Version $VALUES[];
        public static final Version TESSERA_2_0;
        public static final Version TESSERA_3_0;
        private final String versionPtrn;

        public static Version getVersionFromString(String s)
        {
            Version aversion[] = values();
            int j = aversion.length;
            for (int i = 0; i < j; i++)
            {
                Version version1 = aversion[i];
                if (s != null && !"".equals(s) && s.matches(version1.versionPtrn))
                {
                    return version1;
                }
            }

            return null;
        }

        public static Version valueOf(String s)
        {
            return (Version)Enum.valueOf(com/wsi/android/weather/utils/settings/Tessera$Version, s);
        }

        public static Version[] values()
        {
            return (Version[])$VALUES.clone();
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
            $VALUES = (new Version[] {
                TESSERA_2_0, TESSERA_3_0
            });
        }

        private Version(String s, int i, String s1)
        {
            super(s, i);
            versionPtrn = s1;
        }

        Version(String s, int i, String s1, _cls1 _pcls1)
        {
            this(s, i, s1);
        }
    }


    private String culture;
    private String domain;
    private String mapId;
    private String memberId;
    private String release;
    private Version version;

    public Tessera()
    {
    }

    public String getCulture()
    {
        return culture;
    }

    public String getDomain()
    {
        return domain;
    }

    public String getMapId()
    {
        return mapId;
    }

    public String getMemberId()
    {
        return memberId;
    }

    public String getRelease()
    {
        return release;
    }

    public Version getVersion()
    {
        return version;
    }

    public void setCulture(String s)
    {
        culture = s;
    }

    public void setDomain(String s)
    {
        domain = s;
    }

    public void setMapId(String s)
    {
        mapId = s;
    }

    public void setMemberId(String s)
    {
        memberId = s;
    }

    public void setRelease(String s)
    {
        release = s;
    }

    public void setVersion(Version version1)
    {
        version = version1;
    }
}
