// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;

import com.google.common.base.Preconditions;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.system.TwcBus;
import com.weather.util.ExceptionUtil;
import java.util.List;

// Referenced classes of package com.weather.commons.locations:
//            LocationManager

public final class LocationReceiver
    implements Receiver
{
    public static final class UserClickedNewLocationEvent
    {

        public UserClickedNewLocationEvent()
        {
        }
    }

    public static class UserData
    {

        final String locationName;

        public String toString()
        {
            return String.valueOf(locationName);
        }

        public UserData(String s)
        {
            locationName = s;
        }
    }


    private static final String TAG = "LocationReceiver";
    private static final UserClickedNewLocationEvent userClickedNewLocationEvent = new UserClickedNewLocationEvent();
    private final TwcBus bus;
    private final FixedLocations fixedLocations;
    private final com.weather.dal2.locations.CurrentLocationChangeEvent.Cause locationLookupCause;
    private final LocationManager locationManager;

    public LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause cause)
    {
        this(cause, LocationManager.getLocationManager(), FixedLocations.getInstance(), DataAccessLayer.BUS);
    }

    LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause cause, LocationManager locationmanager, FixedLocations fixedlocations, TwcBus twcbus)
    {
        locationLookupCause = (com.weather.dal2.locations.CurrentLocationChangeEvent.Cause)Preconditions.checkNotNull(cause);
        locationManager = (LocationManager)Preconditions.checkNotNull(locationmanager);
        fixedLocations = (FixedLocations)Preconditions.checkNotNull(fixedlocations);
        bus = (TwcBus)Preconditions.checkNotNull(twcbus);
    }

    public void onCompletion(SavedLocation savedlocation, Object obj)
    {
        if (obj instanceof UserData)
        {
            obj = ((UserData)obj).locationName;
            if (obj != null)
            {
                savedlocation.setNickname(((String) (obj)));
            }
        }
        if (!fixedLocations.viewLocations().contains(savedlocation))
        {
            bus.post(userClickedNewLocationEvent);
            fixedLocations.addLocation(savedlocation);
            KahunaEvents.getInstance().addLocation(savedlocation);
        }
        locationManager.setCurrentLocation(savedlocation, "LocationReceiver.onCompletion()", locationLookupCause);
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((SavedLocation)obj, obj1);
    }

    public void onError(Throwable throwable, Object obj)
    {
        ExceptionUtil.logExceptionError("LocationReceiver", (new StringBuilder()).append("onError location:").append(obj).toString(), throwable);
    }

}
