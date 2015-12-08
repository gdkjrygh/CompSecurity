// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.shop.giq.GiqProductItem;
import com.walmart.android.app.shop.giq.GiqUpcSearch;
import com.walmart.android.app.shop.itemloader.ItemLoaderFactory;
import com.walmart.android.app.shop.itemloader.PagingLoader;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.service.item.ItemService;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.util.AvailabilityUtils;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmart.android.wmui.ScrollDirectionListener;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.storelocator.StoreLocationManager;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfPresenter, BarcodeShelfListAdapter, BarcodeShelfHeaderView, ShelfAdapter, 
//            ShelfListAdapter, ShopFilterManager, ShopFilterActivity

public class ShelfListPresenter extends ShelfPresenter
{
    protected class ListItemLoaderListener extends ShelfPresenter.ItemLoaderListener
    {

        final ShelfListPresenter this$0;

        public void onLoadFailed(com.walmart.android.app.shop.itemloader.ItemLoader.PageLoadError pageloaderror, int i)
        {
            super.onLoadFailed(pageloaderror, i);
            WLog.d(ShelfListPresenter.TAG, "onLoadFailed()");
            if (!isPopped() && com.walmart.android.app.shop.itemloader.ItemLoader.PageLoadError.NO_RESULTS.equals(pageloaderror))
            {
                hideFooter();
            }
        }

        protected ListItemLoaderListener()
        {
            this$0 = ShelfListPresenter.this;
            super(ShelfListPresenter.this);
        }
    }


    private static final int NO_ERROR = -1;
    private static final String TAG = com/walmart/android/app/shop/ShelfListPresenter.getSimpleName();
    private BarcodeShelfHeaderView mBarcodeHeaderView;
    private View mHeaderView;
    private View mOptionsFooter;
    private ScrollDirectionListener mScrollDirectionListener;

    public ShelfListPresenter(Activity activity, String s)
    {
        super(activity, s);
    }

    public ShelfListPresenter(Activity activity, String s, int i)
    {
        super(activity, s, i);
    }

    public ShelfListPresenter(Activity activity, String s, String s1)
    {
        super(activity, s, s1);
    }

    public ShelfListPresenter(Activity activity, com.walmart.android.data.StoreQueryResult.Item aitem[], String s)
    {
        super(activity, aitem, s);
    }

    public ShelfListPresenter(Activity activity, String as[])
    {
        super(activity, as);
    }

    private void fallbackToGiqSearch()
    {
        GiqUpcSearch.getInstance().findProductWithUpc(mSearchQuery, new com.walmart.android.app.shop.giq.GiqUpcSearch.OnSearchCompletedAsyncCallback() {

            final ShelfListPresenter this$0;

            public void onFailure()
            {
                if (isPopped())
                {
                    return;
                } else
                {
                    initListViewFromGiqProductItem(null);
                    return;
                }
            }

            public void onSuccess(GiqProductItem giqproductitem)
            {
                if (isPopped())
                {
                    return;
                } else
                {
                    initListViewFromGiqProductItem(giqproductitem);
                    return;
                }
            }

            
            {
                this$0 = ShelfListPresenter.this;
                super();
            }
        });
    }

    private void hideFooter()
    {
        mListContainer.findViewById(0x7f1002dc).setVisibility(8);
    }

