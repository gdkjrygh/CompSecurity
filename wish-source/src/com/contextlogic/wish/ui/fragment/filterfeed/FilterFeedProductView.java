// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.DealDashInfo;
import com.contextlogic.wish.api.data.WishFilter;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishPromoBannerSpec;
import com.contextlogic.wish.api.data.WishWishLookBannerSpec;
import com.contextlogic.wish.api.service.GetFilteredFeedService;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewAdapter;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewListener;
import com.contextlogic.wish.ui.components.list.LoadingListRow;
import com.contextlogic.wish.ui.fragment.collections.CollectionsFeedAdapter;
import com.contextlogic.wish.ui.fragment.dealdash.DealDashView;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedAdapter;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedGridCellView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            PromoBannerView, FilterFeedFragment, WishLookBannerView

public class FilterFeedProductView extends FrameLayout
    implements StaggeredGridViewListener
{
    private static final class ScrollDirection extends Enum
    {

        private static final ScrollDirection $VALUES[];
        public static final ScrollDirection DOWN;
        public static final ScrollDirection UNKNOWN;
        public static final ScrollDirection UP;

        public static ScrollDirection valueOf(String s)
        {
            return (ScrollDirection)Enum.valueOf(com/contextlogic/wish/ui/fragment/filterfeed/FilterFeedProductView$ScrollDirection, s);
        }

        public static ScrollDirection[] values()
        {
            return (ScrollDirection[])$VALUES.clone();
        }

        static 
        {
            UP = new ScrollDirection("UP", 0);
            DOWN = new ScrollDirection("DOWN", 1);
            UNKNOWN = new ScrollDirection("UNKNOWN", 2);
            $VALUES = (new ScrollDirection[] {
                UP, DOWN, UNKNOWN
            });
        }

        private ScrollDirection(String s, int i)
        {
            super(s, i);
        }
    }


    private StaggeredGridViewAdapter adapter;
    private boolean canChangeScrollDirection;
    private int currentOffset;
    private ScrollDirection currentScrollDirection;
    private DealDashView dealDashView;
    private View errorView;
    private boolean feedSetup;
    private FilterFeedFragment fragment;
    private GetFilteredFeedService getFilteredFeedService;
    private LinearLayout headerContainer;
    private int index;
    private int lastScrollEndPosition;
    private HashSet lastSeenProductIds;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private LoadingListRow loadingListRow;
    private View loadingView;
    private WishFilter mainCategory;
    private View noItemsView;
    private boolean noMoreItems;
    private boolean pagerSettled;
    private ArrayList pagerSettledTasks;
    private StaggeredGridView productView;
    private ArrayList products;
    private PromoBannerView promoBanner;
    private SwipeRefreshLayout refresherView;
    private View rootLayout;
    private Runnable scrollEndTask = new Runnable() {

        final FilterFeedProductView this$0;

        public void run()
        {
            int i = productView.getScrollY();
            if (lastScrollEndPosition - i == 0)
            {
                handleScrollEnded();
                return;
            } else
            {
                lastScrollEndPosition = i;
                productView.postDelayed(scrollEndTask, 100L);
                return;
            }
        }

            
            {
                this$0 = FilterFeedProductView.this;
                super();
            }
    };
    private View spacerView;
    private int startScrollPosition;
    private int startTabBarOffset;
    private boolean updatingList;
    private WishLookBannerView wishlookBanner;

    public FilterFeedProductView(Context context)
    {
        this(context, null);
        getFilteredFeedService = new GetFilteredFeedService();
        lastSeenProductIds = new HashSet();
        startScrollPosition = -1;
        startTabBarOffset = -1;
        currentScrollDirection = ScrollDirection.UNKNOWN;
        feedSetup = false;
        pagerSettledTasks = new ArrayList();
        pagerSettled = true;
    }

    public FilterFeedProductView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FilterFeedProductView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        refresherView.setRefreshing(false);
        refresherView.setEnabled(true);
        refreshViewState();
    }

    private void handleLoadingFeaturedProductCollections(ArrayList arraylist, boolean flag, int i)
    {
        Object obj;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); products.add(obj))
        {
            obj = iterator.next();
        }

        if (currentOffset == 0)
        {
            productView.scrollTo(0, 0);
            productView.reloadData();
        } else
        {
            productView.insertCells(arraylist.size());
        }
        loadingComplete = true;
        currentOffset = i;
        noMoreItems = flag;
        if (!noMoreItems && products.size() < 30)
        {
            loadNextPage();
        }
        refreshViewState();
        refresherView.setRefreshing(false);
        refresherView.setEnabled(true);
        updatingList = false;
    }

    private void handleLoadingSuccess(ArrayList arraylist, boolean flag, int i, WishPromoBannerSpec wishpromobannerspec)
    {
        Object obj = new ArrayList();
        if (currentOffset == 0)
        {
            lastSeenProductIds.clear();
            if (wishpromobannerspec != null)
            {
                promoBanner.setVisibility(0);
                promoBanner.setBannerSpec(wishpromobannerspec);
            } else
            {
                promoBanner.setVisibility(8);
            }
        } else
        {
            wishpromobannerspec = new HashSet();
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                WishProduct wishproduct = (WishProduct)arraylist.next();
                String s = wishproduct.getProductId();
                if (!lastSeenProductIds.contains(s) && !wishpromobannerspec.contains(s))
                {
                    ((ArrayList) (obj)).add(wishproduct);
                    wishpromobannerspec.add(s);
                }
            } while (true);
            lastSeenProductIds = wishpromobannerspec;
            arraylist = ((ArrayList) (obj));
        }
        for (wishpromobannerspec = arraylist.iterator(); wishpromobannerspec.hasNext(); products.add(obj))
        {
            obj = (WishProduct)wishpromobannerspec.next();
        }

        if (currentOffset == 0)
        {
            productView.scrollTo(0, 0);
            productView.reloadData();
        } else
        {
            productView.insertCells(arraylist.size());
        }
        loadingComplete = true;
        currentOffset = i;
        noMoreItems = flag;
        if (!noMoreItems && products.size() < 15)
        {
            loadNextPage();
        }
        refreshViewState();
        refresherView.setRefreshing(false);
        refresherView.setEnabled(true);
        updatingList = false;
    }

    private void handleScrollEnded()
    {
        int i = productView.getScrollY();
        if (i <= fragment.getTabBarStripHeight())
        {
            fragment.showTabBarStrip(true);
        } else
        if (i < startScrollPosition)
        {
            fragment.showTabBarStrip(true);
        } else
        {
            fragment.hideTabBarStrip(true);
        }
        startScrollPosition = -1;
        startTabBarOffset = -1;
        currentScrollDirection = ScrollDirection.UNKNOWN;
    }

    private void handleScrollLoad(int i, int j, int k)
    {
        boolean flag;
        if (!loadingErrored && !noMoreItems && !updatingList && !getFilteredFeedService.isPending() && loadingComplete)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && i > k - j * 2)
        {
            loadNextPage();
        }
    }

    private void hideAllUiElements()
    {
        refresherView.setVisibility(8);
        productView.setVisibility(8);
        errorView.setVisibility(8);
        noItemsView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void init()
    {
        rootLayout = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030057, this);
        products = new ArrayList();
    }

    private void loadNextPage()
    {
        loadingErrored = false;
        getFilteredFeedService.requestService(currentOffset, 30, false, mainCategory.getFilterId(), fragment.getSelectedFilters(index), false, new com.contextlogic.wish.api.service.GetFilteredFeedService.SuccessCallback() {

            final FilterFeedProductView this$0;

            public void onServiceSucceeded(final ArrayList products, ArrayList arraylist, final int nextOffset, final boolean noMoreItems, final DealDashInfo info, WishWishLookBannerSpec wishwishlookbannerspec, WishPromoBannerSpec wishpromobannerspec, 
                    final ArrayList featuredProductCollections)
            {
                updatingList = true;
                queuePagerSettledTask(wishpromobannerspec. new Runnable() {

                    final _cls5 this$1;
                    final ArrayList val$featuredProductCollections;
                    final DealDashInfo val$info;
                    final int val$nextOffset;
                    final boolean val$noMoreItems;
                    final ArrayList val$products;
                    final WishPromoBannerSpec val$promoBannerSpec;

                    public void run()
                    {
                        if (info != null && mainCategory.getFilterId().equals("deal_dash__tab"))
                        {
                            dealDashView.setInfo(info);
                        }
                        if (mainCategory.getFilterId().equals("collections__tab"))
                        {
                            handleLoadingFeaturedProductCollections(featuredProductCollections, noMoreItems, nextOffset);
                            return;
                        } else
                        {
                            handleLoadingSuccess(products, noMoreItems, nextOffset, promoBannerSpec);
                            return;
                        }
                    }

            
            {
                this$1 = final__pcls5;
                info = dealdashinfo;
                featuredProductCollections = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                products = arraylist1;
                promoBannerSpec = WishPromoBannerSpec.this;
                super();
            }
                });
            }

            
            {
                this$0 = FilterFeedProductView.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final FilterFeedProductView this$0;

            public void onServiceFailed()
            {
                queuePagerSettledTask(new Runnable() {

                    final _cls6 this$1;

                    public void run()
                    {
                        handleLoadingFailure();
                    }

            
            {
                this$1 = _cls6.this;
                super();
            }
                });
            }

            
            {
                this$0 = FilterFeedProductView.this;
                super();
            }
        });
        refreshViewState();
    }

    private void processPagerSettledTasks()
    {
        if (!pagerSettled || fragment.getCurrentIndex() != index)
        {
            return;
        }
        for (Iterator iterator = pagerSettledTasks.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        pagerSettledTasks.clear();
    }

    private void queuePagerSettledTask(Runnable runnable)
    {
        pagerSettledTasks.add(runnable);
        processPagerSettledTasks();
    }

    private void setSpacerHeight(int i)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)spacerView.getLayoutParams();
        layoutparams.height = i;
        spacerView.setLayoutParams(layoutparams);
    }

    private void updateRefresherOffset()
    {
        int i = (int)TypedValue.applyDimension(1, 100F, WishApplication.getAppInstance().getResources().getDisplayMetrics());
        refresherView.setProgressViewOffset(false, 0, fragment.getTabBarStripHeight(index) + i);
    }

    private void waitForScrollEnd()
    {
        productView.removeCallbacks(scrollEndTask);
        lastScrollEndPosition = -1;
        scrollEndTask.run();
    }

    public void adjustForCountdown(int i, int j, View view, int k)
    {
        if (i == k && dealDashView.getState() == com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.PLAYING) goto _L2; else goto _L1
_L1:
        view.setVisibility(8);
_L4:
        if (j == k && i != j)
        {
            dealDashView.trackEvent(WishAnalyticsEvent.CLICK_DEAL_DASH_LEAVE);
        }
        return;
_L2:
        if (dealDashView.getState() == com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.PLAYING)
        {
            view.setVisibility(0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void cleanup()
    {
        releaseImages();
        getFilteredFeedService.cancelAllRequests();
        if (dealDashView != null)
        {
            dealDashView.cleanup();
        }
    }

    public void handleOrientationChanged()
    {
        if (productView != null)
        {
            productView.reloadData();
        }
    }

    public boolean isFeedSetup()
    {
        return feedSetup;
    }

    public boolean onLongClickCell(StaggeredGridCellView staggeredgridcellview, int i)
    {
        return false;
    }

    public void onPagerScrollSettled()
    {
        pagerSettled = true;
        processPagerSettledTasks();
    }

    public void onPagerScrollUnsettled()
    {
        pagerSettled = false;
    }

    public void onScrollChanged(int i, int j, int k, int l)
    {
        i = Math.max(0, i);
        ScrollDirection scrolldirection;
        if (j < 0)
        {
            scrolldirection = ScrollDirection.UP;
        } else
        if (j == 0)
        {
            scrolldirection = currentScrollDirection;
        } else
        {
            scrolldirection = ScrollDirection.DOWN;
        }
        if (startScrollPosition == -1 || scrolldirection != currentScrollDirection && canChangeScrollDirection)
        {
            startScrollPosition = i - j;
            startTabBarOffset = fragment.getTabBarStripOffset();
            currentScrollDirection = scrolldirection;
        }
        j = startScrollPosition - i;
        if (j != 0)
        {
            fragment.setTabBarStripOffset(startTabBarOffset + j);
        }
        handleScrollLoad(i, k, l);
    }

    public void onSelectCell(StaggeredGridCellView staggeredgridcellview, int i)
    {
        if (products != null && i < products.size())
        {
            if ((staggeredgridcellview = ((StaggeredGridCellView) (products.get(i)))) instanceof WishProduct)
            {
                staggeredgridcellview = (WishProduct)staggeredgridcellview;
                fragment.handleProductClick(staggeredgridcellview);
                return;
            }
        }
    }

    public void prepareForUpdateFeed()
    {
        getFilteredFeedService.cancelAllRequests();
        products.clear();
        productView.reloadData();
        loadingComplete = false;
        loadingErrored = false;
        feedSetup = false;
        refreshViewState();
    }

    public void refreshViewState()
    {
        hideAllUiElements();
        if (!loadingErrored) goto _L2; else goto _L1
_L1:
        if (products.size() <= 0) goto _L4; else goto _L3
_L3:
        refresherView.setVisibility(0);
        productView.setVisibility(0);
        if (!noMoreItems) goto _L6; else goto _L5
_L5:
        loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
_L8:
        return;
_L6:
        if (getFilteredFeedService.isPending())
        {
            loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
            return;
        } else
        {
            loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
            return;
        }
_L4:
        refresherView.setVisibility(0);
        errorView.setVisibility(0);
        return;
_L2:
        if (loadingComplete && products.size() == 0)
        {
            if (index != fragment.getDealDashPosition())
            {
                noItemsView.setVisibility(0);
                return;
            }
            if (dealDashView.getState() == com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.COUNTDOWN)
            {
                loadingView.setVisibility(0);
                return;
            }
        } else
        {
            if (loadingComplete)
            {
                refresherView.setVisibility(0);
                productView.setVisibility(0);
                if (noMoreItems)
                {
                    loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                    return;
                }
                if (getFilteredFeedService.isPending())
                {
                    loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
                    return;
                } else
                {
                    loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
                    return;
                }
            }
            if (!refresherView.isRefreshing())
            {
                loadingView.setVisibility(0);
                return;
            } else
            {
                refresherView.setVisibility(0);
                return;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void refreshWishStates(boolean flag)
    {
        if (productView != null)
        {
            SparseArray sparsearray = productView.getVisibleViews();
            int j = sparsearray.size();
            for (int i = 0; i < j; i++)
            {
                StaggeredGridCellView staggeredgridcellview = (StaggeredGridCellView)sparsearray.valueAt(i);
                if (staggeredgridcellview instanceof ProductFeedGridCellView)
                {
                    ((ProductFeedGridCellView)staggeredgridcellview).refreshWishState(flag);
                }
            }

        }
        if (dealDashView != null)
        {
            dealDashView.refreshWishStates();
        }
    }

    public void releaseImages()
    {
        if (productView != null)
        {
            productView.releaseImages();
        }
    }

    public void restoreImages()
    {
        if (productView != null)
        {
            productView.restoreImages();
        }
    }

    public void setDealDashInfo(DealDashInfo dealdashinfo, View view, FilterFeedFragment filterfeedfragment)
    {
        dealDashView.setCountdownView(view);
        dealDashView.setFilterFragment(filterfeedfragment);
        if (dealdashinfo != null)
        {
            dealDashView.setInfo(dealdashinfo);
        }
    }

    public void setup(WishFilter wishfilter, int i, FilterFeedFragment filterfeedfragment)
    {
        mainCategory = wishfilter;
        index = i;
        fragment = filterfeedfragment;
        loadingView = rootLayout.findViewById(0x7f0d01e1);
        noItemsView = rootLayout.findViewById(0x7f0d01e2);
        errorView = rootLayout.findViewById(0x7f0d01e3);
        productView = (StaggeredGridView)rootLayout.findViewById(0x7f0d01e0);
        refresherView = (SwipeRefreshLayout)rootLayout.findViewById(0x7f0d01df);
        refresherView.setColorSchemeResources(new int[] {
            0x7f0c00bf
        });
        refresherView.setEnabled(false);
        refresherView.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {

            final FilterFeedProductView this$0;

            public void onRefresh()
            {
                fragment.trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Refresh, com.contextlogic.wish.analytics.Analytics.LabelType.Scroll);
                updateFeed(null, null);
            }

            
            {
                this$0 = FilterFeedProductView.this;
                super();
            }
        });
        loadingListRow = new LoadingListRow(getContext());
        loadingListRow.setOnClickListener(new android.view.View.OnClickListener() {

            final FilterFeedProductView this$0;

            public void onClick(View view)
            {
                fragment.trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Load);
                loadNextPage();
            }

            
            {
                this$0 = FilterFeedProductView.this;
                super();
            }
        });
        if (mainCategory.getFilterId().equals("collections__tab"))
        {
            adapter = new CollectionsFeedAdapter(getContext(), products, productView, fragment);
        } else
        {
            adapter = new ProductFeedAdapter(getContext(), products, productView, fragment);
        }
        productView.setAdapter(adapter);
        productView.setListener(this);
        headerContainer = new LinearLayout(getContext());
        headerContainer.setOrientation(1);
        spacerView = new View(getContext());
        headerContainer.addView(spacerView);
        wishlookBanner = new WishLookBannerView(getContext());
        headerContainer.addView(wishlookBanner, new android.widget.LinearLayout.LayoutParams(-1, wishlookBanner.getBannerHeight()));
        promoBanner = new PromoBannerView(getContext());
        i = (int)TypedValue.applyDimension(1, 8F, getContext().getResources().getDisplayMetrics());
        wishfilter = new android.widget.LinearLayout.LayoutParams(-1, promoBanner.getBannerHeight());
        wishfilter.setMargins(i, i, i, i);
        headerContainer.addView(promoBanner, wishfilter);
        productView.addHeaderView(headerContainer);
        productView.addFooterView(loadingListRow);
        productView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final FilterFeedProductView this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 1)
                {
                    canChangeScrollDirection = false;
                    waitForScrollEnd();
                } else
                if (motionevent.getAction() == 2)
                {
                    canChangeScrollDirection = true;
                    return false;
                }
                return false;
            }

            
            {
                this$0 = FilterFeedProductView.this;
                super();
            }
        });
        dealDashView = (DealDashView)rootLayout.findViewById(0x7f0d01e4);
        if (mainCategory.getFilterId().equals("wishlook__tab") && fragment.getWishLookBannerSpec() != null)
        {
            wishlookBanner.setVisibility(0);
            wishlookBanner.setBannerSpec(fragment.getWishLookBannerSpec());
        } else
        {
            wishlookBanner.setVisibility(8);
        }
        updateRefresherOffset();
    }

    public void updateFeed(FilterFeedFragment.InitialProductWrapper initialproductwrapper, ArrayList arraylist)
    {
        prepareForUpdateFeed();
        feedSetup = true;
        FilterFeedFragment.InitialProductWrapper initialproductwrapper1 = initialproductwrapper;
        if (arraylist != null)
        {
            initialproductwrapper1 = initialproductwrapper;
            if (arraylist.size() > 0)
            {
                initialproductwrapper1 = null;
            }
        }
        if (index == fragment.getDealDashPosition())
        {
            setSpacerHeight((int)TypedValue.applyDimension(1, 93F, WishApplication.getAppInstance().getResources().getDisplayMetrics()));
        } else
        {
            setSpacerHeight(fragment.getTabBarStripHeight(index));
        }
        arraylist = null;
        if (initialproductwrapper1 != null)
        {
            initialproductwrapper = initialproductwrapper1.initialProducts;
        } else
        {
            initialproductwrapper = null;
        }
        if (initialproductwrapper != null)
        {
            ArrayList arraylist1 = new ArrayList();
            lastSeenProductIds.clear();
            int i = 0;
            do
            {
                arraylist = arraylist1;
                if (i >= initialproductwrapper.size())
                {
                    break;
                }
                arraylist1.add(initialproductwrapper.get(i));
                lastSeenProductIds.add(((WishProduct)initialproductwrapper.get(i)).getProductId());
                i++;
            } while (true);
        }
        if (initialproductwrapper != null)
        {
            products.addAll(arraylist);
        }
        int j;
        boolean flag;
        if (initialproductwrapper1 != null)
        {
            j = initialproductwrapper1.nextOffset;
        } else
        {
            j = 0;
        }
        currentOffset = j;
        if (initialproductwrapper1 != null)
        {
            flag = initialproductwrapper1.noMoreItems;
        } else
        {
            flag = false;
        }
        noMoreItems = flag;
        if (products.size() > 0 || noMoreItems)
        {
            loadingComplete = true;
            refresherView.setEnabled(true);
        } else
        {
            loadingComplete = false;
        }
        if (initialproductwrapper1 != null && initialproductwrapper1.promoBannerSpec != null)
        {
            promoBanner.setVisibility(0);
            promoBanner.setBannerSpec(initialproductwrapper1.promoBannerSpec);
        } else
        {
            promoBanner.setVisibility(8);
        }
        productView.reloadData();
        refreshViewState();
        if (!noMoreItems && products.size() < 15)
        {
            loadNextPage();
        }
    }





/*
    static int access$102(FilterFeedProductView filterfeedproductview, int i)
    {
        filterfeedproductview.lastScrollEndPosition = i;
        return i;
    }

*/










/*
    static boolean access$602(FilterFeedProductView filterfeedproductview, boolean flag)
    {
        filterfeedproductview.canChangeScrollDirection = flag;
        return flag;
    }

*/



/*
    static boolean access$802(FilterFeedProductView filterfeedproductview, boolean flag)
    {
        filterfeedproductview.updatingList = flag;
        return flag;
    }

*/

}
