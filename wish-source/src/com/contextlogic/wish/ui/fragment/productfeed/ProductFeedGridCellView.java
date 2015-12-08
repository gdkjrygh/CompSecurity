// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishHourlyDeal;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.timer.CountdownTimerView;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.BitmapUtil;

public class ProductFeedGridCellView extends StaggeredGridCellView
{
    public static interface GridCellFragment
    {

        public abstract void addProductToCart(WishProduct wishproduct);

        public abstract void editListForProduct(String s);

        public abstract long getAnimationTimeRemaining();

        public abstract WishCredit getApplicableCredit(WishProduct wishproduct);

        public abstract ProductFeedFragment.DataMode getDataMode();

        public abstract void handleRecommendClick(WishProduct wishproduct);

        public abstract boolean isProductSelected(WishProduct wishproduct);

        public abstract boolean isWishPending(String s);

        public abstract void unwishProduct(WishProduct wishproduct);

        public abstract void wishForProduct(WishProduct wishproduct);
    }

    private class ImageSettingRunnable
        implements Runnable
    {

        private boolean cancelled;
        private String imageUrl;
        final ProductFeedGridCellView this$0;

        public void markCancelled()
        {
            cancelled = true;
        }

        public void run()
        {
            if (!cancelled)
            {
                imageView.getImageView().setImageUrl(imageUrl);
            }
        }

        public ImageSettingRunnable(String s)
        {
            this$0 = ProductFeedGridCellView.this;
            super();
            imageUrl = s;
            cancelled = false;
        }
    }


    private View buttonSeparator;
    private CheckBox checkbox;
    private View discountBannerImage;
    private TextView discountBannerText;
    private View editOverlay;
    private String experimentBucket;
    private GridCellFragment fragment;
    private boolean hideHourlyDeal;
    private LinearLayout hourlyDealView;
    private TextView hourlyDealViewText;
    private CountdownTimerView hourlyDealViewTimer;
    private ImageSettingRunnable imageSettingRunnable;
    private BorderedImageView imageView;
    private View priceLayout;
    private TextView priceLayoutMainText;
    private TextView priceLayoutSubText;
    private WishProduct product;
    private View recommendButton;
    private ImageView recommendButtonImage;
    private TextView recommendButtonText;
    private RotateAnimation rotateAnimation;
    private View urgencyBannerImage;
    private TextView urgencyBannerText;
    private boolean useOriginalImage;
    private boolean wishAnimated;
    private View wishButton;
    private ImageView wishButtonImage;
    private TextView wishButtonText;
    private ImageView wishCheckImage;
    private ProgressBar wishLoadingSpinner;
    private String wishlistExperimentBucket;

    public ProductFeedGridCellView(Context context)
    {
        super(context);
    }

