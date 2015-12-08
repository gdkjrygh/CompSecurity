// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import java.io.Serializable;

// Referenced classes of package com.weather.dal.locations:
//            LocationItem, TwcLocation, LocationItemOptions

public final class FollowMeStatus
    implements Serializable
{

    private static final long serialVersionUID = 0x41d183b7ad548c0fL;
    private final LocationItem item;
    private final State state;

    FollowMeStatus(State state1, LocationItem locationitem)
    {
        state = state1;
        item = locationitem;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FollowMeStatus)obj;
            if (item == null)
            {
                if (((FollowMeStatus) (obj)).item != null)
                {
                    return false;
                }
            } else
            if (!item.equals(((FollowMeStatus) (obj)).item))
            {
                return false;
            }
            if (state != ((FollowMeStatus) (obj)).state)
            {
                return false;
            }
        }
        return true;
    }

    public LocationItem getItem()
    {
        return item;
    }

    public TwcLocation getLocation()
    {
        return item.getLocation();
    }

    public LocationItemOptions getOptions()
    {
        return item.getOptions();
    }

    public State getState()
    {
        return state;
    }

    public int hashCode()
    {
    /* block-local class not found */
    class State {}

        return (item.hashCode() + 31) * 31 + state.hashCode();
    }
}
