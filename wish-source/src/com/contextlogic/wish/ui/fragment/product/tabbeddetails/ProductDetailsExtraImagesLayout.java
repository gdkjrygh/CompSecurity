// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.product.photos.ProductPhotosFragment;
import java.util.ArrayList;

public class ProductDetailsExtraImagesLayout extends FrameLayout
{

    private TextView count;

    public ProductDetailsExtraImagesLayout(Context context)
    {
        this(context, null);
    }

    public ProductDetailsExtraImagesLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        count = (TextView)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03007b, this).findViewById(0x7f0d0257);
    }

    public void setProduct(final WishProduct product, final boolean isAlreadyModal)
    {
        int i = product.getExtraPhotos().size();
        count.setText(Integer.toString(i + 1));
        setOnClickListener(new android.view.View.OnClickListener() {

            final ProductDetailsExtraImagesLayout this$0;
            final boolean val$isAlreadyModal;
            final WishProduct val$product;

            public void onClick(View view)
            {
                boolean flag = false;
                (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_EXTRA_PHOTOS.getValue()), product.getProductId(), null, null);
                view = new ProductPhotosFragment();
                Object obj = new Bundle();
                ((Bundle) (obj)).putSerializable("ArgProduct", product);
                ((Bundle) (obj)).putInt("ArgStartIndex", 0);
                view.setArguments(((Bundle) (obj)));
                obj = (RootActivity)getContext();
                if (!isAlreadyModal)
                {
                    flag = true;
                }
                ((RootActivity) (obj)).setModalContentFragment(view, flag);
            }

            
            {
                this$0 = ProductDetailsExtraImagesLayout.this;
                product = wishproduct;
                isAlreadyModal = flag;
                super();
            }
        });
    }
}
