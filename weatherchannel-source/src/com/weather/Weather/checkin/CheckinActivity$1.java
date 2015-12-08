// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import com.weather.Weather.app.FlagshipApplication;
import com.weather.commons.locations.LocationManager;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinActivity, CheckinMapController

class this._cls0
    implements Runnable
{

    final CheckinActivity this$0;

    public void run()
    {
        com.weather.dal2.locations.SavedLocation savedlocation = FlagshipApplication.getInstance().getLocationManager().getCurrentLocation();
        if (savedlocation != null)
        {
            mapController.moveToLocation(savedlocation);
        }
    }

    er()
    {
        this$0 = CheckinActivity.this;
        super();
    }
}
