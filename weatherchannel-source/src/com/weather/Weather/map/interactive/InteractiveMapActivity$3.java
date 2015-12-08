// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;

// Referenced classes of package com.weather.Weather.map.interactive:
//            InteractiveMapActivity

class this._cls0 extends MyLocationOverlay
{

    final InteractiveMapActivity this$0;

    public void onLocationChanged(Location location)
    {
        this;
        JVM INSTR monitorenter ;
        super.onLocationChanged(location);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        location;
        Log.w("InteractiveMapActivity", "MyLocation error!");
        if (true) goto _L2; else goto _L1
_L1:
        location;
        throw location;
    }

    (Context context, MapView mapview)
    {
        this$0 = InteractiveMapActivity.this;
        super(context, mapview);
    }
}
