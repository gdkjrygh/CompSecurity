// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreViewPresenter, StoreMapController

class this._cls0
    implements com.google.android.gms.maps.ngeListener
{

    final StoreViewPresenter this$0;

    public void onCameraChange(CameraPosition cameraposition)
    {
        if (!StoreViewPresenter.access$2000(StoreViewPresenter.this).isInCircle(cameraposition.target))
        {
            StoreViewPresenter.access$2100(StoreViewPresenter.this, cameraposition.target, false, false, false);
        }
    }

    geListener()
    {
        this$0 = StoreViewPresenter.this;
        super();
    }
}
