// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishFeedPromotionItem;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;

public class ProductFeedPromotionBannerView extends FrameLayout
{
    public static interface ActionListener
    {

        public abstract void onAction(WishFeedPromotionItem wishfeedpromotionitem);

        public abstract void onDismissed(WishFeedPromotionItem wishfeedpromotionitem);
    }


    private Button actionButton;
    private ActionListener actionListener;
    private Button dismissButton;
    private BorderedImageView imageView;
    private WishFeedPromotionItem promotionItem;
    private TextView textView;

    public ProductFeedPromotionBannerView(Context context)
    {
        this(context, null);
    }

    public ProductFeedPromotionBannerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProductFeedPromotionBannerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030088, this);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedPromotionBannerView this$0;

            public void onClick(View view1)
            {
                if (actionListener != null)
                {
                    actionListener.onAction(promotionItem);
                }
            }

            
            {
                this$0 = ProductFeedPromotionBannerView.this;
                super();
            }
        });
        actionButton = (Button)view.findViewById(0x7f0d0299);
        actionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedPromotionBannerView this$0;

            public void onClick(View view1)
            {
                if (actionListener != null)
                {
                    actionListener.onAction(promotionItem);
                }
            }

            
            {
                this$0 = ProductFeedPromotionBannerView.this;
                super();
            }
        });
        dismissButton = (Button)view.findViewById(0x7f0d029a);
        dismissButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedPromotionBannerView this$0;

            public void onClick(View view1)
            {
                if (actionListener != null)
                {
                    actionListener.onDismissed(promotionItem);
                }
            }

            
            {
                this$0 = ProductFeedPromotionBannerView.this;
                super();
            }
        });
        imageView = (BorderedImageView)view.findViewById(0x7f0d0297);
        imageView.getImageView().setRequestedImageHeight(40);
        imageView.getImageView().setRequestedImageWidth(40);
        textView = (TextView)view.findViewById(0x7f0d0298);
    }

    public void setActionListener(ActionListener actionlistener)
    {
        actionListener = actionlistener;
    }

    public void setPromotionItem(WishFeedPromotionItem wishfeedpromotionitem)
    {
        promotionItem = wishfeedpromotionitem;
        actionButton.setText(wishfeedpromotionitem.getActionButtonText());
        dismissButton.setText(wishfeedpromotionitem.getDismissButtonText());
        textView.setText(wishfeedpromotionitem.getText());
        if (wishfeedpromotionitem.getImageUrl() != null)
        {
            imageView.getImageView().setImageUrl(wishfeedpromotionitem.getImageUrl());
            return;
        } else
        {
            imageView.getImageView().setImageResource(0x7f02019f);
            return;
        }
    }


}
