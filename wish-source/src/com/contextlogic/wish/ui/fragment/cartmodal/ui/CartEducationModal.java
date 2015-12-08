// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishCartEducationModalSpec;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.util.BitmapUtil;

public class CartEducationModal extends LinearLayout
{

    private TextView dismissButton;
    private ImageView image;
    private TextView messageText;
    private BorderedImageView productImage;
    private LinearLayout productImageContainer;
    private TextView titleText;

    public CartEducationModal(Context context)
    {
        this(context, null);
    }

    public CartEducationModal(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030042, this);
        setOrientation(1);
        dismissButton = (TextView)view.findViewById(0x7f0d017f);
        titleText = (TextView)view.findViewById(0x7f0d017d);
        messageText = (TextView)view.findViewById(0x7f0d017e);
        image = (ImageView)view.findViewById(0x7f0d017c);
        productImage = (BorderedImageView)view.findViewById(0x7f0d017b);
        productImageContainer = (LinearLayout)view.findViewById(0x7f0d017a);
        setBackgroundColor(getResources().getColor(0x7f0c0071));
    }

    public void setup(WishCartEducationModalSpec wishcarteducationmodalspec, android.view.View.OnClickListener onclicklistener)
    {
        titleText.setText(wishcarteducationmodalspec.getTitle());
        messageText.setText(wishcarteducationmodalspec.getMessage());
        dismissButton.setText(wishcarteducationmodalspec.getButtonText().toUpperCase());
        dismissButton.setOnClickListener(onclicklistener);
        setOnClickListener(onclicklistener);
        productImage.getImageView().setImageUrl(null);
        if (wishcarteducationmodalspec.getImageUrl() != null)
        {
            int k1 = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getHeight();
            int i = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getWidth();
            int i2 = (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics());
            int k2 = (int)TypedValue.applyDimension(1, 250F, getResources().getDisplayMetrics());
            int i1 = i - i2;
            i = i1;
            int k = i;
            if (i > k1 - k2 - i2)
            {
                k = k1 - k2 - i2;
                i1 = k;
            }
            onclicklistener = new android.widget.FrameLayout.LayoutParams(i1, k);
            onclicklistener.gravity = 17;
            image.setPadding((int)((double)i1 * 0.14999999999999999D), (int)((double)k * 0.35799999999999998D), 0, 0);
            image.setLayoutParams(onclicklistener);
            BitmapUtil.safeSetImageResource(image, 0x7f0200ae);
            onclicklistener = new android.widget.FrameLayout.LayoutParams(i1, k);
            onclicklistener.gravity = 17;
            productImageContainer.setLayoutParams(onclicklistener);
            productImageContainer.setPadding((int)((double)i1 * 0.2389D), 0, 0, 0);
            i = (int)((double)i1 * 0.52100000000000002D);
            productImage.getImageView().setRequestedImageWidthPx(i);
            productImage.getImageView().setRequestedImageHeightPx(i);
            onclicklistener = new android.widget.LinearLayout.LayoutParams(i, i);
            productImage.setLayoutParams(onclicklistener);
            productImageContainer.setVisibility(0);
            productImage.getImageView().setImageUrl(wishcarteducationmodalspec.getImageUrl());
            return;
        }
        int l1 = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getHeight();
        int j = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getWidth();
        int j2 = (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics());
        int l2 = (int)TypedValue.applyDimension(1, 250F, getResources().getDisplayMetrics());
        int l = j - j2;
        int j1 = (int)(0.94999999999999996D * (double)l);
        j = j1;
        if (j1 > l1 - l2 - j2)
        {
            j = l1 - l2 - j2;
            l = (int)(1.05D * (double)j);
        }
        wishcarteducationmodalspec = new android.widget.FrameLayout.LayoutParams(l, j);
        wishcarteducationmodalspec.gravity = 17;
        image.setLayoutParams(wishcarteducationmodalspec);
        BitmapUtil.safeSetImageResource(image, 0x7f0200ad);
        productImageContainer.setVisibility(8);
    }
}
