// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import android.text.TextUtils;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.weather.util.FastTimeZoneUtil;
import com.weather.util.enums.EnumConverter;
import com.weather.util.enums.ReverseEnumMap;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.locations:
//            LocationType, LocationUtils

public class SavedLocation
    implements Serializable
{
    public static final class AlertType extends Enum
        implements EnumConverter
    {

        private static final AlertType $VALUES[];
        public static final List SIGNIFICANT_WEATHER_ALERTS_LIST;
        public static final AlertType STATIC;
        public static final AlertType breaking;
        public static final AlertType dense_fog;
        public static final AlertType extreme_cold;
        public static final AlertType extreme_heat;
        public static final AlertType flu;
        public static final AlertType heavy_rain;
        public static final AlertType heavy_snowfall;
        public static final AlertType high_wind;
        public static final AlertType ice;
        public static final AlertType lightning;
        private static final ReverseEnumMap map = new ReverseEnumMap(com/weather/dal2/locations/SavedLocation$AlertType);
        public static final AlertType pollen;
        public static final AlertType rainSnow;
        public static final AlertType realTimeRain;
        public static final AlertType severe;
        public static final AlertType significantWeatherForecast;
        public static final AlertType ski;
        public static final AlertType temperature;
        public static final AlertType thunderstorm;
        private static final Function toStringFunction = new Function() {

            public volatile Object apply(Object obj)
            {
                return apply((AlertType)obj);
            }

            public String apply(AlertType alerttype)
            {
                if (alerttype == null)
                {
                    return null;
                } else
                {
                    return alerttype.convert();
                }
            }

        };
        public static final AlertType traffic;
        public static final AlertType weekend;
        private final String value;

        public static AlertType valueOf(String s)
        {
            return (AlertType)Enum.valueOf(com/weather/dal2/locations/SavedLocation$AlertType, s);
        }

        public static AlertType[] values()
        {
            return (AlertType[])$VALUES.clone();
        }

        public AlertType convert(String s)
        {
            return (AlertType)map.get(s);
        }

        public volatile Enum convert(String s)
        {
            return convert(s);
        }

        public String convert()
        {
            return value;
        }

        static 
        {
            temperature = new AlertType("temperature", 0, "temperature");
            severe = new AlertType("severe", 1, "severe");
            realTimeRain = new AlertType("realTimeRain", 2, "realTimeRain");
            breaking = new AlertType("breaking", 3, "breaking");
            pollen = new AlertType("pollen", 4, "pollen");
            rainSnow = new AlertType("rainSnow", 5, "rainSnow");
            weekend = new AlertType("weekend", 6, "weekend");
            lightning = new AlertType("lightning", 7, "lightning");
            traffic = new AlertType("traffic", 8, "traffic");
            ski = new AlertType("ski", 9, "ski");
            flu = new AlertType("flu", 10, "flu");
            significantWeatherForecast = new AlertType("significantWeatherForecast", 11, "significantWeatherForecast");
            heavy_rain = new AlertType("heavy_rain", 12, "heavy-rain");
            thunderstorm = new AlertType("thunderstorm", 13, "thunder-storm");
            extreme_heat = new AlertType("extreme_heat", 14, "extreme-heat");
            high_wind = new AlertType("high_wind", 15, "high-wind");
            dense_fog = new AlertType("dense_fog", 16, "dense-fog");
            extreme_cold = new AlertType("extreme_cold", 17, "extreme-cold");
            heavy_snowfall = new AlertType("heavy_snowfall", 18, "heavy-snowfall");
            ice = new AlertType("ice", 19, "ice");
            $VALUES = (new AlertType[] {
                temperature, severe, realTimeRain, breaking, pollen, rainSnow, weekend, lightning, traffic, ski, 
                flu, significantWeatherForecast, heavy_rain, thunderstorm, extreme_heat, high_wind, dense_fog, extreme_cold, heavy_snowfall, ice
            });
            STATIC = temperature;
            SIGNIFICANT_WEATHER_ALERTS_LIST = Arrays.asList(new AlertType[] {
                heavy_rain, thunderstorm, extreme_heat, high_wind, dense_fog, extreme_cold, heavy_snowfall, ice
            });
        }


        private AlertType(String s, int i, String s1)
        {
            super(s, i);
            value = (String)Preconditions.checkNotNull(s1);
        }
    }


    private static final String ACCURACY = "accuracy";
    private static final String ADDRESS = "address";
    private static final String ALERTS = "alerts";
    public static final int APP_ORIGINATED = -1;
    private static final String CITY_NM = "cityNm";
    private static final String CNTRY_CD = "cntryCd";
    private static final String CNTY_ID = "cntyId";
    private static final String CNTY_NM = "cntyNm";
    private static final int CURRENT_VERSION = 4;
    private static final String DMA_CD = "dmaCd";
    private static final String GMT_DIFF = "gmtDiff";
    private static final String HAS_POLLEN_NOTIFICATION = "hasPollenNotification";
    private static final String HAS_RAINSNOW_NOTIFICATION = "hasRainSnowNotification";
    private static final String HAS_SEVERE_NOTIFICATION = "hasSevereNotification";
    private static final String HAS_TEMPERATURE_NOTIFICATION = "hasTemperatureNotification";
    private static final String IS_BOAT_BEACH = "isBoatBeach";
    private static final String LAT = "lat";
    private static final String LOC_ID = "locId";
    private static final String LOC_TYPE = "locType";
    private static final String LONG = "long";
    public static final int NETWORK_UP = -100;
    private static final String NICKNAME = "nickname";
    private static final String PRSNT_NM = "prsntNm";
    private static final String SS_RAD = "ssRad";
    private static final String ST_CD = "stCd";
    private static final String TAG = "SavedLocation";
    private static final String TAGS = "tags";
    private static final String TM_ZN_NM = "tmZnNm";
    private static final String VERSION = "VERSION";
    private static final String WIDGET_IDS = "widgetIds";
    private static final String ZIP_CD = "zipCd";
    private static final String ZONE_ID = "zoneId";
    private static final String ZONE_NM = "zoneNm";
    private static final long serialVersionUID = 0x3bc0b32317fb698dL;
    private double accuracy;
    private String address;
    private Set alertTypes;
    private final String cityName;
    private final String countryCode;
    private final String countyId;
    private final String countyName;
    private final Integer dma;
    private final int gmtDiff;
    private final boolean isBoatBeach;
    private final String key;
    private final String keyTypeCountry;
    private double lat;
    private double lng;
    private final LocationType locationType;
    private String nickname;
    private final String presentationName;
    private final String ssRad;
    private final String stateCode;
    private Set tags;
    private final TimeZone timeZone;
    private final int type;
    private List widgetIds;
    private final String zipCode;
    private final String zoneId;
    private final String zoneInfo;
    private final String zoneName;

    private SavedLocation(SavedLocation savedlocation)
    {
        Object obj1 = null;
        super();
        zipCode = savedlocation.zipCode;
        countryCode = savedlocation.countryCode;
        cityName = savedlocation.cityName;
        stateCode = savedlocation.stateCode;
        dma = savedlocation.dma;
        key = savedlocation.key;
        type = savedlocation.type;
        zoneInfo = savedlocation.zoneInfo;
        gmtDiff = savedlocation.gmtDiff;
        countyId = savedlocation.countyId;
        countyName = savedlocation.countyName;
        zoneId = savedlocation.zoneId;
        zoneName = savedlocation.zoneName;
        presentationName = savedlocation.presentationName;
        nickname = savedlocation.nickname;
        lat = savedlocation.lat;
        lng = savedlocation.lng;
        keyTypeCountry = savedlocation.keyTypeCountry;
        timeZone = (TimeZone)savedlocation.timeZone.clone();
        locationType = savedlocation.locationType;
        Object obj;
        if (savedlocation.tags == null)
        {
            obj = null;
        } else
        {
            obj = Collections.synchronizedSet(Sets.newHashSet(savedlocation.tags));
        }
        tags = ((Set) (obj));
        if (savedlocation.alertTypes.isEmpty())
        {
            obj = EnumSet.noneOf(com/weather/dal2/locations/SavedLocation$AlertType);
        } else
        {
            obj = EnumSet.copyOf(savedlocation.alertTypes);
        }
        alertTypes = Collections.synchronizedSet(((Set) (obj)));
        address = savedlocation.address;
        accuracy = savedlocation.accuracy;
        isBoatBeach = savedlocation.isBoatBeach;
        if (savedlocation.widgetIds == null)
        {
            obj = obj1;
        } else
        {
            obj = Lists.newArrayList(savedlocation.widgetIds);
        }
        widgetIds = ((List) (obj));
        ssRad = savedlocation.ssRad;
    }

    private SavedLocation(String s)
        throws JSONException
    {
        int l;
        LogUtil.v("SavedLocation", LoggingMetaTags.TWC_DAL, "init: json=%s", new Object[] {
            s
        });
        s = new JSONObject(s);
        l = s.optInt("VERSION", 4);
        if (l != 2 && l != 3 && l != 4) goto _L2; else goto _L1
_L1:
        zipCode = s.optString("zipCd");
        countryCode = s.getString("cntryCd");
        cityName = s.optString("cityNm");
        stateCode = s.optString("stCd");
        presentationName = s.getString("prsntNm");
        nickname = s.optString("nickname");
        if (TextUtils.isEmpty(nickname))
        {
            nickname = presentationName;
        }
        lat = s.getDouble("lat");
        lng = s.getDouble("long");
        int i = s.optInt("dmaCd", -1);
        JSONArray jsonarray;
        if (i == -1)
        {
            dma = null;
        } else
        {
            dma = Integer.valueOf(i);
        }
        key = s.getString("locId");
        type = s.getInt("locType");
        zoneInfo = s.getString("tmZnNm");
        gmtDiff = s.getInt("gmtDiff");
        countyId = s.optString("cntyId");
        countyName = s.optString("cntyNm");
        zoneId = s.optString("zoneId");
        zoneName = s.optString("zoneNm");
        ssRad = s.optString("ssRad");
        keyTypeCountry = (new StringBuilder()).append(key).append(':').append(type).append(':').append(countryCode).toString();
        timeZone = FastTimeZoneUtil.getTimeZone(zoneInfo);
        locationType = LocationType.getMember(type);
        jsonarray = s.optJSONArray("tags");
        tags = Collections.synchronizedSet(Sets.newHashSet());
        if (jsonarray != null)
        {
            i = 0;
            for (int i1 = jsonarray.length(); i < i1; i++)
            {
                tags.add(jsonarray.getString(i));
            }

        }
        alertTypes = Collections.synchronizedSet(EnumSet.noneOf(com/weather/dal2/locations/SavedLocation$AlertType));
        if (l != 2) goto _L4; else goto _L3
_L3:
        if (s.optBoolean("hasTemperatureNotification"))
        {
            alertTypes.add(AlertType.temperature);
        }
        if (s.optBoolean("hasSevereNotification"))
        {
            alertTypes.add(AlertType.severe);
        }
        if (s.optBoolean("hasPollenNotification"))
        {
            alertTypes.add(AlertType.pollen);
        }
        if (s.optBoolean("hasRainSnowNotification"))
        {
            alertTypes.add(AlertType.rainSnow);
        }
_L6:
        address = s.optString("address");
        accuracy = s.optDouble("accuracy", 0.0D);
        isBoatBeach = s.optBoolean("isBoatBeach", false);
        s = s.optJSONArray("widgetIds");
        widgetIds = Lists.newArrayList();
        if (s != null)
        {
            int j = 0;
            for (l = s.length(); j < l; j++)
            {
                widgetIds.add(Integer.valueOf(s.getInt(j)));
            }

        }
        break; /* Loop/switch isn't completed */
_L4:
        JSONArray jsonarray1 = s.optJSONArray("alerts");
        if (jsonarray1 != null)
        {
            int k = 0;
            l = jsonarray1.length();
            while (k < l) 
            {
                AlertType alerttype = AlertType.STATIC.convert(jsonarray1.getString(k));
                if (alerttype != null)
                {
                    alertTypes.add(alerttype);
                }
                k++;
            }
        }
        if (true) goto _L6; else goto _L5
_L2:
        throw new JSONException((new StringBuilder()).append("Unknown version ").append(l).toString());
_L5:
        LogUtil.v("SavedLocation", LoggingMetaTags.TWC_DAL, "init done: this=%s", new Object[] {
            this
        });
        return;
    }

    public static SavedLocation deSerialize(String s)
        throws JSONException
    {
        return new SavedLocation(s);
    }

    static SavedLocation newInstance(SavedLocation savedlocation)
        throws JSONException
    {
        return new SavedLocation(savedlocation);
    }

    boolean addAlert(AlertType alerttype)
    {
        return alertTypes.add(Preconditions.checkNotNull(alerttype));
    }

    boolean addRemoveAlertType(AlertType alerttype, boolean flag)
    {
        if (flag)
        {
            return addAlert(alerttype);
        } else
        {
            return removeAlert(alerttype);
        }
    }

    void addWidgetId(Integer integer)
    {
        widgetIds.add(integer);
    }

    void clearTag(String s)
    {
        tags.remove(s);
    }

    void clearTags()
    {
        tags.clear();
    }

    void clearWidgetIds()
    {
        widgetIds.clear();
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (SavedLocation)obj;
            return keyTypeCountry.equals(((SavedLocation) (obj)).keyTypeCountry);
        }
    }

    public boolean equalsLatLong(SavedLocation savedlocation)
    {
        return getLatE6() == savedlocation.getLatE6() && getLngE6() == savedlocation.getLngE6();
    }

    public double getAccuracy()
    {
        return accuracy;
    }

    public String getAddress()
    {
        return address;
    }

    public String getCity()
    {
        return cityName;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public String getCountyId()
    {
        return countyId;
    }

    public String getCountyName()
    {
        return countyName;
    }

    public Integer getDma()
    {
        return dma;
    }

    public String getFormattedLocationName()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (!Strings.isNullOrEmpty(cityName))
        {
            stringbuilder.append(cityName);
        }
        if (!Strings.isNullOrEmpty(stateCode))
        {
            stringbuilder.append(", ");
            stringbuilder.append(stateCode);
        }
        if (!Strings.isNullOrEmpty(zipCode))
        {
            stringbuilder.append(" (");
            stringbuilder.append(zipCode);
            stringbuilder.append(')');
        }
        return stringbuilder.toString();
    }

    public int getGmtDiff()
    {
        return gmtDiff;
    }

    public String getKey()
    {
        return key;
    }

    public String getKeyTypeCountry()
    {
        return keyTypeCountry;
    }

    public double getLat()
    {
        return lat;
    }

    public int getLatE6()
    {
        return (int)(lat * 1000000D);
    }

    public String getLatLong()
    {
        return LocationUtils.formatLatLong(lat, lng, 2);
    }

    public double getLng()
    {
        return lng;
    }

    public int getLngE6()
    {
        return (int)(lng * 1000000D);
    }

    public LocationType getLocationType()
    {
        return locationType;
    }

    public String getNickname()
    {
        return nickname;
    }

    public String getPresentationName()
    {
        return presentationName;
    }

    public String getSsRad()
    {
        return ssRad;
    }

    public String getState()
    {
        return stateCode;
    }

    public Set getTags()
    {
        java.util.HashSet hashset = Sets.newHashSet();
        hashset.addAll(tags);
        return hashset;
    }

    public TimeZone getTimeZone()
    {
        return timeZone;
    }

    public List getWidgetIds()
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        for (Iterator iterator = widgetIds.iterator(); iterator.hasNext(); arraylist.add((Integer)iterator.next())) { }
        return arraylist;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public String getZoneId()
    {
        return zoneId;
    }

    public String getZoneName()
    {
        return zoneName;
    }

    public boolean hasAlert(AlertType alerttype)
    {
        return alertTypes.contains(alerttype);
    }

    public boolean hasNotifications()
    {
        return !alertTypes.isEmpty();
    }

    public boolean hasWidgets()
    {
        for (Iterator iterator = widgetIds.iterator(); iterator.hasNext();)
        {
            if (((Integer)iterator.next()).intValue() != -1)
            {
                return true;
            }
        }

        return false;
    }

    public int hashCode()
    {
        return keyTypeCountry.hashCode();
    }

    public boolean isBoatBeach()
    {
        return isBoatBeach;
    }

    public boolean isTag(String s)
    {
        return tags.contains(s);
    }

    boolean isWidgetListEmpty()
    {
        return widgetIds == null || widgetIds.isEmpty();
    }

    void merge(SavedLocation savedlocation)
    {
        Object obj1 = null;
        Object obj;
        if (savedlocation.tags == null)
        {
            obj = null;
        } else
        {
            obj = Collections.synchronizedSet(Sets.newHashSet(savedlocation.tags));
        }
        tags = ((Set) (obj));
        if (savedlocation.alertTypes.isEmpty())
        {
            obj = EnumSet.noneOf(com/weather/dal2/locations/SavedLocation$AlertType);
        } else
        {
            obj = EnumSet.copyOf(savedlocation.alertTypes);
        }
        alertTypes = Collections.synchronizedSet(((Set) (obj)));
        if (savedlocation.widgetIds == null)
        {
            savedlocation = obj1;
        } else
        {
            savedlocation = Lists.newArrayList(savedlocation.widgetIds);
        }
        widgetIds = savedlocation;
    }

    boolean removeAlert(AlertType alerttype)
    {
        return alertTypes.remove(alerttype);
    }

    boolean removeWidgetId(Integer integer)
    {
        return widgetIds.remove(integer);
    }

    public String serialize()
        throws JSONException
    {
        Object obj = new JSONObject();
        ((JSONObject) (obj)).put("VERSION", 4);
        ((JSONObject) (obj)).put("zipCd", zipCode);
        ((JSONObject) (obj)).put("cntryCd", countryCode);
        ((JSONObject) (obj)).put("cityNm", cityName);
        ((JSONObject) (obj)).put("stCd", stateCode);
        ((JSONObject) (obj)).put("prsntNm", presentationName);
        ((JSONObject) (obj)).put("nickname", nickname);
        ((JSONObject) (obj)).put("lat", lat);
        ((JSONObject) (obj)).put("long", lng);
        ((JSONObject) (obj)).put("dmaCd", dma);
        ((JSONObject) (obj)).put("locId", key);
        ((JSONObject) (obj)).put("locType", type);
        ((JSONObject) (obj)).put("tmZnNm", zoneInfo);
        ((JSONObject) (obj)).put("gmtDiff", gmtDiff);
        ((JSONObject) (obj)).put("cntyId", countyId);
        ((JSONObject) (obj)).put("cntyNm", countyName);
        ((JSONObject) (obj)).put("zoneId", zoneId);
        ((JSONObject) (obj)).put("zoneNm", zoneName);
        ((JSONObject) (obj)).put("tags", new JSONArray(tags));
        ((JSONObject) (obj)).put("alerts", new JSONArray(Collections2.transform(alertTypes, AlertType.toStringFunction)));
        ((JSONObject) (obj)).put("address", address);
        ((JSONObject) (obj)).put("accuracy", accuracy);
        ((JSONObject) (obj)).put("isBoatBeach", isBoatBeach);
        ((JSONObject) (obj)).put("widgetIds", new JSONArray(widgetIds));
        ((JSONObject) (obj)).put("ssRad", ssRad);
        obj = ((JSONObject) (obj)).toString();
        LogUtil.v("SavedLocation", LoggingMetaTags.TWC_DAL, "serialize: result=%s", new Object[] {
            obj
        });
        return ((String) (obj));
    }

    public void setAccuracy(double d)
    {
        accuracy = d;
    }

    public void setAddress(String s)
    {
        address = s;
    }

    void setLatLong(double d, double d1)
    {
        lat = d;
        lng = d1;
    }

    public void setNickname(String s)
    {
        nickname = s;
    }

    void setTag(String s)
    {
        tags.add(s);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("SavedLocation{");
        stringbuilder.append("presentationName='").append(presentationName).append('\'');
        stringbuilder.append(", nickname='").append(nickname).append('\'');
        stringbuilder.append(", keyTypeCountry='").append(keyTypeCountry).append('\'');
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
