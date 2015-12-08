// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import java.util.List;

// Referenced classes of package com.weather.commons.locations:
//            LocationManager

static final class PersistedLocation.isFollowMe
{
    static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys CURRENT_LOCATION;
        public static final Keys FOLLOW_ME;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/commons/locations/LocationManager$LocationPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            CURRENT_LOCATION = new Keys("CURRENT_LOCATION", 0);
            FOLLOW_ME = new Keys("FOLLOW_ME", 1);
            $VALUES = (new Keys[] {
                CURRENT_LOCATION, FOLLOW_ME
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }

    static final class PersistedLocation
    {

        final boolean isFollowMe;
        final String keyTypeCountry;

        public String toString()
        {
            return (new StringBuilder()).append("PersistedLocation{keyTypeCountry='").append(keyTypeCountry).append('\'').append(", isFollowMe=").append(isFollowMe).append('}').toString();
        }

        PersistedLocation(String s, boolean flag)
        {
            LocationManager.LocationPrefs.checkKeyTypeCountry(s);
            keyTypeCountry = s;
            isFollowMe = flag;
        }
    }


    private static final Prefs prefs = new Prefs("LOCATION_PREFS");

    static void checkKeyTypeCountry(String s)
    {
        Preconditions.checkArgument(isValidKeyTypeCountry(s), "%s is not a valid keyTypeCountry", new Object[] {
            s
        });
    }

    static PersistedLocation getCurrentLocation()
    {
        String s = prefs.getString(Keys.CURRENT_LOCATION, "");
        boolean flag = prefs.getBoolean(Keys.FOLLOW_ME, false);
        if (isValidKeyTypeCountry(s))
        {
            return new PersistedLocation(s, flag);
        } else
        {
            return null;
        }
    }

    static boolean isValidKeyTypeCountry(CharSequence charsequence)
    {
        while (charsequence == null || Splitter.on(':').trimResults().omitEmptyStrings().splitToList(charsequence).size() != 3) 
        {
            return false;
        }
        return true;
    }

    static void setPersistedLocation(PersistedLocation persistedlocation)
    {
        LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setPersistedLocation location=%s", new Object[] {
            persistedlocation
        });
        Preconditions.checkNotNull(persistedlocation);
        prefs.getEditor().ring(Keys.CURRENT_LOCATION.toString(), persistedlocation.keyTypeCountry).olean(Keys.FOLLOW_ME.toString(), persistedlocation.isFollowMe).();
    }

    static void setPersistedLocation(SavedLocation savedlocation, boolean flag)
    {
        if (savedlocation == null)
        {
            prefs.clear();
            return;
        } else
        {
            setPersistedLocation(new PersistedLocation(savedlocation.getKeyTypeCountry(), flag));
            return;
        }
    }


    private PersistedLocation.isFollowMe()
    {
    }
}
