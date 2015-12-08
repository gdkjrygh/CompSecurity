// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.editor.Placemark;
import com.arubanetworks.meridian.log.MeridianLogger;
import com.arubanetworks.meridian.maps.MapInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.arubanetworks.meridian.location:
//            LocationProvider, ClientLocationData, MeridianLocation

class b extends LocationProvider
    implements LocationListener
{

    private static final MeridianLogger a;
    private LocationManager b;

    public b(Context context, ClientLocationData clientlocationdata, LocationProvider.a a1)
    {
        super(clientlocationdata, a1);
        b = (LocationManager)context.getApplicationContext().getSystemService("location");
        a();
    }

    private MeridianLocation a(Location location)
    {
        if (location.getAccuracy() > 5F)
        {
            a.i("System location accuracy is %f [need %f]; not using system location", new Object[] {
                Float.valueOf(location.getAccuracy()), Float.valueOf(5F)
            });
            return null;
        }
        float f = (float)((double)location.getAccuracy() / 111131.745D);
        for (Iterator iterator = clientLocationData.getOutdoorAreas().iterator(); iterator.hasNext();)
        {
            Object obj = (Placemark)iterator.next();
            obj = (MapInfo)clientLocationData.getOutdoorAreaMaps().get(((Placemark) (obj)).getKey().getParent());
            PointF pointf = ((MapInfo) (obj)).latLongToMapPoint((float)location.getLatitude(), (float)location.getLongitude());
            RectF rectf = new RectF(pointf.x, pointf.y, pointf.x, pointf.y);
            float f1 = location.getAccuracy() * (float)((MapInfo) (obj)).unitsPerMeter;
            rectf.inset(-f1, -f1);
            if ((new RectF(0.0F, 0.0F, (float)((MapInfo) (obj)).width, (float)((MapInfo) (obj)).height)).contains(pointf.x, pointf.y))
            {
                location = new MeridianLocation();
                location.setMap(((MapInfo) (obj)).key);
                location.setPoint(new PointF(rectf.centerX(), rectf.centerY()));
                location.setAccuracy(rectf.width() / 2.0F);
                return location;
            }
        }

        return null;
    }

    private void a()
    {
        b.requestLocationUpdates("gps", 0L, 0.0F, this);
    }

    public LocationProvider.ProviderType getType()
    {
        return LocationProvider.ProviderType.SYSTEM_PROVIDER;
    }

    public void onLocationChanged(Location location)
    {
        if (location != null)
        {
            updateWithLocation(a(location));
        }
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

    public void shutdown()
    {
        b.removeUpdates(this);
    }

    static 
    {
        a = MeridianLogger.forTag("SystemLocationProvider").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.LOCATION);
    }
}
