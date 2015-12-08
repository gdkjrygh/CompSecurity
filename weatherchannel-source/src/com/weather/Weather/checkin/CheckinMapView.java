// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import com.weather.dal2.locations.SavedLocation;
import com.weather.util.geometry.LatLngBounds;
import java.util.Collection;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinClusterItem

public interface CheckinMapView
{

    public abstract void addClusterItem(CheckinClusterItem checkinclusteritem);

    public abstract void animateButtonsSlidingIn();

    public abstract void displayFullGeohashDebugText(String s);

    public abstract void displayGeohashDebugText(String s);

    public abstract LatLngBounds getLatLngBounds();

    public abstract void hideCheckinButtons();

    public abstract void moveMapToLocation(SavedLocation savedlocation);

    public abstract void moveMapToLocationIfNotFollowmeUpdate(SavedLocation savedlocation, boolean flag);

    public abstract void pause();

    public abstract void resume();

    public abstract void setDay(boolean flag);

    public abstract void setFog(boolean flag);

    public abstract void setHail(boolean flag);

    public abstract void setNight(boolean flag);

    public abstract void setThunder(boolean flag);

    public abstract void setWinter(boolean flag);

    public abstract void showButtons();

    public abstract void showLockout(long l);

    public abstract void updateClusterItems(Collection collection);
}
