// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreMapController

class this._cls0
    implements com.google.android.gms.maps.ckListener
{

    final StoreMapController this$0;

    public boolean onMarkerClick(Marker marker)
    {
        StoreMapController.access$202(StoreMapController.this, marker);
        return false;
    }

    kListener()
    {
        this$0 = StoreMapController.this;
        super();
    }
}
