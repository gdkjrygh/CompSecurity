// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.facade;

import android.util.Log;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.commons.ups.backend.UpsConstants;
import com.weather.commons.ups.backend.location.UpsLocationManager;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.app.AbstractTwcApplication;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Profile
{
    public static class EndPoint
    {

        private final EndPointDoc doc = null;
        private final String id = null;

        public EndPointDoc getDoc()
        {
            return doc;
        }

        public String getId()
        {
            return id;
        }

        public String toString()
        {
            return (new StringBuilder()).append("\nEndPoint{id='").append(id).append('\'').append(", doc=").append(doc).append('}').toString();
        }

        public EndPoint()
        {
        }
    }

    public static class EndPoint.EndPointDoc
    {

        private final String addr = null;
        private final String chan = null;
        private final String status = null;

        public String getAddr()
        {
            return addr;
        }

        public String getChan()
        {
            return chan;
        }

        public String getStatus()
        {
            return status;
        }

        public String toString()
        {
            return (new StringBuilder()).append("EndPointDoc{addr='").append(addr).append('\'').append(", chan='").append(chan).append('\'').append(", status='").append(status).append('\'').append('}').toString();
        }

        public EndPoint.EndPointDoc()
        {
        }
    }

    public static class Preference
    {

        private final String language;
        private final String locale;

        public String getLanguage()
        {
            return language;
        }

        public String getLocale()
        {
            return locale;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Preference{language='").append(language).append('\'').append(", locale='").append(locale).append('\'').append('}').toString();
        }

        public Preference()
        {
            language = null;
            locale = null;
        }

        public Preference(String s, String s1)
        {
            language = s;
            locale = s1;
        }
    }

    public static class ProfileLocation
        implements Comparator
    {

        private final ProfileLocationDoc doc = null;
        private final String id = null;

        public int compare(ProfileLocation profilelocation, ProfileLocation profilelocation1)
        {
            profilelocation = profilelocation.getDoc();
            profilelocation1 = profilelocation1.getDoc();
            if (profilelocation != null && profilelocation1 != null)
            {
                if (profilelocation.getPosition() > profilelocation1.getPosition())
                {
                    return -1;
                }
                if (profilelocation.getPosition() < profilelocation1.getPosition())
                {
                    return 1;
                }
            }
            return 0;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((ProfileLocation)obj, (ProfileLocation)obj1);
        }

        public ProfileLocationDoc getDoc()
        {
            return doc;
        }

        public String getId()
        {
            return id;
        }

        public String toString()
        {
            return (new StringBuilder()).append("\nProfileLocation{id='").append(id).append('\'').append(", doc=").append(doc).append('}').toString();
        }

        public ProfileLocation()
        {
        }
    }

    public static class ProfileLocation.ProfileLocationDoc
    {

        private final String address = null;
        private final String loc = null;
        private final String nickname = null;
        private final int position = 0;
        private final String tag = null;

        public String getAddress()
        {
            return address;
        }

        public String getLoc()
        {
            return loc;
        }

        public String getNickname()
        {
            return nickname;
        }

        public int getPosition()
        {
            return position;
        }

        public String getTag()
        {
            return tag;
        }

        public String toString()
        {
            return (new StringBuilder()).append("ProfileLocationDoc{address='").append(address).append('\'').append(", loc='").append(loc).append('\'').append(", nickname='").append(nickname).append('\'').append(", position=").append(position).append(", tag='").append(tag).append('\'').append('}').toString();
        }

        public ProfileLocation.ProfileLocationDoc()
        {
        }
    }

    public static class Service
    {

        private final ServiceDoc doc = null;
        private final String id = null;

        public ServiceDoc getDoc()
        {
            return doc;
        }

        public String getId()
        {
            return id;
        }

        public String toString()
        {
            return (new StringBuilder()).append("\nService{id='").append(id).append('\'').append(", doc=").append(doc).append('}').toString();
        }

        public Service()
        {
        }
    }

    public static class Service.ServiceDoc
    {

        private final String endpoint = null;
        private final Integer hour = null;
        private final String location = null;
        private final String status = null;
        private final String threshold = null;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Service.ServiceDoc)obj;
                if (endpoint == null ? ((Service.ServiceDoc) (obj)).endpoint != null : !endpoint.equals(((Service.ServiceDoc) (obj)).endpoint))
                {
                    return false;
                }
                if (hour == null ? ((Service.ServiceDoc) (obj)).hour != null : !hour.equals(((Service.ServiceDoc) (obj)).hour))
                {
                    return false;
                }
                if (location == null ? ((Service.ServiceDoc) (obj)).location != null : !location.equals(((Service.ServiceDoc) (obj)).location))
                {
                    return false;
                }
                if (status == null ? ((Service.ServiceDoc) (obj)).status != null : !status.equals(((Service.ServiceDoc) (obj)).status))
                {
                    return false;
                }
                if (threshold == null ? ((Service.ServiceDoc) (obj)).threshold != null : !threshold.equals(((Service.ServiceDoc) (obj)).threshold))
                {
                    return false;
                }
            }
            return true;
        }

        public String getEndpoint()
        {
            return endpoint;
        }

        public Integer getHour()
        {
            return hour;
        }

        public String getLocation()
        {
            return location;
        }

        public String getStatus()
        {
            return status;
        }

        public String getThreshold()
        {
            return threshold;
        }

        public int hashCode()
        {
            int i1 = 0;
            int i;
            int j;
            int k;
            int l;
            if (location != null)
            {
                i = location.hashCode();
            } else
            {
                i = 0;
            }
            if (status != null)
            {
                j = status.hashCode();
            } else
            {
                j = 0;
            }
            if (endpoint != null)
            {
                k = endpoint.hashCode();
            } else
            {
                k = 0;
            }
            if (threshold != null)
            {
                l = threshold.hashCode();
            } else
            {
                l = 0;
            }
            if (hour != null)
            {
                i1 = hour.hashCode();
            }
            return (((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
        }

        public String toString()
        {
            return (new StringBuilder()).append("ServiceDoc{location='").append(location).append('\'').append(", status='").append(status).append('\'').append(", endpoint='").append(endpoint).append('\'').append(", threshold='").append(threshold).append('\'').append(", hour='").append(hour).append('\'').append('}').toString();
        }

        public Service.ServiceDoc()
        {
        }
    }


    private static final String TAG = "Profile";
    private final EndPoint endpoints[] = null;
    private final ProfileLocation locations[] = null;
    private final Preference preferences = null;
    private final Service services[] = null;

    public Profile()
    {
    }

    public boolean deviceIdRegistered(String s)
    {
        boolean flag1 = false;
        String s1 = UpsConstants.getAndroidDeviceId();
        EndPoint aendpoint[] = endpoints;
        int j = aendpoint.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    Object obj = aendpoint[i];
                    if (!((EndPoint) (obj)).getId().equals(s1))
                    {
                        break label0;
                    }
                    Object obj1 = ((EndPoint) (obj)).getDoc();
                    if (obj1 == null)
                    {
                        break label0;
                    }
                    obj = ((EndPoint.EndPointDoc) (obj1)).getAddr();
                    String s2 = ((EndPoint.EndPointDoc) (obj1)).getStatus();
                    obj1 = ((EndPoint.EndPointDoc) (obj1)).getChan();
                    if (!((String) (obj)).equals(s) || !s2.equals("enabled") || !((String) (obj1)).equals(UpsConstants.ADM_CHANNEL_NAME) && !((String) (obj1)).equals(UpsConstants.GCM_CHANNEL_NAME))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public boolean dsxLanguageDidSetup()
    {
        String s = preferences.getLanguage();
        String s1 = UpsCommonUtil.getCurrentLocaleStringInLowerCase(AbstractTwcApplication.getRootContext());
        return s != null && s.equals(s1);
    }

    public List getLocations()
    {
        return Arrays.asList(locations);
    }

    public Preference getPreference()
    {
        return new Preference(preferences.getLanguage(), preferences.getLocale());
    }

    public Service getService(SavedLocation savedlocation, com.weather.commons.push.PushService.ServiceType servicetype)
    {
        if (services != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L22:
        return ((Service) (obj));
_L2:
        Service aservice[];
        int j;
        aservice = services;
        j = aservice.length;
        int i = 0;
_L58:
        if (i >= j) goto _L4; else goto _L3
_L3:
        Service service = aservice[i];
        obj = service.getId();
        boolean flag = false;
        static class _cls1
        {

            static final int $SwitchMap$com$weather$commons$push$PushService$ServiceType[];

            static 
            {
                $SwitchMap$com$weather$commons$push$PushService$ServiceType = new int[com.weather.commons.push.PushService.ServiceType.values().length];
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.SEVERE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.POLLEN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.RAINSNOW.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.HEAVY_RAIN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.THUNDERSTORM.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.EXTREME_HEAT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.HIGH_WIND.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.DENSE_FOG.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.EXTREME_COLD.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.HEAVY_SNOWFALL.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.ICE.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.BREAKINGNEWS.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.REAL_TIME_RAIN.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.FOLLOWME_LIGHTNING.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.PushService.ServiceType.FOLLOWME_SEVERE.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.weather.commons.push.PushService.ServiceType[servicetype.ordinal()];
        JVM INSTR tableswitch 1 15: default 577
    //                   1 265
    //                   2 284
    //                   3 303
    //                   4 322
    //                   5 341
    //                   6 360
    //                   7 379
    //                   8 398
    //                   9 417
    //                   10 436
    //                   11 455
    //                   12 474
    //                   13 486
    //                   14 498
    //                   15 510;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L5:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = service;
        if (savedlocation == null) goto _L22; else goto _L21
_L21:
        if (FollowMe.getInstance() == null || !savedlocation.equals(FollowMe.getInstance().getLocation()))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = service;
        if (servicetype == com.weather.commons.push.PushService.ServiceType.REAL_TIME_RAIN) goto _L22; else goto _L23
_L23:
        obj = service;
        if (servicetype == com.weather.commons.push.PushService.ServiceType.FOLLOWME_SEVERE) goto _L22; else goto _L24
_L24:
        obj = service;
        if (servicetype == com.weather.commons.push.PushService.ServiceType.FOLLOWME_LIGHTNING) goto _L22; else goto _L25
_L25:
        String s;
        obj = service.getDoc();
        if (!((Service.ServiceDoc) (obj)).getEndpoint().equals(UpsConstants.getAndroidDeviceId()))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Service.ServiceDoc) (obj)).getLocation();
        s = UpsLocationManager.getInstance().getLocByLocationId(this, ((String) (obj)));
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = service;
        if (s.equals(savedlocation.getLatLong())) goto _L22; else goto _L26
_L26:
        obj = service;
        if (s.equals(savedlocation.getKeyTypeCountry())) goto _L22; else goto _L27
_L6:
        if (savedlocation == null) goto _L29; else goto _L28
_L28:
        if (!((String) (obj)).startsWith("severe/")) goto _L29; else goto _L30
_L30:
        flag = true;
          goto _L5
_L7:
        if (savedlocation == null) goto _L32; else goto _L31
_L31:
        if (!((String) (obj)).startsWith("pollen/")) goto _L32; else goto _L33
_L33:
        flag = true;
          goto _L5
_L8:
        if (savedlocation == null) goto _L35; else goto _L34
_L34:
        if (!((String) (obj)).startsWith("scheduled/")) goto _L35; else goto _L36
_L36:
        flag = true;
          goto _L5
_L9:
        if (savedlocation == null) goto _L38; else goto _L37
_L37:
        if (!((String) (obj)).startsWith("global8/nrf")) goto _L38; else goto _L39
_L39:
        flag = true;
          goto _L5
_L10:
        if (savedlocation == null) goto _L41; else goto _L40
_L40:
        if (!((String) (obj)).startsWith("global8/nts")) goto _L41; else goto _L42
_L42:
        flag = true;
          goto _L5
_L11:
        if (savedlocation == null) goto _L44; else goto _L43
_L43:
        if (!((String) (obj)).startsWith("global8/neh")) goto _L44; else goto _L45
_L45:
        flag = true;
          goto _L5
_L12:
        if (savedlocation == null) goto _L47; else goto _L46
_L46:
        if (!((String) (obj)).startsWith("global8/nhw")) goto _L47; else goto _L48
_L48:
        flag = true;
          goto _L5
_L13:
        if (savedlocation == null) goto _L50; else goto _L49
_L49:
        if (!((String) (obj)).startsWith("global8/nfg")) goto _L50; else goto _L51
_L51:
        flag = true;
          goto _L5
_L14:
        if (savedlocation == null) goto _L53; else goto _L52
_L52:
        if (!((String) (obj)).startsWith("global8/nec")) goto _L53; else goto _L54
_L54:
        flag = true;
          goto _L5
_L15:
        if (savedlocation == null) goto _L56; else goto _L55
_L55:
        if (!((String) (obj)).startsWith("global8/nsf")) goto _L56; else goto _L57
_L57:
        flag = true;
          goto _L5
_L16:
        if (savedlocation == null)
        {
            break MISSING_BLOCK_LABEL_682;
        }
        if (!((String) (obj)).startsWith("global8/nic"))
        {
            break MISSING_BLOCK_LABEL_682;
        }
        flag = true;
          goto _L5
_L17:
        flag = ((String) (obj)).equals(UpsConstants.getBreakingNewsServiceId());
          goto _L5
_L18:
        flag = ((String) (obj)).equals(UpsConstants.getRealTimeRainServiceId());
          goto _L5
_L19:
        flag = ((String) (obj)).equals(UpsConstants.getFollowMeLightningServiceId());
          goto _L5
_L20:
        flag = ((String) (obj)).equals(UpsConstants.getFollowMeSevereServiceId());
          goto _L5
        savedlocation;
        Log.e("Profile", (new StringBuilder()).append("service ").append(servicetype).append(" not found, unexpected exception ").append(savedlocation.getClass().getSimpleName()).append(": ").append(savedlocation.getMessage()).toString());
_L4:
        return null;
_L27:
        i++;
          goto _L58
_L29:
        flag = false;
          goto _L5
_L32:
        flag = false;
          goto _L5
_L35:
        flag = false;
          goto _L5
_L38:
        flag = false;
          goto _L5
_L41:
        flag = false;
          goto _L5
_L44:
        flag = false;
          goto _L5
_L47:
        flag = false;
          goto _L5
_L50:
        flag = false;
          goto _L5
_L53:
        flag = false;
          goto _L5
_L56:
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    public String getServiceId(SavedLocation savedlocation, com.weather.commons.push.PushService.ServiceType servicetype)
    {
        savedlocation = getService(savedlocation, servicetype);
        if (savedlocation == null)
        {
            return null;
        } else
        {
            return savedlocation.getId();
        }
    }

    public List getServices()
    {
        return Arrays.asList(services);
    }

    public boolean isServiceEnabled(String s)
    {
        boolean flag1 = false;
        Service aservice[] = services;
        int j = aservice.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    Service service = aservice[i];
                    if (!s.equals(service.getId()))
                    {
                        break label0;
                    }
                    s = service.getDoc();
                    flag = flag1;
                    if (s != null)
                    {
                        flag = flag1;
                        if ("enabled".equals(s.getStatus()))
                        {
                            flag = true;
                        }
                    }
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public String toString()
    {
        return (new StringBuilder()).append("Profile{preferences=").append(preferences).append(", locations=").append(Arrays.toString(locations)).append(", endpoints=").append(Arrays.toString(endpoints)).append(", services=").append(Arrays.toString(services)).append('}').toString();
    }
}
