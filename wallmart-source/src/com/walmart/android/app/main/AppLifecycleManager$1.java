// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.walmart.android.app.main:
//            AppLifecycleManager

class  extends com.walmartlabs.storelocator.ocationCallbackAdapter
{

    final AppLifecycleManager this$0;

    public void onFoundLocation(LatLng latlng, Location location)
    {
        AppLifecycleManager.access$002(AppLifecycleManager.this, true);
        AppLifecycleManager.access$200(AppLifecycleManager.this, AppLifecycleManager.access$100(AppLifecycleManager.this));
    }

    ocationCallbackAdapter()
    {
        this$0 = AppLifecycleManager.this;
        super();
    }
}
