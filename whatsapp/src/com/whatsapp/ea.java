// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.whatsapp:
//            App, GoogleMapView2

class ea
    implements SensorEventListener
{

    final GoogleMapView2 a;

    ea(GoogleMapView2 googlemapview2)
    {
        a = googlemapview2;
        super();
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        Location location;
        int i;
        i = App.am;
        location = a.getMap().getMyLocation();
        if (location != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        SensorManager.getRotationMatrixFromVector(GoogleMapView2.g(a), sensorevent.values);
_L15:
        float f;
        float f1;
        float f2;
        int j = GoogleMapView2.f(a).getRotation();
        IllegalArgumentException illegalargumentexception;
        long l;
        long l1;
        try
        {
            l = System.currentTimeMillis();
            l1 = location.getTime();
        }
        // Misplaced declaration of an exception variable
        catch (SensorEvent sensorevent)
        {
            try
            {
                throw sensorevent;
            }
            // Misplaced declaration of an exception variable
            catch (SensorEvent sensorevent)
            {
                throw sensorevent;
            }
        }
        if (l - l1 >= 5000L) goto _L4; else goto _L3
_L3:
        if (!location.hasBearing()) goto _L4; else goto _L5
_L5:
        f = location.getSpeed();
        if ((double)f <= 0.89407999999999999D) goto _L4; else goto _L6
_L6:
        f = location.getBearing();
        if (i == 0) goto _L7; else goto _L4
_L4:
        SensorManager.getOrientation(GoogleMapView2.g(a), GoogleMapView2.d(a));
        f1 = (float)Math.toDegrees(GoogleMapView2.d(a)[0]);
        f = f1;
        f2 = f1;
        j;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 494
    //                   1 501
    //                   2 515
    //                   3 529;
           goto _L8 _L9 _L10 _L11 _L12
_L8:
        f = f1;
_L16:
        if (f < 0.0F)
        {
            f += 360F;
        }
        f1 = (new GeomagneticField((float)location.getLatitude(), (float)location.getLongitude(), (float)location.getAltitude(), location.getTime())).getDeclination() + f;
        f = f1;
        if (f1 >= 360F)
        {
            f = f1 - 360F;
        }
_L7:
        GoogleMapView2.b(a, GoogleMapView2.a(a, f, GoogleMapView2.c(a)));
        if (j == 0 || j == 2)
        {
            try
            {
                GoogleMapView2.a(a, (float)Math.abs(Math.toDegrees(GoogleMapView2.d(a)[1])));
            }
            // Misplaced declaration of an exception variable
            catch (SensorEvent sensorevent)
            {
                throw sensorevent;
            }
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        GoogleMapView2.a(a, (float)Math.abs(Math.toDegrees(GoogleMapView2.d(a)[2])));
        if (GoogleMapView2.e(a) != 0) goto _L1; else goto _L13
_L13:
        sensorevent = GoogleMapView2.a(new LatLng(location.getLatitude(), location.getLongitude()), 50D, GoogleMapView2.c(a));
        sensorevent = CameraPosition.builder().tilt(GoogleMapView2.a(GoogleMapView2.h(a), 0.0F, 67.5F)).bearing(GoogleMapView2.c(a)).zoom(Math.max(GoogleMapView2.b(a), 15F)).target(sensorevent).build();
        a.getMap().moveCamera(CameraUpdateFactory.newCameraPosition(sensorevent));
        return;
        illegalargumentexception;
        if (sensorevent.values.length <= 3) goto _L15; else goto _L14
_L14:
        System.arraycopy(sensorevent.values, 0, GoogleMapView2.a(a), 0, 3);
        SensorManager.getRotationMatrixFromVector(GoogleMapView2.g(a), GoogleMapView2.a(a));
          goto _L15
        sensorevent;
        throw sensorevent;
_L9:
        f = f1;
        if (i == 0) goto _L16; else goto _L10
_L10:
        f1 += 90F;
        f = f1;
        if (i == 0) goto _L16; else goto _L17
_L17:
        f = f1;
_L11:
        f2 = f + 180F;
        f = f2;
        if (i == 0) goto _L16; else goto _L12
_L12:
        f = f2 + 270F;
          goto _L16
        sensorevent;
        try
        {
            throw sensorevent;
        }
        // Misplaced declaration of an exception variable
        catch (SensorEvent sensorevent) { }
        throw sensorevent;
          goto _L15
    }
}