    private void animateWish()
    {
        if (wishCheckImage.getDrawable() == null && !BitmapUtil.safeSetImageResource(wishCheckImage, 0x7f0201c9))
        {
            return;
        } else
        {
            wishCheckImage.setVisibility(0);
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setFillBefore(true);
            alphaanimation.setFillAfter(true);
            alphaanimation.setStartOffset(1000L);
            alphaanimation.setDuration(500L);
            alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final ProductFeedGridCellView this$0;

                public void onAnimationEnd(Animation animation)
                {
                    wishCheckImage.setVisibility(8);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = ProductFeedGridCellView.this;
                super();
            }
            });
            wishCheckImage.startAnimation(alphaanimation);
            return;
        }
    }

    private void handleBuyClick()
    {
        if (fragment != null && product != null && product.isCommerceProduct() && product.isInStock())
        {
            fragment.addProductToCart(product);
        }
    }

    private void handleRecommendClick()
    {
label0:
        {
            if (fragment != null && product != null)
            {
                if (!product.isCommerceProduct() || !product.isInStock())
                {
                    break label0;
                }
                fragment.addProductToCart(product);
            }
            return;
        }
        fragment.handleRecommendClick(product);
    }

    private void handleWishClick()
    {
        while (fragment == null || product == null || fragment.isWishPending(product.getProductId())) 
        {
            return;
        }
        if (product.isAlreadyWishing())
        {
            fragment.editListForProduct(product.getProductId());
            return;
        } else
        {
            fragment.wishForProduct(product);
            return;
        }
    }

    private int imageResourceForCart()
    {
        return 0x7f0200e8;
    }

    private int imageResourceForEdit()
    {
        return 0x7f0200f8;
    }

    private int imageResourceForSave()
    {
        return 0x7f020103;
    }

    private int imageResourceForShare()
    {
        return 0x7f020122;
    }

    protected ViewGroup createContentView(Context context)
    {
        return new RelativeLayout(context);
    }

    public void disableActionButtons()
    {
        recommendButton.setClickable(false);
        wishButton.setClickable(false);
    }

    public String getImageUrl(WishProduct wishproduct, int i)
    {
        if (i > 350)
        {
            return wishproduct.getImage(useOriginalImage).getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large);
        } else
        {
            return wishproduct.getImage(useOriginalImage).getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium);
        }
    }

    public BorderedImageView getImageView()
    {
        return imageView;
    }

    public void hideHourlyDeal(boolean flag)
    {
        hideHourlyDeal = flag;
    }

    public void hideWishButton()
    {
        buttonSeparator.setVisibility(8);
        wishButton.setVisibility(8);
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030085, getContentView());
        hourlyDealView = (LinearLayout)view.findViewById(0x7f0d0272);
        hourlyDealViewText = (TextView)view.findViewById(0x7f0d0273);
        checkbox = (CheckBox)view.findViewById(0x7f0d0286);
        editOverlay = view.findViewById(0x7f0d0285);
        wishCheckImage = (ImageView)view.findViewById(0x7f0d0284);
        wishCheckImage.setVisibility(8);
        recommendButton = view.findViewById(0x7f0d027a);
        recommendButtonText = (TextView)view.findViewById(0x7f0d0283);
        recommendButtonImage = (ImageView)view.findViewById(0x7f0d0282);
        recommendButtonImage.setVisibility(8);
        recommendButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedGridCellView this$0;

            public void onClick(View view1)
            {
                handleRecommendClick();
            }

            
            {
                this$0 = ProductFeedGridCellView.this;
                super();
            }
        });
        buttonSeparator = view.findViewById(0x7f0d027d);
        wishButton = view.findViewById(0x7f0d027e);
        wishButtonImage = (ImageView)view.findViewById(0x7f0d027f);
        wishButtonImage.setVisibility(8);
        wishButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedGridCellView this$0;

            public void onClick(View view1)
            {
                handleWishClick();
            }

            
            {
                this$0 = ProductFeedGridCellView.this;
                super();
            }
        });
        wishButtonText = (TextView)view.findViewById(0x7f0d0280);
        wishLoadingSpinner = (ProgressBar)view.findViewById(0x7f0d0281);
        imageView = (BorderedImageView)view.findViewById(0x7f0d0275);
        priceLayout = view.findViewById(0x7f0d0274);
        priceLayoutMainText = (TextView)view.findViewById(0x7f0d027c);
        priceLayoutSubText = (TextView)view.findViewById(0x7f0d027b);
        priceLayoutSubText.setPaintFlags(priceLayoutSubText.getPaintFlags() | 0x10);
        urgencyBannerImage = view.findViewById(0x7f0d0279);
        urgencyBannerText = (TextView)view.findViewById(0x7f0d0278);
        BitmapUtil.safeSetImageResource((ImageView)urgencyBannerImage, 0x7f02014f);
        discountBannerImage = view.findViewById(0x7f0d0276);
        discountBannerText = (TextView)view.findViewById(0x7f0d0277);
        BitmapUtil.safeSetImageResource((ImageView)discountBannerImage, 0x7f020150);
        int i = (int)TypedValue.applyDimension(1, 40F, getContext().getResources().getDisplayMetrics()) / 2;
        int j = (int)TypedValue.applyDimension(1, 24F, getContext().getResources().getDisplayMetrics()) / 2;
        rotateAnimation = new RotateAnimation(0.0F, -45F, i, j);
        rotateAnimation.setDuration(0L);
        rotateAnimation.setFillAfter(true);
        imageSettingRunnable = null;
        experimentBucket = UserStatusManager.getInstance().getBucketForExperiment("mobile_simple_feed_tile");
        wishlistExperimentBucket = ((RootActivity)getContext()).getWishlistExperimentBucket();
    }

    public void prepareForRecycle()
    {
        imageView.getImageView().releaseImage();
        imageView.getImageView().setImageUrl(null);
        wishAnimated = false;
        wishCheckImage.setVisibility(8);
        wishCheckImage.clearAnimation();
        if (hourlyDealViewTimer != null)
        {
            hourlyDealViewTimer.pauseTimer();
        }
    }

    public void refreshCommerceState()
    {
        if (!product.isCommerceProduct()) goto _L2; else goto _L1
_L1:
        priceLayout.setVisibility(0);
        Object obj = product.getCommerceValue();
        WishCredit wishcredit = fragment.getApplicableCredit(product);
        WishLocalizedCurrencyValue wishlocalizedcurrencyvalue = ((WishLocalizedCurrencyValue) (obj));
        if (wishcredit != null)
        {
            obj = ((WishLocalizedCurrencyValue) (obj)).subtract(wishcredit.getValue());
            wishlocalizedcurrencyvalue = ((WishLocalizedCurrencyValue) (obj));
            if (((WishLocalizedCurrencyValue) (obj)).getValue() <= 0.0D)
            {
                ((WishLocalizedCurrencyValue) (obj)).zeroOutValue();
                wishlocalizedcurrencyvalue = ((WishLocalizedCurrencyValue) (obj));
            }
        }
        obj = null;
        if (product.getUrgencyText() != null)
        {
            obj = product.getUrgencyText();
        }
        if (obj != null)
        {
            urgencyBannerImage.setVisibility(0);
            urgencyBannerText.setVisibility(0);
            urgencyBannerText.setText(((CharSequence) (obj)));
        } else
        {
            urgencyBannerImage.setVisibility(8);
            urgencyBannerText.setVisibility(8);
        }
        priceLayoutMainText.setVisibility(0);
        if (wishlocalizedcurrencyvalue.getValue() > 0.0D)
        {
            priceLayoutMainText.setText(wishlocalizedcurrencyvalue.toFormattedString());
        } else
        {
            priceLayoutMainText.setText(getContext().getString(0x7f0601e1));
        }
        if (wishcredit != null)
        {
            obj = product.getCommerceValue();
        } else
        {
            obj = product.getValue();
        }
        if (((WishLocalizedCurrencyValue) (obj)).getValue() > wishlocalizedcurrencyvalue.getValue())
        {
            priceLayoutSubText.setVisibility(0);
            int i;
            if (((WishLocalizedCurrencyValue) (obj)).getValue() > 0.0D)
            {
                priceLayoutSubText.setText(((WishLocalizedCurrencyValue) (obj)).toFormattedString());
            } else
            {
                priceLayoutSubText.setText(getContext().getString(0x7f0601e1));
            }
            discountBannerImage.setVisibility(0);
            discountBannerText.setVisibility(0);
            if (discountBannerText.getAnimation() == null)
            {
                discountBannerText.setAnimation(rotateAnimation);
            }
            if (wishlocalizedcurrencyvalue.getValue() > 0.0D)
            {
                double d = ((WishLocalizedCurrencyValue) (obj)).subtract(wishlocalizedcurrencyvalue).divide(((WishLocalizedCurrencyValue) (obj)));
                discountBannerText.setText(String.format("-%1$.0f%%", new Object[] {
                    Double.valueOf(Math.floor(d * 100D))
                }));
            } else
            {
                discountBannerText.setText(getContext().getString(0x7f0601e1));
            }
        } else
        {
            priceLayoutSubText.setVisibility(8);
            discountBannerImage.setVisibility(8);
            discountBannerText.setVisibility(8);
            discountBannerText.clearAnimation();
        }
        if (product.isInStock())
        {
            recommendButtonText.setText(getContext().getString(0x7f0600b6));
            recommendButtonImage.setVisibility(0);
            recommendButtonImage.setImageResource(imageResourceForCart());
        } else
        {
            recommendButtonImage.setVisibility(0);
            recommendButtonImage.setImageResource(imageResourceForShare());
            recommendButtonText.setText(getContext().getString(0x7f0603bb));
        }
        if (product.getHourlyDeal() == null || hideHourlyDeal) goto _L4; else goto _L3
_L3:
        hourlyDealView.setVisibility(0);
        hourlyDealViewTimer = new CountdownTimerView(getContext());
        hourlyDealViewTimer.setup(product.getHourlyDeal().getExpiry(), 15, getResources().getColor(0x7f0c00e8), getResources().getColor(0x7f0c00e7));
        hourlyDealViewTimer.startTimer();
        for (i = hourlyDealView.getChildCount() - 1; i >= 0; i--)
        {
            if (hourlyDealView.getChildAt(i) instanceof CountdownTimerView)
            {
                hourlyDealView.removeViewAt(i);
            }
        }

        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 17;
        hourlyDealView.addView(hourlyDealViewTimer, 0, layoutparams);
        hourlyDealViewText.setText(product.getHourlyDeal().getTitle());
_L6:
        if (experimentBucket.equals("show") || experimentBucket.equals("show-v2"))
        {
            priceLayout.setVisibility(8);
            buttonSeparator.setVisibility(8);
            wishButton.setVisibility(8);
            recommendButton.setVisibility(8);
            if (experimentBucket.equals("show-v2"))
            {
                if (product.getHourlyDeal() == null || hideHourlyDeal)
                {
                    discountBannerImage.setVisibility(8);
                    discountBannerText.setVisibility(8);
                }
                urgencyBannerImage.setVisibility(8);
                urgencyBannerText.setVisibility(8);
            }
        }
        return;
_L4:
        hourlyDealView.setVisibility(8);
        if (hourlyDealViewTimer != null)
        {
            hourlyDealViewTimer.pauseTimer();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        urgencyBannerImage.setVisibility(8);
        urgencyBannerText.setVisibility(8);
        priceLayout.setVisibility(8);
        discountBannerImage.setVisibility(8);
        discountBannerText.setVisibility(8);
        discountBannerText.clearAnimation();
        recommendButtonImage.setVisibility(0);
        recommendButtonImage.setImageResource(imageResourceForShare());
        recommendButtonText.setText(getContext().getString(0x7f0603bb));
        hourlyDealView.setVisibility(8);
        if (hourlyDealViewTimer != null)
        {
            hourlyDealViewTimer.pauseTimer();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void refreshSelectedState()
    {
        if (fragment != null && product != null)
        {
            checkbox.setChecked(fragment.isProductSelected(product));
        }
    }

    public void refreshWishState(boolean flag)
    {
        if (fragment == null || product == null)
        {
            return;
        }
        if (!fragment.isWishPending(product.getProductId())) goto _L2; else goto _L1
_L1:
        wishButtonImage.setVisibility(8);
        wishButtonText.setVisibility(8);
        wishLoadingSpinner.setVisibility(0);
_L4:
        refreshCommerceState();
        return;
_L2:
        if (product.isAlreadyWishing())
        {
            wishButtonImage.setVisibility(0);
            BitmapUtil.safeSetImageResource(wishButtonImage, imageResourceForEdit());
            wishButtonText.setText(getContext().getString(0x7f060137));
            wishButtonText.setVisibility(0);
            wishLoadingSpinner.setVisibility(8);
            if (!wishAnimated)
            {
                wishAnimated = true;
                if (flag)
                {
                    animateWish();
                }
            }
            if (wishlistExperimentBucket.equals("show"))
            {
                wishButtonText.setText(0x7f060397);
                wishButton.setOnClickListener(new android.view.View.OnClickListener() {

                    final ProductFeedGridCellView this$0;

                    public void onClick(View view)
                    {
                        fragment.unwishProduct(product);
                    }

            
            {
                this$0 = ProductFeedGridCellView.this;
                super();
            }
                });
            }
        } else
        {
            if (wishlistExperimentBucket.equals("show"))
            {
                wishButtonText.setText(0x7f060397);
                wishButton.setOnClickListener(new android.view.View.OnClickListener() {

                    final ProductFeedGridCellView this$0;

                    public void onClick(View view)
                    {
                        handleWishClick();
                    }

            
            {
                this$0 = ProductFeedGridCellView.this;
                super();
            }
                });
            }
            wishAnimated = false;
            wishButtonImage.setVisibility(0);
            BitmapUtil.safeSetImageResource(wishButtonImage, imageResourceForSave());
            wishButtonText.setText(getContext().getString(0x7f06038f));
            wishButtonText.setVisibility(0);
            wishLoadingSpinner.setVisibility(8);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void releaseImages()
    {
        imageView.getImageView().releaseImage();
        if (hourlyDealViewTimer != null)
        {
            hourlyDealViewTimer.pauseTimer();
        }
    }

    public void restoreImages()
    {
        imageView.getImageView().restoreImage();
        if (hourlyDealViewTimer != null)
        {
            hourlyDealViewTimer.startTimer();
        }
    }

    public void setEditModeEnabled(boolean flag)
    {
        if (flag)
        {
            editOverlay.setVisibility(0);
            recommendButton.setClickable(false);
            wishButton.setClickable(false);
        } else
        {
            editOverlay.setVisibility(8);
            recommendButton.setClickable(true);
            wishButton.setClickable(true);
        }
        refreshSelectedState();
    }

    public void setFragment(GridCellFragment gridcellfragment)
    {
        fragment = gridcellfragment;
    }

    public void setImageWidth(int i)
    {
        imageView.getImageView().setRequestedImageWidthPx(i);
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)wishCheckImage.getLayoutParams();
        layoutparams.width = i / 3;
        layoutparams.height = i / 3;
        wishCheckImage.setLayoutParams(layoutparams);
    }

    public void setProduct(WishProduct wishproduct, int i, int j, long l)
    {
        product = wishproduct;
        String s = getImageUrl(wishproduct, j);
        if (imageSettingRunnable != null)
        {
            removeCallbacks(imageSettingRunnable);
            imageSettingRunnable.markCancelled();
            imageSettingRunnable = null;
        }
        wishAnimated = wishproduct.isAlreadyWishing();
        if (wishproduct.isAlreadyWishing())
        {
            wishCheckImage.setVisibility(8);
        }
        refreshWishState(true);
        imageView.getImageView().setImageUrl(null);
        imageSettingRunnable = new ImageSettingRunnable(s);
        if (l > 0L)
        {
            postDelayed(imageSettingRunnable, l);
            return;
        } else
        {
            imageSettingRunnable.run();
            return;
        }
    }

    public void setUseOriginalImage(boolean flag)
    {
        useOriginalImage = flag;
    }

    public void updateImageHeight(int i, boolean flag)
    {
        int j = (int)TypedValue.applyDimension(1, 50F, getContext().getResources().getDisplayMetrics());
        if (flag)
        {
            imageView.getImageView().setRequestedImageHeightPx(i - j);
            return;
        } else
        {
            imageView.getImageView().setRequestedImageHeightPx(i);
            return;
        }
    }






}
