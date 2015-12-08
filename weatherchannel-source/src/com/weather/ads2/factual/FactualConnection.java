// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.factual;

import android.net.TrafficStats;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.config.AdConfigManager;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.ads2.targeting.TargetingDataConnection;
import com.weather.ads2.targeting.UserIdQuerier;
import com.weather.ads2.targeting.UserIdQueriers;
import com.weather.ads2.util.AdUtils;
import com.weather.ads2.util.AndroidIdUtils;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.locations.LocationBaseServiceChange;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;
import com.weather.util.config.ConfigException;
import com.weather.util.geometry.LatLng;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.net.HttpRequest;
import com.weather.util.prefs.Prefs;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

// Referenced classes of package com.weather.ads2.factual:
//            FactualPrefs, FactualResponse

public final class FactualConnection extends TargetingDataConnection
{

    private static final String ANDROID_AID_KEY = "android-aid";
    public static final int AUDIENCE_STALE_TIME_IN_DAYS = 14;
    private static final long AUDIENCE_STALE_TIME_IN_MILLIS;
    private static final String DEFAULT_URL_BASE = "https://location.wfxtriggers.com";
    private static final int EXPIRATION_IN_MINUTES = 5;
    private static final String LATITUDE_KEY = "latitude";
    private static final String LONGITUDE_KEY = "longitude";
    private static final String PATH_TEMPLATE = "/geopulse/7620026f-cfb6-4d0c-9f8e-434ff0cd34d0?audience=%s&proximity=true";
    private static final long PROXIMITY_STALE_TIME_IN_MILLIS;
    private static final String SET = "set";
    private static final String TAG = "FactualConnection";
    private static final String TIMESTAMP_KEY = "timestamp";
    private static final String TURN_ON = "true";
    private static final String TWC_FULL_KEY = "twc-full";
    private static final String USER_ID_KEY = "user-id";
    private final Prefs factualPrefs;
    private LatLng oldLatLng;
    private volatile Map requestEntity;
    private final TimeProvider timeProvider;
    private final String urlTemplate;
    private final UserIdQuerier userIdQuerier;

    FactualConnection(Ticker ticker, TwcBus twcbus, Prefs prefs, TimeProvider timeprovider, UserIdQuerier useridquerier, String s)
    {
        super(5, ticker, twcbus, "FactualConnection");
        factualPrefs = prefs;
        timeProvider = (TimeProvider)Preconditions.checkNotNull(timeprovider);
        userIdQuerier = (UserIdQuerier)Preconditions.checkNotNull(useridquerier);
        urlTemplate = (new StringBuilder()).append(s).append("/geopulse/7620026f-cfb6-4d0c-9f8e-434ff0cd34d0?audience=%s&proximity=true").toString();
    }

    public FactualConnection(TwcBus twcbus)
    {
        this(null, twcbus, FactualPrefs.getInstance(), SystemTimeProvider.getInstance(), UserIdQueriers.getQuerier(), "https://location.wfxtriggers.com");
    }

    private void saveToPersistentStorage(String s, String s1)
    {
        factualPrefs.putString(FactualPrefs.Keys.AUDIENCE, s);
        factualPrefs.putString(FactualPrefs.Keys.PROXIMITY, s1);
        factualPrefs.putLong(FactualPrefs.Keys.UPDATE_TIME, timeProvider.currentTimeMillis());
    }

    private void setPostEntity(double d, double d1, Locale locale)
    {
        String s = userIdQuerier.getFilteredId();
        String s1;
        String s2;
        String s3;
        com.google.common.collect.ImmutableMap.Builder builder;
        if (s == null)
        {
            s1 = "nl";
            s = "nl";
        } else
        {
            s1 = AndroidIdUtils.getHashedAndroidId();
        }
        locale = AdUtils.getTimeInUTC(timeProvider.currentTimeMillis(), locale);
        s2 = String.format(Locale.US, "%f", new Object[] {
            Double.valueOf(d)
        });
        s3 = String.format(Locale.US, "%f", new Object[] {
            Double.valueOf(d1)
        });
        builder = ImmutableMap.builder();
        builder.put("latitude", s2);
        builder.put("longitude", s3);
        builder.put("timestamp", locale);
        builder.put("user-id", s1);
        builder.put("android-aid", s);
        builder.put("twc-full", "true");
        builder.put("set", "true");
        requestEntity = builder.build();
        LogUtil.d("FactualConnection", LoggingMetaTags.TWC_AD, "request entity = %s", new Object[] {
            Joiner.on("&").withKeyValueSeparator("=").join(requestEntity)
        });
    }

