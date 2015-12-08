// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishProductExtraImage;
import com.contextlogic.wish.api.data.WishProfileImage;
import com.contextlogic.wish.api.data.WishRating;
import com.contextlogic.wish.api.data.WishRatingSizeSummary;
import com.contextlogic.wish.api.data.WishRatingSizeSummaryBar;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.scrollview.ListeningScrollView;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.KlarnaPaymentProcessor;
import com.contextlogic.wish.ui.fragment.embeddedbrowser.EmbeddedBrowserFragment;
import com.contextlogic.wish.ui.fragment.filterfeed.PromoBannerView;
import com.contextlogic.wish.ui.fragment.product.photos.ProductPhotosFragment;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.StringUtil;
import com.contextlogic.wish.util.TabletUtil;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsPagerView, TabbedProductDetailsFragment, ProductDetailsTopRatingRow, TabbedProductDetailsWishButton, 
//            ProductDetailsMainPhotoAdapter, ProductDetailsExtraImagesLayout, TabbedProductDetailsRecommendButton

public class TabbedProductDetailsOverviewView extends TabbedProductDetailsPagerView
    implements com.contextlogic.wish.ui.components.scrollview.ListeningScrollView.ScrollViewListener, ProductDetailsMainPhotoAdapter.PhotoAdapterCallback
{

    private View arrivalDetailsText;
    private TextView arrivalText;
    private View colorHeader;
    private TextView colorHeaderText;
    private TextView colorText;
    private ProductDetailsExtraImagesLayout extraImagesLayout;
    private ImageView guaranteeImageView;
    private TextView guaranteeText;
    private View guaranteeView;
    private boolean imageScrollTracked;
    private BorderedImageView klarnaPaymentMethodImage;
    private ProductDetailsMainPhotoAdapter photoAdapter;
    private ViewPager productImageViewpager;
    private ImageView productRatingStarFive;
    private ImageView productRatingStarFour;
    private ImageView productRatingStarOne;
    private ImageView productRatingStarThree;
    private ImageView productRatingStarTwo;
    private TextView productRatingText;
    private View productRatingView;
    private PromoBannerView promoBannerView;
    private LinearLayout recentRatingsContainer;
    private View recentRatingsHeader;
    private View recentRatingsHeaderViewAll;
    private TabbedProductDetailsRecommendButton recommendButton;
    private View rootLayout;
    private ListeningScrollView scroller;
    private View shippingDetailsText;
    private TextView shippingOfferText;
    private TextView shippingOfferTitle;
    private View shippingOfferView;
    private TextView shippingText;
    private TextView sizeChartText;
    private View sizeHeader;
    private TextView sizeHeaderText;
    private TextView sizeText;
    private LinearLayout sizingBarNameContainer;
    private LinearLayout sizingBarRatioContainer;
    private LinearLayout sizingContainer;
    private View sizingHeader;
    private TextView sizingSubtitle;
    private View spacerView;
    private TextView titleView;
    private TextView uploadedByText;
    private BorderedImageView uploaderImage;
    private View uploaderLayout;
    private TextView uploaderSizeText;
    private TextView uploaderText;
    private boolean wishAnimated;
    private TabbedProductDetailsWishButton wishButton;
    private ImageView wishCheckmark;

    public TabbedProductDetailsOverviewView(Context context)
    {
        super(context);
    }

    public TabbedProductDetailsOverviewView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TabbedProductDetailsOverviewView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void addSizingSummaryBar(WishRatingSizeSummaryBar wishratingsizesummarybar)
    {
        Object obj = new UnifiedFontTextView(getContext());
        ((UnifiedFontTextView) (obj)).setText(wishratingsizesummarybar.getName());
        ((UnifiedFontTextView) (obj)).setTextSize(1, 13F);
        ((UnifiedFontTextView) (obj)).setTextColor(getResources().getColor(0x7f0c00b7));
        int i = (int)TypedValue.applyDimension(1, 15F, getContext().getResources().getDisplayMetrics());
        int j = (int)TypedValue.applyDimension(1, 25F, getContext().getResources().getDisplayMetrics());
        ((UnifiedFontTextView) (obj)).setPadding(0, 0, i, 0);
        ((UnifiedFontTextView) (obj)).setGravity(51);
        ((UnifiedFontTextView) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, j));
        sizingBarNameContainer.addView(((View) (obj)));
        obj = new ProgressBar(getContext(), null, 0x1010078);
        ((ProgressBar) (obj)).setProgressDrawable(getResources().getDrawable(0x7f020161));
        i = (int)TypedValue.applyDimension(1, 15F, getContext().getResources().getDisplayMetrics());
        j = (int)TypedValue.applyDimension(1, 10F, getContext().getResources().getDisplayMetrics());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, i);
        layoutparams.bottomMargin = j;
        ((ProgressBar) (obj)).setLayoutParams(layoutparams);
        ((ProgressBar) (obj)).setMax(100);
        ((ProgressBar) (obj)).setProgress((int)(wishratingsizesummarybar.getRatio() * 100D));
        sizingBarRatioContainer.addView(((View) (obj)));
    }

    private void animateWishCheckmark()
    {
        if (wishCheckmark.getDrawable() == null)
        {
            BitmapUtil.safeSetImageResource(wishCheckmark, 0x7f0201c9);
        }
        wishCheckmark.clearAnimation();
        wishCheckmark.setVisibility(0);
        ScaleAnimation scaleanimation = new ScaleAnimation(2.0F, 1.0F, 2.0F, 1.0F, 1, 0.5F, 1, 0.5F);
        scaleanimation.setDuration(250L);
        scaleanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final TabbedProductDetailsOverviewView this$0;

            public void onAnimationEnd(Animation animation)
            {
                animation = new AlphaAnimation(1.0F, 0.0F);
                animation.setDuration(500L);
                animation.setStartOffset(750L);
                animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final _cls9 this$1;

                    public void onAnimationEnd(Animation animation)
                    {
                        wishCheckmark.setImageDrawable(null);
                        wishCheckmark.setVisibility(8);
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                this$1 = _cls9.this;
                super();
            }
                });
                wishCheckmark.startAnimation(animation);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = TabbedProductDetailsOverviewView.this;
                super();
            }
        });
        wishCheckmark.startAnimation(scaleanimation);
    }

    private void clickSizingChart()
    {
        if (product == null || getContext() == null)
        {
            return;
        } else
        {
            fragment.trackClick(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_SIZING_CHART);
            EmbeddedBrowserFragment embeddedbrowserfragment = new EmbeddedBrowserFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("ArgUseNativeStyle", true);
            bundle.putString("ArgInitialUrl", product.getSizingChartUrl());
            embeddedbrowserfragment.setArguments(bundle);
            ((RootActivity)getContext()).setModalContentFragment(embeddedbrowserfragment, true);
            return;
        }
    }

    public static int getImageHeightForProduct(WishProduct wishproduct, Activity activity)
    {
        Display display = ((WindowManager)activity.getSystemService("window")).getDefaultDisplay();
        float f;
        DisplayMetrics displaymetrics;
        int i;
        int j;
        int k;
        int l;
        if (TabletUtil.isTablet(activity))
        {
            i = ((RootActivity)activity).getTabletContentContainerWidth();
        } else
        {
            i = display.getWidth();
        }
        displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        f = displaymetrics.density;
        j = (int)((double)i / wishproduct.getAspectRatio());
        l = (int)(wishproduct.getOriginalImageHeight() * (double)f);
        k = Math.max(i / 2, l);
        i = j;
        if (l != -1)
        {
            i = j;
            if (k < j)
            {
                i = k;
            }
        }
        return Math.min(display.getHeight() - (int)TypedValue.applyDimension(1, 220F, activity.getResources().getDisplayMetrics()), i);
    }

    private void refreshImageUploader()
    {
        int i = productImageViewpager.getCurrentItem();
        if (i > 0)
        {
            WishProductExtraImage wishproductextraimage = (WishProductExtraImage)product.getExtraPhotos().get(i - 1);
            if (wishproductextraimage.getUploader() != null && wishproductextraimage.getUploader().getName() != null && wishproductextraimage.getUploader().getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Medium) != null)
            {
                uploaderLayout.setVisibility(0);
                uploaderImage.getImageView().setImageUrl(wishproductextraimage.getUploader().getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Medium));
                uploaderText.setText(wishproductextraimage.getUploader().getName());
                if (wishproductextraimage.getSize() != null)
                {
                    uploaderText.setVisibility(8);
                    uploadedByText.setText(wishproductextraimage.getUploader().getName());
                    uploaderSizeText.setVisibility(0);
                    uploaderSizeText.setText(fragment.getString(0x7f0603ea, new Object[] {
                        wishproductextraimage.getSize()
                    }));
                    return;
                } else
                {
                    uploadedByText.setText(fragment.getString(0x7f06045b));
                    uploaderSizeText.setVisibility(8);
                    uploaderText.setVisibility(0);
                    return;
                }
            } else
            {
                uploaderLayout.setVisibility(8);
                uploaderImage.getImageView().setImageUrl(null);
                uploaderText.setText(null);
                return;
            }
        } else
        {
            uploaderLayout.setVisibility(8);
            uploaderImage.getImageView().setImageUrl(null);
            uploaderText.setText(null);
            return;
        }
    }

    private void setupCommerceItems()
    {
        Object obj;
        guaranteeView = rootLayout.findViewById(0x7f0d03b9);
        guaranteeText = (TextView)rootLayout.findViewById(0x7f0d03bb);
        guaranteeImageView = (ImageView)rootLayout.findViewById(0x7f0d03ba);
        if (product.getWishGuaranteeText() != null)
        {
            guaranteeView.setVisibility(0);
            guaranteeText.setText(product.getWishGuaranteeText());
            BitmapUtil.safeSetImageResource(guaranteeImageView, 0x7f02011b);
        } else
        {
            guaranteeView.setVisibility(8);
        }
        recentRatingsHeader = rootLayout.findViewById(0x7f0d03a1);
        recentRatingsHeaderViewAll = rootLayout.findViewById(0x7f0d03a2);
        recentRatingsContainer = (LinearLayout)rootLayout.findViewById(0x7f0d03a3);
        if (product.getTopRatings() != null && product.getTopRatings().size() > 0)
        {
            recentRatingsHeader.setVisibility(0);
            recentRatingsContainer.setVisibility(0);
            recentRatingsHeaderViewAll.setOnClickListener(new android.view.View.OnClickListener() {

                final TabbedProductDetailsOverviewView this$0;

                public void onClick(View view)
                {
                    fragment.showProductRatings();
                }

            
            {
                this$0 = TabbedProductDetailsOverviewView.this;
                super();
            }
            });
            recentRatingsContainer.removeAllViews();
            ProductDetailsTopRatingRow productdetailstopratingrow;
            for (Iterator iterator = product.getTopRatings().iterator(); iterator.hasNext(); recentRatingsContainer.addView(productdetailstopratingrow))
            {
                WishRating wishrating = (WishRating)iterator.next();
                productdetailstopratingrow = new ProductDetailsTopRatingRow(getContext());
                productdetailstopratingrow.setRating(wishrating);
            }

        } else
        {
            recentRatingsHeader.setVisibility(8);
            recentRatingsContainer.setVisibility(8);
        }
        sizingHeader = rootLayout.findViewById(0x7f0d03a4);
        sizingContainer = (LinearLayout)rootLayout.findViewById(0x7f0d03a5);
        sizingSubtitle = (TextView)rootLayout.findViewById(0x7f0d03a8);
        sizingBarNameContainer = (LinearLayout)rootLayout.findViewById(0x7f0d03a6);
        sizingBarRatioContainer = (LinearLayout)rootLayout.findViewById(0x7f0d03a7);
        String s;
        Object obj1;
        Object obj2;
        if (product.getRatingSizeSummary() != null && product.getRatingSizeSummary().getNumRatings() > 0L)
        {
            sizingHeader.setVisibility(0);
            sizingContainer.setVisibility(0);
            sizingSubtitle.setVisibility(0);
            sizingBarNameContainer.removeAllViews();
            sizingBarRatioContainer.removeAllViews();
            for (Iterator iterator1 = product.getRatingSizeSummary().getSizeBars().iterator(); iterator1.hasNext(); addSizingSummaryBar((WishRatingSizeSummaryBar)iterator1.next())) { }
            sizingSubtitle.setText(product.getRatingSizeSummary().getSubtitle());
        } else
        {
            sizingHeader.setVisibility(8);
            sizingContainer.setVisibility(8);
            sizingSubtitle.setVisibility(8);
        }
        sizeHeader = rootLayout.findViewById(0x7f0d03a9);
        sizeHeaderText = (TextView)rootLayout.findViewById(0x7f0d03aa);
        sizeText = (TextView)rootLayout.findViewById(0x7f0d03ac);
        sizeChartText = (TextView)rootLayout.findViewById(0x7f0d03ab);
        sizeChartText.setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsOverviewView this$0;

            public void onClick(View view)
            {
                clickSizingChart();
            }

            
            {
                this$0 = TabbedProductDetailsOverviewView.this;
                super();
            }
        });
        obj1 = null;
        obj2 = null;
        if (product.getVariationSizes() != null && product.getVariationSizes().size() > 0)
        {
            obj = StringUtil.joinList(product.getVariationSizes(), ", ", false);
            s = WishApplication.getAppInstance().getQuantityString(0x7f070004, product.getVariationSizes().size());
        } else
        {
            obj = obj2;
            s = obj1;
            if (product.getHiddenVariationSizes() != null)
            {
                obj = obj2;
                s = obj1;
                if (product.getHiddenVariationSizes().size() > 0)
                {
                    obj = StringUtil.joinList(product.getHiddenVariationSizes(), ", ", false);
                    s = WishApplication.getAppInstance().getQuantityString(0x7f070004, product.getHiddenVariationSizes().size());
                }
            }
        }
        if (s != null && obj != null)
        {
            sizeHeaderText.setText(s);
            sizeText.setText(((CharSequence) (obj)));
            if (product.getSizingChartUrl() != null)
            {
                sizeChartText.setText(fragment.getString(0x7f0603ec));
            } else
            {
                sizeChartText.setVisibility(8);
            }
        } else
        {
            sizeHeader.setVisibility(8);
            sizeText.setVisibility(8);
            sizeChartText.setVisibility(8);
        }
        colorHeader = rootLayout.findViewById(0x7f0d03ad);
        colorHeaderText = (TextView)rootLayout.findViewById(0x7f0d03ae);
        colorText = (TextView)rootLayout.findViewById(0x7f0d03af);
        obj1 = null;
        obj2 = null;
        if (product.getVariationColors() != null && product.getVariationColors().size() > 0)
        {
            obj = StringUtil.joinList(product.getVariationColors(), ", ", false);
            s = WishApplication.getAppInstance().getQuantityString(0x7f070003, product.getVariationColors().size());
        } else
        {
            obj = obj2;
            s = obj1;
            if (product.getHiddenVariationColors() != null)
            {
                obj = obj2;
                s = obj1;
                if (product.getHiddenVariationColors().size() > 0)
                {
                    obj = StringUtil.joinList(product.getHiddenVariationColors(), ", ", false);
                    s = WishApplication.getAppInstance().getQuantityString(0x7f070003, product.getHiddenVariationColors().size());
                }
            }
        }
        if (s != null && obj != null)
        {
            colorHeaderText.setText(s);
            colorText.setText(((CharSequence) (obj)));
        } else
        {
            colorHeader.setVisibility(8);
            colorText.setVisibility(8);
        }
        if (product.getShippingPrice().getValue() <= 0.0D)
        {
            obj = getContext().getString(0x7f0601e1);
        } else
        {
            obj = product.getShippingPrice().toFormattedString(false, false);
        }
        s = product.getShippingTimeString();
        arrivalDetailsText = rootLayout.findViewById(0x7f0d03b2);
        arrivalDetailsText.setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsOverviewView this$0;

            public void onClick(View view)
            {
                fragment.showShippingInfo();
            }

            
            {
                this$0 = TabbedProductDetailsOverviewView.this;
                super();
            }
        });
        arrivalText = (TextView)rootLayout.findViewById(0x7f0d03b3);
        arrivalText.setText(s);
        shippingDetailsText = rootLayout.findViewById(0x7f0d03b6);
        shippingDetailsText.setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsOverviewView this$0;

            public void onClick(View view)
            {
                fragment.showShippingInfo();
            }

            
            {
                this$0 = TabbedProductDetailsOverviewView.this;
                super();
            }
        });
        shippingText = (TextView)rootLayout.findViewById(0x7f0d03b7);
        shippingText.setText(((CharSequence) (obj)));
        shippingOfferView = rootLayout.findViewById(0x7f0d039c);
        shippingOfferTitle = (TextView)rootLayout.findViewById(0x7f0d039e);
        shippingOfferText = (TextView)rootLayout.findViewById(0x7f0d039f);
        if (product.getShippingOfferText() != null && product.getShippingOfferTitle() != null)
        {
            shippingOfferView.setVisibility(0);
            shippingOfferTitle.setText(product.getShippingOfferTitle());
            shippingOfferText.setText(product.getShippingOfferText());
            BitmapUtil.safeSetImageResource((ImageView)rootLayout.findViewById(0x7f0d039d), 0x7f020123);
        } else
        {
            shippingOfferView.setVisibility(8);
        }
        productRatingView = rootLayout.findViewById(0x7f0d0395);
        productRatingView.setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsOverviewView this$0;

            public void onClick(View view)
            {
                fragment.showProductRatings();
            }

            
            {
                this$0 = TabbedProductDetailsOverviewView.this;
                super();
            }
        });
        productRatingText = (TextView)rootLayout.findViewById(0x7f0d039b);
        productRatingStarOne = (ImageView)rootLayout.findViewById(0x7f0d0396);
        productRatingStarTwo = (ImageView)rootLayout.findViewById(0x7f0d0397);
        productRatingStarThree = (ImageView)rootLayout.findViewById(0x7f0d0398);
        productRatingStarFour = (ImageView)rootLayout.findViewById(0x7f0d0399);
        productRatingStarFive = (ImageView)rootLayout.findViewById(0x7f0d039a);
        if (product.getProductRatingCount() <= 0) goto _L2; else goto _L1
