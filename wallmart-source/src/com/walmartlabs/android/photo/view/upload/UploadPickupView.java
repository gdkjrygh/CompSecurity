// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.upload;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.utils.CapabilityUtils;
import com.walmartlabs.android.photo.model.user.Store;

public class UploadPickupView extends LinearLayout
{
    public static interface UploadPickupViewListener
    {

        public abstract void onDoneClick();

        public abstract void onPhoneClick(String s);
    }


    private UploadPickupViewListener mListener;

    public UploadPickupView(Context context)
    {
        super(context);
    }

    public UploadPickupView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ((Button)findViewById(com.walmartlabs.android.photo.R.id.done_button)).setOnClickListener(new android.view.View.OnClickListener() {

            final UploadPickupView this$0;

            public void onClick(View view1)
            {
                if (mListener != null)
                {
                    mListener.onDoneClick();
                }
            }

            
            {
                this$0 = UploadPickupView.this;
                super();
            }
        });
        View view = findViewById(com.walmartlabs.android.photo.R.id.store_phone_link);
        if (CapabilityUtils.canMakeCalls(getContext()))
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final UploadPickupView this$0;

                public void onClick(View view1)
                {
                    if (mListener != null)
                    {
                        view1 = ((TextView)findViewById(com.walmartlabs.android.photo.R.id.store_phone_link)).getText();
                        if (!TextUtils.isEmpty(view1))
                        {
                            mListener.onPhoneClick(view1.toString());
                        }
                    }
                }

            
            {
                this$0 = UploadPickupView.this;
                super();
            }
            });
            return;
        } else
        {
            ((TextView)view).setTextColor(getResources().getColor(com.walmartlabs.android.photo.R.color.photo_text_color));
            return;
        }
    }

    public void setPickupInfo(Store store)
    {
        TextView textview = (TextView)findViewById(com.walmartlabs.android.photo.R.id.store_name);
        TextView textview1 = (TextView)findViewById(com.walmartlabs.android.photo.R.id.store_address);
        TextView textview2 = (TextView)findViewById(com.walmartlabs.android.photo.R.id.store_phone_link);
        if (store != null)
        {
            textview.setText(store.getName());
            textview1.setText(store.getAddress());
            textview2.setText(store.getPhone());
        }
    }

    public void setUploadPickupViewListener(UploadPickupViewListener uploadpickupviewlistener)
    {
        mListener = uploadpickupviewlistener;
    }

}