    public void answerLbsChange(LocationBaseServiceChange locationbaseservicechange)
    {
        locationbaseservicechange = locationbaseservicechange.getLocation();
        locationbaseservicechange = new LatLng(Double.valueOf(locationbaseservicechange.getLat()), Double.valueOf(locationbaseservicechange.getLng()));
        boolean flag;
        if (!locationbaseservicechange.equals(oldLatLng))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        oldLatLng = locationbaseservicechange;
        refresh(flag);
    }

    protected String getUrl()
    {
        if (oldLatLng != null)
        {
            setPostEntity(oldLatLng.latitude, oldLatLng.longitude, Locale.US);
        }
        if (requestEntity == null || requestEntity.isEmpty())
        {
            return null;
        }
        boolean flag;
        if (!"nl".equals(requestEntity.get("android-aid")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return String.format(Locale.US, urlTemplate, new Object[] {
            Boolean.valueOf(flag)
        });
    }

    protected Map loadPersistedValues()
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        long l = timeProvider.currentTimeMillis() - factualPrefs.getLong(FactualPrefs.Keys.UPDATE_TIME, 0L);
        if (l < AUDIENCE_STALE_TIME_IN_MILLIS)
        {
            builder.put(AdTargetingParam.AUDIENCE, factualPrefs.getString(FactualPrefs.Keys.AUDIENCE, "nl"));
        } else
        {
            builder.put(AdTargetingParam.AUDIENCE, "nl");
        }
        if (l < PROXIMITY_STALE_TIME_IN_MILLIS)
        {
            builder.put(AdTargetingParam.PROXIMITY, factualPrefs.getString(FactualPrefs.Keys.PROXIMITY, "nl"));
        } else
        {
            builder.put(AdTargetingParam.PROXIMITY, "nl");
        }
        return builder.build();
    }

    protected Map parseResponse(String s)
    {
        try
        {
            Object obj = AdConfigManager.INSTANCE.getFactualConfig();
            LogUtil.d("FactualConnection", LoggingMetaTags.TWC_AD, "Factual config %s", new Object[] {
                obj
            });
            obj = new FactualResponse(((com.weather.ads2.config.FactualConfig) (obj)), s);
            s = ((FactualResponse) (obj)).getAudienceSegments();
            obj = ((FactualResponse) (obj)).getProximitySegments();
            saveToPersistentStorage(s, ((String) (obj)));
            s = ImmutableMap.of(AdTargetingParam.AUDIENCE, s, AdTargetingParam.PROXIMITY, obj);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            EventLog.e("FactualConnection", "Error parsing factual response", s);
            saveToPersistentStorage("nl", "nl");
            return ImmutableMap.of(AdTargetingParam.AUDIENCE, "nl", AdTargetingParam.PROXIMITY, "nl");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            EventLog.e("FactualConnection", "Unable to get factual configuration", s);
            return loadPersistedValues();
        }
        return s;
    }

    protected String requestData()
        throws com.weather.util.net.HttpRequest.HttpRequestException
    {
        HttpRequest httprequest;
        Object obj;
        obj = getUrl();
        if (obj == null)
        {
            LogUtil.d("FactualConnection", LoggingMetaTags.TWC_AD, "Skipping factual call since current location is not known", new Object[0]);
            return null;
        }
        LogUtil.d("FactualConnection", LoggingMetaTags.TWC_AD, "url for targeting data is %s", new Object[] {
            obj
        });
        httprequest = null;
        TrafficStats.setThreadStatsTag(40960);
        obj = HttpRequest.post(((CharSequence) (obj)));
        httprequest = ((HttpRequest) (obj));
        ((HttpRequest) (obj)).contentType("application/x-www-form-urlencoded", "UTF-8");
        httprequest = ((HttpRequest) (obj));
        ((HttpRequest) (obj)).form(requestEntity);
        httprequest = ((HttpRequest) (obj));
        String s = ((HttpRequest) (obj)).body();
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).success())
        {
            break MISSING_BLOCK_LABEL_143;
        }
        httprequest = ((HttpRequest) (obj));
        LogUtil.d("FactualConnection", LoggingMetaTags.TWC_AD, "Failed to make request: statusCode=%s, error=", new Object[] {
            Integer.valueOf(((HttpRequest) (obj)).code()), s
        });
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return null;
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return s;
        Exception exception;
        exception;
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw exception;
    }

    static 
    {
        AUDIENCE_STALE_TIME_IN_MILLIS = TimeUnit.DAYS.toMillis(14L);
        PROXIMITY_STALE_TIME_IN_MILLIS = TimeUnit.HOURS.toMillis(2L);
    }
}