    private void initBarcodeShelfListAdapter(StoreAvailabilityData astoreavailabilitydata[], int i)
    {
        BarcodeShelfListAdapter barcodeshelflistadapter = new BarcodeShelfListAdapter(mActivity);
        BarcodeShelfHeaderView barcodeshelfheaderview = getBarcodeHeader();
        StoreAvailabilityData storeavailabilitydata = AvailabilityUtils.getAvailabilityForPreferredStore(mActivity, astoreavailabilitydata);
        if (astoreavailabilitydata != null && barcodeshelfheaderview.setAvailabilityData(storeavailabilitydata, barcodeshelflistadapter.shouldShowSoldOut()))
        {
            mLoader = new PagingLoader(ItemLoaderFactory.createForSearch(barcodeshelfheaderview.getProductSearchName(), null, mSortManager, mFilterManager, 5));
            mLoader.setListener(new ListItemLoaderListener());
            barcodeshelflistadapter.setAndStartLoader(mLoader);
            ((ListRecyclerView)mItemsView).setAdapter(barcodeshelflistadapter);
            ((ListRecyclerView)mItemsView).addHeaderView(barcodeshelfheaderview);
            ((ListRecyclerView)mItemsView).setVisibility(0);
            mLoadingView.setVisibility(8);
            initOptionsFooter();
        } else
        if (i != -1)
        {
            if (i == 0x15f92)
            {
                i = 0x7f090282;
            } else
            {
                i = 0x7f090091;
            }
            barcodeshelfheaderview.setError(mActivity.getString(i));
            ((ListRecyclerView)mItemsView).setAdapter(barcodeshelflistadapter);
            ((ListRecyclerView)mItemsView).addHeaderView(barcodeshelfheaderview);
            ((ListRecyclerView)mItemsView).setVisibility(0);
            mLoadingView.setVisibility(8);
            initOptionsFooter();
        } else
        {
            fallbackToGiqSearch();
        }
        mAdapter = barcodeshelflistadapter;
        if (SharedPreferencesUtil.getSavedLocalAdStore(mActivity) != null)
        {
            astoreavailabilitydata = "Store Set";
        } else
        {
            astoreavailabilitydata = "Store Not Set";
        }
        GoogleAnalytics.trackEvent("Scan", "Scan to Shelf", astoreavailabilitydata);
    }

    private void initListViewFromGiqProductItem(GiqProductItem giqproductitem)
    {
        BarcodeShelfListAdapter barcodeshelflistadapter = (BarcodeShelfListAdapter)mAdapter;
        BarcodeShelfHeaderView barcodeshelfheaderview = getBarcodeHeader();
        boolean flag;
        boolean flag1;
        if (SharedPreferencesUtil.getSavedLocalAdStore(mActivity) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!StoreLocationManager.getInstance(mActivity).getNearbyByStores().isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        barcodeshelfheaderview.setGiqProductItem(giqproductitem, flag, flag1);
        mLoader = new PagingLoader(ItemLoaderFactory.createForSearch(barcodeshelfheaderview.getProductSearchName(), null, mSortManager, mFilterManager, 5));
        mLoader.setListener(new ListItemLoaderListener());
        barcodeshelflistadapter.setAndStartLoader(mLoader);
        ((ListRecyclerView)mItemsView).setAdapter(barcodeshelflistadapter);
        ((ListRecyclerView)mItemsView).addHeaderView(barcodeshelfheaderview);
        ((ListRecyclerView)mItemsView).setVisibility(0);
        mLoadingView.setVisibility(8);
        initOptionsFooter();
    }

    private void initOptionsFooter()
    {
        mOptionsFooter = mListContainer.findViewById(0x7f1002dc);
        if (mMode != 3 && mMode != 4 && mMode != 2)
        {
            mOptionsFooter.setVisibility(0);
            TextView textview = (TextView)ViewUtil.findViewById(mOptionsFooter, 0x7f1002de);
            textview.setText(0x7f090554);
            textview.setOnClickListener(new android.view.View.OnClickListener() {

                final ShelfListPresenter this$0;

                public void onClick(View view)
                {
                    view = new Intent(mActivity, com/walmart/android/app/shop/ShopFilterActivity);
                    ShopFilterManager shopfiltermanager = new ShopFilterManager();
                    shopfiltermanager.setStoreID(mFilterManager.getStoreID());
                    shopfiltermanager.setBrowseToken(mFilterManager.getBrowseToken());
                    shopfiltermanager.setSearchQuery(mFilterManager.getSearchQuery());
                    shopfiltermanager.setDepartment(mFilterManager.getDepartment());
                    shopfiltermanager.setShelfDepartmentTitle(mFilterManager.getShelfDepartmentTitle());
                    shopfiltermanager.setRefinements(mFilterManager.getRefinements());
                    ShopFilterActivity.setFilterParams(shopfiltermanager);
                    mActivity.startActivityForResult(view, 100);
                    mActivity.overridePendingTransition(0x7f05002c, 0x7f050033);
                    if (mMode == 1)
                    {
                        AnalyticsHelper.post(AnalyticsHelper.prepareSearchFilterPageViewEvent());
                    }
                }

            
            {
                this$0 = ShelfListPresenter.this;
                super();
            }
            });
            textview = (TextView)ViewUtil.findViewById(mOptionsFooter, 0x7f1002dd);
            textview.setText(0x7f09055f);
            textview.setOnClickListener(new android.view.View.OnClickListener() {

                final ShelfListPresenter this$0;

                public void onClick(View view)
                {
                    if (mMode == 1)
                    {
                        AnalyticsHelper.post(AnalyticsHelper.prepareSearchSortPageViewEvent());
                    }
                    showDialog(1);
                }

            
            {
                this$0 = ShelfListPresenter.this;
                super();
            }
            });
            setupFooterHideOnScroll(mOptionsFooter);
            return;
        } else
        {
            hideFooter();
            return;
        }
    }

    private void legacyLoadFromBarcode(String s, String as[])
    {
        Services.get().getWalmartService().getStoreAvailabilityByUpc(s, as, new AsyncCallbackOnThread(new Handler()) {

            final ShelfListPresenter this$0;

            private void onResponse(StoreAvailabilityData astoreavailabilitydata[], Integer integer)
            {
                if (!isPopped())
                {
                    initBarcodeShelfListAdapter(astoreavailabilitydata, integer.intValue());
                }
                Log.i("INSTORE_DEBUG", (new StringBuilder()).append("Got availability response: ").append(Arrays.toString(astoreavailabilitydata)).toString());
            }

            public void onFailureSameThread(Integer integer, StoreAvailabilityData astoreavailabilitydata[])
            {
                onResponse(astoreavailabilitydata, integer);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (StoreAvailabilityData[])obj1);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((StoreAvailabilityData[])obj);
            }

            public void onSuccessSameThread(StoreAvailabilityData astoreavailabilitydata[])
            {
                onResponse(astoreavailabilitydata, Integer.valueOf(-1));
            }

            
            {
                this$0 = ShelfListPresenter.this;
                super(handler);
            }
        });
    }

