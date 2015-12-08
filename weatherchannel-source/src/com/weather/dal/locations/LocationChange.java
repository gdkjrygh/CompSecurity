// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.EnumSet;

// Referenced classes of package com.weather.dal.locations:
//            SavedLocationsSnapshot, FollowMeStatus, TwcLocation

public final class LocationChange
    implements Serializable
{

    public static final EnumSet ALL;
    private static final long serialVersionUID = 0xb7ba5c8cbc53ca9L;
    private final EnumSet flags;
    private final int index;
    private final TwcLocation location;
    private final SavedLocationsSnapshot snapshot;

    private LocationChange(SavedLocationsSnapshot savedlocationssnapshot, EnumSet enumset, int i, TwcLocation twclocation)
    {
        flags = EnumSet.copyOf(enumset);
        index = i;
        snapshot = savedlocationssnapshot;
        location = twclocation;
    }

    static LocationChange newLocationChange(SavedLocationsSnapshot savedlocationssnapshot, EnumSet enumset)
    {
        return new LocationChange(savedlocationssnapshot, enumset, -1, null);
    }

    static LocationChange newLocationChange(SavedLocationsSnapshot savedlocationssnapshot, EnumSet enumset, int i)
    {
        return new LocationChange(savedlocationssnapshot, enumset, i, null);
    }

    static LocationChange newLocationChange(SavedLocationsSnapshot savedlocationssnapshot, EnumSet enumset, int i, TwcLocation twclocation)
    {
        return new LocationChange(savedlocationssnapshot, enumset, i, twclocation);
    }

    public EnumSet getFlags()
    {
        return EnumSet.copyOf(flags);
    }

    public int getIndex()
    {
        Preconditions.checkState(shouldHaveIndex());
        boolean flag;
        if (index != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return index;
    }

    public int getIndexUnchecked()
    {
        return index;
    }

    public TwcLocation getLocation()
    {
        Preconditions.checkState(shouldHaveLocation());
        boolean flag;
        if (location != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return location;
    }

    public TwcLocation getLocationUnchecked()
    {
        return location;
    }

    public SavedLocationsSnapshot getSnapshot()
    {
        return snapshot;
    }

    public boolean shouldHaveIndex()
    {
    /* block-local class not found */
    class Flags {}

        return flags.contains(Flags.NICKNAME) || flags.contains(Flags.UPDATED);
    }

    public boolean shouldHaveLocation()
    {
        return flags.contains(Flags.NOTIFICATION_ITEM_REMOVED) || flags.contains(Flags.ITEM_REMOVED);
    }

    public String toString()
    {
        String s = "";
        Object obj;
        String s1;
        String s2;
        if (shouldHaveIndex())
        {
            if (index == -2)
            {
                s = (new StringBuilder()).append(", index:").append("FOLLOW_ME").toString();
            } else
            if (index == -1)
            {
                s = (new StringBuilder()).append(", index:").append("NONE(!)").toString();
            } else
            {
                s = (new StringBuilder()).append(", index:").append(snapshot.getLocationFromList(index).getName()).toString();
            }
        }
        s1 = "FM:null";
        obj = snapshot.getFollowMeStatus();
        if (obj != null)
        {
            s1 = (new StringBuilder()).append("FM:").append(((FollowMeStatus) (obj)).getLocation().getName()).toString();
        }
        s2 = "C:null(!)";
        if (snapshot.hasLocations())
        {
            s2 = (new StringBuilder()).append("C:").append(snapshot.getCurrentLocation().getName()).toString();
        }
        obj = "";
        if (shouldHaveLocation())
        {
            if (location != null)
            {
                obj = (new StringBuilder()).append(", location:").append(location.getName()).toString();
            } else
            {
                obj = ", location:null(!)";
            }
        }
        return (new StringBuilder()).append(flags).append(s).append(((String) (obj))).append('(').append(s1).append(", ").append(s2).append(')').toString();
    }

    static 
    {
        ALL = EnumSet.of(Flags.HOME, new Flags[] {
            Flags.CURRENT, Flags.WORK, Flags.SCHOOL, Flags.FOLLOW_ME_ACTIVATED, Flags.FOLLOW_ME_DEACTIVATED_BY_APP, Flags.LIST, Flags.NOTIFICATION_ITEM_REMOVED, Flags.ITEM_REMOVED, Flags.ITEM_ADDED, Flags.FOLLOW_ME_CHANGE, 
            Flags.INITIAL, Flags.UPDATED, Flags.WIDGET_ID_ADDED, Flags.WIDGET_ID_REMOVED, Flags.FOLLOW_ME_ACTIVATION_FAILURE, Flags.NICKNAME, Flags.TEMPERATURE_NOTIFICATION_REMOVED, Flags.SEVERE_NOTIFICATION_REMOVED, Flags.SEVERE_NOTIFICATION_ADDED, Flags.TEMPERATURE_NOTIFICATION_ADDED, 
            Flags.PICTURE_URL, Flags.NOTIFICATION_CHANGE
        });
    }
}
