// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.whatsapp:
//            ea, App, a81

public class GoogleMapView2 extends MapView
{

    private static final String z[];
    private SensorManager b;
    private float c[];
    private Display d;
    private long e;
    private float f[];
    private int g;
    private SensorEventListener h;
    private boolean i;
    private float j;
    private float k;
    private float l[];
    private float m;

    public GoogleMapView2(Context context)
    {
        super(context);
        g = 2;
        l = new float[16];
        c = new float[3];
        f = new float[3];
        h = new ea(this);
        a(context);
    }

    public GoogleMapView2(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = 2;
        l = new float[16];
        c = new float[3];
        f = new float[3];
        h = new ea(this);
        a(context);
    }

    public GoogleMapView2(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = 2;
        l = new float[16];
        c = new float[3];
        f = new float[3];
        h = new ea(this);
        a(context);
    }

    public GoogleMapView2(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context, googlemapoptions);
        g = 2;
        l = new float[16];
        c = new float[3];
        f = new float[3];
        h = new ea(this);
        a(context);
    }

    private float a(float f1, float f2)
    {
label0:
        {
label1:
            {
                float f3 = 1.0F;
                int i1 = App.am;
                long l1 = System.currentTimeMillis();
                float f4 = (float)(l1 - e) / 400F;
                if (f4 <= 1.0F)
                {
                    f3 = f4;
                }
                e = l1;
                if (Math.abs(f1 - f2) < 180F)
                {
                    if (Math.abs(f1 - f2) > 60F)
                    {
                        f4 = f1;
                        if (i1 == 0)
                        {
                            break label1;
                        }
                    }
                    f4 = (f1 - f2) * f3 + f2;
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (360D - (double)Math.abs(f1 - f2) > 60D)
                {
                    f4 = f1;
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                if (f2 > f1)
                {
                    f4 = ((((360F + f1) - f2) % 360F) * f3 + f2 + 360F) % 360F;
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                f4 = ((f2 - f3 * (((360F - f1) + f2) % 360F)) + 360F) % 360F;
            }
            return f4;
        }
        return f4;
    }

    public static float a(float f1, float f2, float f3)
    {
        return Math.max(Math.min(f1, f3), f2);
    }

    static float a(GoogleMapView2 googlemapview2, float f1)
    {
        googlemapview2.k = f1;
        return f1;
    }

    static float a(GoogleMapView2 googlemapview2, float f1, float f2)
    {
        return googlemapview2.a(f1, f2);
    }

    static int a(GoogleMapView2 googlemapview2, int i1)
    {
        googlemapview2.g = i1;
        return i1;
    }

    public static LatLng a(LatLng latlng, double d1, double d2)
    {
        double d4 = d1 / 6378137D;
        d2 = Math.toRadians(d2);
        double d6 = Math.toRadians(latlng.latitude);
        d1 = Math.toRadians(latlng.longitude);
        double d3 = Math.cos(d4);
        d4 = Math.sin(d4);
        double d5 = Math.sin(d6);
        double d7 = Math.cos(d6);
        d6 = d3 * d5 + d4 * d7 * Math.cos(d2);
        d2 = Math.atan2(d4 * d7 * Math.sin(d2), d3 - d5 * d6);
        return new LatLng(Math.toDegrees(Math.asin(d6)), Math.toDegrees(d2 + d1));
    }

    private void a(Context context)
    {
        b = (SensorManager)context.getSystemService(z[1]);
        d = ((WindowManager)context.getSystemService(z[0])).getDefaultDisplay();
    }

    static float[] a(GoogleMapView2 googlemapview2)
    {
        return googlemapview2.f;
    }

    static float b(GoogleMapView2 googlemapview2)
    {
        return googlemapview2.m;
    }

    static float b(GoogleMapView2 googlemapview2, float f1)
    {
        googlemapview2.j = f1;
        return f1;
    }

    static float c(GoogleMapView2 googlemapview2)
    {
        return googlemapview2.j;
    }

    static float[] d(GoogleMapView2 googlemapview2)
    {
        return googlemapview2.c;
    }

    static int e(GoogleMapView2 googlemapview2)
    {
        return googlemapview2.g;
    }

    static Display f(GoogleMapView2 googlemapview2)
    {
        return googlemapview2.d;
    }

    static float[] g(GoogleMapView2 googlemapview2)
    {
        return googlemapview2.l;
    }

    static float h(GoogleMapView2 googlemapview2)
    {
        return googlemapview2.k;
    }

    public void a()
    {
        int i1 = App.am;
        g;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 37
    //                   1 46
    //                   2 55;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        setLocationMode(1);
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        setLocationMode(0);
        if (i1 == 0) goto _L1; else goto _L4
_L4:
        setLocationMode(1);
        return;
    }

    public void a(int i1)
    {
    }

    public void b()
    {
        if (b != null)
        {
            b.unregisterListener(h);
        }
    }

    public void c()
    {
        if (b != null)
        {
            android.hardware.Sensor sensor = b.getDefaultSensor(11);
            boolean flag;
            if (sensor != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = flag;
            if (sensor != null)
            {
                b.registerListener(h, sensor, 16000);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (g != 2)
        {
            g = 2;
            a(g);
        }
        return super.dispatchTouchEvent(motionevent);
    }

    public void setLocationMode(int i1)
    {
        CameraPosition cameraposition;
        int j1;
        j1 = App.am;
        cameraposition = getMap().getCameraPosition();
        i1;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 41
    //                   1 192
    //                   2 290;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (!i) goto _L1; else goto _L5
_L5:
        Object obj;
        m = cameraposition.zoom;
        a(0);
        obj = getMap().getMyLocation();
        if (obj == null) goto _L7; else goto _L6
_L6:
        obj = new LatLng(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude());
        if (j1 == 0) goto _L8; else goto _L7
_L7:
        obj = cameraposition.target;
_L8:
        if (obj != null)
        {
            obj = a(((LatLng) (obj)), 50D, j);
            obj = CameraPosition.builder().tilt(a(k, 0.0F, 67.5F)).bearing(j).zoom(Math.max(m, 15F)).target(((LatLng) (obj))).build();
            getMap().animateCamera(CameraUpdateFactory.newCameraPosition(((CameraPosition) (obj))));
        }
        postDelayed(new a81(this), 1000L);
        if (j1 == 0) goto _L1; else goto _L3
_L3:
        obj = getMap().getMyLocation();
        if (obj == null) goto _L10; else goto _L9
_L9:
        obj = new LatLng(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude());
        g = 1;
        if (j1 == 0) goto _L11; else goto _L10
_L10:
        obj = cameraposition.target;
        g = 2;
_L11:
        obj = CameraPosition.builder().target(((LatLng) (obj))).zoom(cameraposition.zoom).tilt(0.0F).bearing(0.0F).build();
        getMap().animateCamera(CameraUpdateFactory.newCameraPosition(((CameraPosition) (obj))));
        a(g);
        if (j1 == 0) goto _L1; else goto _L4
_L4:
        g = 2;
        a(2);
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[2];
        obj = "\036ljFb\036";
        byte1 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i1] = ((String) (obj));
                i1 = 1;
                obj = "\032`jQb\033";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 168
    //                   3 173;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_173;
_L3:
        byte byte0 = 13;
_L9:
        obj[j1] = (char)(byte0 ^ c1);
        j1++;
          goto _L8
_L4:
        byte0 = 105;
          goto _L9
_L5:
        byte0 = 5;
          goto _L9
_L6:
        byte0 = 4;
          goto _L9
        byte0 = 34;
          goto _L9
    }
}
