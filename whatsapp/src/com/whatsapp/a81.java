// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.google.android.gms.maps.GoogleMap;

// Referenced classes of package com.whatsapp:
//            GoogleMapView2

class a81
    implements Runnable
{

    final GoogleMapView2 a;

    a81(GoogleMapView2 googlemapview2)
    {
        a = googlemapview2;
        super();
    }

    public void run()
    {
        a.getMap().stopAnimation();
        GoogleMapView2.a(a, 0);
    }
}
