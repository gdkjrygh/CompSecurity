// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.location.Location;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.LatLng;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

class this._cls0
    implements com.walmartlabs.storelocator.tionCallback
{

    final WalmartLocationService this$0;

    public void onError(int i)
    {
        WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("onError: ").append(i).toString());
        if (!WalmartLocationService.access$100(WalmartLocationService.this))
        {
            return;
        }
        i;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 68
    //                   2 60;
           goto _L1 _L2 _L1
_L1:
        WalmartLocationService.access$300(WalmartLocationService.this);
        return;
_L2:
        WalmartLocationService.access$402(WalmartLocationService.this, true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onError(ConnectionResult connectionresult)
    {
        WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("onError: ").append(connectionresult.toString()).toString());
        if (!WalmartLocationService.access$100(WalmartLocationService.this))
        {
            return;
        } else
        {
            WalmartLocationService.access$300(WalmartLocationService.this);
            return;
        }
    }

    public void onFoundLocation(LatLng latlng, Location location)
    {
        WLog.d(WalmartLocationService.TAG, "found location");
        if (!WalmartLocationService.access$100(WalmartLocationService.this))
        {
            return;
        } else
        {
            WalmartLocationService.access$200(WalmartLocationService.this, new cationData(latlng, location));
            return;
        }
    }

    public void onStarted()
    {
        WLog.d(WalmartLocationService.TAG, "getting location");
    }

    cationData()
    {
        this$0 = WalmartLocationService.this;
        super();
    }
}
