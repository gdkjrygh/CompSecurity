// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.configuration;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

// Referenced classes of package com.walmartlabs.android.photo.view.configuration:
//            OrderConfigurationProductsView

public class OrderConfigurationView extends RelativeLayout
{

    private OrderConfigurationProductsView mProductsView;

    public OrderConfigurationView(Context context)
    {
        super(context);
    }

    public OrderConfigurationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OrderConfigurationView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public OrderConfigurationProductsView getProductsView()
    {
        return mProductsView;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mProductsView = (OrderConfigurationProductsView)findViewById(com.walmartlabs.android.photo.R.id.products_layout);
    }
}