    private void loadFromBarcode(final String barcode)
    {
        final String storeIds[] = AvailabilityUtils.getNearbyAndMyStoreIDs(mActivity);
        Services.get().getItemService().getItemByUpc(barcode, storeIds).addCallback(new CallbackSameThread() {

            final ShelfListPresenter this$0;
            final String val$barcode;
            final String val$storeIds[];

            public void onResultSameThread(Request request, Result result)
            {
                if (result.successful() && result.getData() != null && !isPopped())
                {
                    request = (ItemModel)result.getData();
                    result = new ItemDetailsPresenter(mActivity, request);
                    mPresenterStackForPushes.pushAndReplacePresenter(result, false);
                    GoogleAnalytics.trackEvent("Scan", "Scan to Item", request.getItemId());
                    return;
                } else
                {
                    legacyLoadFromBarcode(barcode, storeIds);
                    return;
                }
            }

            
            {
                this$0 = ShelfListPresenter.this;
                barcode = s;
                storeIds = as;
                super();
            }
        });
    }

    private void prepareAsyncList()
    {
        ((ListRecyclerView)mItemsView).setVisibility(8);
        mLoadingView.setVisibility(0);
        if (mAdapter != null)
        {
            mAdapter = null;
            ((ListRecyclerView)mItemsView).setAdapter(null);
        }
    }

    private void setupFooterHideOnScroll(View view)
    {
        int i = view.getLayoutParams().height;
        ((ListRecyclerView)mItemsView).addOnItemTouchListener(new ScrollDirectionListener(view) {

            final ShelfListPresenter this$0;
            final int val$offset;
            final View val$optionsFooter;

            public void onScrollDirectionChanged(int j)
            {
                if (hasScrollableContent()) goto _L2; else goto _L1
_L1:
                return;
_L2:
                switch (j)
                {
                default:
                    break;

                case 1: // '\001'
                    break; /* Loop/switch isn't completed */

                case 0: // '\0'
                    break;
                }
                break MISSING_BLOCK_LABEL_90;
_L4:
                if (mScrollDirectionListener != null)
                {
                    mScrollDirectionListener.onScrollDirectionChanged(j);
                    return;
                }
                if (true) goto _L1; else goto _L3
_L3:
                float f = mListContainer.getHeight() - offset;
                optionsFooter.animate().y(f);
                  goto _L4
                float f1 = mListContainer.getHeight();
                optionsFooter.animate().y(f1);
                  goto _L4
            }

            
            {
                this$0 = ShelfListPresenter.this;
                offset = i;
                optionsFooter = view;
                super(final_context);
            }
        });
    }

