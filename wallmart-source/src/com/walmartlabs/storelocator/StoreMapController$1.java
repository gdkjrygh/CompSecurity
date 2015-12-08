// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.google.android.gms.maps.model.Marker;
import java.util.HashMap;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreMapController, StoreData, StorePickerListener

class this._cls0
    implements com.google.android.gms.maps.wClickListener
{

    final StoreMapController this$0;

    public void onInfoWindowClick(Marker marker)
    {
        if (StoreMapController.access$000(StoreMapController.this) != null)
        {
            marker = (StoreData)StoreMapController.access$100(StoreMapController.this).get(marker.getId());
            if (marker != null)
            {
                StoreMapController.access$000(StoreMapController.this).onStoreClicked(marker);
            }
        }
    }

    ClickListener()
    {
        this$0 = StoreMapController.this;
        super();
    }
}
