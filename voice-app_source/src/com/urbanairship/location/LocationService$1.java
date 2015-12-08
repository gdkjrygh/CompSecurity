// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.location.Criteria;
import android.location.Location;
import android.os.AsyncTask;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.LocationOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.LocationEvent;
import java.util.Locale;

// Referenced classes of package com.urbanairship.location:
//            LocationService, LastLocationFinder

class this._cls0 extends AsyncTask
{

    final LocationService this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        avoid = UAirship.shared().getAirshipConfigOptions().locationOptions;
        avoid = LocationService.access$000(LocationService.this).getLastBestLocation(((LocationOptions) (avoid)).updateIntervalSeconds * 1000L, criteria);
        if (avoid != null)
        {
            Logger.info(String.format(Locale.US, "Last best location found at lat: %f, long: %f with provider: %s", new Object[] {
                Double.valueOf(avoid.getLatitude()), Double.valueOf(avoid.getLongitude()), avoid.getProvider()
            }));
            LocationEvent locationevent = new LocationEvent(avoid, com.urbanairship.analytics.teType.CONTINUOUS, criteria.getAccuracy(), UAirship.shared().getAirshipConfigOptions().locationOptions.updateIntervalMeters);
            UAirship.shared().getAnalytics().addEvent(locationevent);
            LocationService.access$100(LocationService.this, avoid);
        } else
        {
            Logger.info("No last best location found.");
        }
        return null;
    }

    ateType()
    {
        this$0 = LocationService.this;
        super();
    }
}