    protected ShelfPresenter.OnFilterChangedListener createOnFilterChangedListener()
    {
        return new ShelfPresenter.OnFilterChangedListener() {

            final ShelfListPresenter this$0;

            public void onFilterChanged()
            {
                super.onFilterChanged();
                TextView textview = (TextView)ViewUtil.findViewById(mListContainer, 0x7f1002de);
                ArrayList arraylist = mFilterManager.getRefinements();
                String s = mFilterManager.getStoreID();
                if (arraylist != null && !arraylist.isEmpty() || s != null)
                {
                    textview.setSelected(true);
                    return;
                } else
                {
                    textview.setSelected(false);
                    return;
                }
            }

            
            {
                this$0 = ShelfListPresenter.this;
                super(ShelfListPresenter.this);
            }
        };
    }

    public BarcodeShelfHeaderView getBarcodeHeader()
    {
        if (mBarcodeHeaderView == null)
        {
            mBarcodeHeaderView = (BarcodeShelfHeaderView)ViewUtil.inflate(mActivity, 0x7f040186, null);
        }
        return mBarcodeHeaderView;
    }

    protected int getContainerLayout()
    {
        return 0x7f040193;
    }

    public boolean hasScrollableContent()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mItemsView != null)
        {
            flag = flag1;
            if (mAdapter != null)
            {
                int j = mAdapter.getItemCount() * ViewUtil.dpToPixels(98, mActivity);
                int i = j;
                if (mHeaderView != null)
                {
                    i = j + mHeaderView.getHeight();
                }
                int k = ((ListRecyclerView)mItemsView).getHeight();
                j = k;
                if (mOptionsFooter != null)
                {
                    j = k - mOptionsFooter.getHeight();
                }
                flag = flag1;
                if (i > j)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    protected void initListView()
    {
        mAdapter = new ShelfListAdapter(mActivity);
        if (mMode == 4)
        {
            mAdapter.setShouldShowSoldOut(true);
        }
        ((ListRecyclerView)mItemsView).setAdapter(mAdapter);
        if (mHeaderView != null)
        {
            ((ListRecyclerView)mItemsView).addHeaderView(mHeaderView);
        }
        if (mLoader != null)
        {
            mLoader.setListener(new ListItemLoaderListener());
            mAdapter.setAndStartLoader(mLoader);
        }
        wireListeners();
        initOptionsFooter();
        getBarcodeHeader().setClickable(false);
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        if (mMode == 3)
        {
            prepareAsyncList();
            loadFromBarcode(mSearchQuery);
        }
    }

    public void onPop()
    {
        super.onPop();
        if (mItemsView != null)
        {
            ((ListRecyclerView)mItemsView).setAdapter(null);
        }
        if (mLoader != null)
        {
            mLoader.destroy();
        }
    }

    public void onPushed()
    {
        super.onPushed();
        mIsPushed = true;
        if (mAdapter != null && mAdapter.getDataItemCount() > 0)
        {
            ((ListRecyclerView)mItemsView).setVisibility(0);
            mLoadingView.setVisibility(8);
        }
    }

    public void onStartAsTop()
    {
        WLog.d(TAG, "onStartAsTop()");
        super.onStartAsTop();
        if (mAdapter != null)
        {
            mAdapter.notifyDataSetChanged();
        }
    }

    public void reloadData()
    {
        WLog.d(TAG, "reloadData()");
        if (mMode == 3)
        {
            prepareAsyncList();
            loadFromBarcode(mSearchQuery);
            return;
        } else
        {
            super.reloadData();
            return;
        }
    }

    public void setHeaderView(int i)
    {
        mHeaderView = ViewUtil.inflate(mActivity, i, mItemsView);
    }

    public void setScrollDirectionListener(ScrollDirectionListener scrolldirectionlistener)
    {
        mScrollDirectionListener = scrolldirectionlistener;
    }








}
