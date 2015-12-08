// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.astuetz.PagerSlidingTabStrip;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishAddToCartOffer;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.api.service.GetProductService;
import com.contextlogic.wish.api.service.HideProductService;
import com.contextlogic.wish.api.service.MoveToBucketService;
import com.contextlogic.wish.api.service.ProductWishService;
import com.contextlogic.wish.cache.ImageCacheWarmer;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.components.timer.CountdownTimerView;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.menu.MainMenuItem;
import com.contextlogic.wish.ui.fragment.menu.wishlist.MoveToWishlistMenuFragment;
import com.contextlogic.wish.ui.fragment.menu.wishlist.WishlistMenuFragment;
import com.contextlogic.wish.ui.fragment.product.flag.FlagProductFragment;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedMoveToBucketView;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.TabletUtil;
import com.facebook.AppEventsLogger;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsPagerAdapter, ProductDetailsAddToCartModal, TabbedProductDetailsOverviewView

public class TabbedProductDetailsFragment extends BaseContentFragment
    implements ApiDataChangeNotificationListener, com.contextlogic.wish.ui.fragment.productfeed.ProductFeedGridCellView.GridCellFragment
{

    public static final String ARG_BUCKET = "ArgBucket";
    public static final String ARG_CREDIT = "ArgCredit";
    public static final String ARG_FROM_CART = "ArgFromCart";
    public static final String ARG_PRODUCT = "ArgProduct";
    public static final int TAB_BAR_HEIGHT = 52;
    private UnifiedFontButton addToCartButton;
    private View addToCartButtonContainer;
    private ProductDetailsAddToCartModal addToCartModal;
    private ImageView addToCartOfferArrow;
    private LinearLayout addToCartOfferCounterContainer;
    private TextView addToCartOfferText;
    private CountdownTimerView addToCartOfferTimer;
    private View addToCartOfferView;
    private String appIndexingTitle;
    private Uri appUri;
    private ImageCacheWarmer cacheWarmer;
    private String creditId;
    private View errorView;
    private boolean firstLoadRequested;
    private boolean fromCart;
    private GetProductService getProductService;
    private WishProduct initialProduct;
    private TextView listPriceText;
    private WishProduct loadedProduct;
    private boolean loadingErrored;
    private View loadingView;
    private boolean mAppIndexTrackStarted;
    private boolean mAppIndexTracked;
    private GoogleApiClient mClient;
    private ProductFeedMoveToBucketView moveToBucketView;
    private android.support.v4.view.ViewPager.OnPageChangeListener pageScrollListener;
    private TabbedProductDetailsPagerAdapter pagerAdapter;
    private WishUserProductBucket productBucket;
    private View productView;
    private ViewPager productViewPager;
    private ProductWishService productWishService;
    private View soldOutButton;
    private PagerSlidingTabStrip tabStrip;
    private View tabStripContainer;
    private TextView taxText;
    private Uri webUrl;
    private TextView yourPriceText;

    public TabbedProductDetailsFragment()
    {
    }

    private void customizeTabStrip()
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            int i = (int)TypedValue.applyDimension(1, 3F, getResources().getDisplayMetrics());
            int j = (int)TypedValue.applyDimension(1, 14F, getResources().getDisplayMetrics());
            tabStrip.setUnderlineHeight(0);
            tabStrip.setUnderlineColorResource(0x7f0c00bf);
            tabStrip.setIndicatorHeight(i);
            tabStrip.setIndicatorColorResource(0x7f0c00e8);
            tabStrip.setDividerColorResource(0x7f0c00bf);
            tabStrip.setTextColorResource(0x7f0c00e8);
            tabStrip.setTextSize(j);
            return;
        }
    }

    private void handleFlagAsInappropriate()
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("ArgProduct", loadedProduct);
        FlagProductFragment flagproductfragment = new FlagProductFragment();
        flagproductfragment.setArguments(bundle);
        ((RootActivity)getActivity()).setContentFragment(flagproductfragment, false);
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f060199));
        refreshViewState();
    }

    private void handleLoadingSuccess(WishProduct wishproduct)
    {
        loadedProduct = wishproduct;
        pagerAdapter.updatePages();
        trackAppIndexImpression();
        customizeTabStrip();
        tabStrip.setViewPager(productViewPager);
        tabStrip.setOnPageChangeListener(pageScrollListener);
        refreshTabStripFontColors();
        if (loadedProduct.isCommerceProduct())
        {
            wishproduct = new Bundle();
            wishproduct.putString("fb_currency", loadedProduct.getCommerceValue().getLocalizedCurrencyCode());
            wishproduct.putString("fb_content_type", "product");
            wishproduct.putString("fb_content_id", loadedProduct.getProductId());
            FacebookManager.getInstance().getAppEventLogger().logEvent("fb_mobile_content_view", loadedProduct.getCommerceValue().getValue(), wishproduct);
            WishLocalizedCurrencyValue wishlocalizedcurrencyvalue;
            int i;
            if (loadedProduct.isInStock())
            {
                soldOutButton.setVisibility(8);
            } else
            {
                addToCartButton.setVisibility(8);
            }
            wishproduct = loadedProduct.getCommerceValue();
            if (wishproduct.getValue() > 0.0D)
            {
                yourPriceText.setText(wishproduct.toFormattedString());
            } else
            {
                yourPriceText.setText(getString(0x7f0601e1));
            }
            wishlocalizedcurrencyvalue = loadedProduct.getValue();
            if (wishlocalizedcurrencyvalue.getValue() > wishproduct.getValue())
            {
                if (wishlocalizedcurrencyvalue.getValue() > 0.0D)
                {
                    listPriceText.setText(wishlocalizedcurrencyvalue.toFormattedString());
                } else
                {
                    listPriceText.setText(getString(0x7f0601e1));
                }
            } else
            {
                listPriceText.setText("");
            }
        } else
        {
            addToCartButtonContainer.setVisibility(8);
        }
        if (loadedProduct.getTaxText() != null)
        {
            taxText.setVisibility(0);
            taxText.setText(loadedProduct.getTaxText());
            i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
            wishproduct = (android.widget.LinearLayout.LayoutParams)listPriceText.getLayoutParams();
            wishproduct.bottomMargin = i;
            listPriceText.setLayoutParams(wishproduct);
            wishproduct = (android.widget.LinearLayout.LayoutParams)yourPriceText.getLayoutParams();
            wishproduct.bottomMargin = i;
            yourPriceText.setLayoutParams(wishproduct);
        } else
        {
            taxText.setVisibility(8);
        }
        if (loadedProduct.getAddToCartOffer() != null && !loadedProduct.getAddToCartOffer().isExpired())
        {
            addToCartOfferView.setVisibility(0);
            addToCartOfferTimer = new CountdownTimerView(getActivity());
            addToCartOfferTimer.setup(loadedProduct.getAddToCartOffer().getExpiry(), 18, getResources().getColor(0x7f0c00e8), getResources().getColor(0x7f0c008d));
            addToCartOfferTimer.startTimer();
            addToCartOfferCounterContainer.removeAllViews();
            addToCartOfferCounterContainer.addView(addToCartOfferTimer);
            BitmapUtil.safeSetImageResource(addToCartOfferArrow, 0x7f02003d);
            addToCartOfferText.setText(loadedProduct.getAddToCartOffer().getTitle());
        } else
        {
            addToCartOfferView.setVisibility(8);
            addToCartOfferArrow.setVisibility(8);
        }
        refreshViewState();
        refreshNavigationBar();
    }

    private void handlePageSelected(int i)
    {
        trackClick(WishAnalyticsEvent.CLICK_MOBILE_PRODUCT_DETAIL_SECTION);
        refreshTabStripFontColors();
    }

    private void hideAllUiElements()
    {
        productView.setVisibility(8);
        errorView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void loadProduct()
    {
        loadingErrored = false;
        firstLoadRequested = true;
        getProductService.requestService(initialProduct.getProductId(), creditId, 0, new com.contextlogic.wish.api.service.GetProductService.SuccessCallback() {

            final TabbedProductDetailsFragment this$0;

            public void onServiceSucceeded(WishProduct wishproduct)
            {
                handleLoadingSuccess(wishproduct);
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final TabbedProductDetailsFragment this$0;

            public void onServiceFailed()
            {
                handleLoadingFailure();
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
        });
        refreshViewState();
    }

    private void onPagerScrollSettled()
    {
        if (pagerAdapter != null)
        {
            pagerAdapter.onPagerScrollSettled();
        }
    }

    private void onPagerScrollUnsettled()
    {
        if (pagerAdapter != null)
        {
            pagerAdapter.onPagerScrollUnsettled();
        }
    }

    private void performAddToCart(String s, String s1, String s2, int i)
    {
        RootActivity rootactivity = (RootActivity)getActivity();
        if (rootactivity != null)
        {
            rootactivity.showCart(s, s1, s2, i);
        }
    }

    private void prepareAppIndexing()
    {
        if (loadedProduct == null)
        {
            return;
        } else
        {
            String s1 = UserStatusManager.getInstance().getGoogleAppIndexingBaseAppUri();
            String s = UserStatusManager.getInstance().getGoogleAppIndexingBaseWebUrl();
            s1 = (new StringBuilder()).append(s1).append(loadedProduct.getProductId()).toString();
            s = (new StringBuilder()).append(s).append(loadedProduct.getProductId()).toString();
            appUri = Uri.parse(s1);
            webUrl = Uri.parse(s);
            appIndexingTitle = (new StringBuilder()).append(WishApplication.getAppInstance().getAppName()).append(" | ").append(loadedProduct.getName()).toString();
            return;
        }
    }

    private void refreshNavigationBar()
    {
        NavigationBarWrapper navigationbarwrapper = getNavigationBar();
        navigationbarwrapper.setTitle(getString(0x7f060120));
        navigationbarwrapper.clearRightButtons();
        navigationbarwrapper.addMenuItem(getResources().getString(0x7f06039b), 0x7f0200be, new NavigationBarButtonCallback() {

            final TabbedProductDetailsFragment this$0;

            public void onMenuItemClicked()
            {
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_DETAILS_SEARCH);
                if (getActivity() != null)
                {
                    getActivity().onSearchRequested();
                }
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
        }, false);
        if (loadedProduct != null)
        {
            navigationbarwrapper.addMenuItem(getResources().getString(0x7f060164), 0, new NavigationBarButtonCallback() {

                final TabbedProductDetailsFragment this$0;

                public void onMenuItemClicked()
                {
                    handleFlagAsInappropriate();
                }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
            }, true);
        }
    }

    private void refreshTabStripFontColors()
    {
        LinearLayout linearlayout = (LinearLayout)tabStrip.getChildAt(0);
        int i = 0;
        while (i < linearlayout.getChildCount()) 
        {
            TextView textview = (TextView)linearlayout.getChildAt(i);
            if (i == productViewPager.getCurrentItem())
            {
                textview.setTextColor(getResources().getColor(0x7f0c00e8));
            } else
            {
                textview.setTextColor(getResources().getColor(0x7f0c00e0));
            }
            i++;
        }
    }

    private void refreshViewState()
    {
        hideAllUiElements();
        if (loadingErrored)
        {
            errorView.setVisibility(0);
            return;
        }
        if (!firstLoadRequested || getProductService.isPending())
        {
            loadingView.setVisibility(0);
            return;
        } else
        {
            productView.setVisibility(0);
            return;
        }
    }

    private void refreshWishStates(boolean flag)
    {
        if (pagerAdapter != null)
        {
            pagerAdapter.refreshWishStates(flag);
        }
    }

    private void refreshWishStatesDelayed(final boolean allowAnimate)
    {
        if (getView() != null)
        {
            getView().post(new Runnable() {

                final TabbedProductDetailsFragment this$0;
                final boolean val$allowAnimate;

                public void run()
                {
                    pagerAdapter.refreshWishStates(allowAnimate);
                }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                allowAnimate = flag;
                super();
            }
            });
        }
    }

    private void showAddToCartModal(final WishProduct product)
    {
        addToCartModal = new ProductDetailsAddToCartModal(getActivity());
        addToCartModal.setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsFragment this$0;

            public void onClick(View view)
            {
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
        });
        addToCartModal.setProduct(product, getApplicableCredit(product));
        addToCartModal.setCallback(new ProductDetailsAddToCartModal.Callback() {

            final TabbedProductDetailsFragment this$0;
            final WishProduct val$product;

            public void onAddToCart(String s, String s1, int i)
            {
                clearOverlay();
                addToCartModal = null;
                performAddToCart(product.getCommerceProductId(), s1, product.getAddToCartOfferId(), i);
            }

            public void onAddToCartCancel()
            {
                clearOverlay();
                addToCartModal = null;
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                product = wishproduct;
                super();
            }
        });
        showOverlay(addToCartModal, false);
    }

    private void stopAppIndexImpression()
    {
        if (mAppIndexTrackStarted)
        {
            if (webUrl != null && appUri != null)
            {
                Action action = Action.newAction("http://schema.org/ViewAction", appIndexingTitle, webUrl, appUri);
                AppIndex.AppIndexApi.end(mClient, action);
                mClient.disconnect();
            }
            mAppIndexTrackStarted = false;
        }
    }

    private void trackAppIndexImpression()
    {
        if (!mAppIndexTrackStarted && !mAppIndexTracked)
        {
            prepareAppIndexing();
            if (webUrl != null && appUri != null && appUri.getScheme().equals("android-app"))
            {
                mClient.connect();
                Action action = Action.newAction("http://schema.org/ViewAction", appIndexingTitle, webUrl, appUri);
                AppIndex.AppIndexApi.start(mClient, action);
                mAppIndexTrackStarted = true;
                mAppIndexTracked = true;
            }
        }
    }

    public void addProductToCart(WishProduct wishproduct)
    {
label0:
        {
            if (wishproduct != null && wishproduct.isCommerceProduct() && wishproduct.isInStock())
            {
                if (!wishproduct.canShowAddToCartModal())
                {
                    break label0;
                }
                showAddToCartModal(wishproduct);
            }
            return;
        }
        performAddToCart(wishproduct.getCommerceProductId(), wishproduct.getCommerceDefaultVariationId(), wishproduct.getAddToCartOfferId(), 1);
    }

    public void editListForProduct(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        editListForProducts(arraylist);
    }

    public void editListForProducts(ArrayList arraylist)
    {
        if (getActivity() == null)
        {
            return;
        }
        com.contextlogic.wish.ui.fragment.menu.wishlist.MoveToWishlistMenuFragment.Callback callback = new com.contextlogic.wish.ui.fragment.menu.wishlist.MoveToWishlistMenuFragment.Callback() {

            final TabbedProductDetailsFragment this$0;

            public void onBucketEditCancelled()
            {
                clearOverlay();
            }

            public void onBucketEdited(ArrayList arraylist1, String s, String s1)
            {
                Object obj = (RootActivity)getActivity();
                if (!TabletUtil.isTablet(getActivity()) && ((RootActivity) (obj)).hasRightMenu()) goto _L2; else goto _L1
_L1:
                clearOverlay();
_L4:
                obj = arraylist1.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    String s3 = (String)((Iterator) (obj)).next();
                    if (getLoadedProduct() != null && s3.equals(getLoadedProduct().getProductId()) && productBucket != null && s1 != null && s1.equals(productBucket.getBucketId()))
                    {
                        (new ArrayList()).add(s3);
                        ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketEdit(productBucket, arraylist1);
                    }
                } while (true);
                break; /* Loop/switch isn't completed */
_L2:
                if (obj != null)
                {
                    ((RootActivity) (obj)).closeMenus();
                }
                if (true) goto _L4; else goto _L3
_L3:
                PopupAlertDialog.showSuccess(getActivity(), null, String.format(getActivity().getString(0x7f0602b5), new Object[] {
                    s
                }));
                String s2;
                for (arraylist1 = arraylist1.iterator(); arraylist1.hasNext(); (new MoveToBucketService()).requestService(s2, s, s1, null, null))
                {
                    s2 = (String)arraylist1.next();
                }

                ((RootActivity)getActivity()).setRightMenuFragment(new WishlistMenuFragment());
                return;
            }

            public void onProductsRemoved(ArrayList arraylist1)
            {
                Object obj = (RootActivity)getActivity();
                if (TabletUtil.isTablet(getActivity()) || !((RootActivity) (obj)).hasRightMenu())
                {
                    clearOverlay();
                } else
                {
                    ((RootActivity) (obj)).closeMenus();
                }
                obj = arraylist1.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    String s = (String)((Iterator) (obj)).next();
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForProductUnwish(s);
                    (new HideProductService()).requestService(s, new com.contextlogic.wish.api.service.HideProductService.SuccessCallback() {

                        final _cls13 this$1;

                        public void onServiceSucceeded()
                        {
                            trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
                        }

            
            {
                this$1 = _cls13.this;
                super();
            }
                    }, null);
                    if (getLoadedProduct() != null && s.equals(getLoadedProduct().getProductId()) && productBucket != null)
                    {
                        ArrayList arraylist2 = new ArrayList();
                        arraylist2.add(s);
                        ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketEdit(productBucket, arraylist2);
                    }
                } while (true);
                PopupAlertDialog.showSuccess(getActivity(), null, WishApplication.getAppInstance().getQuantityString(0x7f070006, arraylist1.size()));
                ((RootActivity)getActivity()).setRightMenuFragment(new WishlistMenuFragment());
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
        };
        RootActivity rootactivity = (RootActivity)getActivity();
        if (TabletUtil.isTablet(rootactivity) || !rootactivity.hasRightMenu())
        {
            clearOverlay();
            moveToBucketView.setCallback(callback);
            moveToBucketView.show(arraylist);
            if (moveToBucketView.getParent() != null)
            {
                ((ViewGroup)moveToBucketView.getParent()).removeView(moveToBucketView);
            }
            showOverlay(moveToBucketView, true);
            return;
        } else
        {
            MoveToWishlistMenuFragment movetowishlistmenufragment = new MoveToWishlistMenuFragment();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ArgProductIds", arraylist);
            movetowishlistmenufragment.setArguments(bundle);
            movetowishlistmenufragment.setCallback(callback);
            rootactivity.setRightMenuFragment(movetowishlistmenufragment);
            rootactivity.showRightMenu();
            return;
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.ProductDetails;
    }

    public WishCredit getApplicableCredit(WishProduct wishproduct)
    {
        return null;
    }

    public int getCurrentIndex()
    {
        return productViewPager.getCurrentItem();
    }

    public com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode getDataMode()
    {
        return null;
    }

    public int getHiddenTabBarStripOffset()
    {
        return getTabBarStripHeight() * -1;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f0300ae;
    }

    public WishProduct getLoadedProduct()
    {
        return loadedProduct;
    }

    public int getTabBarStripHeight()
    {
        return (int)TypedValue.applyDimension(1, 52F, WishApplication.getAppInstance().getResources().getDisplayMetrics());
    }

    public int getTabBarStripOffset()
    {
        return ((android.widget.RelativeLayout.LayoutParams)tabStripContainer.getLayoutParams()).topMargin;
    }

    public MainMenuItem getTopLevelMenuItem()
    {
        return null;
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return null;
    }

    protected void handleOrientationChanged()
    {
        super.handleOrientationChanged();
        if (pagerAdapter != null)
        {
            pagerAdapter.handleOrientationChanged();
        }
    }

    public void handleProductClick(WishProduct wishproduct)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            ((RootActivity)getActivity()).setContentFragment(RootActivity.getProductDetailFragment(wishproduct, null, null, null), false);
            return;
        }
    }

    public void handleRecommendClick(WishProduct wishproduct)
    {
        trackClick(WishAnalyticsEvent.CLICK_MOBILE_RECOMMEND);
        if (getActivity() != null)
        {
            ((RootActivity)getActivity()).showShareDialog(wishproduct.getShareSubject(), wishproduct.getShareMessage());
        }
    }

    public void handleResume()
    {
        super.handleResume();
        if (!firstLoadRequested)
        {
            loadProduct();
        } else
        {
            refreshViewState();
        }
        if (addToCartOfferTimer != null)
        {
            addToCartOfferTimer.startTimer();
        }
        refreshWishStates(false);
    }

    public void hideTabBarStrip(boolean flag)
    {
        final int hiddenTabBarOffset = getHiddenTabBarStripOffset();
        int i = getTabBarStripOffset();
        if (i == hiddenTabBarOffset)
        {
            return;
        }
        tabStripContainer.clearAnimation();
        i = hiddenTabBarOffset - i;
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, i);
        long l;
        if (flag)
        {
            l = (int)(250D * ((double)Math.abs(i) / (double)getTabBarStripHeight()));
        } else
        {
            l = 0L;
        }
        translateanimation.setDuration(l);
        translateanimation.setFillAfter(false);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final TabbedProductDetailsFragment this$0;
            final int val$hiddenTabBarOffset;

            public void onAnimationEnd(Animation animation)
            {
                setTabBarStripOffset(hiddenTabBarOffset);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                hiddenTabBarOffset = i;
                super();
            }
        });
        tabStripContainer.startAnimation(translateanimation);
    }

    protected void initializeUi(View view)
    {
        loadingView = view.findViewById(0x7f0d0383);
        errorView = view.findViewById(0x7f0d0384);
        productView = view.findViewById(0x7f0d0375);
        productViewPager = (ViewPager)view.findViewById(0x7f0d0377);
        pagerAdapter = new TabbedProductDetailsPagerAdapter(getActivity(), this, productViewPager);
        productViewPager.setAdapter(pagerAdapter);
        tabStripContainer = view.findViewById(0x7f0d0381);
        tabStrip = (PagerSlidingTabStrip)view.findViewById(0x7f0d0382);
        moveToBucketView = new ProductFeedMoveToBucketView(getActivity());
        moveToBucketView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addToCartOfferView = view.findViewById(0x7f0d0376);
        addToCartOfferText = (TextView)view.findViewById(0x7f0d037a);
        addToCartOfferCounterContainer = (LinearLayout)view.findViewById(0x7f0d0379);
        addToCartOfferArrow = (ImageView)view.findViewById(0x7f0d0380);
        taxText = (TextView)view.findViewById(0x7f0d037f);
        addToCartButtonContainer = view.findViewById(0x7f0d0378);
        yourPriceText = (TextView)view.findViewById(0x7f0d037b);
        listPriceText = (TextView)view.findViewById(0x7f0d037c);
        listPriceText.setPaintFlags(listPriceText.getPaintFlags() | 0x10);
        soldOutButton = view.findViewById(0x7f0d037e);
        addToCartButton = (UnifiedFontButton)view.findViewById(0x7f0d037d);
        addToCartButton.setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsFragment this$0;

            public void onClick(View view1)
            {
                if (loadedProduct != null)
                {
                    addProductToCart(loadedProduct);
                }
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
        });
        hideAllUiElements();
        refreshNavigationBar();
        if (initialProduct != null && initialProduct.getImage() != null && initialProduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large) != null && initialProduct.getAspectRatio() > 0.0D)
        {
            int i;
            int j;
            if (TabletUtil.isTablet(getActivity()))
            {
                i = RootActivity.getContentPaneWidth(getActivity());
            } else
            {
                i = ((WindowManager)getActivity().getSystemService("window")).getDefaultDisplay().getWidth();
            }
            j = TabbedProductDetailsOverviewView.getImageHeightForProduct(initialProduct, getActivity());
            cacheWarmer.warmCache(initialProduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large), i, j, 0);
        }
    }

    public boolean isProductSelected(WishProduct wishproduct)
    {
        return false;
    }

    public boolean isWishPending(String s)
    {
        return productWishService.isPending(s);
    }

    public boolean onBackPressed()
    {
        final RootActivity rootActivity = (RootActivity)getActivity();
        if (fromCart && rootActivity != null)
        {
            rootActivity.post(new Runnable() {

                final TabbedProductDetailsFragment this$0;
                final RootActivity val$rootActivity;

                public void run()
                {
                    rootActivity.showCart(null, null, null);
                }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                rootActivity = rootactivity;
                super();
            }
            });
        }
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getProductService = new GetProductService();
        productWishService = new ProductWishService();
        cacheWarmer = new ImageCacheWarmer();
        pageScrollListener = new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final TabbedProductDetailsFragment this$0;

            public void onPageScrollStateChanged(int i)
            {
                if (i == 0)
                {
                    onPagerScrollSettled();
                    return;
                } else
                {
                    onPagerScrollUnsettled();
                    return;
                }
            }

            public void onPageScrolled(int i, float f, int j)
            {
                if (tabStripContainer.getAnimation() == null)
                {
                    showTabBarStrip(true);
                }
                refreshNavigationBar();
            }

            public void onPageSelected(int i)
            {
                handlePageSelected(i);
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
        };
        initialProduct = (WishProduct)getArguments().getSerializable("ArgProduct");
        creditId = getArguments().getString("ArgCredit");
        productBucket = (WishUserProductBucket)getArguments().getSerializable("ArgBucket");
        fromCart = getArguments().getBoolean("ArgFromCart", false);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Wish, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Unwish, this);
        mClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity())).addApi(AppIndex.API).build();
    }

    public void onDestroy()
    {
        super.onDestroy();
        cacheWarmer.cancelAll();
        getProductService.cancelAllRequests();
        if (pagerAdapter != null)
        {
            pagerAdapter.cleanup();
        }
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Wish || notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Unwish)
        {
            refreshWishStatesDelayed(false);
        }
    }

    public void onPause()
    {
        super.onPause();
        if (addToCartOfferTimer != null)
        {
            addToCartOfferTimer.pauseTimer();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        super.onStart();
        trackAppIndexImpression();
    }

    public void onStop()
    {
        stopAppIndexImpression();
        super.onStop();
    }

    protected void releaseImages()
    {
        if (pagerAdapter != null)
        {
            pagerAdapter.releaseImages();
        }
    }

    protected void restoreImages()
    {
        if (pagerAdapter != null)
        {
            pagerAdapter.restoreImages();
        }
    }

    protected void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
    }

    public void setTabBarStripOffset(int i)
    {
        tabStripContainer.clearAnimation();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)tabStripContainer.getLayoutParams();
        layoutparams.topMargin = Math.min(Math.max(i, getHiddenTabBarStripOffset()), 0);
        tabStripContainer.setLayoutParams(layoutparams);
    }

    public void showProductRatings()
    {
        if (pagerAdapter != null)
        {
            int i = pagerAdapter.getSectionIndex(TabbedProductDetailsPagerAdapter.ProductDetailSection.PRODUCT_RATINGS);
            if (i != -1)
            {
                switchToPosition(i, true);
            }
        }
    }

    public void showShippingInfo()
    {
        if (pagerAdapter != null)
        {
            int i = pagerAdapter.getSectionIndex(TabbedProductDetailsPagerAdapter.ProductDetailSection.SHIPPING_INFO);
            if (i != -1)
            {
                switchToPosition(i, true);
            }
        }
    }

    public void showTabBarStrip(boolean flag)
    {
        int i = getTabBarStripOffset();
        if (i == 0)
        {
            return;
        }
        tabStripContainer.clearAnimation();
        i = 0 - i;
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, i);
        long l;
        if (flag)
        {
            l = (int)(250D * ((double)Math.abs(i) / (double)getTabBarStripHeight()));
        } else
        {
            l = 0L;
        }
        translateanimation.setDuration(l);
        translateanimation.setFillAfter(false);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final TabbedProductDetailsFragment this$0;

            public void onAnimationEnd(Animation animation)
            {
                setTabBarStripOffset(0);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
        });
        tabStripContainer.startAnimation(translateanimation);
    }

    public void switchToPosition(int i, boolean flag)
    {
        if (i >= 0 && i < pagerAdapter.getCount())
        {
            productViewPager.setCurrentItem(i, flag);
            if (!flag)
            {
                refreshNavigationBar();
                return;
            }
        }
    }

    public void unwishProduct(WishProduct wishproduct)
    {
        wishproduct = wishproduct.getProductId();
        ApiDataChangeNotificationManager.getInstance().notifyListenersForProductUnwish(wishproduct);
        (new HideProductService()).requestService(wishproduct, new com.contextlogic.wish.api.service.HideProductService.SuccessCallback() {

            final TabbedProductDetailsFragment this$0;

            public void onServiceSucceeded()
            {
                trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.UnwishFromProductDetail, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
            }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
        }, null);
    }

    public boolean useCanvasBackground()
    {
        return true;
    }

    public void wishForProduct(WishProduct wishproduct)
    {
        if (!productWishService.isPending(wishproduct.getProductId()))
        {
            productWishService.requestService(wishproduct, null, false, new com.contextlogic.wish.api.service.ProductWishService.SuccessCallback() {

                final TabbedProductDetailsFragment this$0;

                public void onServiceSucceeded()
                {
                    refreshWishStatesDelayed(true);
                }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ProductWishService.FailureCallback() {

                final TabbedProductDetailsFragment this$0;

                public void onServiceFailed()
                {
                    refreshWishStatesDelayed(true);
                }

            
            {
                this$0 = TabbedProductDetailsFragment.this;
                super();
            }
            });
            refreshWishStates(true);
        }
    }




/*
    static ProductDetailsAddToCartModal access$1002(TabbedProductDetailsFragment tabbedproductdetailsfragment, ProductDetailsAddToCartModal productdetailsaddtocartmodal)
    {
        tabbedproductdetailsfragment.addToCartModal = productdetailsaddtocartmodal;
        return productdetailsaddtocartmodal;
    }

*/











}
