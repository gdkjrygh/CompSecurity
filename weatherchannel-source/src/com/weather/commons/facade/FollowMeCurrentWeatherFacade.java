// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.weather.commons.facade:
//            CurrentWeatherFacade

public class FollowMeCurrentWeatherFacade
{

    public final CurrentWeatherFacade currentWeatherFacade;

    public FollowMeCurrentWeatherFacade(CurrentWeatherFacade currentweatherfacade)
    {
        currentWeatherFacade = (CurrentWeatherFacade)Preconditions.checkNotNull(currentweatherfacade);
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("currentWeatherFacade", currentWeatherFacade).toString();
    }
}
