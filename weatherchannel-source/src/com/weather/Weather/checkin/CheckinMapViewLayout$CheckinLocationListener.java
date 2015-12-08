// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.location.Location;
import android.widget.TextView;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapViewLayout

private class <init>
    implements LocationListener
{

    final CheckinMapViewLayout this$0;

    public void onLocationChanged(Location location)
    {
        CheckinMapViewLayout.access$900(CheckinMapViewLayout.this).setText(String.format("My Location= %.3f, %.3f", new Object[] {
            Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())
        }));
    }

    private ()
    {
        this$0 = CheckinMapViewLayout.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
