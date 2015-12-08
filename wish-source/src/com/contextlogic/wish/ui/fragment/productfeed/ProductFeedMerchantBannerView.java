// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishMerchant;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.fragment.ratings.RatingsFragment;
import java.text.NumberFormat;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

public class ProductFeedMerchantBannerView extends FrameLayout
{

    private ProductFeedFragment fragment;
    private BorderedImageView imageView;
    private WishMerchant merchant;
    private TextView nameText;
    private TextView productCountText;
    private ImageView ratingStarFive;
    private ImageView ratingStarFour;
    private ImageView ratingStarOne;
    private ImageView ratingStarThree;
    private ImageView ratingStarTwo;
    private TextView ratingText;
    private View ratingView;
    private View viewAllRatingsText;

    public ProductFeedMerchantBannerView(Context context)
    {
        this(context, null);
    }

    public ProductFeedMerchantBannerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProductFeedMerchantBannerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030086, this);
        imageView = (BorderedImageView)view.findViewById(0x7f0d0287);
        imageView.getImageView().setRequestedImageHeight(60);
        imageView.getImageView().setRequestedImageWidth(60);
        nameText = (TextView)view.findViewById(0x7f0d0288);
        productCountText = (TextView)view.findViewById(0x7f0d0289);
        viewAllRatingsText = (TextView)view.findViewById(0x7f0d0291);
        ratingText = (TextView)view.findViewById(0x7f0d0290);
        ratingStarOne = (ImageView)view.findViewById(0x7f0d028b);
        ratingStarTwo = (ImageView)view.findViewById(0x7f0d028c);
        ratingStarThree = (ImageView)view.findViewById(0x7f0d028d);
        ratingStarFour = (ImageView)view.findViewById(0x7f0d028e);
        ratingStarFive = (ImageView)view.findViewById(0x7f0d028f);
        ratingView = view.findViewById(0x7f0d028a);
        ratingView.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedMerchantBannerView this$0;

            public void onClick(View view1)
            {
                showRatings();
            }

            
            {
                this$0 = ProductFeedMerchantBannerView.this;
                super();
            }
        });
        viewAllRatingsText.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedMerchantBannerView this$0;

            public void onClick(View view1)
            {
                showRatings();
            }

            
            {
                this$0 = ProductFeedMerchantBannerView.this;
                super();
            }
        });
    }

    public void setFragment(ProductFeedFragment productfeedfragment)
    {
        fragment = productfeedfragment;
    }

    public void setMerchant(WishMerchant wishmerchant)
    {
        merchant = wishmerchant;
        imageView.getImageView().setImageUrl(wishmerchant.getImageUrl());
        nameText.setText(wishmerchant.getDisplayName());
        if (wishmerchant.getProductCount() > 0)
        {
            productCountText.setVisibility(0);
            productCountText.setText(WishApplication.getAppInstance().getQuantityString(0x7f07000a, wishmerchant.getProductCount(), new Object[] {
                NumberFormat.getInstance().format(wishmerchant.getProductCount())
            }));
        } else
        {
            productCountText.setVisibility(8);
        }
        if (wishmerchant.getRatingCount() > 0)
        {
            ratingView.setVisibility(0);
            viewAllRatingsText.setVisibility(0);
            int ai[] = new int[5];
            int i = 0;
            while (i < 5) 
            {
                if (wishmerchant.getRating() >= (double)(i + 1))
                {
                    ai[i] = 0x7f0201ce;
                } else
                {
                    double d = (double)(i + 1) - wishmerchant.getRating();
                    if (d <= 0.25D)
                    {
                        ai[i] = 0x7f0201ce;
                    } else
                    if (d <= 0.75D)
                    {
                        ai[i] = 0x7f0200dc;
                    } else
                    {
                        ai[i] = 0x7f0200d8;
                    }
                }
                i++;
            }
            ratingStarOne.setImageResource(ai[0]);
            ratingStarTwo.setImageResource(ai[1]);
            ratingStarThree.setImageResource(ai[2]);
            ratingStarFour.setImageResource(ai[3]);
            ratingStarFive.setImageResource(ai[4]);
            ratingText.setText(WishApplication.getAppInstance().getQuantityString(0x7f070009, wishmerchant.getRatingCount(), new Object[] {
                NumberFormat.getInstance().format(wishmerchant.getRatingCount())
            }));
            return;
        } else
        {
            ratingView.setVisibility(8);
            viewAllRatingsText.setVisibility(8);
            return;
        }
    }

    public void showRatings()
    {
        if (merchant == null)
        {
            return;
        }
        (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_MERCHANT_VIEW_RATING.getValue()), null, null, null);
        Object obj = new Bundle();
        ((Bundle) (obj)).putString("ArgMerchantID", merchant.getMerchantId());
        RatingsFragment ratingsfragment = new RatingsFragment();
        ratingsfragment.setArguments(((Bundle) (obj)));
        obj = (RootActivity)getContext();
        if (fragment.isModal())
        {
            ((RootActivity) (obj)).setModalContentFragment(ratingsfragment, false);
            return;
        } else
        {
            ((RootActivity) (obj)).setContentFragment(ratingsfragment, false);
            return;
        }
    }
}
