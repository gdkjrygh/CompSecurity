// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.astuetz.PagerSlidingTabStrip;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.DealDashInfo;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishFilter;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishPromoBannerSpec;
import com.contextlogic.wish.api.data.WishWishLookBannerSpec;
import com.contextlogic.wish.api.service.GetFilteredFeedService;
import com.contextlogic.wish.api.service.HideProductService;
import com.contextlogic.wish.api.service.MoveToBucketService;
import com.contextlogic.wish.api.service.ProductWishService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.menu.MainMenuItem;
import com.contextlogic.wish.ui.fragment.menu.wishlist.MoveToWishlistMenuFragment;
import com.contextlogic.wish.ui.fragment.menu.wishlist.WishlistMenuFragment;
import com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedMoveToBucketView;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedProductSelectedFiltersView, FilterFeedFilterView, FilterFeedPagerAdapter, FilterFeedProductView

public class FilterFeedFragment extends BaseContentFragment
    implements ApiDataChangeNotificationListener, com.contextlogic.wish.ui.fragment.productfeed.ProductFeedGridCellView.GridCellFragment
{
    public class InitialProductWrapper
    {

        public ArrayList initialProducts;
        public int nextOffset;
        public boolean noMoreItems;
        public WishPromoBannerSpec promoBannerSpec;
        final FilterFeedFragment this$0;

        public InitialProductWrapper()
        {
            this$0 = FilterFeedFragment.this;
            super();
        }
    }


    public static final String ARG_CATEGORIES = "ArgCategories";
    public static final String ARG_FEATURED_REQUEST = "ArgFeaturedProductCollection";
    public static final String ARG_INITIAL_CATEGORY = "ArgInitialCategory";
    public static final String ARG_NOT_TOP_LEVEL_MENU_ITEM = "ArgNotTopLevelMenuItem";
    public static final String ARG_PLACEHOLDER_MODE = "ArgPlaceholderMode";
    public static final String ARG_TITLE = "ArgTitle";
    public static final int REQUEST_PRODUCT_COUNT = 30;
    public static final int TAB_BAR_DEAL_DASH = 48;
    public static final int TAB_BAR_DEAL_DASH_TOTAL = 93;
    public static final int TAB_BAR_FILTER_HEIGHT = 45;
    public static final int TAB_BAR_HEIGHT_LARGE = 97;
    public static final int TAB_BAR_HEIGHT_SMALL = 52;
    private ProductDetailsAddToCartModal addToCartModal;
    private int dealDashPosition;
    private View errorView;
    private boolean featuredProductCollectionRequest;
    private FilterFeedFilterView filterView;
    private boolean firstFeedRequested;
    private GetFilteredFeedService getFilteredFeedService;
    private String initialCategory;
    private SparseArray initialProducts;
    private boolean isFiltering;
    private int lastPosition;
    private boolean loadingErrored;
    private View loadingView;
    private ArrayList mainCategories;
    private ProductFeedMoveToBucketView moveToBucketView;
    private View noItemsView;
    private boolean notTopLevelMenuItem;
    private android.support.v4.view.ViewPager.OnPageChangeListener pageScrollListener;
    private FilterFeedPagerAdapter pagerAdapter;
    private boolean placeholderMode;
    private View productView;
    private ViewPager productViewPager;
    private ProductWishService productWishService;
    private FilterFeedProductSelectedFiltersView selectedFilterView;
    private SparseArray selectedFilters;
    private PagerSlidingTabStrip tabStrip;
    private View tabStripContainer;
    private String title;
    private View topCountView;
    private WishWishLookBannerSpec wishLookBannerSpec;

    public FilterFeedFragment()
    {
    }

    private boolean canFilter()
    {
        int i = productViewPager.getCurrentItem();
        if (mainCategories == null || i > mainCategories.size() || i == getDealDashPosition())
        {
            return false;
        }
        ArrayList arraylist = ((WishFilter)mainCategories.get(i)).getChildFilterGroups();
        return arraylist != null && arraylist.size() > 0;
    }

    private void completeSelectedFilterBarUpdate()
    {
        int i = productViewPager.getCurrentItem();
        ArrayList arraylist = getSelectedFilters(i);
        selectedFilterView.setup(i, this);
        selectedFilterView.setSelectedFilters(arraylist);
        if (arraylist != null && arraylist.size() > 0)
        {
            selectedFilterView.clearAnimation();
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, -getSelectedFilterBarHeight(), 0.0F);
            translateanimation.setDuration(175L);
            translateanimation.setFillBefore(true);
            translateanimation.setFillAfter(false);
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final FilterFeedFragment this$0;

                public void onAnimationEnd(Animation animation)
                {
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                    selectedFilterView.setVisibility(0);
                }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
            });
            selectedFilterView.startAnimation(translateanimation);
        }
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

    private int getSelectedFilterBarHeight()
    {
        return (int)TypedValue.applyDimension(1, 45F, getResources().getDisplayMetrics());
    }

    private void handleFilter()
    {
        if (isFiltering)
        {
            return;
        }
        if (getActivity() != null)
        {
            ((RootActivity)getActivity()).hideKeyboard();
        }
        isFiltering = true;
        showTabBarStrip(false);
        selectedFilterView.forceHideView();
        filterView.clearAnimation();
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, -productView.getHeight(), 0.0F);
        translateanimation.setDuration(250L);
        translateanimation.setFillBefore(true);
        translateanimation.setFillAfter(false);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final FilterFeedFragment this$0;

            public void onAnimationEnd(Animation animation)
            {
                refreshNavigationBar();
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                filterView.prepareToShow(tabStrip);
                filterView.resync();
                filterView.setVisibility(0);
            }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
        });
        filterView.startAnimation(translateanimation);
    }

    private void handleFilterCancel()
    {
        if (!isFiltering)
        {
            return;
        } else
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_FEED_FILTER_CANCEL);
            filterView.clearAnimation();
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -filterView.getHeight());
            translateanimation.setDuration(250L);
            translateanimation.setFillAfter(false);
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final FilterFeedFragment this$0;

                public void onAnimationEnd(Animation animation)
                {
                    filterView.setVisibility(8);
                    isFiltering = false;
                    refreshNavigationBar();
                    selectedFilterView.reverseForceHide();
                    filterView.prepareToRelease();
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
            });
            filterView.startAnimation(translateanimation);
            return;
        }
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0601a6));
        refreshViewState();
    }

    private void handleLoadingSuccess(ArrayList arraylist, ArrayList arraylist1, boolean flag, int i, DealDashInfo dealdashinfo, WishWishLookBannerSpec wishwishlookbannerspec, WishPromoBannerSpec wishpromobannerspec)
    {
        InitialProductWrapper initialproductwrapper;
        byte byte0;
        initialproductwrapper = new InitialProductWrapper();
        initialproductwrapper.initialProducts = arraylist;
        initialproductwrapper.noMoreItems = flag;
        initialproductwrapper.nextOffset = i;
        initialproductwrapper.promoBannerSpec = wishpromobannerspec;
        if (wishLookBannerSpec == null)
        {
            wishLookBannerSpec = wishwishlookbannerspec;
        }
        if (mainCategories == null)
        {
            mainCategories = arraylist1;
        }
        byte0 = -1;
        i = byte0;
        if (initialCategory == null) goto _L2; else goto _L1
_L1:
        i = byte0;
        if (mainCategories == null) goto _L2; else goto _L3
_L3:
        int j = 0;
_L7:
        i = byte0;
        if (j >= mainCategories.size()) goto _L2; else goto _L4
_L4:
        if (!((WishFilter)mainCategories.get(j)).getFilterId().equals(initialCategory)) goto _L6; else goto _L5
_L5:
        i = j;
_L2:
        j = 0;
_L8:
        if (j < mainCategories.size())
        {
            if (!((WishFilter)mainCategories.get(j)).getFilterId().equals("deal_dash__tab"))
            {
                break MISSING_BLOCK_LABEL_337;
            }
            dealDashPosition = j;
        }
        if (dealdashinfo != null)
        {
            pagerAdapter.setDealDashInfo(dealdashinfo, topCountView);
        }
        arraylist = new com.astuetz.PagerSlidingTabStrip.TabType[mainCategories.size()];
        Arrays.fill(arraylist, com.astuetz.PagerSlidingTabStrip.TabType.TEXT_TAB);
        if (dealDashPosition >= 0)
        {
            arraylist[dealDashPosition] = com.astuetz.PagerSlidingTabStrip.TabType.ICON_TAB;
        }
        tabStrip.setTabTypes(arraylist);
        arraylist = initialProducts;
        if (i != -1)
        {
            j = i;
        } else
        {
            j = 0;
        }
        arraylist.put(j, initialproductwrapper);
        pagerAdapter.updateMainCategories();
        filterView.updateMainCategories();
        customizeTabStrip();
        completeSelectedFilterBarUpdate();
        tabStrip.setViewPager(productViewPager);
        tabStrip.setOnPageChangeListener(pageScrollListener);
        refreshTabStripFontColors();
        refreshViewState();
        if (i != -1)
        {
            switchToPosition(i, false);
        }
        return;
_L6:
        j++;
          goto _L7
        j++;
          goto _L8
    }

    private void handlePageSelected(int i)
    {
        trackClick(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_CATEGORY);
        refreshTabStripFontColors();
        updateSelectedFilterBar();
        if (dealDashPosition != -1)
        {
            ((FilterFeedProductView)productViewPager.findViewWithTag(Integer.valueOf(i))).adjustForCountdown(i, lastPosition, topCountView, dealDashPosition);
            if (i == getDealDashPosition())
            {
                trackClick(WishAnalyticsEvent.CLICK_DEAL_DASH_TAB);
            }
        }
        lastPosition = i;
    }

    private void hideAllUiElements()
    {
        productView.setVisibility(8);
        productViewPager.setVisibility(8);
        errorView.setVisibility(8);
        noItemsView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void loadFeed()
    {
        boolean flag = true;
        loadingErrored = false;
        firstFeedRequested = true;
        GetFilteredFeedService getfilteredfeedservice = getFilteredFeedService;
        if (mainCategories != null)
        {
            flag = false;
        }
        getfilteredfeedservice.requestService(0, 30, flag, initialCategory, null, featuredProductCollectionRequest, new com.contextlogic.wish.api.service.GetFilteredFeedService.SuccessCallback() {

            final FilterFeedFragment this$0;

            public void onServiceSucceeded(ArrayList arraylist, ArrayList arraylist1, int i, boolean flag1, DealDashInfo dealdashinfo, WishWishLookBannerSpec wishwishlookbannerspec, WishPromoBannerSpec wishpromobannerspec, 
                    ArrayList arraylist2)
            {
                handleLoadingSuccess(arraylist, arraylist1, flag1, i, dealdashinfo, wishwishlookbannerspec, wishpromobannerspec);
            }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final FilterFeedFragment this$0;

            public void onServiceFailed()
            {
                handleLoadingFailure();
            }

            
            {
                this$0 = FilterFeedFragment.this;
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

    private void refreshNavigationBar()
    {
        getNavigationBar().clearRightButtons();
        if (isFiltering)
        {
            getNavigationBar().addMenuItem(getResources().getString(0x7f06006f), 0x7f0200ba, new NavigationBarButtonCallback() {

                final FilterFeedFragment this$0;

                public void onMenuItemClicked()
                {
                    handleFilterApply();
                }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
            }, false);
            getNavigationBar().addMenuItem(getResources().getString(0x7f0600bc), 0x7f0200bb, new NavigationBarButtonCallback() {

                final FilterFeedFragment this$0;

                public void onMenuItemClicked()
                {
                    handleFilterCancel();
                }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
            }, false);
            return;
        }
        if (canFilter())
        {
            getNavigationBar().addMenuItem(getResources().getString(0x7f060161), 0x7f0200bc, new NavigationBarButtonCallback() {

                final FilterFeedFragment this$0;

                public void onMenuItemClicked()
                {
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_FEED_FILTER_NAV);
                    handleFilter();
                }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
            }, false);
        }
        getNavigationBar().addMenuItem(getResources().getString(0x7f06039b), 0x7f0200be, new NavigationBarButtonCallback() {

            final FilterFeedFragment this$0;

            public void onMenuItemClicked()
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.SearchSelect);
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_FEED_FILTER_SEARCH);
                if (getActivity() != null)
                {
                    getActivity().onSearchRequested();
                }
            }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
        }, false);
    }

    private void refreshTabStripFontColors()
    {
        LinearLayout linearlayout = (LinearLayout)tabStrip.getChildAt(0);
        int i = 0;
        while (i < linearlayout.getChildCount()) 
        {
            if (tabStrip.getTabType(i) == com.astuetz.PagerSlidingTabStrip.TabType.TEXT_TAB)
            {
                TextView textview = (TextView)linearlayout.getChildAt(i);
                if (i == productViewPager.getCurrentItem())
                {
                    textview.setTextColor(getResources().getColor(0x7f0c00e8));
                } else
                {
                    textview.setTextColor(getResources().getColor(0x7f0c00e0));
                }
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
        if (placeholderMode || !firstFeedRequested || getFilteredFeedService.isPending())
        {
            loadingView.setVisibility(0);
            return;
        }
        if (mainCategories == null || mainCategories.size() == 0)
        {
            noItemsView.setVisibility(0);
            return;
        } else
        {
            productView.setVisibility(0);
            productViewPager.setVisibility(0);
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

                final FilterFeedFragment this$0;
                final boolean val$allowAnimate;

                public void run()
                {
                    pagerAdapter.refreshWishStates(allowAnimate);
                }

            
            {
                this$0 = FilterFeedFragment.this;
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

            final FilterFeedFragment this$0;

            public void onClick(View view)
            {
            }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
        });
        addToCartModal.setProduct(product, getApplicableCredit(product));
        addToCartModal.setCallback(new com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal.Callback() {

            final FilterFeedFragment this$0;
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
                this$0 = FilterFeedFragment.this;
                product = wishproduct;
                super();
            }
        });
        showOverlay(addToCartModal, false);
    }

    private void updateSelectedFilterBar()
    {
        if (selectedFilterView.hasFilters())
        {
            selectedFilterView.clearAnimation();
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -getSelectedFilterBarHeight());
            translateanimation.setDuration(175L);
            translateanimation.setFillAfter(false);
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final FilterFeedFragment this$0;

                public void onAnimationEnd(Animation animation)
                {
                    selectedFilterView.setVisibility(8);
                    completeSelectedFilterBarUpdate();
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
            });
            selectedFilterView.startAnimation(translateanimation);
            return;
        } else
        {
            completeSelectedFilterBarUpdate();
            return;
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

    public void clearInitialProductInfo(int i)
    {
        initialProducts.remove(i);
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

            final FilterFeedFragment this$0;

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
                PopupAlertDialog.showSuccess(getActivity(), null, String.format(getActivity().getString(0x7f0602b5), new Object[] {
                    s
                }));
                for (arraylist1 = arraylist1.iterator(); arraylist1.hasNext(); (new MoveToBucketService()).requestService(((String) (obj)), s, s1, null, null))
                {
                    obj = (String)arraylist1.next();
                }

                break; /* Loop/switch isn't completed */
_L2:
                if (obj != null)
                {
                    ((RootActivity) (obj)).closeMenus();
                }
                if (true) goto _L4; else goto _L3
_L3:
                ((RootActivity)getActivity()).setRightMenuFragment(new WishlistMenuFragment());
                return;
            }

            public void onProductsRemoved(ArrayList arraylist1)
            {
                Object obj = (RootActivity)getActivity();
                String s;
                if (TabletUtil.isTablet(getActivity()) || !((RootActivity) (obj)).hasRightMenu())
                {
                    clearOverlay();
                } else
                {
                    ((RootActivity) (obj)).closeMenus();
                }
                for (obj = arraylist1.iterator(); ((Iterator) (obj)).hasNext(); (new HideProductService()).requestService(s, new com.contextlogic.wish.api.service.HideProductService.SuccessCallback() {

            final _cls18 this$1;

            public void onServiceSucceeded()
            {
                trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
            }

            
            {
                this$1 = _cls18.this;
                super();
            }
        }, null))
                {
                    s = (String)((Iterator) (obj)).next();
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForProductUnwish(s);
                }

                PopupAlertDialog.showSuccess(getActivity(), null, WishApplication.getAppInstance().getQuantityString(0x7f070006, arraylist1.size()));
                ((RootActivity)getActivity()).setRightMenuFragment(new WishlistMenuFragment());
            }

            
            {
                this$0 = FilterFeedFragment.this;
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
        return com.contextlogic.wish.analytics.Analytics.PageViewType.FeedGrid;
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

    public int getDealDashPosition()
    {
        return dealDashPosition;
    }

    public FilterFeedProductView getDealDashProdView()
    {
        return (FilterFeedProductView)productViewPager.findViewWithTag(Integer.valueOf(getDealDashPosition()));
    }

    public int getHiddenTabBarStripOffset()
    {
        return getTabBarStripHeight() * -1;
    }

    public InitialProductWrapper getInitialProductInfo(int i)
    {
        return (InitialProductWrapper)initialProducts.get(i);
    }

    public int getLastPosition()
    {
        return lastPosition;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f030052;
    }

    public ArrayList getMainCategories()
    {
        return mainCategories;
    }

    public ArrayList getSelectedFilters(int i)
    {
        return (ArrayList)selectedFilters.get(i);
    }

    public int getTabBarStripHeight()
    {
        return getTabBarStripHeight(productViewPager.getCurrentItem());
    }

    public int getTabBarStripHeight(int i)
    {
        ArrayList arraylist = (ArrayList)selectedFilters.get(i);
        if (arraylist != null && arraylist.size() > 0)
        {
            return (int)TypedValue.applyDimension(1, 97F, WishApplication.getAppInstance().getResources().getDisplayMetrics());
        }
        if (i == getDealDashPosition())
        {
            return (int)TypedValue.applyDimension(1, 48F, WishApplication.getAppInstance().getResources().getDisplayMetrics());
        } else
        {
            return (int)TypedValue.applyDimension(1, 52F, WishApplication.getAppInstance().getResources().getDisplayMetrics());
        }
    }

    public int getTabBarStripOffset()
    {
        return ((android.widget.FrameLayout.LayoutParams)tabStripContainer.getLayoutParams()).topMargin;
    }

    public MainMenuItem getTopLevelMenuItem()
    {
        if (notTopLevelMenuItem)
        {
            return null;
        } else
        {
            return MainMenuItem.HOME;
        }
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return null;
    }

    public WishWishLookBannerSpec getWishLookBannerSpec()
    {
        return wishLookBannerSpec;
    }

    public void handleFilterApply()
    {
        if (!isFiltering)
        {
            return;
        } else
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_FEED_FILTER_APPLY);
            filterView.clearAnimation();
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -filterView.getHeight());
            translateanimation.setDuration(250L);
            translateanimation.setFillAfter(false);
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final FilterFeedFragment this$0;

                public void onAnimationEnd(Animation animation)
                {
                    filterView.setVisibility(8);
                    isFiltering = false;
                    refreshNavigationBar();
                    updateSelectedFilters(filterView.getCurrentIndex(), filterView.getSelectedFilters());
                    filterView.prepareToRelease();
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
            });
            filterView.startAnimation(translateanimation);
            return;
        }
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
        if (placeholderMode)
        {
            return;
        }
        if (!firstFeedRequested)
        {
            loadFeed();
        } else
        {
            refreshViewState();
        }
        refreshWishStates(false);
    }

    public void hideTabBarStrip(boolean flag)
    {
        if (!isFiltering)
        {
            final int hiddenTabBarOffset = getHiddenTabBarStripOffset();
            int i = getTabBarStripOffset();
            if (i != hiddenTabBarOffset)
            {
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

                    final FilterFeedFragment this$0;
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
                this$0 = FilterFeedFragment.this;
                hiddenTabBarOffset = i;
                super();
            }
                });
                tabStripContainer.startAnimation(translateanimation);
                return;
            }
        }
    }

    protected void initializeUi(View view)
    {
        loadingView = view.findViewById(0x7f0d01d2);
        noItemsView = view.findViewById(0x7f0d01d3);
        errorView = view.findViewById(0x7f0d01d4);
        productView = view.findViewById(0x7f0d01ca);
        topCountView = view.findViewById(0x7f0d01ce);
        productViewPager = (ViewPager)view.findViewById(0x7f0d01c9);
        pagerAdapter = new FilterFeedPagerAdapter(getActivity(), this, productViewPager);
        productViewPager.setAdapter(pagerAdapter);
        tabStripContainer = view.findViewById(0x7f0d01cc);
        selectedFilterView = (FilterFeedProductSelectedFiltersView)view.findViewById(0x7f0d01d1);
        filterView = (FilterFeedFilterView)view.findViewById(0x7f0d01cb);
        filterView.setup(this);
        filterView.setVisibility(8);
        tabStrip = (PagerSlidingTabStrip)view.findViewById(0x7f0d01cd);
        moveToBucketView = new ProductFeedMoveToBucketView(getActivity());
        moveToBucketView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        lastPosition = 0;
        dealDashPosition = -1;
        hideAllUiElements();
        if (title != null)
        {
            getNavigationBar().setTitle(title);
        } else
        {
            getNavigationBar().setTitleLogo();
        }
        refreshNavigationBar();
    }

    public boolean isProductSelected(WishProduct wishproduct)
    {
        return false;
    }

    public boolean isWishPending(String s)
    {
        return productWishService.isPending(s);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getFilteredFeedService = new GetFilteredFeedService();
        productWishService = new ProductWishService();
        initialProducts = new SparseArray();
        selectedFilters = new SparseArray();
        pageScrollListener = new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final FilterFeedFragment this$0;

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
                this$0 = FilterFeedFragment.this;
                super();
            }
        };
        isFiltering = false;
        if (getArguments() != null)
        {
            placeholderMode = getArguments().getBoolean("ArgPlaceholderMode", false);
            initialCategory = getArguments().getString("ArgInitialCategory");
            mainCategories = (ArrayList)getArguments().getSerializable("ArgCategories");
            notTopLevelMenuItem = getArguments().getBoolean("ArgNotTopLevelMenuItem", false);
            title = getArguments().getString("ArgTitle");
            featuredProductCollectionRequest = getArguments().getBoolean("ArgFeaturedProductCollection", false);
        }
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Wish, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Unwish, this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        getFilteredFeedService.cancelAllRequests();
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
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    public void recaptureViewPager()
    {
        tabStrip.setOnPageChangeListener(pageScrollListener);
        tabStrip.setViewPager(productViewPager);
        refreshTabStripFontColors();
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
        if (isFiltering && i < 0)
        {
            return;
        } else
        {
            tabStripContainer.clearAnimation();
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)tabStripContainer.getLayoutParams();
            layoutparams.topMargin = Math.min(Math.max(i, getHiddenTabBarStripOffset()), 0);
            tabStripContainer.setLayoutParams(layoutparams);
            return;
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

            final FilterFeedFragment this$0;

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
                this$0 = FilterFeedFragment.this;
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

            final FilterFeedFragment this$0;

            public void onServiceSucceeded()
            {
                trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.UnwishFromFilterFeed, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
            }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
        }, null);
    }

    public void updateSelectedFilters(int i, ArrayList arraylist)
    {
        if (arraylist != null)
        {
            selectedFilters.put(i, arraylist);
        } else
        {
            selectedFilters.remove(i);
        }
        if (pagerAdapter != null)
        {
            pagerAdapter.updateFeed(i);
        }
        if (i != productViewPager.getCurrentItem())
        {
            switchToPosition(i, false);
        }
        updateSelectedFilterBar();
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

                final FilterFeedFragment this$0;

                public void onServiceSucceeded()
                {
                    refreshWishStatesDelayed(true);
                }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ProductWishService.FailureCallback() {

                final FilterFeedFragment this$0;

                public void onServiceFailed()
                {
                    refreshWishStatesDelayed(true);
                }

            
            {
                this$0 = FilterFeedFragment.this;
                super();
            }
            });
            refreshWishStates(true);
        }
    }









/*
    static ProductDetailsAddToCartModal access$1502(FilterFeedFragment filterfeedfragment, ProductDetailsAddToCartModal productdetailsaddtocartmodal)
    {
        filterfeedfragment.addToCartModal = productdetailsaddtocartmodal;
        return productdetailsaddtocartmodal;
    }

*/











/*
    static boolean access$902(FilterFeedFragment filterfeedfragment, boolean flag)
    {
        filterfeedfragment.isFiltering = flag;
        return flag;
    }

*/
}
