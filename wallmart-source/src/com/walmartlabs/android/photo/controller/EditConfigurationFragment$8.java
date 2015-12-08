// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationProductsView;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            EditConfigurationFragment

class val.products
    implements com.walmartlabs.android.photo.util.task.humbnailsCallback
{

    final EditConfigurationFragment this$0;
    final List val$products;
    final PhotoSpecification val$specification;

    public void onRendered(Map map)
    {
        if (val$specification.equals(EditConfigurationFragment.access$200(EditConfigurationFragment.this)))
        {
            EditConfigurationFragment.access$300(EditConfigurationFragment.this).setThumbnails(map);
            EditConfigurationFragment.access$300(EditConfigurationFragment.this).setWarnings(EditConfigurationFragment.access$600(EditConfigurationFragment.this, val$specification, val$products));
        }
    }

    oductsView()
    {
        this$0 = final_editconfigurationfragment;
        val$specification = photospecification;
        val$products = List.this;
        super();
    }
}
