// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.SavedLocationsSnapshot;

// Referenced classes of package com.weather.Weather.app:
//            NoLocationActivity

class shot
    implements Runnable
{

    final NoLocationActivity this$0;
    final SavedLocationsSnapshot val$snapshot;

    public void run()
    {
        com.weather.dal2.locations.SavedLocation savedlocation = val$snapshot.getActiveLocation();
        if (savedlocation != null)
        {
            FixedLocations.getInstance().setNotification(savedlocation, com.weather.dal2.locations.pe.temperature, true);
        }
        setResult(-1);
        finish();
    }

    shot()
    {
        this$0 = final_nolocationactivity;
        val$snapshot = SavedLocationsSnapshot.this;
        super();
    }
}
