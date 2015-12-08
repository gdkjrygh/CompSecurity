// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.view.ViewTreeObserver;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreMapController, StoreFinderConfigurator

class val.map
    implements android.view.obalLayoutListener
{

    final StoreMapController this$0;
    final GoogleMap val$map;

    public void onGlobalLayout()
    {
        com.google.android.gms.maps.CameraUpdate cameraupdate = CameraUpdateFactory.newLatLngBounds(StoreMapController.access$300(StoreMapController.this).getDefaultBounds(), 20);
        val$map.moveCamera(cameraupdate);
        StoreMapController.access$400(StoreMapController.this).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    or()
    {
        this$0 = final_storemapcontroller;
        val$map = GoogleMap.this;
        super();
    }
}
