// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import android.content.Context;
import android.content.Intent;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.TwcBus;
import com.weather.util.AbstractPostable;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.Serializable;
import java.util.EnumSet;

// Referenced classes of package com.weather.dal2.locations:
//            SavedLocationsSnapshot, ActiveLocation, SavedLocation

public final class LocationChange extends AbstractPostable
    implements Serializable
{
    public static final class Flags extends Enum
    {

        private static final Flags $VALUES[];
        public static final Flags ACTIVE;
        public static final Flags ADDRESS_CHANGE;
        public static final Flags FOLLOW_ME_ACTIVATED;
        public static final Flags FOLLOW_ME_ACTIVATION_FAILURE;
        public static final Flags FOLLOW_ME_CHANGE;
        public static final Flags FOLLOW_ME_CHANGE_ON_LAST_LOCATION;
        public static final Flags FOLLOW_ME_DEACTIVATED;
        public static final Flags INITIAL;
        public static final Flags ITEMS_REMOVED;
        public static final Flags ITEM_ADDED;
        public static final Flags ITEM_REMOVED;
        public static final Flags LIST;
        public static final Flags LIST_CREATED;
        public static final Flags NOTIFICATION_CHANGE;
        public static final Flags SYSTEM_LBS_CHANGED;
        public static final Flags WIDGET_ADDED;

        public static Flags valueOf(String s)
        {
            return (Flags)Enum.valueOf(com/weather/dal2/locations/LocationChange$Flags, s);
        }

        public static Flags[] values()
        {
            return (Flags[])$VALUES.clone();
        }

        static 
        {
            LIST = new Flags("LIST", 0);
            ITEM_REMOVED = new Flags("ITEM_REMOVED", 1);
            ITEMS_REMOVED = new Flags("ITEMS_REMOVED", 2);
            ITEM_ADDED = new Flags("ITEM_ADDED", 3);
            INITIAL = new Flags("INITIAL", 4);
            SYSTEM_LBS_CHANGED = new Flags("SYSTEM_LBS_CHANGED", 5);
            FOLLOW_ME_CHANGE = new Flags("FOLLOW_ME_CHANGE", 6);
            FOLLOW_ME_CHANGE_ON_LAST_LOCATION = new Flags("FOLLOW_ME_CHANGE_ON_LAST_LOCATION", 7);
            FOLLOW_ME_ACTIVATED = new Flags("FOLLOW_ME_ACTIVATED", 8);
            FOLLOW_ME_DEACTIVATED = new Flags("FOLLOW_ME_DEACTIVATED", 9);
            FOLLOW_ME_ACTIVATION_FAILURE = new Flags("FOLLOW_ME_ACTIVATION_FAILURE", 10);
            ACTIVE = new Flags("ACTIVE", 11);
            WIDGET_ADDED = new Flags("WIDGET_ADDED", 12);
            NOTIFICATION_CHANGE = new Flags("NOTIFICATION_CHANGE", 13);
            LIST_CREATED = new Flags("LIST_CREATED", 14);
            ADDRESS_CHANGE = new Flags("ADDRESS_CHANGE", 15);
            $VALUES = (new Flags[] {
                LIST, ITEM_REMOVED, ITEMS_REMOVED, ITEM_ADDED, INITIAL, SYSTEM_LBS_CHANGED, FOLLOW_ME_CHANGE, FOLLOW_ME_CHANGE_ON_LAST_LOCATION, FOLLOW_ME_ACTIVATED, FOLLOW_ME_DEACTIVATED, 
                FOLLOW_ME_ACTIVATION_FAILURE, ACTIVE, WIDGET_ADDED, NOTIFICATION_CHANGE, LIST_CREATED, ADDRESS_CHANGE
            });
        }

        private Flags(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String LOCATION_CHANGE_EXTRA = "com.weather.Weather.LOCATION_CHANGE_EXTRA";
    public static final String LOCATION_CHANGE_INTENT = "com.weather.Weather.LOCATION_CHANGE";
    private static final String TAG = "LocationChange";
    private static final long serialVersionUID = 0x3bc0aa0a8dedff8cL;
    private final EnumSet flags;
    private final SavedLocation location;
    private final SavedLocationsSnapshot snapshot = new SavedLocationsSnapshot();

    private LocationChange(EnumSet enumset, SavedLocation savedlocation)
    {
        flags = EnumSet.copyOf(enumset);
        location = savedlocation;
    }

    static void broadcast(EnumSet enumset, SavedLocation savedlocation)
    {
        if (ActiveLocation.getInstance().normalize())
        {
            enumset.add(Flags.ACTIVE);
        }
        enumset = newLocationChange(enumset, savedlocation);
        enumset.setOriginTag("LocationChange");
        LogUtil.method("LocationChange", LoggingMetaTags.TWC_DAL_LOCATIONS, "broadcast", new Object[] {
            enumset
        });
        DataAccessLayer.BUS.post(enumset);
        savedlocation = new Intent("com.weather.Weather.LOCATION_CHANGE");
        savedlocation.putExtra("com.weather.Weather.LOCATION_CHANGE_EXTRA", enumset);
        AbstractTwcApplication.getRootContext().sendBroadcast(savedlocation);
    }

    static LocationChange newLocationChange(EnumSet enumset)
    {
        return new LocationChange(enumset, null);
    }

    static LocationChange newLocationChange(EnumSet enumset, SavedLocation savedlocation)
    {
        return new LocationChange(enumset, savedlocation);
    }

    public LocationChange getActiveLocation()
    {
        return newLocationChange(EnumSet.of(Flags.ACTIVE, Flags.INITIAL), ActiveLocation.getInstance().getLocation());
    }

    public EnumSet getFlags()
    {
        return EnumSet.copyOf(flags);
    }

    public SavedLocation getLocation()
    {
        return location;
    }

    public SavedLocationsSnapshot getSnapshot()
    {
        return snapshot;
    }

    public String toString()
    {
        return (new StringBuilder()).append(flags).append(" loc:").append(location).toString();
    }
}
