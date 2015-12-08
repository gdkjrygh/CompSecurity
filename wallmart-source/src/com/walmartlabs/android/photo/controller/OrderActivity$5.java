// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import com.google.android.gms.maps.model.LatLng;
import com.walmartlabs.android.photo.model.user.Store;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            OrderActivity

class val.store
    implements com.google.android.gms.maps.lickListener
{

    final OrderActivity this$0;
    final Store val$store;

    public void onMapClick(LatLng latlng)
    {
        OrderActivity.access$600(OrderActivity.this, val$store);
    }

    ()
    {
        this$0 = final_orderactivity;
        val$store = Store.this;
        super();
    }
}
