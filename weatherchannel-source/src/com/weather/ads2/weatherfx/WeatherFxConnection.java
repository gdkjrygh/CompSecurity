// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.weatherfx;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Ticker;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.weather.ads2.config.AdConfig;
import com.weather.ads2.config.AdConfigProvider;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.ads2.targeting.TargetingDataConnection;
import com.weather.dal2.cache.MemCache;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.locations.LocationChange;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.system.TwcBus;
import com.weather.util.CountryCodeUtil;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.ads2.weatherfx:
//            WeatherFxPrefs, WeatherFxResponse, ScatterShot, ScatterShotUpdateEvent, 
//            WeatherFxLegacyResponse

public final class WeatherFxConnection extends TargetingDataConnection
{
    private static final class Location
    {

        private final String countryCode;
        private final String zip;

        static Location valueOf(SavedLocation savedlocation)
        {
            if (savedlocation != null && !Strings.isNullOrEmpty(savedlocation.getZipCode()))
            {
                String s = null;
                if (CountryCodeUtil.isUs(savedlocation.getCountryCode()))
                {
                    s = "US";
                } else
                if (CountryCodeUtil.isUk(savedlocation.getCountryCode()))
                {
                    s = "GB";
                }
                if (s != null)
                {
                    return new Location(savedlocation.getZipCode(), s);
                }
            }
            return null;
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Location)obj;
                if (!countryCode.equals(((Location) (obj)).countryCode))
                {
                    return false;
                }
                if (!zip.equals(((Location) (obj)).zip))
                {
                    return false;
                }
            }
            return true;
        }

        public String getLocationId()
        {
            return (new StringBuilder()).append(countryCode).append("_4_").append(zip).toString();
        }

        public String getZip()
        {
            return zip;
        }

        public int hashCode()
        {
            return zip.hashCode() * 31 + countryCode.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Location{zip='").append(zip).append('\'').append(", countryCode='").append(countryCode).append('\'').append('}').toString();
        }


        private Location(String s, String s1)
        {
            zip = s;
            countryCode = s1;
        }
    }

    private static final class RequestKey
    {

        private final Location followMe;
        private final Set locations;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (RequestKey)obj;
                if (followMe == null ? ((RequestKey) (obj)).followMe != null : !followMe.equals(((RequestKey) (obj)).followMe))
                {
                    return false;
                }
                if (!locations.equals(((RequestKey) (obj)).locations))
                {
                    return false;
                }
            }
            return true;
        }

        String getHzcsQueryValue()
        {
            if (followMe == null)
            {
                return "IP";
            } else
            {
                return followMe.getZip();
            }
        }

        String getLocQueryValue()
        {
            if (followMe == null)
            {
                return "";
            } else
            {
                return followMe.getLocationId();
            }
        }

        String getNzcsQueryValue()
        {
            return "zcs";
        }

        String getZcsQueryValue()
        {
            if (locations.isEmpty())
            {
                return "nl";
            } else
            {
                Collection collection = Collections2.transform(locations, WeatherFxConnection.zipCodeFunction);
                return Joiner.on(',').join(collection);
            }
        }

        String getZip()
        {
            if (followMe == null)
            {
                return "";
            } else
            {
                return followMe.getZip();
            }
        }

        boolean hasFollowMe()
        {
            return followMe != null;
        }

        public int hashCode()
        {
            int j = locations.hashCode();
            int i;
            if (followMe != null)
            {
                i = followMe.hashCode();
            } else
            {
                i = 0;
            }
            return j * 31 + i;
        }

        public String toString()
        {
            return (new StringBuilder()).append("RequestKey{locations=").append(locations).append(", followMe=").append(followMe).append('}').toString();
        }

        private RequestKey(Collection collection, Location location)
        {
            locations = ImmutableSet.copyOf(collection);
            followMe = location;
        }

    }


    private static final int EXPIRATION_IN_MINUTES = 5;
    private static final String LEGACY_URL = "http://triggers.weather.com/json/?resp_type=json";
    private static final String LEGACY_ZIP = "&zip=";
    private static final String TAG = "WeatherFxConnection";
    private static final long TOLERABLE_STALENESS;
    private static final String URL_TEMPLATE_WITHOUT_FOLLOWME = "&zcs=%s&hzcs=%s&nzcs=%s";
    private static final String URL_TEMPLATE_WITH_FOLLOWME = "&zcs=%s&hzcs=%s&nzcs=%s&loc=%s";
    private static final Function zipCodeFunction = new Function() {

        public volatile Object apply(Object obj)
        {
            return apply((Location)obj);
        }

        public String apply(Location location)
        {
            if (location == null)
            {
                return null;
            } else
            {
                return location.zip;
            }
        }

    };
    private final AdConfigProvider adConfigProvider;
    private final TwcBus bus;
    private final Prefs prefs;
    private volatile RequestKey requestKey;
    private volatile boolean scatterShotsEnabled;
    private final TimeProvider timeProvider;

    public WeatherFxConnection(TwcBus twcbus, AdConfigProvider adconfigprovider)
    {
        this(WeatherFxPrefs.getInstance(), SystemTimeProvider.getInstance(), ((Ticker) (null)), twcbus, adconfigprovider);
    }

    WeatherFxConnection(Prefs prefs1, TimeProvider timeprovider, Ticker ticker, TwcBus twcbus, AdConfigProvider adconfigprovider)
    {
        super(5, ticker, twcbus, "WeatherFxConnection");
        requestKey = new RequestKey(ImmutableSet.of(), null);
        adConfigProvider = (AdConfigProvider)Preconditions.checkNotNull(adconfigprovider);
        prefs = (Prefs)Preconditions.checkNotNull(prefs1);
        timeProvider = (TimeProvider)Preconditions.checkNotNull(timeprovider);
        bus = (TwcBus)Preconditions.checkNotNull(twcbus);
    }

    WeatherFxConnection(Prefs prefs1, TimeProvider timeprovider, TwcBus twcbus, MemCache memcache, AdConfigProvider adconfigprovider)
    {
        super(twcbus, "WeatherFxConnection", memcache);
        requestKey = new RequestKey(ImmutableSet.of(), null);
        adConfigProvider = (AdConfigProvider)Preconditions.checkNotNull(adconfigprovider);
        prefs = (Prefs)Preconditions.checkNotNull(prefs1);
        timeProvider = (TimeProvider)Preconditions.checkNotNull(timeprovider);
        bus = (TwcBus)Preconditions.checkNotNull(twcbus);
    }

    private RequestKey createRequestKey(SavedLocationsSnapshot savedlocationssnapshot)
    {
        Location location = Location.valueOf(savedlocationssnapshot.followMe().getLocation());
        com.google.common.collect.ImmutableSet.Builder builder = ImmutableSet.builder();
        if (location != null)
        {
            builder.add(location);
        }
        savedlocationssnapshot = savedlocationssnapshot.getFixedLocations().iterator();
        do
        {
            if (!savedlocationssnapshot.hasNext())
            {
                break;
            }
            Location location1 = Location.valueOf((SavedLocation)savedlocationssnapshot.next());
            if (location1 != null)
            {
                builder.add(location1);
            }
        } while (true);
        return new RequestKey(builder.build(), location);
    }

    private ImmutableMap createTargetingMapAndUpdateScatterShot(String s)
    {
        if (scatterShotsEnabled)
        {
            s = new WeatherFxResponse(s);
            String s1 = s.getWeatherFxString();
            Map map = s.getScatterShotMap();
            s = "nl";
            Iterator iterator = map.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ScatterShot scattershot = (ScatterShot)iterator.next();
                if (!"nl".equals(scattershot.getHzcs()))
                {
                    s = scattershot.getHzcs();
                }
            } while (true);
            bus.post(new ScatterShotUpdateEvent(map));
            return ImmutableMap.of(AdTargetingParam.WEATHERFX, s1, AdTargetingParam.HZCS, s);
        } else
        {
            s = new WeatherFxLegacyResponse(s);
            return ImmutableMap.of(AdTargetingParam.WEATHERFX, s.getWeatherFxString(), AdTargetingParam.HZCS, "nl");
        }
    }

    protected String getUrl()
    {
        Object obj;
        try
        {
            obj = adConfigProvider.getAdConfig();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            EventLog.e("WeatherFxConnection", "Unable to get ad config", ((Throwable) (obj)));
            return null;
        }
        scatterShotsEnabled = ((AdConfig) (obj)).isScatterShotsEnabled();
        if (scatterShotsEnabled)
        {
            RequestKey requestkey = requestKey;
            String s1 = ((AdConfig) (obj)).getWeatherFxUrl();
            if (requestkey.hasFollowMe())
            {
                obj = "&zcs=%s&hzcs=%s&nzcs=%s&loc=%s";
            } else
            {
                obj = "&zcs=%s&hzcs=%s&nzcs=%s";
            }
            obj = (new StringBuilder()).append(s1).append(String.format(Locale.US, ((String) (obj)), new Object[] {
                requestkey.getZcsQueryValue(), requestkey.getHzcsQueryValue(), requestkey.getNzcsQueryValue(), requestkey.getLocQueryValue()
            })).toString();
            LogUtil.d("WeatherFxConnection", LoggingMetaTags.TWC_AD, "WeatherFxConnection url: %s, %s", new Object[] {
                requestkey, obj
            });
            return ((String) (obj));
        }
        String s = requestKey.getZip();
        if (s.isEmpty())
        {
            obj = "http://triggers.weather.com/json/?resp_type=json";
        } else
        {
            obj = (new StringBuilder()).append("http://triggers.weather.com/json/?resp_type=json&zip=").append(s).toString();
        }
        LogUtil.d("WeatherFxConnection", LoggingMetaTags.TWC_AD, "WeatherFxConnection legacy url: %s, %s", new Object[] {
            s, obj
        });
        return ((String) (obj));
    }

    protected Map loadPersistedValues()
    {
        if (prefs.getLong(WeatherFxPrefs.Keys.EXPIRES_AT, 0L) < timeProvider.currentTimeMillis())
        {
            LogUtil.d("WeatherFxConnection", LoggingMetaTags.TWC_AD, "Unable to make WeatherFX request or access tolerably stale data for: %s", new Object[] {
                requestKey
            });
            return ImmutableMap.of(AdTargetingParam.WEATHERFX, "nl", AdTargetingParam.HZCS, "nl");
        } else
        {
            LogUtil.d("WeatherFxConnection", LoggingMetaTags.TWC_AD, "Using tolerably stale data for: %s", new Object[] {
                requestKey
            });
            return createTargetingMapAndUpdateScatterShot(prefs.getString(WeatherFxPrefs.Keys.VALUE, ""));
        }
    }

    public void onLocationChange(LocationChange locationchange)
    {
        boolean flag = false;
        LogUtil.d("WeatherFxConnection", LoggingMetaTags.TWC_AD, "LocationBaseServiceChange", new Object[0]);
        RequestKey requestkey = requestKey;
        EnumSet enumset = locationchange.getFlags();
        if (!enumset.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_ACTIVATED) && !enumset.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_CHANGE) && !enumset.contains(com.weather.dal2.locations.LocationChange.Flags.ITEM_ADDED))
        {
            return;
        }
        requestKey = createRequestKey(locationchange.getSnapshot());
        if (!requestkey.equals(requestKey))
        {
            flag = true;
        }
        refresh(flag);
    }

    protected Map parseResponse(String s)
    {
        ImmutableMap immutablemap = createTargetingMapAndUpdateScatterShot(s);
        prefs.putString(WeatherFxPrefs.Keys.VALUE, s);
        prefs.putLong(WeatherFxPrefs.Keys.EXPIRES_AT, timeProvider.currentTimeMillis() + TOLERABLE_STALENESS);
        return immutablemap;
    }

    public void start()
    {
        RequestKey requestkey = requestKey;
        requestKey = createRequestKey(new SavedLocationsSnapshot());
        boolean flag;
        if (!requestkey.equals(requestKey))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        refresh(flag);
        super.start();
    }

    static 
    {
        TOLERABLE_STALENESS = TimeUnit.HOURS.toMillis(2L);
    }

}
