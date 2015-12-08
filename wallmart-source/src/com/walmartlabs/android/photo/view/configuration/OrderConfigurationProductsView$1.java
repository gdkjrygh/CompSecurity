// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.configuration;

import com.walmartlabs.android.photo.model.products.PhotoProduct;

// Referenced classes of package com.walmartlabs.android.photo.view.configuration:
//            OrderConfigurationProductsView

class val.product
    implements ductViewListener
{

    final OrderConfigurationProductsView this$0;
    final PhotoProduct val$product;

    public void onCrop()
    {
        if (OrderConfigurationProductsView.access$000(OrderConfigurationProductsView.this) != null)
        {
            OrderConfigurationProductsView.access$000(OrderConfigurationProductsView.this).onCropClick(val$product);
        }
    }

    public void onDecrementClick()
    {
        if (OrderConfigurationProductsView.access$000(OrderConfigurationProductsView.this) != null)
        {
            OrderConfigurationProductsView.access$000(OrderConfigurationProductsView.this).onQuantityClick(val$product, -1);
        }
    }

    public void onIncrementClick()
    {
        if (OrderConfigurationProductsView.access$000(OrderConfigurationProductsView.this) != null)
        {
            OrderConfigurationProductsView.access$000(OrderConfigurationProductsView.this).onQuantityClick(val$product, 1);
        }
    }

    oductClickListener()
    {
        this$0 = final_orderconfigurationproductsview;
        val$product = PhotoProduct.this;
        super();
    }
}
