// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.location.Location;
import com.urbanairship.Logger;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.analytics:
//            Event, DefaultEnvironment, Environment

public class LocationEvent extends Event
{
    public static final class AllowableProvider extends Enum
    {

        private static final AllowableProvider $VALUES[];
        public static final AllowableProvider GPS;
        public static final AllowableProvider NETWORK;
        public static final AllowableProvider PASSIVE;
        public static final AllowableProvider UNKNOWN;

        public static AllowableProvider valueOf(String s)
        {
            return (AllowableProvider)Enum.valueOf(com/urbanairship/analytics/LocationEvent$AllowableProvider, s);
        }

        public static AllowableProvider[] values()
        {
            return (AllowableProvider[])$VALUES.clone();
        }

        static 
        {
            GPS = new AllowableProvider("GPS", 0);
            NETWORK = new AllowableProvider("NETWORK", 1);
            PASSIVE = new AllowableProvider("PASSIVE", 2);
            UNKNOWN = new AllowableProvider("UNKNOWN", 3);
            $VALUES = (new AllowableProvider[] {
                GPS, NETWORK, PASSIVE, UNKNOWN
            });
        }

        private AllowableProvider(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class UpdateType extends Enum
    {

        private static final UpdateType $VALUES[];
        public static final UpdateType CHANGE;
        public static final UpdateType CONTINUOUS;
        public static final UpdateType SINGLE;

        public static UpdateType valueOf(String s)
        {
            return (UpdateType)Enum.valueOf(com/urbanairship/analytics/LocationEvent$UpdateType, s);
        }

        public static UpdateType[] values()
        {
            return (UpdateType[])$VALUES.clone();
        }

        static 
        {
            CONTINUOUS = new UpdateType("CONTINUOUS", 0);
            SINGLE = new UpdateType("SINGLE", 1);
            CHANGE = new UpdateType("CHANGE", 2);
            $VALUES = (new UpdateType[] {
                CONTINUOUS, SINGLE, CHANGE
            });
        }

        private UpdateType(String s, int i)
        {
            super(s, i);
        }
    }


    static final String FOREGROUND_KEY = "foreground";
    static final String H_ACCURACY_KEY = "h_accuracy";
    static final String LATITUDE_KEY = "lat";
    static final String LONGITUDE_KEY = "long";
    static final String PROVIDER_KEY = "provider";
    static final String REQUESTED_ACCURACY_KEY = "requested_accuracy";
    private static final String TYPE = "location";
    static final String UPDATE_DISTANCE_KEY = "update_dist";
    static final String UPDATE_TYPE_KEY = "update_type";
    static final String V_ACCURACY_KEY = "v_accuracy";
    private String accuracy;
    private String foreground;
    private String latitude;
    private String longitude;
    private String provider;
    private String requestedAccuracy;
    private String updateDistance;
    private UpdateType updateType;

    public LocationEvent(Location location, UpdateType updatetype, int i, int j)
    {
        this(((Environment) (new DefaultEnvironment())), location, updatetype, i, j);
    }

    public LocationEvent(Environment environment, Location location, UpdateType updatetype, int i, int j)
    {
        super(environment);
        latitude = String.format((Locale)null, "%.6f", new Object[] {
            Double.valueOf(location.getLatitude())
        });
        longitude = String.format((Locale)null, "%.6f", new Object[] {
            Double.valueOf(location.getLongitude())
        });
        provider = getValidProviderName(location.getProvider());
        accuracy = String.valueOf(location.getAccuracy());
        if (i >= 0)
        {
            location = String.valueOf(i);
        } else
        {
            location = "NONE";
        }
        requestedAccuracy = location;
        if (j >= 0)
        {
            location = String.valueOf(j);
        } else
        {
            location = "NONE";
        }
        updateDistance = location;
        if (environment.isAppInForeground())
        {
            environment = "true";
        } else
        {
            environment = "false";
        }
        foreground = environment;
        updateType = updatetype;
        Logger.info(String.format("New location at lat: %s, long: %s found with provider: %s", new Object[] {
            latitude, longitude, provider
        }));
    }

    private String getValidProviderName(String s)
    {
        AllowableProvider aallowableprovider[] = AllowableProvider.values();
        int j = aallowableprovider.length;
        for (int i = 0; i < j; i++)
        {
            if (aallowableprovider[i].toString().equalsIgnoreCase(s))
            {
                return s.toUpperCase();
            }
        }

        return AllowableProvider.UNKNOWN.toString();
    }

    JSONObject getData()
    {
        JSONObject jsonobject = new JSONObject();
        Environment environment = getEnvironment();
        try
        {
            jsonobject.put("session_id", environment.getSessionId());
            jsonobject.put("push_enabled", environment.isPushEnabled());
            jsonobject.put("notification_types", new JSONArray(environment.getNotificationTypes()));
            jsonobject.put("lat", latitude);
            jsonobject.put("long", longitude);
            jsonobject.put("requested_accuracy", requestedAccuracy);
            jsonobject.put("update_type", updateType.toString());
            jsonobject.put("provider", provider);
            jsonobject.put("h_accuracy", accuracy);
            jsonobject.put("v_accuracy", "NONE");
            jsonobject.put("foreground", foreground);
            jsonobject.put("update_dist", updateDistance);
        }
        catch (JSONException jsonexception)
        {
            Logger.error((new StringBuilder()).append("Error constructing JSON data for ").append(getType()).toString());
            return jsonobject;
        }
        return jsonobject;
    }

    String getType()
    {
        return "location";
    }
}
