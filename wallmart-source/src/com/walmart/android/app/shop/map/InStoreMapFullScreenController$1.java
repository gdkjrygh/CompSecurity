// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.arubanetworks.meridian.maps.Marker;
import com.walmartlabs.utils.WLog;
import java.util.Arrays;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapFullScreenController, SourceDataMapper, MappedSections

class this._cls0
    implements this._cls0
{

    final InStoreMapFullScreenController this$0;

    public void onMapTapped()
    {
        WLog.d(InStoreMapFullScreenController.access$000(), "onMapTapped");
        InStoreMapFullScreenController.access$100(InStoreMapFullScreenController.this).onMapTap();
    }

    public void onMarkerTapped(Marker marker)
    {
        WLog.i(InStoreMapFullScreenController.access$000(), (new StringBuilder()).append("Marker selected position:").append(Arrays.toString(marker.getPosition())).append(", anchor:").append(Arrays.toString(marker.getAnchor())).toString());
        if (marker instanceof cess._cls000)
        {
            InStoreMapFullScreenController.access$100(InStoreMapFullScreenController.this).onMarkerTap(mSourceDataMapper.getMappedSections().getData(((s)marker).Section()));
        }
    }

    rkerCallbacks()
    {
        this$0 = InStoreMapFullScreenController.this;
        super();
    }
}
