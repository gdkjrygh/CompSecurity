// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.text.TextUtils;
import com.arubanetworks.meridian.editor.EditorKey;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapController, InStoreMapMarkerView

class val.storeId
    implements dCallback
{

    final InStoreMapController this$0;
    final String val$storeId;

    public void onEnabled(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            showStoreMap();
            InStoreMapController.access$402(InStoreMapController.this, EditorKey.forMap(s, InStoreMapController.access$500(InStoreMapController.this)));
            if (mMapView != null)
            {
                mMapView.setMapKey(InStoreMapController.access$400(InStoreMapController.this));
            }
            InStoreMapController.access$600(InStoreMapController.this, val$storeId);
            return;
        } else
        {
            onMapDisabled();
            return;
        }
    }

    dCallback()
    {
        this$0 = final_instoremapcontroller;
        val$storeId = String.this;
        super();
    }
}
