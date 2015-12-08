// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.service.GetRelatedProductFeedService;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewListener;
import com.contextlogic.wish.ui.components.list.LoadingListRow;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedAdapter;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedGridCellView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsPagerView, TabbedProductDetailsFragment

public class TabbedProductDetailsRelatedProductsView extends TabbedProductDetailsPagerView
    implements StaggeredGridViewListener
{

    private static final int REQUEST_PRODUCT_COUNT = 30;
    private ProductFeedAdapter adapter;
    private int currentOffset;
    private View errorView;
    private GetRelatedProductFeedService getRelatedProductsService;
    private HashSet lastSeenProductIds;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private LoadingListRow loadingListRow;
    private View loadingView;
    private View noItemsView;
    private boolean noMoreItems;
    private StaggeredGridView productView;
    private ArrayList products;
    private View rootLayout;
    private View spacerView;
    private boolean updatingList;

    public TabbedProductDetailsRelatedProductsView(Context context)
    {
        super(context);
    }

    public TabbedProductDetailsRelatedProductsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TabbedProductDetailsRelatedProductsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        refreshViewState();
    }

    private void handleLoadingSuccess(ArrayList arraylist, boolean flag, int i)
    {
        Object obj = new ArrayList();
        Object obj1;
        if (currentOffset == 0)
        {
            lastSeenProductIds.clear();
        } else
        {
            HashSet hashset = new HashSet();
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                Object obj2 = arraylist.next();
                if (obj2 instanceof WishProduct)
                {
                    String s = ((WishProduct)obj2).getProductId();
                    hashset.add(s);
                    if (!lastSeenProductIds.contains(s))
                    {
                        ((ArrayList) (obj)).add(obj2);
                    }
                } else
                {
                    ((ArrayList) (obj)).add(obj2);
                }
            } while (true);
            lastSeenProductIds = hashset;
            arraylist = ((ArrayList) (obj));
        }
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); products.add(obj1))
        {
            obj1 = ((Iterator) (obj)).next();
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
        updatingList = false;
    }

    private void handleScrollLoad(int i, int j, int k)
    {
        boolean flag;
        if (!loadingErrored && !noMoreItems && !updatingList && !getRelatedProductsService.isPending() && loadingComplete)
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
        productView.setVisibility(8);
        errorView.setVisibility(8);
        noItemsView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void loadNextPage()
    {
        loadingErrored = false;
        getRelatedProductsService.requestService(com.contextlogic.wish.api.service.GetRelatedProductFeedService.FeedMode.Similar, product.getProductId(), currentOffset, 30, null, new com.contextlogic.wish.api.service.GetRelatedProductFeedService.SuccessCallback() {

            final TabbedProductDetailsRelatedProductsView this$0;

            public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, int i)
            {
                updatingList = true;
                queuePagerSettledTask(i. new Runnable() {

                    final _cls2 this$1;
                    final ArrayList val$items;
                    final int val$nextOffset;
                    final boolean val$noMoreItems;

                    public void run()
                    {
                        handleLoadingSuccess(items, noMoreItems, nextOffset);
                    }

            
            {
                this$1 = final__pcls2;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = I.this;
                super();
            }
                });
            }

            
            {
                this$0 = TabbedProductDetailsRelatedProductsView.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final TabbedProductDetailsRelatedProductsView this$0;

            public void onServiceFailed()
            {
                queuePagerSettledTask(new Runnable() {

                    final _cls3 this$1;

                    public void run()
                    {
                        handleLoadingFailure();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
            }

            
            {
                this$0 = TabbedProductDetailsRelatedProductsView.this;
                super();
            }
        });
        refreshViewState();
    }

    private void refreshViewState()
    {
        hideAllUiElements();
        if (loadingErrored)
        {
            if (products.size() > 0)
            {
                productView.setVisibility(0);
                if (noMoreItems)
                {
                    loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                    return;
                }
                if (getRelatedProductsService.isPending())
                {
                    loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
                    return;
                } else
                {
                    loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
                    return;
                }
            } else
            {
                errorView.setVisibility(0);
                return;
            }
        }
        if (loadingComplete && products.size() == 0)
        {
            noItemsView.setVisibility(0);
            return;
        }
        if (loadingComplete)
        {
            productView.setVisibility(0);
            if (noMoreItems)
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                return;
            }
            if (getRelatedProductsService.isPending())
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
                return;
            } else
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
                return;
            }
        } else
        {
            loadingView.setVisibility(0);
            return;
        }
    }

    public void cleanup()
    {
        releaseImages();
        getRelatedProductsService.cancelAllRequests();
    }

    public int getCurrentScrollY()
    {
        if (productView != null)
        {
            return productView.getScrollY();
        } else
        {
            return 0;
        }
    }

    public void handleOrientationChanged()
    {
        if (productView != null)
        {
            productView.reloadData();
        }
    }

    protected void init()
    {
        super.init();
        getRelatedProductsService = new GetRelatedProductFeedService();
        rootLayout = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300b4, this);
        products = new ArrayList();
        lastSeenProductIds = new HashSet();
    }

    public boolean onLongClickCell(StaggeredGridCellView staggeredgridcellview, int i)
    {
        return false;
    }

    public void onScrollChanged(int i, int j, int k, int l)
    {
        handleScrollChanged(i, j);
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

    public void setup(WishProduct wishproduct, int i, TabbedProductDetailsFragment tabbedproductdetailsfragment)
    {
        super.setup(wishproduct, i, tabbedproductdetailsfragment);
        loadingView = rootLayout.findViewById(0x7f0d03d5);
        noItemsView = rootLayout.findViewById(0x7f0d03d6);
        errorView = rootLayout.findViewById(0x7f0d03d7);
        productView = (StaggeredGridView)rootLayout.findViewById(0x7f0d03d4);
        loadingListRow = new LoadingListRow(getContext());
        loadingListRow.setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsRelatedProductsView this$0;

            public void onClick(View view)
            {
                fragment.trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Load);
                loadNextPage();
            }

            
            {
                this$0 = TabbedProductDetailsRelatedProductsView.this;
                super();
            }
        });
        adapter = new ProductFeedAdapter(getContext(), products, productView, fragment);
        productView.setAdapter(adapter);
        productView.setListener(this);
        spacerView = new View(getContext());
        wishproduct = new android.widget.LinearLayout.LayoutParams(-1, tabbedproductdetailsfragment.getTabBarStripHeight());
        spacerView.setLayoutParams(wishproduct);
        productView.addHeaderView(spacerView);
        productView.addFooterView(loadingListRow);
        setupScroller(productView);
        loadNextPage();
    }



/*
    static boolean access$102(TabbedProductDetailsRelatedProductsView tabbedproductdetailsrelatedproductsview, boolean flag)
    {
        tabbedproductdetailsrelatedproductsview.updatingList = flag;
        return flag;
    }

*/


}
