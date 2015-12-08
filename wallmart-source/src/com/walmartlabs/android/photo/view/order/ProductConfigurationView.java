// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.order;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.android.photo.model.order.Crop;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.util.PhotoUtils;
import java.text.DecimalFormat;

public class ProductConfigurationView extends LinearLayout
{

    private static DecimalFormat sPriceFormat = new DecimalFormat("0.00");
    private TextView mCountView;
    private TextView mCroppedView;
    private ProductConfiguration mModel;
    private TextView mNameView;
    private PhotoSpecification mSpec;
    private TextView mTotalView;
    private ImageView mWarningView;

    public ProductConfigurationView(Context context)
    {
        super(context);
    }

    public ProductConfigurationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void refresh()
    {
        byte byte0 = 4;
        if (mModel != null && mSpec != null)
        {
            int i = mModel.getQuantity();
            double d = mModel.getProduct().getPrice();
            double d1 = i;
            mNameView.setText(mModel.getProduct().getShortProductName());
            mCountView.setText(String.valueOf(i));
            mTotalView.setText((new StringBuilder()).append("$").append(sPriceFormat.format(d1 * d)).toString());
            TextView textview = mCroppedView;
            i = byte0;
            if (mModel.getCrop() != null)
            {
                if (!mModel.getCrop().isCropped())
                {
                    i = byte0;
                } else
                {
                    i = 0;
                }
            }
            textview.setVisibility(i);
            return;
        } else
        {
            mNameView.setText("");
            mCountView.setText("");
            mCroppedView.setVisibility(4);
            mTotalView.setText("");
            mWarningView.setOnClickListener(null);
            mWarningView.setVisibility(8);
            return;
        }
    }

    public void doResolutionCheck()
    {
label0:
        {
            if (mSpec != null && mModel != null)
            {
                if (PhotoUtils.resolutionOk(mSpec.getPhoto(), mModel.getProduct(), mModel.getCrop()))
                {
                    break label0;
                }
                mWarningView.setVisibility(0);
                mWarningView.setOnClickListener(new android.view.View.OnClickListener() {

                    final ProductConfigurationView this$0;

                    public void onClick(View view)
                    {
                        DialogFactory.createAlertDialog(getContext().getString(com.walmartlabs.android.photo.R.string.photo_some_lowres_title), getContext().getString(com.walmartlabs.android.photo.R.string.photo_low_res_warning), getContext()).show();
                    }

            
            {
                this$0 = ProductConfigurationView.this;
                super();
            }
                });
            }
            return;
        }
        mWarningView.setOnClickListener(null);
        mWarningView.setVisibility(4);
    }

    public ProductConfiguration getModel()
    {
        return mModel;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mNameView = (TextView)findViewById(com.walmartlabs.android.photo.R.id.product);
        mWarningView = (ImageView)findViewById(com.walmartlabs.android.photo.R.id.warning);
        mCroppedView = (TextView)findViewById(com.walmartlabs.android.photo.R.id.crop_indicator);
        mCountView = (TextView)findViewById(com.walmartlabs.android.photo.R.id.count);
        mTotalView = (TextView)findViewById(com.walmartlabs.android.photo.R.id.total);
    }

    public void setModel(PhotoSpecification photospecification, ProductConfiguration productconfiguration)
    {
        mSpec = photospecification;
        mModel = productconfiguration;
        refresh();
    }

}
