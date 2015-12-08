// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.os.Bundle;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationServices;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapViewLayout

private class <init>
    implements com.google.android.gms.common.api.
{

    final CheckinMapViewLayout this$0;

    public void onConnected(Bundle bundle)
    {
        LocationServices.FusedLocationApi.requestLocationUpdates(CheckinMapViewLayout.access$1000(CheckinMapViewLayout.this), CheckinMapViewLayout.access$1100(), CheckinMapViewLayout.access$1200(CheckinMapViewLayout.this));
    }

    public void onConnectionSuspended(int i)
    {
    }

    private Q()
    {
        this$0 = CheckinMapViewLayout.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
