// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.google.common.base.Preconditions;
import com.weather.util.AbstractPostable;

// Referenced classes of package com.weather.dal2.locations:
//            SavedLocationsSnapshot

public class CurrentLocationChangeEvent extends AbstractPostable
{
    public static final class Cause extends Enum
    {

        private static final Cause $VALUES[];
        public static final Cause APP_RESTORE;
        public static final Cause CLICK_THRU;
        public static final Cause FOLLOW_ME;
        public static final Cause LOCATION_ADDED;
        public static final Cause LOCATION_DELETED;
        public static final Cause USER_SELECTED;

        public static Cause valueOf(String s)
        {
            return (Cause)Enum.valueOf(com/weather/dal2/locations/CurrentLocationChangeEvent$Cause, s);
        }

        public static Cause[] values()
        {
            return (Cause[])$VALUES.clone();
        }

        static 
        {
            APP_RESTORE = new Cause("APP_RESTORE", 0);
            USER_SELECTED = new Cause("USER_SELECTED", 1);
            LOCATION_ADDED = new Cause("LOCATION_ADDED", 2);
            LOCATION_DELETED = new Cause("LOCATION_DELETED", 3);
            CLICK_THRU = new Cause("CLICK_THRU", 4);
            FOLLOW_ME = new Cause("FOLLOW_ME", 5);
            $VALUES = (new Cause[] {
                APP_RESTORE, USER_SELECTED, LOCATION_ADDED, LOCATION_DELETED, CLICK_THRU, FOLLOW_ME
            });
        }

        private Cause(String s, int i)
        {
            super(s, i);
        }
    }


    private final Cause cause;
    private final SavedLocationsSnapshot snapshot = new SavedLocationsSnapshot();

    public CurrentLocationChangeEvent(Cause cause1)
    {
        cause = (Cause)Preconditions.checkNotNull(cause1);
    }

    public Cause getCause()
    {
        return cause;
    }

    public SavedLocationsSnapshot getSnapshot()
    {
        return snapshot;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CurrentLocationChangeEvent{snapshot=").append(snapshot).append('}').toString();
    }
}
