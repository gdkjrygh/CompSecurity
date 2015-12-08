// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishBrandFilter;
import com.contextlogic.wish.api.data.WishCollection;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishFeedPromotionItem;
import com.contextlogic.wish.api.data.WishMerchant;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.api.service.DeleteBucketService;
import com.contextlogic.wish.api.service.DislikeProductService;
import com.contextlogic.wish.api.service.FeedCampaignLogService;
import com.contextlogic.wish.api.service.GetBrandFeedService;
import com.contextlogic.wish.api.service.GetFeedService;
import com.contextlogic.wish.api.service.GetMerchantFeedService;
import com.contextlogic.wish.api.service.GetProfileProductsService;
import com.contextlogic.wish.api.service.GetWishlistFeedService;
import com.contextlogic.wish.api.service.HideProductService;
import com.contextlogic.wish.api.service.MoveToBucketService;
import com.contextlogic.wish.api.service.ProductSearchService;
import com.contextlogic.wish.api.service.ProductWishService;
import com.contextlogic.wish.api.service.RenameBucketService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.animation.DropDownAnimation;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewListener;
import com.contextlogic.wish.ui.components.list.LoadingListRow;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.menu.wishlist.MoveToWishlistMenuFragment;
import com.contextlogic.wish.ui.fragment.menu.wishlist.WishlistMenuFragment;
import com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedRenameBucketView, ProductFeedGridCellView, ProductFeedGiftCardBannerView, ProductFeedEditListOverlayView, 
//            ProductFeedMerchantBannerView, ProductFeedPromotionBannerView, ProductFeedTitleBannerView, ProductFeedMoveToBucketView, 
//            ProductFeedAdapter

