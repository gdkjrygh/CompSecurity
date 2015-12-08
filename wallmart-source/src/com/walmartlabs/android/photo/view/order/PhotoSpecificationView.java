// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.order;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.view.order:
//            ProductConfigurationView

public class PhotoSpecificationView extends LinearLayout
{

    private View mEmptyLayout;
    private ImageView mImageView;
    private PhotoSpecification mPhotoSpecification;
    private LinearLayout mProductConfigurationViewsLayout;

    public PhotoSpecificationView(Context context)
    {
        super(context);
    }

    public PhotoSpecificationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void addProductView()
    {
        View view = LayoutInflater.from(getContext()).inflate(com.walmartlabs.android.photo.R.layout.photo_order_product_configuration, mProductConfigurationViewsLayout, false);
        mProductConfigurationViewsLayout.addView(view);
    }

    private void clearProductViews()
    {
        for (int i = 0; i < mProductConfigurationViewsLayout.getChildCount(); i++)
        {
            ((ProductConfigurationView)mProductConfigurationViewsLayout.getChildAt(i)).setModel(null, null);
        }

    }

    private void prepareViews()
    {
        int i;
        if (mPhotoSpecification != null)
        {
            i = mPhotoSpecification.getProductConfigurations().size();
        } else
        {
            i = 0;
        }
        for (; i > mProductConfigurationViewsLayout.getChildCount(); addProductView()) { }
        for (; mProductConfigurationViewsLayout.getChildCount() > i; removeProductView()) { }
    }

    private void removeProductView()
    {
        if (mProductConfigurationViewsLayout.getChildCount() > 0)
        {
            ((ProductConfigurationView)mProductConfigurationViewsLayout.getChildAt(mProductConfigurationViewsLayout.getChildCount() - 1)).setModel(null, null);
            mProductConfigurationViewsLayout.removeViewAt(mProductConfigurationViewsLayout.getChildCount() - 1);
        }
    }

    public PhotoSpecification getModel()
    {
        return mPhotoSpecification;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mImageView = (ImageView)findViewById(com.walmartlabs.android.photo.R.id.image);
        mProductConfigurationViewsLayout = (LinearLayout)findViewById(com.walmartlabs.android.photo.R.id.products_layout);
        mEmptyLayout = findViewById(com.walmartlabs.android.photo.R.id.empty_layout);
    }

    public void reset()
    {
        mImageView.setImageDrawable(null);
        setModel(null);
    }

    public void setBitmapDrawable(PhotoDrawable photodrawable)
    {
        mImageView.setImageDrawable(photodrawable);
        for (int i = 0; i < mProductConfigurationViewsLayout.getChildCount(); i++)
        {
            ((ProductConfigurationView)mProductConfigurationViewsLayout.getChildAt(i)).doResolutionCheck();
        }

    }

    public void setModel(PhotoSpecification photospecification)
    {
        mPhotoSpecification = photospecification;
        if (mPhotoSpecification != null && mPhotoSpecification.nonZeroQuantity())
        {
            mProductConfigurationViewsLayout.setVisibility(0);
            mEmptyLayout.setVisibility(8);
            prepareViews();
            int i = 0;
            for (Iterator iterator = mPhotoSpecification.getProductConfigurations().iterator(); iterator.hasNext();)
            {
                ProductConfiguration productconfiguration = (ProductConfiguration)iterator.next();
                ProductConfigurationView productconfigurationview = (ProductConfigurationView)mProductConfigurationViewsLayout.getChildAt(i);
                if (productconfigurationview != null)
                {
                    productconfigurationview.setModel(photospecification, productconfiguration);
                }
                i++;
            }

        } else
        {
            clearProductViews();
            mProductConfigurationViewsLayout.setVisibility(8);
            mEmptyLayout.setVisibility(0);
        }
    }
}
