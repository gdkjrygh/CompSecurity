// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishUpsellOffer;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui:
//            CartUpsellModalPagerAdapter

public class CartUpsellModal extends FrameLayout
{
    public static interface Callback
    {

        public abstract void onAddToCartUpsell(WishProduct wishproduct);
    }


    private CartUpsellModalPagerAdapter adapter;
    private UnifiedFontButton buyButton;
    private Callback callback;
    private ImageView exitButton;
    private CirclePageIndicator indicator;
    private View modalView;
    private UnifiedFontTextView noThanksTextView;
    private ViewPager pager;
    private BorderedImageView prevProductImage;
    private UnifiedFontTextView previousProductText;
    private UnifiedFontTextView promotionText;

    public CartUpsellModal(Context context)
    {
        this(context, null);
    }

    public CartUpsellModal(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CartUpsellModal(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void handleBuy()
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_UPSELL_MODAL_BUY_BUTTON);
        callback.onAddToCartUpsell(adapter.getProductInPosition(pager.getCurrentItem()));
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030046, this);
        ((ImageView)view.findViewById(0x7f0d0193)).setOnClickListener(new android.view.View.OnClickListener() {

            final CartUpsellModal this$0;

            public void onClick(View view1)
            {
                handleNext();
            }

            
            {
                this$0 = CartUpsellModal.this;
                super();
            }
        });
        ((ImageView)view.findViewById(0x7f0d0192)).setOnClickListener(new android.view.View.OnClickListener() {

            final CartUpsellModal this$0;

            public void onClick(View view1)
            {
                handlePrev();
            }

            
            {
                this$0 = CartUpsellModal.this;
                super();
            }
        });
        pager = (ViewPager)view.findViewById(0x7f0d0191);
        indicator = (CirclePageIndicator)view.findViewById(0x7f0d0194);
        modalView = view.findViewById(0x7f0d018c);
        prevProductImage = (BorderedImageView)view.findViewById(0x7f0d018d);
        prevProductImage.getImageView().setRequestedImageWidth(70);
        prevProductImage.getImageView().setRequestedImageHeight(70);
        exitButton = (ImageView)view.findViewById(0x7f0d018f);
        buyButton = (UnifiedFontButton)view.findViewById(0x7f0d0195);
        noThanksTextView = (UnifiedFontTextView)view.findViewById(0x7f0d0196);
        promotionText = (UnifiedFontTextView)view.findViewById(0x7f0d0190);
        previousProductText = (UnifiedFontTextView)view.findViewById(0x7f0d018e);
        setBackgroundColor(getResources().getColor(0x7f0c006e));
    }

    public void handleNext()
    {
        if (pager.getCurrentItem() < adapter.getCount() - 1)
        {
            pager.setCurrentItem(pager.getCurrentItem() + 1, true);
        }
    }

    public void handlePrev()
    {
        if (pager.getCurrentItem() > 0)
        {
            pager.setCurrentItem(pager.getCurrentItem() - 1, true);
        }
    }

    public void setCallback(Callback callback1)
    {
        callback = callback1;
    }

    public void setup(WishCartItem wishcartitem, WishUpsellOffer wishupselloffer, android.view.View.OnClickListener onclicklistener)
    {
        prevProductImage.getImageView().setImageUrl(wishcartitem.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        exitButton.setOnClickListener(onclicklistener);
        noThanksTextView.setOnClickListener(onclicklistener);
        buyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartUpsellModal this$0;

            public void onClick(View view)
            {
                handleBuy();
            }

            
            {
                this$0 = CartUpsellModal.this;
                super();
            }
        });
        promotionText.setText(wishupselloffer.getTitle().toUpperCase(Locale.getDefault()));
        previousProductText.setText(wishupselloffer.getMessage());
        adapter = new CartUpsellModalPagerAdapter(getContext());
        adapter.updateProducts(wishupselloffer.getUpsellProducts());
        pager.setAdapter(adapter);
        indicator.setForceCount(wishupselloffer.getUpsellProducts().size());
        indicator.setViewPager(pager);
        indicator.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final CartUpsellModal this$0;

            public void onPageScrollStateChanged(int j)
            {
            }

            public void onPageScrolled(int j, float f, int k)
            {
            }

            public void onPageSelected(int j)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_UPSELL_MODAL_PRODUCT_SCROLL);
            }

            
            {
                this$0 = CartUpsellModal.this;
                super();
            }
        });
        int i = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight();
        trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_UPSELL_MODAL);
        wishcartitem = new TranslateAnimation(0.0F, 0.0F, i, 0.0F);
        wishcartitem.setFillAfter(false);
        wishcartitem.setDuration(200L);
        wishcartitem.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CartUpsellModal this$0;

            public void onAnimationEnd(Animation animation)
            {
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                modalView.setVisibility(0);
            }

            
            {
                this$0 = CartUpsellModal.this;
                super();
            }
        });
        modalView.startAnimation(wishcartitem);
    }

    public void trackEvent(WishAnalyticsEvent wishanalyticsevent)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), null, null, null);
    }


}
