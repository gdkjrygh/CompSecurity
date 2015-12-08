// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapController, AisleMapTransform

class this._cls0
    implements istener
{

    final InStoreMapController this$0;

    public void onMapLoadFail(Throwable throwable)
    {
        WLog.d(InStoreMapController.access$300(), (new StringBuilder()).append("Failed to load store map ").append(throwable).toString());
        onMapFailed();
    }

    public void onMapLoadFinish()
    {
        WLog.d(InStoreMapController.access$300(), "Finished loading map");
        if (mAisleMapTransform.hasMapBounds())
        {
            onMapLoaded();
            zoomMap();
            return;
        } else
        {
            WLog.e(InStoreMapController.access$300(), "Map has no placemarker bounds");
            onMapFailed();
            return;
        }
    }

    public void onMapLoadStart()
    {
        WLog.d(InStoreMapController.access$300(), "Starting to load map");
        mAisleMapTransform.resetMapBounds();
    }

    public void onMapReloadFinish()
    {
        WLog.d(InStoreMapController.access$300(), "Finished reloading map");
        onMapReloaded();
    }

    public void onMapReloadStart()
    {
        WLog.d(InStoreMapController.access$300(), "Map reload start");
        onMapReloading();
    }

    public void onMapSource(float f, float f1, float f2, float f3)
    {
        mAisleMapTransform.setMapSource(f, f1, f2, f3);
    }

    istener()
    {
        this$0 = InStoreMapController.this;
        super();
    }
}
