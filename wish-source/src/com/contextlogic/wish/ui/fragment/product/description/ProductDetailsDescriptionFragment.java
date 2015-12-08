// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.description;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;

public class ProductDetailsDescriptionFragment extends BaseContentFragment
{

    public static final String ARG_DESCRIPTION = "ArgDescription";
    public static final String ARG_FROM_CART = "ArgFromCart";
    public static final String ARG_TITLE = "ArgTitle";
    private boolean fromCart;
    private String productDescription;
    private String title;

    public ProductDetailsDescriptionFragment()
    {
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.ProductDescription;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f030079;
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(title);
        ((TextView)view.findViewById(0x7f0d0253)).setText(productDescription);
    }

    public boolean onBackPressed()
    {
        final RootActivity rootActivity = (RootActivity)getActivity();
        if (fromCart && rootActivity != null)
        {
            rootActivity.post(new Runnable() {

                final ProductDetailsDescriptionFragment this$0;
                final RootActivity val$rootActivity;

                public void run()
                {
                    rootActivity.showCart(null, null, null);
                }

            
            {
                this$0 = ProductDetailsDescriptionFragment.this;
                rootActivity = rootactivity;
                super();
            }
            });
        }
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        productDescription = getArguments().getString("ArgDescription");
        title = getArguments().getString("ArgTitle");
        fromCart = getArguments().getBoolean("ArgFromCart", false);
    }

    public boolean useCanvasBackground()
    {
        return false;
    }
}
