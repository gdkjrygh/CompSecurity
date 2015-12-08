// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.FollowMeCurrentWeatherFacade;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapController, CheckinMapView

class cade
    implements Runnable
{

    final CheckinMapController this$0;
    final FollowMeCurrentWeatherFacade val$change;

    public void run()
    {
        CheckinMapController.access$002(CheckinMapController.this, val$change.currentWeatherFacade);
        if (CheckinMapController.access$000(CheckinMapController.this).isEmpty())
        {
            CheckinMapController.access$100(CheckinMapController.this).setThunder(true);
            CheckinMapController.access$100(CheckinMapController.this).setDay(true);
            CheckinMapController.access$100(CheckinMapController.this).setNight(true);
            CheckinMapController.access$100(CheckinMapController.this).setWinter(true);
            CheckinMapController.access$100(CheckinMapController.this).setHail(true);
            CheckinMapController.access$100(CheckinMapController.this).setFog(true);
            return;
        } else
        {
            CheckinMapController.access$100(CheckinMapController.this).setThunder(CheckinMapController.access$200(CheckinMapController.access$000(CheckinMapController.this).getSkyCode()));
            CheckinMapController.access$100(CheckinMapController.this).setDay(CheckinMapController.access$000(CheckinMapController.this).isDay());
            CheckinMapController.access$100(CheckinMapController.this).setNight(CheckinMapController.access$000(CheckinMapController.this).isNight());
            CheckinMapController.access$100(CheckinMapController.this).setWinter(CheckinMapController.access$300(CheckinMapController.access$000(CheckinMapController.this).getCurrentTempFahrenheit()));
            CheckinMapController.access$100(CheckinMapController.this).setHail(CheckinMapController.access$400(CheckinMapController.access$000(CheckinMapController.this).getSkyCode()));
            CheckinMapController.access$100(CheckinMapController.this).setFog(CheckinMapController.access$500(CheckinMapController.access$000(CheckinMapController.this).getSkyCode(), CheckinMapController.access$000(CheckinMapController.this).getVisibilityInMiles()));
            return;
        }
    }

    cade()
    {
        this$0 = final_checkinmapcontroller;
        val$change = FollowMeCurrentWeatherFacade.this;
        super();
    }
}
