// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.walmart.android.service.storesearch.AisleLocations;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapController, AislePositions, AisleMapTransform, SourceDataMapper

class this._cls0
    implements oadCallback
{

    final InStoreMapController this$0;

    public void onAisleFailed()
    {
        onMapFailed();
    }

    public void onAisleLocations(AisleLocations aislelocations)
    {
        aislelocations = new AislePositions(aislelocations);
        mAisleMapTransform.setAislePositions(aislelocations);
        mSourceDataMapper.setAislePositions(aislelocations);
        if (InStoreMapController.access$700(InStoreMapController.this) != null)
        {
            InStoreMapController.access$700(InStoreMapController.this).onAislesLoaded();
        }
    }

    adingCallbacks()
    {
        this$0 = InStoreMapController.this;
        super();
    }
}
