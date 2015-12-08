// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlistv2;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.service.GetWishlistFeedService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewListener;
import com.contextlogic.wish.ui.components.list.LoadingListRow;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.base.BaseMenuFragment;
import com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedAdapter;
import com.contextlogic.wish.ui.fragment.profile.ProfileFragment;
import com.contextlogic.wish.user.LoggedInUser;
import java.util.ArrayList;
import java.util.Iterator;

public class WishlistV2MenuFragment extends BaseMenuFragment
    implements ApiDataChangeNotificationListener, StaggeredGridViewListener, com.contextlogic.wish.ui.fragment.productfeed.ProductFeedGridCellView.GridCellFragment
{

    private static long REFRESH_TIME_IN_MS = 0x927c0L;
    private static int REQUEST_PRODUCT_COUNT = 6;
    private ProductDetailsAddToCartModal addToCartModal;
    private int currentOffset;
    private View emptyView;
    private View errorView;
    private StaggeredGridView gridView;
    private long lastRefreshed;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private LoadingListRow loadingListRow;
    private View loadingView;
    private boolean noMoreItems;
    private ArrayList products;
    private boolean updatingList;
    private ProductFeedAdapter wishlistAdapter;
    private GetWishlistFeedService wishlistFeedService;
    private View yourWishlist;

    public WishlistV2MenuFragment()
    {
    }

    private int findIndex(String s)
    {
        for (int i = 0; i < products.size(); i++)
        {
            if ((products.get(i) instanceof WishProduct) && ((WishProduct)products.get(i)).getProductId().equals(s))
            {
                return i;
            }
        }

        return -1;
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0601de));
        refreshViewState();
    }

    private void handleLoadingSuccess(ArrayList arraylist, boolean flag, int i)
    {
        loadingComplete = true;
        Object obj;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); products.add(obj))
        {
            obj = iterator.next();
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
        if (!noMoreItems && products.size() < REQUEST_PRODUCT_COUNT)
        {
            loadNextPage();
        }
        refreshViewState();
        updatingList = false;
    }

    private void handleProductClick(WishProduct wishproduct, int i)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            RootActivity rootactivity = (RootActivity)getActivity();
            wishproduct = RootActivity.getProductDetailFragment(wishproduct, null, null, null);
            rootactivity.closeMenus();
            rootactivity.setContentFragment(wishproduct, false);
            return;
        }
    }

    private void handleScrollLoad(int i, int j, int k)
    {
        boolean flag;
        if (!loadingErrored && !noMoreItems && !updatingList && !wishlistFeedService.isPending() && loadingComplete)
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

    private void handleUnwish(String s)
    {
        loadingComplete = true;
        int i = findIndex(s);
        if (i == -1)
        {
            return;
        } else
        {
            currentOffset = currentOffset - 1;
            removeProduct(i);
            gridView.removeCell(i);
            gridView.reloadData();
            refreshViewState();
            updatingList = false;
            return;
        }
    }

    private void handleWishedForSuccess(WishProduct wishproduct)
    {
        handleUnwish(wishproduct.getProductId());
        loadingComplete = true;
        products.add(0, wishproduct);
        gridView.insertCells(1);
        currentOffset = currentOffset + 1;
        gridView.reloadData();
        refreshViewState();
        updatingList = false;
    }

    private void hideAllUiElements()
    {
        gridView.setVisibility(8);
        errorView.setVisibility(8);
        emptyView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void loadNextPage()
    {
        loadingErrored = false;
        wishlistFeedService.requestService(currentOffset, REQUEST_PRODUCT_COUNT, com.contextlogic.wish.api.service.GetWishlistFeedService.REQUEST_SOURCE.MENU.name(), new com.contextlogic.wish.api.service.GetWishlistFeedService.SuccessCallback() {

            final WishlistV2MenuFragment this$0;

            public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, int i)
            {
                updatingList = true;
                postDelayed(i. new Runnable() {

                    final _cls3 this$1;
                    final ArrayList val$items;
                    final int val$nextOffset;
                    final boolean val$noMoreItems;

                    public void run()
                    {
                        handleLoadingSuccess(items, noMoreItems, nextOffset);
                    }

            
            {
                this$1 = final__pcls3;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = I.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = WishlistV2MenuFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final WishlistV2MenuFragment this$0;

            public void onServiceFailed()
            {
                postDelayed(new Runnable() {

                    final _cls4 this$1;

                    public void run()
                    {
                        handleLoadingFailure();
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = WishlistV2MenuFragment.this;
                super();
            }
        });
        refreshViewState();
    }

    private void performAddToCart(String s, String s1, String s2, int i)
    {
        RootActivity rootactivity = (RootActivity)getActivity();
        if (rootactivity != null)
        {
            rootactivity.showCart(s, s1, s2, i);
        }
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
        emptyView.setVisibility(0);
_L8:
        return;
_L6:
        if (wishlistFeedService.isPending())
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
        if (loadingComplete && products.size() == 0)
        {
            emptyView.setVisibility(0);
            return;
        }
        if (loadingComplete)
        {
            gridView.setVisibility(0);
            if (noMoreItems)
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                return;
            }
            if (wishlistFeedService.isPending())
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
                return;
            }
        } else
        if (wishlistFeedService.isPending())
        {
            loadingView.setVisibility(0);
            return;
        } else
        {
            loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void removeProduct(int i)
    {
        if (i >= 0 && i < products.size())
        {
            products.remove(i);
        }
    }

    private void showAddToCartModal(final WishProduct product)
    {
        addToCartModal = new ProductDetailsAddToCartModal(getActivity());
        addToCartModal.setOnClickListener(new android.view.View.OnClickListener() {

            final WishlistV2MenuFragment this$0;

            public void onClick(View view)
            {
            }

            
            {
                this$0 = WishlistV2MenuFragment.this;
                super();
            }
        });
        addToCartModal.setProduct(product, getApplicableCredit(product));
        addToCartModal.setCallback(new com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal.Callback() {

            final WishlistV2MenuFragment this$0;
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
                this$0 = WishlistV2MenuFragment.this;
                product = wishproduct;
                super();
            }
        });
        showOverlay(addToCartModal, false);
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
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.WishlistMenu;
    }

    public WishCredit getApplicableCredit(WishProduct wishproduct)
    {
        return null;
    }

    public com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode getDataMode()
    {
        return null;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f0300bd;
    }

    public void handleRecommendClick(WishProduct wishproduct)
    {
    }

    public void handleResume()
    {
        super.handleResume();
        refreshIfNeeded(false);
    }

    protected void initializeUi(View view)
    {
        emptyView = view.findViewById(0x7f0d0402);
        loadingView = view.findViewById(0x7f0d0401);
        errorView = view.findViewById(0x7f0d0403);
        yourWishlist = view.findViewById(0x7f0d03ff);
        yourWishlist.setOnClickListener(new android.view.View.OnClickListener() {

            final WishlistV2MenuFragment this$0;

            public void onClick(View view1)
            {
                view1 = new ProfileFragment();
                Object obj = new Bundle();
                ((Bundle) (obj)).putString("ArgUser", RuntimeStateStore.getInstance().storeState(LoggedInUser.getInstance().getCurrentUser(), null));
                view1.setArguments(((Bundle) (obj)));
                obj = (RootActivity)getActivity();
                ((RootActivity) (obj)).setContentFragment(view1, false);
                ((RootActivity) (obj)).closeMenus();
            }

            
            {
                this$0 = WishlistV2MenuFragment.this;
                super();
            }
        });
        gridView = (StaggeredGridView)view.findViewById(0x7f0d0400);
        wishlistAdapter = new ProductFeedAdapter(getActivity(), products, gridView, this);
        wishlistAdapter.overrideNumberOfColumns(1);
        wishlistAdapter.overrideFeedWidth(((RootActivity)getActivity()).getCurrentRightMenuWidth());
        gridView.setAdapter(wishlistAdapter);
        gridView.reloadData();
        gridView.setListener(this);
        gridView.setFadingEdgeLength(0);
        loadingListRow = new LoadingListRow(getActivity());
        loadingListRow.setOnClickListener(new android.view.View.OnClickListener() {

            final WishlistV2MenuFragment this$0;

            public void onClick(View view1)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Load);
                loadNextPage();
            }

            
            {
                this$0 = WishlistV2MenuFragment.this;
                super();
            }
        });
        gridView.addFooterView(loadingListRow);
        hideAllUiElements();
    }

    public boolean isProductSelected(WishProduct wishproduct)
    {
        return false;
    }

    public boolean isWishPending(String s)
    {
        return false;
    }

    public boolean onBackPressed()
    {
        ((RootActivity)getActivity()).closeMenus();
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        products = new ArrayList();
        wishlistFeedService = new GetWishlistFeedService();
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Unwish, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Wish, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.PurchaseComplete, this);
    }

    public boolean onLongClickCell(StaggeredGridCellView staggeredgridcellview, int i)
    {
        return false;
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Wish)
        {
            handleWishedForSuccess((WishProduct)bundle.getSerializable("Product"));
        } else
        {
            if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Unwish)
            {
                handleUnwish((String)bundle.getSerializable("ProductId"));
                return;
            }
            if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.PurchaseComplete)
            {
                refreshIfNeeded(true);
                return;
            }
        }
    }

    public void onScrollChanged(int i, int j, int k, int l)
    {
        handleScrollLoad(i, k, l);
    }

    public void onSelectCell(StaggeredGridCellView staggeredgridcellview, int i)
    {
        if (i < products.size())
        {
            if ((staggeredgridcellview = ((StaggeredGridCellView) (products.get(i)))) instanceof WishProduct)
            {
                handleProductClick((WishProduct)staggeredgridcellview, i);
                return;
            }
        }
    }

    public void refreshIfNeeded(boolean flag)
    {
        long l = System.currentTimeMillis();
        if (flag || lastRefreshed < l - REFRESH_TIME_IN_MS)
        {
            lastRefreshed = l;
            products = new ArrayList();
            noMoreItems = false;
            currentOffset = 0;
            wishlistAdapter = new ProductFeedAdapter(getActivity(), products, gridView, this);
            wishlistAdapter.overrideNumberOfColumns(1);
            wishlistAdapter.overrideFeedWidth(((RootActivity)getActivity()).getCurrentRightMenuWidth());
            loadingComplete = false;
            gridView.setAdapter(wishlistAdapter);
            gridView.reloadData();
            loadNextPage();
            return;
        } else
        {
            refreshViewState();
            return;
        }
    }

    protected void releaseImages()
    {
        if (gridView != null)
        {
            gridView.releaseImages();
        }
    }

    protected void restoreImages()
    {
        if (gridView != null)
        {
            gridView.restoreImages();
        }
    }

    protected boolean shouldTrackImpression()
    {
        return false;
    }

    public void unwishProduct(WishProduct wishproduct)
    {
    }

    public void wishForProduct(WishProduct wishproduct)
    {
    }




/*
    static boolean access$102(WishlistV2MenuFragment wishlistv2menufragment, boolean flag)
    {
        wishlistv2menufragment.updatingList = flag;
        return flag;
    }

*/




/*
    static ProductDetailsAddToCartModal access$402(WishlistV2MenuFragment wishlistv2menufragment, ProductDetailsAddToCartModal productdetailsaddtocartmodal)
    {
        wishlistv2menufragment.addToCartModal = productdetailsaddtocartmodal;
        return productdetailsaddtocartmodal;
    }

*/

}
