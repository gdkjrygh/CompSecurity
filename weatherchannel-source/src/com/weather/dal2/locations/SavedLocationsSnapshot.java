// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.weather.dal2.locations:
//            FollowMeSnapshot, FixedLocationsSnapshot, WidgetLocationsSnapshot, ActiveLocation, 
//            SavedLocation

public class SavedLocationsSnapshot
    implements Serializable
{

    private static final String TAG = "SavedLocationsSnapshot";
    private static final long serialVersionUID = 0x3bc0aa0a8dedff8cL;
    private final SavedLocation active = ActiveLocation.getInstance().getLocation();
    private final FixedLocationsSnapshot fixed = new FixedLocationsSnapshot();
    private final FollowMeSnapshot followMe = new FollowMeSnapshot();
    private final WidgetLocationsSnapshot widget = new WidgetLocationsSnapshot();

    public SavedLocationsSnapshot()
    {
    }

    public FixedLocationsSnapshot fixed()
    {
        return fixed;
    }

    public FollowMeSnapshot followMe()
    {
        return followMe;
    }

    public SavedLocation getActiveLocation()
    {
        return active;
    }

    public List getFixedLocations()
    {
        return fixed.viewLocations();
    }

    public SavedLocation getFollowMeLocation()
    {
        return followMe.getLocation();
    }

    public List getWidgetLocations()
    {
        return widget.viewLocations();
    }

    public String toString()
    {
        return (new StringBuilder()).append("SavedLocationsSnapshot{followMe=").append(followMe).append(", widget=").append(widget).append(", fixed=").append(fixed).append(", active=").append(active).append('}').toString();
    }

    public WidgetLocationsSnapshot widget()
    {
        return widget;
    }
}