_L1:
        double d;
        int i;
        if (product.getProductRatingCount() > 0)
        {
            d = product.getProductRating();
        } else
        {
            d = 5D;
        }
        obj = new int[5];
        i = 0;
        while (i < 5) 
        {
            if (d >= (double)(i + 1))
            {
                obj[i] = 0x7f0201cf;
            } else
            {
                double d1 = (double)(i + 1) - d;
                if (d1 <= 0.25D)
                {
                    obj[i] = 0x7f0201cf;
                } else
                if (d1 <= 0.75D)
                {
                    obj[i] = 0x7f0200dd;
                } else
                {
                    obj[i] = 0x7f0200d9;
                }
            }
            i++;
        }
        productRatingStarOne.setImageResource(obj[0]);
        productRatingStarTwo.setImageResource(obj[1]);
        productRatingStarThree.setImageResource(obj[2]);
        productRatingStarFour.setImageResource(obj[3]);
        productRatingStarFive.setImageResource(obj[4]);
        productRatingText.setText(String.format("(%1$s)", new Object[] {
            NumberFormat.getInstance().format(product.getProductRatingCount())
        }));
_L4:
        refreshWishStates(false);
        return;
_L2:
        productRatingView.setVisibility(8);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void cleanup()
    {
        releaseImages();
    }

    public int getCurrentScrollY()
    {
        if (scroller != null)
        {
            return scroller.getScrollY();
        } else
        {
            return 0;
        }
    }

    public void handleOrientationChanged()
    {
    }

    protected void init()
    {
        super.init();
        rootLayout = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300b0, this);
    }

    public void onScrollChanged(int i, int j)
    {
        handleScrollChanged(i, j);
    }

    public void refreshWishStates(boolean flag)
    {
        if (product.isAlreadyWishing())
        {
            if (((RootActivity)getContext()).getWishlistExperimentBucket().equals("show"))
            {
                wishButton.setButtonMode(TabbedProductDetailsWishButton.ButtonMode.WishedV2);
            } else
            {
                wishButton.setButtonMode(TabbedProductDetailsWishButton.ButtonMode.Wished);
            }
            if (!wishAnimated)
            {
                wishAnimated = true;
                if (flag)
                {
                    animateWishCheckmark();
                }
            }
            return;
        }
        if (fragment.isWishPending(product.getProductId()))
        {
            wishButton.setButtonMode(TabbedProductDetailsWishButton.ButtonMode.WishLoading);
            return;
        } else
        {
            wishButton.setButtonMode(TabbedProductDetailsWishButton.ButtonMode.Wish);
            return;
        }
    }

    public void releaseImages()
    {
        if (photoAdapter != null)
        {
            photoAdapter.releaseImages();
        }
    }

    public void restoreImages()
    {
        if (photoAdapter != null)
        {
            photoAdapter.restoreImages();
        }
    }

    public void setup(WishProduct wishproduct, int i, TabbedProductDetailsFragment tabbedproductdetailsfragment)
    {
        super.setup(wishproduct, i, tabbedproductdetailsfragment);
        scroller = (ListeningScrollView)rootLayout.findViewById(0x7f0d0388);
        scroller.setScrollViewListener(this);
        setupScroller(scroller);
        spacerView = rootLayout.findViewById(0x7f0d0389);
        tabbedproductdetailsfragment = new android.widget.LinearLayout.LayoutParams(-1, tabbedproductdetailsfragment.getTabBarStripHeight());
        spacerView.setLayoutParams(tabbedproductdetailsfragment);
        productImageViewpager = (ViewPager)rootLayout.findViewById(0x7f0d038a);
        titleView = (TextView)rootLayout.findViewById(0x7f0d0394);
        extraImagesLayout = (ProductDetailsExtraImagesLayout)rootLayout.findViewById(0x7f0d0390);
        wishCheckmark = (ImageView)rootLayout.findViewById(0x7f0d03bc);
        wishButton = (TabbedProductDetailsWishButton)rootLayout.findViewById(0x7f0d0392);
        wishButton.setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsOverviewView this$0;

            public void onClick(View view)
            {
                if (product.isAlreadyWishing())
                {
                    if (((RootActivity)getContext()).getWishlistExperimentBucket().equals("show"))
                    {
                        fragment.unwishProduct(product);
                        return;
                    } else
                    {
                        fragment.editListForProduct(product.getProductId());
                        return;
                    }
                } else
                {
                    fragment.wishForProduct(product);
                    return;
                }
            }

            
            {
                this$0 = TabbedProductDetailsOverviewView.this;
                super();
            }
        });
        recommendButton = (TabbedProductDetailsRecommendButton)rootLayout.findViewById(0x7f0d0393);
        recommendButton.setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsOverviewView this$0;

            public void onClick(View view)
            {
                fragment.handleRecommendClick(product);
            }

            
            {
                this$0 = TabbedProductDetailsOverviewView.this;
                super();
            }
        });
        uploaderLayout = rootLayout.findViewById(0x7f0d038b);
        uploaderImage = (BorderedImageView)rootLayout.findViewById(0x7f0d038c);
        uploaderText = (TextView)rootLayout.findViewById(0x7f0d038f);
        uploadedByText = (TextView)rootLayout.findViewById(0x7f0d038e);
        uploaderSizeText = (TextView)rootLayout.findViewById(0x7f0d038d);
        uploaderImage.getImageView().setRequestedImageWidth(40);
        uploaderImage.getImageView().setRequestedImageHeight(40);
        promoBannerView = (PromoBannerView)rootLayout.findViewById(0x7f0d03a0);
        if (wishproduct.getPromoBannerSpec() != null)
        {
            promoBannerView.setBannerSpec(wishproduct.getPromoBannerSpec());
            promoBannerView.setVisibility(0);
        } else
        {
            promoBannerView.setVisibility(8);
        }
        klarnaPaymentMethodImage = (BorderedImageView)rootLayout.findViewById(0x7f0d03b8);
        wishproduct = (RootActivity)getContext();
        if (UserStatusManager.getInstance().getBucketForExperiment("mobile_klarna_banner_details").equals("show") && wishproduct != null && UserStatusManager.getInstance().getKlarnaCountryCode() != null)
        {
            klarnaPaymentMethodImage.setUseLoadingSpinner(com.contextlogic.wish.ui.components.image.BorderedImageView.LoadingStyle.Gone);
            klarnaPaymentMethodImage.getImageView().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            tabbedproductdetailsfragment = ((WindowManager)wishproduct.getSystemService("window")).getDefaultDisplay();
            if (TabletUtil.isTablet(wishproduct))
            {
                i = wishproduct.getTabletContentContainerWidth();
            } else
            {
                i = tabbedproductdetailsfragment.getWidth();
            }
            i -= (int)TypedValue.applyDimension(1, 16F, getResources().getDisplayMetrics());
            klarnaPaymentMethodImage.getLayoutParams().height = (int)((double)i * 0.19D);
            klarnaPaymentMethodImage.getImageView().setImageUrl(KlarnaPaymentProcessor.getPaymentMethodImageUrl(i));
        } else
        {
            klarnaPaymentMethodImage.setVisibility(8);
        }
        i = getImageHeightForProduct(product, fragment.getActivity());
        wishproduct = new android.widget.FrameLayout.LayoutParams(-1, i);
        productImageViewpager.setLayoutParams(wishproduct);
        productImageViewpager.setVisibility(0);
        photoAdapter = new ProductDetailsMainPhotoAdapter(fragment.getActivity(), this, i, product);
        productImageViewpager.setAdapter(photoAdapter);
        productImageViewpager.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final TabbedProductDetailsOverviewView this$0;

            public void onPageScrollStateChanged(int j)
            {
            }

            public void onPageScrolled(int j, float f, int k)
            {
            }

            public void onPageSelected(int j)
            {
                if (j != 0 && !imageScrollTracked)
                {
                    imageScrollTracked = true;
                    fragment.trackClick(WishAnalyticsEvent.CLICK_SCROLL_MAIN_PRODUCT_IMAGE, product.getProductId());
                }
                refreshImageUploader();
            }

            
            {
                this$0 = TabbedProductDetailsOverviewView.this;
                super();
            }
        });
        refreshImageUploader();
        wishAnimated = product.isAlreadyWishing();
        extraImagesLayout.setProduct(product, false);
        titleView.setText(product.getName());
        if (product.isCommerceProduct())
        {
            setupCommerceItems();
        }
    }

    public void showExtraPhotos(int i)
    {
        (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_EXTRA_PHOTOS.getValue()), product.getProductId(), null, null);
        ProductPhotosFragment productphotosfragment = new ProductPhotosFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ArgProduct", product);
        bundle.putInt("ArgStartIndex", index);
        productphotosfragment.setArguments(bundle);
        ((RootActivity)fragment.getActivity()).setModalContentFragment(productphotosfragment, true);
    }



/*
    static boolean access$002(TabbedProductDetailsOverviewView tabbedproductdetailsoverviewview, boolean flag)
    {
        tabbedproductdetailsoverviewview.imageScrollTracked = flag;
        return flag;
    }

*/



}