public class ProductFeedFragment extends BaseContentFragment
    implements ApiDataChangeNotificationListener, StaggeredGridViewListener, ProductFeedGridCellView.GridCellFragment
{
    public static final class DataMode extends Enum
    {

        private static final DataMode $VALUES[];
        public static final DataMode Brand;
        public static final DataMode Collections;
        public static final DataMode Merchant;
        public static final DataMode Search;
        public static final DataMode Set;
        public static final DataMode Tag;
        public static final DataMode WishlistV2;

        public static DataMode valueOf(String s)
        {
            return (DataMode)Enum.valueOf(com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$DataMode, s);
        }

        public static DataMode[] values()
        {
            return (DataMode[])$VALUES.clone();
        }

        static 
        {
            Search = new DataMode("Search", 0);
            Tag = new DataMode("Tag", 1);
            Set = new DataMode("Set", 2);
            Brand = new DataMode("Brand", 3);
            Merchant = new DataMode("Merchant", 4);
            Collections = new DataMode("Collections", 5);
            WishlistV2 = new DataMode("WishlistV2", 6);
            $VALUES = (new DataMode[] {
                Search, Tag, Set, Brand, Merchant, Collections, WishlistV2
            });
        }

        private DataMode(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class SortMode extends Enum
    {

        private static final SortMode $VALUES[];
        public static final SortMode BrandPrice100To150;
        public static final SortMode BrandPrice150Plus;
        public static final SortMode BrandPrice1To20;
        public static final SortMode BrandPrice20To50;
        public static final SortMode BrandPrice50To100;
        public static final SortMode Everything;
        public static final SortMode MostWishes;
        public static final SortMode Price100To150;
        public static final SortMode Price150Plus;
        public static final SortMode Price1To20;
        public static final SortMode Price20To50;
        public static final SortMode Price50To100;
        public static final SortMode Recommended;
        public static final SortMode Trending;

        public static SortMode valueOf(String s)
        {
            return (SortMode)Enum.valueOf(com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$SortMode, s);
        }

        public static SortMode[] values()
        {
            return (SortMode[])$VALUES.clone();
        }

        static 
        {
            Recommended = new SortMode("Recommended", 0);
            Trending = new SortMode("Trending", 1);
            MostWishes = new SortMode("MostWishes", 2);
            Price1To20 = new SortMode("Price1To20", 3);
            Price20To50 = new SortMode("Price20To50", 4);
            Price50To100 = new SortMode("Price50To100", 5);
            Price100To150 = new SortMode("Price100To150", 6);
            Price150Plus = new SortMode("Price150Plus", 7);
            Everything = new SortMode("Everything", 8);
            BrandPrice1To20 = new SortMode("BrandPrice1To20", 9);
            BrandPrice20To50 = new SortMode("BrandPrice20To50", 10);
            BrandPrice50To100 = new SortMode("BrandPrice50To100", 11);
            BrandPrice100To150 = new SortMode("BrandPrice100To150", 12);
            BrandPrice150Plus = new SortMode("BrandPrice150Plus", 13);
            $VALUES = (new SortMode[] {
                Recommended, Trending, MostWishes, Price1To20, Price20To50, Price50To100, Price100To150, Price150Plus, Everything, BrandPrice1To20, 
                BrandPrice20To50, BrandPrice50To100, BrandPrice100To150, BrandPrice150Plus
            });
        }

        private SortMode(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String ARG_BUCKET = "ArgBucket";
    public static final String ARG_COMMERCE_ONLY = "ArgCommerceOnly";
    public static final String ARG_DATA_MODE = "ArgDataMode";
    public static final String ARG_DATA_TITLE = "ArgDataTitle";
    public static final String ARG_DATA_VALUE = "ArgDataValue";
    public static final String ARG_NESTED_FRAGMENT_MODE = "ArgNestedFragmentMode";
    public static final String ARG_PLACEHOLDER_MODE = "ArgPlaceholderMode";
    public static final SortMode BRAND_SORTS[];
    public static final SortMode DEFAULT_SORTS[];
    private static final int REQUEST_PRODUCT_COUNT = 30;
    private static final String STORED_STATE_COLLECTIONS = "StoredStateCollections";
    private static final String STORED_STATE_CREDIT = "StoredStateCredit";
    private static final String STORED_STATE_CURRENT_OFFSET = "StoredStateCurrentOffset";
    private static final String STORED_STATE_DATA = "StoredStateData";
    private static final String STORED_STATE_FOREGROUND_TIME = "StoredStateForegroundTime";
    private static final String STORED_STATE_NO_MORE_DATA = "StoredStateNoMoreData";
    private static final String STORED_STATE_PROMOTION_BANNER = "StoredStatePromotaonBanner";
    private static final String STORED_STATE_PROMOTION_TILE_COUNT = "StoredStatePromotionTileCount";
    private ProductDetailsAddToCartModal addToCartModal;
    private WishBrandFilter brandFilter;
    private SortMode brandSortMode;
    private WishUserProductBucket bucket;
    private boolean commerceOnly;
    private WishCredit credit;
    private int currentOffset;
    private DataMode dataMode;
    private String dataStateCollectionsStoreKey;
    private String dataStateStoreKey;
    private String dataTitle;
    private String dataValue;
    private View editBar;
    private Button editCancelButton;
    private Button editHideButton;
    private ProductFeedEditListOverlayView editListOverlayView;
    private Button editMoveButton;
    private View errorView;
    private GetBrandFeedService getBrandFeedService;
    private GetFeedService getFeedService;
    private GetMerchantFeedService getMerchantFeedService;
    private GetProfileProductsService getProfileProductsService;
    private ProductFeedAdapter gridAdapter;
    private StaggeredGridView gridView;
    private boolean isLoggedInUserBucket;
    private long lastForegroundTime;
    private HashSet lastSeenProductIds;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private LoadingListRow loadingListRow;
    private View loadingView;
    private ProductFeedMoveToBucketView moveToBucketView;
    private View noItemsView;
    private boolean noMoreItems;
    private boolean placeholderMode;
    private ArrayList productCollections;
    private ProductSearchService productSearchService;
    private ProductWishService productWishService;
    private ArrayList products;
    private WishFeedPromotionItem promotionBanner;
    private int promotionTileCount;
    private ProductFeedRenameBucketView renameBucketView;
    private HashMap selectedItems;
    private SortMode sortMode;
    private boolean updatingList;
    private boolean useNestedMode;
    private GetWishlistFeedService wishlistFeedService;

    public ProductFeedFragment()
    {
    }

    public static BaseContentFragment createEverythingFeedFragment(Context context)
    {
        context = new ProductFeedFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ArgDataValue", "all");
        bundle.putInt("ArgDataMode", DataMode.Tag.ordinal());
        context.setArguments(bundle);
        return context;
    }

    private void dismissEditListOverlay()
    {
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Dismiss, com.contextlogic.wish.analytics.Analytics.PageViewType.ListEditingOverlay, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
        clearOverlay();
        editListOverlayView = null;
    }

    private void dismissPromotionBanner(boolean flag)
    {
label0:
        {
            final View bannerView = gridView.getHeaderView();
            if (bannerView != null)
            {
                promotionBanner = null;
                if (!flag)
                {
                    break label0;
                }
                DropDownAnimation dropdownanimation = new DropDownAnimation(bannerView, (int)TypedValue.applyDimension(1, 100F, getActivity().getResources().getDisplayMetrics()), false);
                dropdownanimation.setDuration(250L);
                dropdownanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final ProductFeedFragment this$0;
                    final View val$bannerView;

                    public void onAnimationEnd(Animation animation)
                    {
                        bannerView.post(new Runnable() {

                            final _cls30 this$1;

                            public void run()
                            {
                                gridView.removeHeaderView();
                            }

            
            {
                this$1 = _cls30.this;
                super();
            }
                        });
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                this$0 = ProductFeedFragment.this;
                bannerView = view;
                super();
            }
                });
                bannerView.startAnimation(dropdownanimation);
            }
            return;
        }
        gridView.removeHeaderView();
    }

    private String getBucketShareString()
    {
        if (bucket.getBucketId().equals("rewarded"))
        {
            if (isLoggedInUserBucket)
            {
                return getString(0x7f0603c7, new Object[] {
                    WishApplication.getAppInstance().getAppName()
                });
            } else
            {
                return String.format(getString(0x7f0603c9), new Object[] {
                    bucket.getUserName(), WishApplication.getAppInstance().getAppName()
                });
            }
        }
        if (bucket.getBucketId().equals("added"))
        {
            if (isLoggedInUserBucket)
            {
                return getString(0x7f0603b9, new Object[] {
                    WishApplication.getAppInstance().getAppName()
                });
            } else
            {
                return String.format(getString(0x7f0603c8), new Object[] {
                    bucket.getUserName(), WishApplication.getAppInstance().getAppName()
                });
            }
        }
        if (isLoggedInUserBucket)
        {
            return getString(0x7f0603cf, new Object[] {
                WishApplication.getAppInstance().getAppName()
            });
        } else
        {
            return getString(0x7f0603ca, new Object[] {
                WishApplication.getAppInstance().getAppName()
            });
        }
    }

    private ArrayList getSelectedProductIds()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = selectedItems.entrySet().iterator(); iterator.hasNext(); arraylist.add(((java.util.Map.Entry)iterator.next()).getKey())) { }
        return arraylist;
    }

    private String getSortFilter(SortMode sortmode)
    {
        static class _cls38
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode = new int[SortMode.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.Everything.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.Recommended.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.Trending.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.MostWishes.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.Price1To20.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.Price20To50.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.Price50To100.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.Price100To150.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.Price150Plus.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.BrandPrice1To20.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.BrandPrice20To50.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.BrandPrice50To100.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.BrandPrice100To150.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$productfeed$ProductFeedFragment$SortMode[SortMode.BrandPrice150Plus.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls38..SwitchMap.com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.SortMode[sortmode.ordinal()])
        {
        case 2: // '\002'
        default:
            return "recommended";

        case 3: // '\003'
            return "trending";

        case 4: // '\004'
            return "mostwishes";

        case 5: // '\005'
            return "price_1_20";

        case 6: // '\006'
            return "price_20_50";

        case 7: // '\007'
            return "price_50_100";

        case 8: // '\b'
            return "price_100_150";

        case 9: // '\t'
            return "price_150_all";

        case 1: // '\001'
            return null;

        case 10: // '\n'
            return "1_20";

        case 11: // '\013'
            return "20_50";

        case 12: // '\f'
            return "50_100";

        case 13: // '\r'
            return "100_150";

        case 14: // '\016'
            return "150_all";
        }
    }

    public static String getSortReadableName(SortMode sortmode)
    {
        switch (_cls38..SwitchMap.com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.SortMode[sortmode.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return WishApplication.getAppInstance().getString(0x7f060152);

        case 2: // '\002'
            return WishApplication.getAppInstance().getString(0x7f060402);

        case 3: // '\003'
            return WishApplication.getAppInstance().getString(0x7f060403);

        case 4: // '\004'
            return WishApplication.getAppInstance().getString(0x7f0603fa);

        case 5: // '\005'
            return WishApplication.getAppInstance().getString(0x7f0603fe);

        case 6: // '\006'
            return WishApplication.getAppInstance().getString(0x7f0603ff);

        case 7: // '\007'
            return WishApplication.getAppInstance().getString(0x7f060400);

        case 8: // '\b'
            return WishApplication.getAppInstance().getString(0x7f0603fc);

        case 9: // '\t'
            return WishApplication.getAppInstance().getString(0x7f0603fd);

        case 10: // '\n'
            return WishApplication.getAppInstance().getString(0x7f0603f7);

        case 11: // '\013'
            return WishApplication.getAppInstance().getString(0x7f0603f8);

        case 12: // '\f'
            return WishApplication.getAppInstance().getString(0x7f0603f9);

        case 13: // '\r'
            return WishApplication.getAppInstance().getString(0x7f0603f5);

        case 14: // '\016'
            return WishApplication.getAppInstance().getString(0x7f0603f6);
        }
    }

    private void handleDeleteBucket()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
        alertdialog.setTitle(getActivity().getString(0x7f060073));
        alertdialog.setMessage(getActivity().getString(0x7f060078));
        alertdialog.setButton(getActivity().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final ProductFeedFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
        });
        alertdialog.setButton2(getActivity().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final ProductFeedFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.DeleteBucket);
                (new DeleteBucketService()).requestService(bucket.getBucketId(), new com.contextlogic.wish.api.service.DeleteBucketService.SuccessCallback() {

                    final _cls37 this$1;

                    public void onServiceSucceeded()
                    {
                        trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.DeleteBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
                    }

            
            {
                this$1 = _cls37.this;
                super();
            }
                }, null);
                PopupAlertDialog.showSuccess(getActivity(), null, getActivity().getString(0x7f060112));
                ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketDelete(bucket);
                ((RootActivity)getActivity()).closeScreensWithCount(1);
            }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
        });
        alertdialog.show();
    }

    private void handleEditBucket()
    {
        editBar.setVisibility(0);
        gridView.setEditModeEnabled(true);
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0601a6));
        refreshViewState();
    }

    private void handleLoadingSuccess(ArrayList arraylist, boolean flag, int i, WishFeedEndedButtonSpec wishfeedendedbuttonspec, String s)
    {
        if (!loadingComplete && dataMode == com.contextlogic.wish.ui.fragment.productfeed.DataMode.Set && bucket != null && !bucket.getBucketId().equalsIgnoreCase("hidden"))
        {
            initializeActionButton();
        }
        if (currentOffset == 0 && s != null)
        {
            showTitleBanner(s);
        }
        if (wishfeedendedbuttonspec != null && loadingListRow != null)
        {
            loadingListRow.setNoMoreItemsSpec(wishfeedendedbuttonspec.getMessage(), wishfeedendedbuttonspec.getButtonText(), wishfeedendedbuttonspec.getActionDeepLink(), wishfeedendedbuttonspec.getButtonColor());
        }
        loadingComplete = true;
        wishfeedendedbuttonspec = new ArrayList();
        if (currentOffset == 0)
        {
            lastSeenProductIds.clear();
        } else
        {
            s = new HashSet();
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                Object obj = arraylist.next();
                if (obj instanceof WishProduct)
                {
                    String s1 = ((WishProduct)obj).getProductId();
                    if (!lastSeenProductIds.contains(s1) && !s.contains(s1))
                    {
                        wishfeedendedbuttonspec.add(obj);
                        s.add(s1);
                    }
                } else
                {
                    wishfeedendedbuttonspec.add(obj);
                }
            } while (true);
            lastSeenProductIds = s;
            arraylist = wishfeedendedbuttonspec;
        }
        for (wishfeedendedbuttonspec = arraylist.iterator(); wishfeedendedbuttonspec.hasNext(); products.add(s))
        {
            s = ((String) (wishfeedendedbuttonspec.next()));
        }

        if (currentOffset == 0)
        {
            gridView.scrollTo(0, 0);
            gridView.reloadData();
        } else
        {
            gridView.insertCells(arraylist.size());
        }
        currentOffset = i;
        noMoreItems = flag;
        if (!noMoreItems && products.size() < 25)
        {
            loadNextPage();
        }
        refreshViewState();
        showEditListOverlay();
        updatingList = false;
    }

    private void handleProductClick(WishProduct wishproduct, int i)
    {
        if (getActivity() == null)
        {
            return;
        }
        RootActivity rootactivity = (RootActivity)getActivity();
        String s;
        if (credit != null)
        {
            s = credit.getCreditId();
        } else
        {
            s = null;
        }
        wishproduct = RootActivity.getProductDetailFragment(wishproduct, s, null, bucket);
        if (isModal())
        {
            rootactivity.setModalContentFragment(wishproduct, false);
            return;
        } else
        {
            rootactivity.setContentFragment(wishproduct, false);
            return;
        }
    }

    private void handleRenameBucket()
    {
        renameBucketView.show(bucket.getName());
        if (renameBucketView.getParent() != null)
        {
            ((ViewGroup)renameBucketView.getParent()).removeView(renameBucketView);
        }
        showOverlay(renameBucketView, true);
    }

    private void handleScrollLoad(int i, int j, int k)
    {
        boolean flag;
        if (!loadingErrored && !noMoreItems && !updatingList && !productSearchService.isPending() && !getFeedService.isPending() && !getProfileProductsService.isPending() && !getBrandFeedService.isPending() && !getMerchantFeedService.isPending() && loadingComplete)
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

    private void handleShare()
    {
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Share);
        if (bucket.getPermalink() == null)
        {
            return;
        } else
        {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", getBucketShareString());
            intent.putExtra("android.intent.extra.TEXT", (new StringBuilder()).append(getBucketShareString()).append("\n\n").append(bucket.getPermalink()).toString());
            startActivity(intent);
            return;
        }
    }

    private void hideAllUiElements()
    {
        gridView.setVisibility(8);
        errorView.setVisibility(8);
        noItemsView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void initializeActionButton()
    {
        renameBucketView = new ProductFeedRenameBucketView(getActivity());
        renameBucketView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        renameBucketView.setCallback(new ProductFeedRenameBucketView.Callback() {

            final ProductFeedFragment this$0;

            public void onBucketRenameCanceled()
            {
                clearOverlay();
            }

            public void onBucketRenamed(String s)
            {
                clearOverlay();
                PopupAlertDialog.showSuccess(getActivity(), null, String.format(getActivity().getString(0x7f060374), new Object[] {
                    s
                }));
                ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketRename(bucket, s);
                (new RenameBucketService()).requestService(bucket.getBucketId(), s, new com.contextlogic.wish.api.service.RenameBucketService.SuccessCallback() {

                    final _cls31 this$1;

                    public void onServiceSucceeded()
                    {
                        trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.RenameBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
                    }

            
            {
                this$1 = _cls31.this;
                super();
            }
                }, null);
            }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
        });
        if (WishApplication.getAppInstance().isWishApp())
        {
            getNavigationBar().addMenuItem(getResources().getString(0x7f0603b7), 0x7f0200e2, new NavigationBarButtonCallback() {

                final ProductFeedFragment this$0;

                public void onMenuItemClicked()
                {
                    handleShare();
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            }, false);
        }
        if (isLoggedInUserBucket)
        {
            if (bucket.isEditable())
            {
                getNavigationBar().addMenuItem(getResources().getString(0x7f060135), 0x7f0200e1, new NavigationBarButtonCallback() {

                    final ProductFeedFragment this$0;

                    public void onMenuItemClicked()
                    {
                        handleEditBucket();
                    }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
                }, false);
            }
            if (bucket.isModifiable())
            {
                getNavigationBar().addMenuItem(getResources().getString(0x7f060373), 0, new NavigationBarButtonCallback() {

                    final ProductFeedFragment this$0;

                    public void onMenuItemClicked()
                    {
                        handleRenameBucket();
                    }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
                }, true);
                getNavigationBar().addMenuItem(getResources().getString(0x7f06010f), 0, new NavigationBarButtonCallback() {

                    final ProductFeedFragment this$0;

                    public void onMenuItemClicked()
                    {
                        handleDeleteBucket();
                    }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
                }, true);
            }
        }
    }

    private void loadNextPage()
    {
        loadingErrored = false;
        if (dataMode != DataMode.Tag) goto _L2; else goto _L1
_L1:
        int i = products.size();
        if (currentOffset == 0)
        {
            i = 0;
        }
        i = (i + 30) / 30;
        boolean flag;
        boolean flag1;
        if (currentOffset == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (promotionTileCount < i)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        getFeedService.requestService(currentOffset, 30, flag, flag1, null, dataValue, getSortFilter(sortMode), new com.contextlogic.wish.api.service.GetFeedService.SuccessCallback() {

            final ProductFeedFragment this$0;

            public void onServiceSucceeded(final ArrayList items, final String tagTitle, final boolean noMoreItems, final WishFeedPromotionItem banner, final int promotionTileCount, final int nextOffset, final WishFeedEndedButtonSpec feedEndedSpec, 
                    String s)
            {
                updatingList = true;
                postDelayed(s. new Runnable() , getAnimationTimeRemaining());
            }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final ProductFeedFragment this$0;

            public void onServiceFailed()
            {
                postDelayed(new Runnable() {

                    final _cls18 this$1;

                    public void run()
                    {
                        handleLoadingFailure();
                    }

            
            {
                this$1 = _cls18.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
        });
_L4:
        refreshViewState();
        return;
_L2:
        if (dataMode == DataMode.WishlistV2)
        {
            wishlistFeedService.requestService(currentOffset, 30, com.contextlogic.wish.api.service.GetWishlistFeedService.REQUEST_SOURCE.FEED.name(), new com.contextlogic.wish.api.service.GetWishlistFeedService.SuccessCallback() {

                final ProductFeedFragment this$0;

                public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, int j)
                {
                    updatingList = true;
                    postDelayed(j. new Runnable() {

                        final _cls19 this$1;
                        final ArrayList val$items;
                        final int val$nextOffset;
                        final boolean val$noMoreItems;

                        public void run()
                        {
                            ArrayList arraylist = new ArrayList(items);
                            handleLoadingSuccess(arraylist, noMoreItems, nextOffset, null, null);
                        }

            
            {
                this$1 = final__pcls19;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = I.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final ProductFeedFragment this$0;

                public void onServiceFailed()
                {
                    postDelayed(new Runnable() {

                        final _cls20 this$1;

                        public void run()
                        {
                            handleLoadingFailure();
                        }

            
            {
                this$1 = _cls20.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            });
        } else
        if (dataMode == com.contextlogic.wish.ui.fragment.productfeed.DataMode.Set)
        {
            getProfileProductsService.requestService(dataValue, currentOffset, 30, new com.contextlogic.wish.api.service.GetProfileProductsService.SuccessCallback() {

                final ProductFeedFragment this$0;

                public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset, final WishFeedEndedButtonSpec feedEndedSpec, String s)
                {
                    updatingList = true;
                    postDelayed(s. new Runnable() {

                        final _cls21 this$1;
                        final String val$bannerTitle;
                        final WishFeedEndedButtonSpec val$feedEndedSpec;
                        final ArrayList val$items;
                        final int val$nextOffset;
                        final boolean val$noMoreItems;

                        public void run()
                        {
                            handleLoadingSuccess(items, noMoreItems, nextOffset, feedEndedSpec, bannerTitle);
                        }

            
            {
                this$1 = final__pcls21;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                feedEndedSpec = wishfeedendedbuttonspec;
                bannerTitle = String.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final ProductFeedFragment this$0;

                public void onServiceFailed()
                {
                    postDelayed(new Runnable() {

                        final _cls22 this$1;

                        public void run()
                        {
                            handleLoadingFailure();
                        }

            
            {
                this$1 = _cls22.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            });
        } else
        if (dataMode == DataMode.Search)
        {
            productSearchService.requestService(dataValue, currentOffset, 30, commerceOnly, new com.contextlogic.wish.api.service.ProductSearchService.SuccessCallback() {

                final ProductFeedFragment this$0;

                public void onServiceSucceeded(final ArrayList items, int j, final int nextOffset, final WishFeedEndedButtonSpec feedEndedSpec, String s)
                {
                    boolean flag2 = true;
                    updatingList = true;
                    final boolean noMoreItems = flag2;
                    if (items.size() != 0)
                    {
                        if (j <= items.size() + products.size())
                        {
                            noMoreItems = flag2;
                        } else
                        {
                            noMoreItems = false;
                        }
                    }
                    postDelayed(s. new Runnable() {

                        final _cls23 this$1;
                        final String val$bannerTitle;
                        final WishFeedEndedButtonSpec val$feedEndedSpec;
                        final ArrayList val$items;
                        final int val$nextOffset;
                        final boolean val$noMoreItems;

                        public void run()
                        {
                            handleLoadingSuccess(items, noMoreItems, nextOffset, feedEndedSpec, bannerTitle);
                        }

            
            {
                this$1 = final__pcls23;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                feedEndedSpec = wishfeedendedbuttonspec;
                bannerTitle = String.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final ProductFeedFragment this$0;

                public void onServiceFailed()
                {
                    postDelayed(new Runnable() {

                        final _cls24 this$1;

                        public void run()
                        {
                            handleLoadingFailure();
                        }

            
            {
                this$1 = _cls24.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            });
        } else
        if (dataMode == DataMode.Brand)
        {
            getBrandFeedService.requestService(brandFilter, currentOffset, 30, new com.contextlogic.wish.api.service.GetBrandFeedService.SuccessCallback() {

                final ProductFeedFragment this$0;

                public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset, final WishCredit credit, String s, String s1, final WishFeedEndedButtonSpec feedEndedSpec, 
                        String s2)
                {
                    updatingList = true;
                    postDelayed(s2. new Runnable() {

                        final _cls25 this$1;
                        final String val$bannerTitle;
                        final WishCredit val$credit;
                        final WishFeedEndedButtonSpec val$feedEndedSpec;
                        final ArrayList val$items;
                        final int val$nextOffset;
                        final boolean val$noMoreItems;

                        public void run()
                        {
                            if (credit == null)
                            {
                                getNavigationBar().setMenuItem(getResources().getString(0x7f06039b), 0x7f0200be, new NavigationBarButtonCallback() {

                                    final _cls1 this$2;

                                    public void onMenuItemClicked()
                                    {
                                        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.SearchSelect);
                                        if (getActivity() != null)
                                        {
                                            getActivity().onSearchRequested();
                                        }
                                    }

            
            {
                this$2 = _cls1.this;
                super();
            }
                                });
                            }
                            showCredit(credit);
                            handleLoadingSuccess(items, noMoreItems, nextOffset, feedEndedSpec, bannerTitle);
                        }

            
            {
                this$1 = final__pcls25;
                credit = wishcredit;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                feedEndedSpec = wishfeedendedbuttonspec;
                bannerTitle = String.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final ProductFeedFragment this$0;

                public void onServiceFailed()
                {
                    postDelayed(new Runnable() {

                        final _cls26 this$1;

                        public void run()
                        {
                            handleLoadingFailure();
                        }

            
            {
                this$1 = _cls26.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            });
        } else
        if (dataMode == DataMode.Merchant)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = products.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = iterator.next();
                if (obj instanceof WishProduct)
                {
                    arraylist.add(((WishProduct)obj).getProductId());
                }
            } while (true);
            getMerchantFeedService.requestService(brandFilter, currentOffset, 30, arraylist, new com.contextlogic.wish.api.service.GetMerchantFeedService.SuccessCallback() {

                final ProductFeedFragment this$0;

                public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset, final WishFeedEndedButtonSpec feedEndedSpec, String s, final WishMerchant merchant)
                {
                    postDelayed(s. new Runnable() {

                        final _cls27 this$1;
                        final String val$bannerTitle;
                        final WishFeedEndedButtonSpec val$feedEndedSpec;
                        final ArrayList val$items;
                        final WishMerchant val$merchant;
                        final int val$nextOffset;
                        final boolean val$noMoreItems;

                        public void run()
                        {
                            showMerchantBanner(merchant);
                            handleLoadingSuccess(items, noMoreItems, nextOffset, feedEndedSpec, bannerTitle);
                        }

            
            {
                this$1 = final__pcls27;
                merchant = wishmerchant;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                feedEndedSpec = wishfeedendedbuttonspec;
                bannerTitle = String.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final ProductFeedFragment this$0;

                public void onServiceFailed()
                {
                    postDelayed(new Runnable() {

                        final _cls28 this$1;

                        public void run()
                        {
                            handleLoadingFailure();
                        }

            
            {
                this$1 = _cls28.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void onRemoveItemAnimationComplete(int i)
    {
        gridView.removeCell(i);
    }

    private void performAddToCart(String s, String s1, String s2, int i)
    {
        RootActivity rootactivity = (RootActivity)getActivity();
        if (rootactivity != null)
        {
            rootactivity.showCart(s, s1, s2, i);
        }
    }

    private void performPromotionItemAction(WishFeedPromotionItem wishfeedpromotionitem)
    {
        (new FeedCampaignLogService()).requestService(com.contextlogic.wish.api.service.FeedCampaignLogService.FeedCampaignLogServiceActionType.Action, wishfeedpromotionitem.getCampaignId(), null, null);
        wishfeedpromotionitem = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(wishfeedpromotionitem.getActionUrl()));
        if (wishfeedpromotionitem != null)
        {
            FragmentActivity fragmentactivity = getActivity();
            if (fragmentactivity != null && (fragmentactivity instanceof RootActivity))
            {
                ((RootActivity)fragmentactivity).processDeepLink(wishfeedpromotionitem, false);
            }
        }
    }

    private void refreshCommerceStates()
    {
        if (getView() != null)
        {
            SparseArray sparsearray = gridView.getVisibleViews();
            int j = sparsearray.size();
            for (int i = 0; i < j; i++)
            {
                StaggeredGridCellView staggeredgridcellview = (StaggeredGridCellView)sparsearray.valueAt(i);
                if (staggeredgridcellview instanceof ProductFeedGridCellView)
                {
                    ((ProductFeedGridCellView)staggeredgridcellview).refreshCommerceState();
                }
            }

        }
    }

    private void refreshTitleView()
    {
        String s = dataTitle;
        if (useNestedMode)
        {
            return;
        }
        if (dataMode == DataMode.Brand)
        {
            if (brandSortMode == SortMode.Everything)
            {
                if (s == null || s.toLowerCase().equals("wishwall"))
                {
                    getNavigationBar().setTitleLogo();
                    return;
                } else
                {
                    getNavigationBar().setTitle(s);
                    return;
                }
            }
            if (s == null || s.toLowerCase().equals("wishwall"))
            {
                s = getString(0x7f0603dd);
            }
            String s1 = getSortReadableName(brandSortMode);
            getNavigationBar().setTitle(s, s1);
            return;
        }
        if (dataMode != DataMode.Tag)
        {
            if (s == null)
            {
                getNavigationBar().setTitleLogo();
                return;
            } else
            {
                getNavigationBar().setTitle(s);
                return;
            }
        }
        if (sortMode == SortMode.Recommended)
        {
            if (s == null)
            {
                getNavigationBar().setTitleLogo();
                return;
            } else
            {
                getNavigationBar().setTitle(s);
                return;
            }
        }
        if (s == null)
        {
            s = getString(0x7f060402);
        }
        getNavigationBar().setTitle(s, getSortReadableName(sortMode));
    }

    private void refreshViewState()
    {
        hideAllUiElements();
        loadingListRow.setVisibility(0);
        if (!loadingErrored) goto _L2; else goto _L1
_L1:
        if (products.size() <= 0) goto _L4; else goto _L3
_L3:
        gridView.setVisibility(0);
        if (!noMoreItems) goto _L6; else goto _L5
_L5:
        loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
_L8:
        return;
_L6:
        if (productSearchService.isPending() || getFeedService.isPending() || getProfileProductsService.isPending() || getBrandFeedService.isPending() || getMerchantFeedService.isPending())
        {
            loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
            return;
        } else
        {
            loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
            return;
        }
_L4:
        errorView.setVisibility(0);
        return;
_L2:
        if (loadingComplete && products.size() == 0 && (gridView.getHeaderView() == null || dataMode != DataMode.Merchant))
        {
            noItemsView.setVisibility(0);
            return;
        }
        if (loadingComplete || gridView.getHeaderView() != null && dataMode == DataMode.Merchant)
        {
            gridView.setVisibility(0);
            if (noMoreItems)
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                return;
            }
            if (productSearchService.isPending() || getFeedService.isPending() || getProfileProductsService.isPending() || getBrandFeedService.isPending() || getMerchantFeedService.isPending())
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
                return;
            } else
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
                return;
            }
        }
        if (productSearchService.isPending() || getFeedService.isPending() || getProfileProductsService.isPending() || getBrandFeedService.isPending() || getMerchantFeedService.isPending())
        {
            loadingView.setVisibility(0);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void refreshWishStates(boolean flag)
    {
        if (getView() != null)
        {
            SparseArray sparsearray = gridView.getVisibleViews();
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
    }

    private void refreshWishStatesDelayed(final boolean allowAnimate)
    {
        if (getView() != null)
        {
            getView().post(new Runnable() {

                final ProductFeedFragment this$0;
                final boolean val$allowAnimate;

                public void run()
                {
                    refreshWishStates(allowAnimate);
                }

            
            {
                this$0 = ProductFeedFragment.this;
                allowAnimate = flag;
                super();
            }
            });
        }
    }

    private void removeItemFromFeed(View view, final int index)
    {
        Object obj = products.get(index);
        if (obj instanceof WishProduct)
        {
            obj = (WishProduct)obj;
            (new DislikeProductService()).requestService(((WishProduct) (obj)).getProductId(), null, null);
            if (!UserPreferences.getDislikeDialogSeen())
            {
                PopupAlertDialog.showSuccess(getActivity(), getActivity().getString(0x7f060436), getActivity().getString(0x7f060370));
                UserPreferences.setDislikeDialogSeen(true);
            }
            obj = new AlphaAnimation(1.0F, 0.0F);
            ((AlphaAnimation) (obj)).setDuration(500L);
            ((AlphaAnimation) (obj)).setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final ProductFeedFragment this$0;
                final int val$index;

                public void onAnimationEnd(Animation animation)
                {
                    (new Handler()).post(new Runnable() {

                        final _cls16 this$1;

                        public void run()
                        {
                            onRemoveItemAnimationComplete(index);
                        }

            
            {
                this$1 = _cls16.this;
                super();
            }
                    });
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = ProductFeedFragment.this;
                index = i;
                super();
            }
            });
            view.startAnimation(((Animation) (obj)));
            products.remove(index);
        }
    }

    private void restoreSortMode()
    {
        sortMode = SortMode.Recommended;
    }

    private void showAddToCartModal(final WishProduct product)
    {
        addToCartModal = new ProductDetailsAddToCartModal(getActivity());
        addToCartModal.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedFragment this$0;

            public void onClick(View view)
            {
            }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
        });
        addToCartModal.setProduct(product, getApplicableCredit(product));
        addToCartModal.setCallback(new com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal.Callback() {

            final ProductFeedFragment this$0;
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
                this$0 = ProductFeedFragment.this;
                product = wishproduct;
                super();
            }
        });
        showOverlay(addToCartModal, false);
    }

    private void showCredit(WishCredit wishcredit)
    {
        if (credit != null && wishcredit != null && credit.getCreditId().equals(wishcredit.getCreditId()))
        {
            return;
        }
        credit = wishcredit;
        if (wishcredit != null)
        {
            gridView.removeHeaderView();
            ProductFeedGiftCardBannerView productfeedgiftcardbannerview = new ProductFeedGiftCardBannerView(getActivity());
            productfeedgiftcardbannerview.setCredit(wishcredit);
            gridView.addHeaderView(productfeedgiftcardbannerview);
            return;
        } else
        {
            gridView.removeHeaderView();
            return;
        }
    }

    private void showEditListOverlay()
    {
        if (TabletUtil.isTablet(getActivity()))
        {
            UserPreferences.setListEditingOverlaySeen(true);
        }
        if (bucket != null && isLoggedInUserBucket && bucket.isEditable() && loadingComplete && !UserPreferences.getListEditingOverlaySeen())
        {
            UserPreferences.setListEditingOverlaySeen(true);
            Analytics.getInstance().trackPageView(com.contextlogic.wish.analytics.Analytics.PageViewType.ListEditingOverlay);
            editListOverlayView = new ProductFeedEditListOverlayView(getActivity());
            editListOverlayView.setOnClickListener(new android.view.View.OnClickListener() {

                final ProductFeedFragment this$0;

                public void onClick(View view)
                {
                    dismissEditListOverlay();
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            });
            showOverlay(editListOverlayView, false);
        }
    }

    private void showMerchantBanner(WishMerchant wishmerchant)
    {
        if (gridView.getHeaderView() == null && gridView.getSpecialHeaderView() == null)
        {
            ProductFeedMerchantBannerView productfeedmerchantbannerview = new ProductFeedMerchantBannerView(getActivity());
            productfeedmerchantbannerview.setMerchant(wishmerchant);
            productfeedmerchantbannerview.setFragment(this);
            gridView.addHeaderView(productfeedmerchantbannerview);
        }
    }

    private void showPromotionBanner(WishFeedPromotionItem wishfeedpromotionitem)
    {
        promotionBanner = wishfeedpromotionitem;
        if (wishfeedpromotionitem != null)
        {
            gridView.removeHeaderView();
            if (!wishfeedpromotionitem.isImpressionTracked())
            {
                wishfeedpromotionitem.setImpressionTracked(true);
                (new FeedCampaignLogService()).requestService(com.contextlogic.wish.api.service.FeedCampaignLogService.FeedCampaignLogServiceActionType.Impression, wishfeedpromotionitem.getCampaignId(), null, null);
            }
            ProductFeedPromotionBannerView productfeedpromotionbannerview = new ProductFeedPromotionBannerView(getActivity());
            productfeedpromotionbannerview.setActionListener(new ProductFeedPromotionBannerView.ActionListener() {

                final ProductFeedFragment this$0;

                public void onAction(WishFeedPromotionItem wishfeedpromotionitem1)
                {
                    performPromotionItemAction(wishfeedpromotionitem1);
                    dismissPromotionBanner(false);
                }

                public void onDismissed(WishFeedPromotionItem wishfeedpromotionitem1)
                {
                    (new FeedCampaignLogService()).requestService(com.contextlogic.wish.api.service.FeedCampaignLogService.FeedCampaignLogServiceActionType.Dismiss, wishfeedpromotionitem1.getCampaignId(), null, null);
                    dismissPromotionBanner(true);
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            });
            productfeedpromotionbannerview.setPromotionItem(wishfeedpromotionitem);
            gridView.addHeaderView(productfeedpromotionbannerview);
            return;
        } else
        {
            gridView.removeHeaderView();
            return;
        }
    }

    private void showTitleBanner(String s)
    {
        if (gridView.getHeaderView() == null && gridView.getSpecialHeaderView() == null)
        {
            ProductFeedTitleBannerView productfeedtitlebannerview = new ProductFeedTitleBannerView(getActivity());
            productfeedtitlebannerview.setMessage(s);
            gridView.addHeaderView(productfeedtitlebannerview);
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

            final ProductFeedFragment this$0;

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
                gridView.setEditModeEnabled(false);
                editBar.setVisibility(8);
                selectedItems.clear();
                if (s1 == null || bucket == null || !s1.equals(bucket.getBucketId()))
                {
                    if (getActivity() != null)
                    {
                        PopupAlertDialog.showSuccess(getActivity(), null, String.format(getActivity().getString(0x7f0602b5), new Object[] {
                            s
                        }));
                    }
                    if (bucket != null)
                    {
                        ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketEdit(bucket, arraylist1);
                    }
                    for (arraylist1 = arraylist1.iterator(); arraylist1.hasNext(); (new MoveToBucketService()).requestService(((String) (obj)), s, s1, null, null))
                    {
                        obj = (String)arraylist1.next();
                    }

                }
                break; /* Loop/switch isn't completed */
_L2:
                if (obj != null)
                {
                    ((RootActivity) (obj)).closeMenus();
                }
                if (true) goto _L4; else goto _L3
_L3:
                if (getActivity() != null)
                {
                    ((RootActivity)getActivity()).setRightMenuFragment(new WishlistMenuFragment());
                }
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
                gridView.setEditModeEnabled(false);
                editBar.setVisibility(8);
                selectedItems.clear();
                String s;
                for (obj = arraylist1.iterator(); ((Iterator) (obj)).hasNext(); (new HideProductService()).requestService(s, new com.contextlogic.wish.api.service.HideProductService.SuccessCallback() {

            final _cls14 this$1;

            public void onServiceSucceeded()
            {
                trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
            }

            
            {
                this$1 = _cls14.this;
                super();
            }
        }, null))
                {
                    s = (String)((Iterator) (obj)).next();
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForProductUnwish(s);
                }

                PopupAlertDialog.showSuccess(getActivity(), null, WishApplication.getAppInstance().getQuantityString(0x7f070006, arraylist1.size()));
                if (bucket != null)
                {
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketEdit(bucket, arraylist1);
                }
                ((RootActivity)getActivity()).setRightMenuFragment(new WishlistMenuFragment());
            }

            
            {
                this$0 = ProductFeedFragment.this;
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
        if (DataMode.values()[getArguments().getInt("ArgDataMode")] == DataMode.Tag)
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.FeedGrid;
        }
        if (DataMode.values()[getArguments().getInt("ArgDataMode")] == com.contextlogic.wish.ui.fragment.productfeed.DataMode.Set)
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.ProfileBucketGrid;
        }
        if (DataMode.values()[getArguments().getInt("ArgDataMode")] == DataMode.Merchant)
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.MerchantFeedGrid;
        }
        if (DataMode.values()[getArguments().getInt("ArgDataMode")] == DataMode.Brand)
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.BrandFeedGrid;
        } else
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.SearchResultGrid;
        }
    }

    public WishCredit getApplicableCredit(WishProduct wishproduct)
    {
        return null;
    }

    public DataMode getDataMode()
    {
        return dataMode;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f030083;
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        if (dataMode == DataMode.Merchant)
        {
            return WishAnalyticsEvent.IMPRESSION_MOBILE_NATIVE_MERCHANT_PAGE;
        } else
        {
            return null;
        }
    }

    public void handleCollectionClick(WishCollection wishcollection, int i)
    {
        if (getActivity() != null)
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_FOOTER_COLLECTION);
            wishcollection = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(wishcollection.getActionUrl()));
            if (wishcollection != null)
            {
                FragmentActivity fragmentactivity = getActivity();
                if (fragmentactivity != null && (fragmentactivity instanceof RootActivity))
                {
                    ((RootActivity)fragmentactivity).processDeepLink(wishcollection, false);
                    return;
                }
            }
        }
    }

    protected void handleOrientationChanged()
    {
        super.handleOrientationChanged();
        if (gridView != null)
        {
            gridView.reloadData();
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
        if (lastForegroundTime > 0L && System.currentTimeMillis() - lastForegroundTime > 0x1b7740L)
        {
            products.clear();
            productCollections.clear();
            if (gridView.getHeaderView() == null || dataMode != DataMode.Merchant)
            {
                gridView.removeHeaderView();
                gridView.removeSpecialHeaderView();
            }
            noMoreItems = false;
            currentOffset = 0;
            promotionTileCount = 0;
            loadingComplete = false;
            gridView.addFooterView(loadingListRow);
            gridView.reloadData();
        }
        lastForegroundTime = System.currentTimeMillis();
        if (currentOffset == -1 || !loadingComplete)
        {
            currentOffset = 0;
            loadNextPage();
        }
        refreshViewState();
        refreshWishStates(false);
        refreshCommerceStates();
        if (gridAdapter != null)
        {
            gridAdapter.resumeCacheWarming();
        }
        if (gridView != null)
        {
            View view = gridView.getHeaderView();
            if (view != null && (view instanceof ProductFeedGiftCardBannerView))
            {
                ((ProductFeedGiftCardBannerView)view).handleResume();
            }
        }
        showEditListOverlay();
    }

    protected void initializeUi(View view)
    {
        if (useNestedMode)
        {
            hideNavigationBar();
        }
        selectedItems.clear();
        if (dataMode != DataMode.Tag && dataMode != DataMode.Brand) goto _L2; else goto _L1
_L1:
        if (dataMode != DataMode.Brand)
        {
            getNavigationBar().setMenuItem(getResources().getString(0x7f06039b), 0x7f0200be, new NavigationBarButtonCallback() {

                final ProductFeedFragment this$0;

                public void onMenuItemClicked()
                {
                    trackClick(com.contextlogic.wish.analytics.Analytics.EventType.SearchSelect);
                    if (getActivity() != null)
                    {
                        getActivity().onSearchRequested();
                    }
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            });
        }
_L4:
        editBar = view.findViewById(0x7f0d026c);
        editMoveButton = (Button)view.findViewById(0x7f0d026d);
        editHideButton = (Button)view.findViewById(0x7f0d026e);
        editCancelButton = (Button)view.findViewById(0x7f0d026f);
        gridView = (StaggeredGridView)view.findViewById(0x7f0d0268);
        loadingView = view.findViewById(0x7f0d0269);
        noItemsView = view.findViewById(0x7f0d026a);
        errorView = view.findViewById(0x7f0d026b);
        moveToBucketView = new ProductFeedMoveToBucketView(getActivity());
        moveToBucketView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        editCancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedFragment this$0;

            public void onClick(View view1)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Cancel);
                gridView.setEditModeEnabled(false);
                editBar.setVisibility(8);
                selectedItems.clear();
            }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
        });
        editMoveButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedFragment this$0;

            public void onClick(View view1)
            {
                view1 = getSelectedProductIds();
                if (view1.size() > 0)
                {
                    editListForProducts(view1);
                }
            }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
        });
        editHideButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedFragment this$0;

            public void onClick(View view1)
            {
                view1 = getSelectedProductIds();
                if (view1.size() > 0)
                {
                    AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
                    alertdialog.setTitle(getActivity().getString(0x7f060073));
                    alertdialog.setMessage(WishApplication.getAppInstance().getQuantityString(0x7f070001, view1.size()));
                    alertdialog.setButton(getActivity().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

                        final _cls5 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                        }

            
            {
                this$1 = _cls5.this;
                super();
            }
                    });
                    alertdialog.setButton2(getActivity().getString(0x7f060488), view1. new android.content.DialogInterface.OnClickListener() {

                        final _cls5 this$1;
                        final ArrayList val$productIds;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            trackClick(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct);
                            gridView.setEditModeEnabled(false);
                            editBar.setVisibility(8);
                            selectedItems.clear();
                            String s;
                            for (dialoginterface = productIds.iterator(); dialoginterface.hasNext(); (new HideProductService()).requestService(s, new com.contextlogic.wish.api.service.HideProductService.SuccessCallback() {

                        final _cls2 this$2;

                        public void onServiceSucceeded()
                        {
                            trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
                        }

            
            {
                this$2 = _cls2.this;
                super();
            }
                    }, null))
                            {
                                s = (String)dialoginterface.next();
                                ApiDataChangeNotificationManager.getInstance().notifyListenersForProductUnwish(s);
                            }

                            PopupAlertDialog.showSuccess(getActivity(), null, WishApplication.getAppInstance().getQuantityString(0x7f070006, productIds.size()));
                            if (bucket != null)
                            {
                                ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketEdit(bucket, productIds);
                            }
                        }

            
            {
                this$1 = final__pcls5;
                productIds = ArrayList.this;
                super();
            }
                    });
                    alertdialog.show();
                }
            }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
        });
        gridView.setListener(this);
        loadingListRow = new LoadingListRow(getActivity());
        loadingListRow.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductFeedFragment this$0;

            public void onClick(View view1)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Load);
                loadNextPage();
            }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
        });
        gridView.addFooterView(loadingListRow);
        gridAdapter = new ProductFeedAdapter(getActivity(), products, gridView, this);
        gridView.setAdapter(gridAdapter);
        gridView.reloadData();
        if (promotionBanner != null)
        {
            showPromotionBanner(promotionBanner);
        }
        if (credit != null)
        {
            showCredit(credit);
        }
        if (loadingComplete && dataMode == com.contextlogic.wish.ui.fragment.productfeed.DataMode.Set && bucket != null && !bucket.getBucketId().equalsIgnoreCase("hidden"))
        {
            initializeActionButton();
        }
        refreshTitleView();
        hideAllUiElements();
        return;
_L2:
        if (dataMode == DataMode.Search || dataMode == DataMode.Collections)
        {
            getNavigationBar().setMenuItem(getResources().getString(0x7f06039b), 0x7f0200be, new NavigationBarButtonCallback() {

                final ProductFeedFragment this$0;

                public void onMenuItemClicked()
                {
                    trackClick(com.contextlogic.wish.analytics.Analytics.EventType.SearchSelect);
                    if (getActivity() != null)
                    {
                        getActivity().onSearchRequested();
                    }
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isProductSelected(WishProduct wishproduct)
    {
        return selectedItems.containsKey(wishproduct.getProductId());
    }

    public boolean isWishPending(String s)
    {
        return productWishService.isPending(s);
    }

    public boolean onBackPressed()
    {
        if (renameBucketView != null && renameBucketView.getParent() != null)
        {
            renameBucketView.onBackPressed();
            return true;
        }
        if (moveToBucketView != null && moveToBucketView.getParent() != null)
        {
            moveToBucketView.onBackPressed();
            return true;
        }
        if (gridView != null && gridView.isInEditMode())
        {
            editBar.setVisibility(8);
            gridView.setEditModeEnabled(false);
            selectedItems.clear();
            return true;
        } else
        {
            return super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getFeedService = new GetFeedService();
        productSearchService = new ProductSearchService();
        getProfileProductsService = new GetProfileProductsService();
        getBrandFeedService = new GetBrandFeedService();
        getMerchantFeedService = new GetMerchantFeedService();
        productWishService = new ProductWishService();
        wishlistFeedService = new GetWishlistFeedService();
        selectedItems = new HashMap();
        dataMode = DataMode.values()[getArguments().getInt("ArgDataMode")];
        dataTitle = getArguments().getString("ArgDataTitle");
        useNestedMode = getArguments().getBoolean("ArgNestedFragmentMode", false);
        lastSeenProductIds = new HashSet();
        bundle = getArguments().getSerializable("ArgDataValue");
        boolean flag;
        if (bundle instanceof String)
        {
            dataValue = (String)bundle;
        } else
        if (bundle instanceof WishBrandFilter)
        {
            brandFilter = (WishBrandFilter)bundle;
            dataValue = brandFilter.getQuery();
            dataTitle = brandFilter.getTitle();
            if (brandFilter.isMerchant())
            {
                dataMode = DataMode.Merchant;
                dataTitle = getActivity().getString(0x7f060417);
            } else
            {
                bundle = brandFilter.getPrice();
                brandSortMode = SortMode.Everything;
                if (bundle != null)
                {
                    if (bundle.equals("1_20"))
                    {
                        brandSortMode = SortMode.BrandPrice1To20;
                    } else
                    if (bundle.equals("20_50"))
                    {
                        brandSortMode = SortMode.BrandPrice20To50;
                    } else
                    if (bundle.equals("50_100"))
                    {
                        brandSortMode = SortMode.BrandPrice50To100;
                    } else
                    if (bundle.equals("100_150"))
                    {
                        brandSortMode = SortMode.BrandPrice100To150;
                    } else
                    if (bundle.equals("150_all"))
                    {
                        brandSortMode = SortMode.BrandPrice150Plus;
                    }
                }
            }
        }
        placeholderMode = getArguments().getBoolean("ArgPlaceholderMode", false);
        commerceOnly = getArguments().getBoolean("ArgCommerceOnly", false);
        bucket = (WishUserProductBucket)getArguments().getSerializable("ArgBucket");
        if (bucket != null && LoggedInUser.getInstance().isLoggedIn() && bucket.getUserId().equals(LoggedInUser.getInstance().getCurrentUser().getUserId()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isLoggedInUserBucket = flag;
        if (bucket != null)
        {
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketRename, this);
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketEdit, this);
        }
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Wish, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Unwish, this);
        restoreSortMode();
    }

    public void onDeepLinkSortSelected(String s)
    {
        FragmentActivity fragmentactivity;
        if (getActivity() != null)
        {
            if ((s = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(s))) != null && s.getType() != com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Website && ((fragmentactivity = getActivity()) != null && (fragmentactivity instanceof RootActivity)))
            {
                ((RootActivity)fragmentactivity).processDeepLink(s, false);
                return;
            }
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        RuntimeStateStore.getInstance().clearState(dataStateStoreKey);
    }

    public boolean onLongClickCell(final StaggeredGridCellView cell, final int index)
    {
        if (dataMode != DataMode.Tag || sortMode != SortMode.Recommended) goto _L2; else goto _L1
_L1:
        if (products.get(index) instanceof WishProduct) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        Object obj = getString(0x7f06036f);
        Object obj2 = getString(0x7f0600bc);
        obj = new ArrayAdapter(getActivity(), 0x1090011, new String[] {
            obj, obj2
        });
        obj2 = new android.app.AlertDialog.Builder(getActivity());
        ((android.app.AlertDialog.Builder) (obj2)).setTitle(getString(0x7f060032));
        ((android.app.AlertDialog.Builder) (obj2)).setAdapter(((android.widget.ListAdapter) (obj)), new android.content.DialogInterface.OnClickListener() {

            final ProductFeedFragment this$0;
            final StaggeredGridCellView val$cell;
            final int val$index;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == 0)
                {
                    removeItemFromFeed(cell.getContentView(), index);
                }
            }

            
            {
                this$0 = ProductFeedFragment.this;
                cell = staggeredgridcellview;
                index = i;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj2)).show();
        return true;
_L2:
        if (bucket != null && bucket.isEditable() && !gridView.isInEditMode())
        {
            editBar.setVisibility(0);
            gridView.setEditModeEnabled(true);
            Object obj1 = products.get(index);
            if (obj1 instanceof WishProduct)
            {
                obj1 = (WishProduct)obj1;
                selectedItems.put(((WishProduct) (obj1)).getProductId(), Boolean.valueOf(true));
            }
            if (cell instanceof ProductFeedGridCellView)
            {
                ((ProductFeedGridCellView)cell).refreshSelectedState();
            }
            return true;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype != com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketRename) goto _L2; else goto _L1
_L1:
        notificationtype = bundle.getString("BucketId");
        if (bucket != null && notificationtype.equals(bucket.getBucketId()))
        {
            getNavigationBar().setTitle(bundle.getString("Name"));
        }
_L4:
        return;
_L2:
        if (notificationtype != com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketEdit)
        {
            continue; /* Loop/switch isn't completed */
        }
        notificationtype = bundle.getString("BucketId");
        if (bucket == null || !notificationtype.equals(bucket.getBucketId())) goto _L4; else goto _L3
_L3:
        notificationtype = bundle.getStringArrayList("ProductId").iterator();
        do
        {
            if (!notificationtype.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            bundle = (String)notificationtype.next();
            int i = 0;
            do
            {
                if (i < products.size())
                {
label0:
                    {
                        Object obj = products.get(i);
                        if (!(obj instanceof WishProduct) || !((WishProduct)obj).getProductId().equals(bundle))
                        {
                            break label0;
                        }
                        products.remove(i);
                    }
                }
                if (true)
                {
                    break;
                }
                i++;
            } while (true);
        } while (true);
        if (gridView == null || getView() == null) goto _L4; else goto _L5
_L5:
        gridView.reloadData();
        refreshViewState();
        return;
        if (notificationtype != com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Wish && notificationtype != com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Unwish) goto _L4; else goto _L6
_L6:
        refreshWishStatesDelayed(false);
        return;
    }

    public void onPause()
    {
        super.onPause();
        if (gridAdapter != null)
        {
            gridAdapter.pauseCacheWarming();
        }
        if (gridView != null)
        {
            View view = gridView.getHeaderView();
            if (view != null && (view instanceof ProductFeedGiftCardBannerView))
            {
                ((ProductFeedGiftCardBannerView)view).handlePause();
            }
        }
        getFeedService.cancelAllRequests();
        productSearchService.cancelAllRequests();
        getProfileProductsService.cancelAllRequests();
        getBrandFeedService.cancelAllRequests();
        getMerchantFeedService.cancelAllRequests();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loadingComplete && products.size() > 0 && currentOffset >= 0)
        {
            dataStateStoreKey = RuntimeStateStore.getInstance().storeState(products, dataStateStoreKey);
            bundle.putSerializable("StoredStateData", dataStateStoreKey);
            bundle.putInt("StoredStateCurrentOffset", currentOffset);
            bundle.putLong("StoredStateForegroundTime", lastForegroundTime);
            bundle.putBoolean("StoredStateNoMoreData", noMoreItems);
            bundle.putInt("StoredStatePromotionTileCount", promotionTileCount);
            if (promotionBanner != null)
            {
                bundle.putSerializable("StoredStatePromotaonBanner", promotionBanner);
            }
            if (credit != null)
            {
                bundle.putSerializable("StoredStateCredit", credit);
            }
            if (productCollections.size() > 0)
            {
                dataStateCollectionsStoreKey = RuntimeStateStore.getInstance().storeState(productCollections, dataStateCollectionsStoreKey);
                bundle.putSerializable("StoredStateCollections", dataStateCollectionsStoreKey);
            }
        }
    }

    public void onScrollChanged(int i, int j, int k, int l)
    {
        handleScrollLoad(i, k, l);
    }

    public void onSelectCell(StaggeredGridCellView staggeredgridcellview, int i)
    {
        Object obj;
        if (i < products.size())
        {
            obj = products.get(i);
            if (!(obj instanceof WishProduct))
            {
                continue;
            }
            obj = (WishProduct)obj;
            if (gridView.isInEditMode())
            {
                if (selectedItems.containsKey(((WishProduct) (obj)).getProductId()))
                {
                    selectedItems.remove(((WishProduct) (obj)).getProductId());
                } else
                {
                    selectedItems.put(((WishProduct) (obj)).getProductId(), Boolean.valueOf(true));
                }
                if (staggeredgridcellview instanceof ProductFeedGridCellView)
                {
                    ((ProductFeedGridCellView)staggeredgridcellview).refreshSelectedState();
                    return;
                }
            } else
            {
                handleProductClick(((WishProduct) (obj)), i);
                return;
            }
        }
        do
        {
            return;
        } while (!(obj instanceof WishFeedPromotionItem));
        performPromotionItemAction((WishFeedPromotionItem)obj);
    }

    public void onSortSelected(SortMode sortmode)
    {
        if (sortMode != sortmode)
        {
            Analytics.getInstance().trackRawEvent((new StringBuilder()).append("Sort").append(sortmode.name()).toString(), getAnalyticsPageViewType(), com.contextlogic.wish.analytics.Analytics.LabelType.Click);
            if (dataMode == DataMode.Brand)
            {
                brandSortMode = sortmode;
                sortmode = getSortFilter(sortmode);
                brandFilter.setPrice(sortmode);
                brandFilter.setProducts(null);
                getArguments().putSerializable("ArgDataValue", brandFilter);
            } else
            {
                sortMode = sortmode;
                UserPreferences.setPreferredSortMode(sortMode.ordinal());
            }
            getFeedService.cancelAllRequests();
            productSearchService.cancelAllRequests();
            getProfileProductsService.cancelAllRequests();
            getBrandFeedService.cancelAllRequests();
            getMerchantFeedService.cancelAllRequests();
            gridView.removeHeaderView();
            products.clear();
            noMoreItems = false;
            currentOffset = 0;
            promotionTileCount = 0;
            loadingComplete = false;
            gridView.reloadData();
            loadNextPage();
            refreshTitleView();
        }
    }

    public void refresh()
    {
        getFeedService.cancelAllRequests();
        productSearchService.cancelAllRequests();
        getProfileProductsService.cancelAllRequests();
        getBrandFeedService.cancelAllRequests();
        getMerchantFeedService.cancelAllRequests();
        wishlistFeedService.cancelAllRequests();
        selectedItems.clear();
        lastSeenProductIds.clear();
        loadingComplete = false;
        noMoreItems = false;
        loadingErrored = false;
        products.clear();
        productCollections.clear();
        currentOffset = 0;
        promotionTileCount = 0;
        gridView.reloadData();
        selectedItems.clear();
        moveToBucketView = new ProductFeedMoveToBucketView(getActivity());
        moveToBucketView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        gridView.setListener(this);
        refreshTitleView();
        loadNextPage();
    }

    protected void releaseImages()
    {
    }

    protected void restoreImages()
    {
        if (gridView != null)
        {
            gridView.restoreImages();
        }
    }

    protected void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
        if (bundle != null && bundle.containsKey("StoredStateData") && bundle.containsKey("StoredStateNoMoreData") && bundle.containsKey("StoredStateCurrentOffset") && bundle.containsKey("StoredStateForegroundTime") && bundle.containsKey("StoredStatePromotionTileCount"))
        {
            dataStateStoreKey = bundle.getString("StoredStateData");
            products = (ArrayList)RuntimeStateStore.getInstance().getState(dataStateStoreKey);
            currentOffset = bundle.getInt("StoredStateCurrentOffset");
            noMoreItems = bundle.getBoolean("StoredStateNoMoreData");
            boolean flag;
            if (products != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            loadingComplete = flag;
            lastForegroundTime = bundle.getLong("StoredStateForegroundTime");
            promotionTileCount = bundle.getInt("StoredStatePromotionTileCount");
            if (bundle.containsKey("StoredStatePromotaonBanner"))
            {
                promotionBanner = (WishFeedPromotionItem)bundle.getSerializable("StoredStatePromotaonBanner");
            }
            if (bundle.containsKey("StoredStateCredit"))
            {
                credit = (WishCredit)bundle.getSerializable("StoredStateCredit");
            }
            if (bundle.containsKey("StoredStateCollections"))
            {
                dataStateCollectionsStoreKey = bundle.getString("StoredStateCollections");
                productCollections = (ArrayList)RuntimeStateStore.getInstance().getState(dataStateCollectionsStoreKey);
            } else
            {
                productCollections = new ArrayList();
            }
        }
        if (!loadingComplete)
        {
            products = new ArrayList();
            productCollections = new ArrayList();
            noMoreItems = false;
            currentOffset = -1;
            loadingComplete = false;
            lastForegroundTime = 0L;
            promotionTileCount = 0;
        }
    }

    public void unwishProduct(WishProduct wishproduct)
    {
        wishproduct = wishproduct.getProductId();
        ApiDataChangeNotificationManager.getInstance().notifyListenersForProductUnwish(wishproduct);
        (new HideProductService()).requestService(wishproduct, new com.contextlogic.wish.api.service.HideProductService.SuccessCallback() {

            final ProductFeedFragment this$0;

            public void onServiceSucceeded()
            {
                trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.UnwishFromProductFeed, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
            }

            
            {
                this$0 = ProductFeedFragment.this;
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

                final ProductFeedFragment this$0;

                public void onServiceSucceeded()
                {
                    refreshWishStatesDelayed(true);
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ProductWishService.FailureCallback() {

                final ProductFeedFragment this$0;

                public void onServiceFailed()
                {
                    refreshWishStatesDelayed(true);
                }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
            });
            refreshWishStates(true);
        }
    }

    static 
    {
        DEFAULT_SORTS = (new SortMode[] {
            SortMode.Recommended, SortMode.Trending, SortMode.MostWishes, SortMode.Price1To20, SortMode.Price20To50, SortMode.Price50To100, SortMode.Price150Plus
        });
        BRAND_SORTS = (new SortMode[] {
            SortMode.Everything, SortMode.BrandPrice1To20, SortMode.BrandPrice20To50, SortMode.BrandPrice50To100, SortMode.BrandPrice150Plus
        });
    }







/*
    static boolean access$1302(ProductFeedFragment productfeedfragment, boolean flag)
    {
        productfeedfragment.updatingList = flag;
        return flag;
    }

*/


/*
    static String access$1402(ProductFeedFragment productfeedfragment, String s)
    {
        productfeedfragment.dataTitle = s;
        return s;
    }

*/



/*
    static int access$1612(ProductFeedFragment productfeedfragment, int i)
    {
        i = productfeedfragment.promotionTileCount + i;
        productfeedfragment.promotionTileCount = i;
        return i;
    }

*/





















/*
    static ProductDetailsAddToCartModal access$902(ProductFeedFragment productfeedfragment, ProductDetailsAddToCartModal productdetailsaddtocartmodal)
    {
        productfeedfragment.addToCartModal = productdetailsaddtocartmodal;
        return productdetailsaddtocartmodal;
    }

*/
}
