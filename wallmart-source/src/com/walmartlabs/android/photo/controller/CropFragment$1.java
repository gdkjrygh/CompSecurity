// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.support.v4.app.FragmentManager;
import android.view.View;
import com.walmartlabs.android.photo.model.order.Crop;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.view.crop.CropView;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            CropFragment

class this._cls0
    implements android.view.tener
{

    final CropFragment this$0;

    public void onClick(View view)
    {
        view = CropFragment.access$000(CropFragment.this).getCurrentCrop();
        view = new Crop(view.etLeft(), view.etTop(), view.etRight(), view.etBottom());
        ProductConfiguration productconfiguration = CropFragment.access$200(CropFragment.this).getOrCreateConfigurationForProduct(CropFragment.access$100(CropFragment.this));
        if (productconfiguration.getQuantity() == 0)
        {
            productconfiguration.incrementQuantity();
        }
        productconfiguration.setCrop(view);
        getFragmentManager().popBackStack();
    }

    ration()
    {
        this$0 = CropFragment.this;
        super();
    }
}
