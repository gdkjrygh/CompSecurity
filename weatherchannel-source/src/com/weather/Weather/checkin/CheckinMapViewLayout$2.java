// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapViewLayout, CheckinMapController

class this._cls0
    implements com.google.android.gms.maps.eListener
{

    final CheckinMapViewLayout this$0;

    public void onCameraChange(CameraPosition cameraposition)
    {
        int i = CheckinMapViewLayout.access$300(CheckinMapViewLayout.this).incrementAndGet();
        CheckinMapViewLayout.access$400(CheckinMapViewLayout.this).setText(String.format("Camera Position: %.3f, %.3f, zoom=%.2f, (%d)", new Object[] {
            Double.valueOf(cameraposition.target.latitude), Double.valueOf(cameraposition.target.longitude), Float.valueOf(cameraposition.zoom), Integer.valueOf(i)
        }));
        LatLngBounds latlngbounds = CheckinMapViewLayout.access$500(CheckinMapViewLayout.this).getProjection().getVisibleRegion().latLngBounds;
        CheckinMapViewLayout.access$600(CheckinMapViewLayout.this).setText(String.format("Visible Bounds: sw=%.3f, %.3f, ne=%.3f, %.3f", new Object[] {
            Double.valueOf(latlngbounds.southwest.latitude), Double.valueOf(latlngbounds.southwest.longitude), Double.valueOf(latlngbounds.northeast.latitude), Double.valueOf(latlngbounds.northeast.longitude)
        }));
        controller.updateCheckins();
        CheckinMapViewLayout.access$702(CheckinMapViewLayout.this, cameraposition.target.latitude);
        CheckinMapViewLayout.access$802(CheckinMapViewLayout.this, cameraposition.target.longitude);
    }

    eListener()
    {
        this$0 = CheckinMapViewLayout.this;
        super();
    }
}
