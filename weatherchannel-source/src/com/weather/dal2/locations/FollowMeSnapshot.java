// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import java.io.Serializable;

// Referenced classes of package com.weather.dal2.locations:
//            FollowMe, SavedLocation

public class FollowMeSnapshot
    implements Serializable
{

    private static final long serialVersionUID = 0x3bc0aa0a8dedff8cL;
    private final SavedLocation followMeLocation = FollowMe.getInstance().getLocation();

    public FollowMeSnapshot()
    {
    }

    public SavedLocation getLocation()
    {
        return followMeLocation;
    }

    public boolean hasNotifications()
    {
        return followMeLocation != null && followMeLocation.hasNotifications();
    }

    public boolean hasWidgets()
    {
        return followMeLocation != null && followMeLocation.hasWidgets();
    }
}
