// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import com.weather.dal2.locations.CurrentLocation;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;

// Referenced classes of package com.weather.Weather.app:
//            NoLocationActivity

class val.followMe
    implements Runnable
{

    final NoLocationActivity this$0;
    final SavedLocation val$followMe;

    public void run()
    {
        CurrentLocation.getInstance().setLocation(val$followMe, "NoLocationActivity.onLocationChange() - FOLLOW_ME_ACTIVATED", com.weather.dal2.locations.Event.Cause.FOLLOW_ME);
        FollowMe.getInstance().setTemperatureNotification(true);
        setResult(-1);
        finish();
    }

    ngeEvent.Cause()
    {
        this$0 = final_nolocationactivity;
        val$followMe = SavedLocation.this;
        super();
    }
}
