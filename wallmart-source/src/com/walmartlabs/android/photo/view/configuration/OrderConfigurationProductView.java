// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.configuration;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import java.text.DecimalFormat;

public class OrderConfigurationProductView extends RelativeLayout
{
    public static interface ProductViewListener
    {

        public abstract void onCrop();

        public abstract void onDecrementClick();

        public abstract void onIncrementClick();
    }


    private static DecimalFormat sPriceFormat = new DecimalFormat("0.00");
    private ImageView mCropIcon;
    private ImageButton mDecrementButton;
    private ImageView mImageView;
    private ImageButton mIncrementButton;
    private ProductViewListener mListener;
    private PhotoProduct mModel;
    private TextView mPriceView;
    private TextView mProductNameView;
    private TextView mQuantityView;
    private ImageView mWarningView;

    public OrderConfigurationProductView(Context context)
    {
        super(context);
    }

    public OrderConfigurationProductView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OrderConfigurationProductView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mImageView = (ImageView)findViewById(com.walmartlabs.android.photo.R.id.image);
        mProductNameView = (TextView)findViewById(com.walmartlabs.android.photo.R.id.product_name);
        mPriceView = (TextView)findViewById(com.walmartlabs.android.photo.R.id.product_price);
        mWarningView = (ImageView)findViewById(com.walmartlabs.android.photo.R.id.warning);
        mCropIcon = (ImageView)findViewById(com.walmartlabs.android.photo.R.id.crop);
        mCropIcon.setOnClickListener(new android.view.View.OnClickListener() {

            final OrderConfigurationProductView this$0;

            public void onClick(View view)
            {
                if (mListener != null)
                {
                    mListener.onCrop();
                }
            }

            
            {
                this$0 = OrderConfigurationProductView.this;
                super();
            }
        });
        mQuantityView = (TextView)findViewById(com.walmartlabs.android.photo.R.id.quantity);
        mIncrementButton = (ImageButton)findViewById(com.walmartlabs.android.photo.R.id.button_increment);
        mDecrementButton = (ImageButton)findViewById(com.walmartlabs.android.photo.R.id.button_decrement);
        mIncrementButton.setOnClickListener(new android.view.View.OnClickListener() {

            final OrderConfigurationProductView this$0;

            public void onClick(View view)
            {
                if (mListener != null)
                {
                    mListener.onIncrementClick();
                }
            }

            
            {
                this$0 = OrderConfigurationProductView.this;
                super();
            }
        });
        mDecrementButton.setOnClickListener(new android.view.View.OnClickListener() {

            final OrderConfigurationProductView this$0;

            public void onClick(View view)
            {
                if (mListener != null)
                {
                    mListener.onDecrementClick();
                }
            }

            
            {
                this$0 = OrderConfigurationProductView.this;
                super();
            }
        });
    }

    public void setHideCropIcon(boolean flag)
    {
        ImageView imageview = mCropIcon;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
    }

    public void setHideImageView(boolean flag)
    {
        ImageView imageview = mImageView;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
    }

    public void setImage(PhotoDrawable photodrawable)
    {
        mImageView.setImageDrawable(photodrawable);
    }

    public void setModel(PhotoProduct photoproduct)
    {
        mModel = photoproduct;
        TextView textview = mProductNameView;
        String s;
        if (mModel != null)
        {
            s = mModel.getShortProductName();
        } else
        {
            s = "";
        }
        textview.setText(s);
        mPriceView.setText((new StringBuilder()).append("$").append(sPriceFormat.format(photoproduct.getPrice())).append(" ").append(getContext().getString(com.walmartlabs.android.photo.R.string.photo_each)).toString());
        mWarningView.setOnClickListener(null);
        mWarningView.setVisibility(4);
    }

    public void setProductViewListener(ProductViewListener productviewlistener)
    {
        mListener = productviewlistener;
    }

    public void setQuantity(int i)
    {
        mQuantityView.setText(String.valueOf(i));
    }

    public void setWarnLowRes(boolean flag)
    {
        if (flag)
        {
            mWarningView.setVisibility(0);
            mWarningView.setOnClickListener(new android.view.View.OnClickListener() {

                final OrderConfigurationProductView this$0;

                public void onClick(View view)
                {
                    Toast.makeText(getContext(), com.walmartlabs.android.photo.R.string.photo_low_res_warning, 0).show();
                }

            
            {
                this$0 = OrderConfigurationProductView.this;
                super();
            }
            });
            return;
        } else
        {
            mWarningView.setOnClickListener(null);
            mWarningView.setVisibility(4);
            return;
        }
    }


}
