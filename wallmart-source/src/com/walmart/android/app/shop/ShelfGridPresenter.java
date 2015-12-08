// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.walmart.android.app.shop.itemloader.PagingLoader;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.GridRecyclerView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfPresenter, ShelfGridAdapter, ShelfAdapter, ShopFilterActivity, 
//            ShopFilterManager, BarcodeShelfHeaderView

public class ShelfGridPresenter extends ShelfPresenter
{
    protected class GridItemLoaderListener extends ShelfPresenter.ItemLoaderListener
    {

        final ShelfGridPresenter this$0;

        private String getHeaderForCount(int i)
        {
            if (i > 0)
            {
                if (mMode == 2)
                {
                    return mActivity.getString(0x7f09055a, new Object[] {
                        Integer.valueOf(i), getTitleText()
                    });
                }
                if (TextUtils.isEmpty(mSearchQuery))
                {
                    return mActivity.getString(0x7f09055e, new Object[] {
                        Integer.valueOf(i), getTitleText()
                    });
                } else
                {
                    return mActivity.getString(0x7f09055d, new Object[] {
                        Integer.valueOf(i), mSearchQuery
                    });
                }
            } else
            {
                return getTitleText();
            }
        }

        public void onBatchLoaded()
        {
            super.onBatchLoaded();
            updateAdapterItemCap();
        }

        public void onFirstBatchLoaded(int i)
        {
            super.onFirstBatchLoaded(i);
            if (!isPopped())
            {
                updateAdapterItemCap();
                mHeader.setText(getHeaderForCount(i));
                if (mIsPushed)
                {
                    mHeader.setVisibility(0);
                    updateSortAndRefineVisibility(sortAndRefineAvailable());
                }
            }
        }

        protected GridItemLoaderListener()
        {
            this$0 = ShelfGridPresenter.this;
            super(ShelfGridPresenter.this);
        }
    }


    private static final String TAG = com/walmart/android/app/shop/ShelfGridPresenter.getSimpleName();
    private int mCurrentGridColumnCount;
    private TextView mHeader;
    private MenuItem mRefineMenuItem;
    private MenuItem mSortMenuItem;

    public ShelfGridPresenter(Activity activity, String s)
    {
        super(activity, s);
    }

    public ShelfGridPresenter(Activity activity, String s, int i)
    {
        super(activity, s, i);
    }

    public ShelfGridPresenter(Activity activity, String s, String s1)
    {
        super(activity, s, s1);
    }

    public ShelfGridPresenter(Activity activity, com.walmart.android.data.StoreQueryResult.Item aitem[], String s)
    {
        super(activity, aitem, s);
    }

    private void setupGrid()
    {
        int i = ViewUtil.getScreenWidthInDp(mActivity);
        int j = ViewUtil.getScreenHeightInDp(mActivity);
        WLog.d(TAG, (new StringBuilder()).append("setupGrid(): Current screen size (dp): ").append(i).append(" x ").append(j).toString());
        i = getAppropriateColumnCount();
        WLog.d(TAG, (new StringBuilder()).append("setupGrid(): Current column count is: ").append(mCurrentGridColumnCount).toString());
        WLog.d(TAG, (new StringBuilder()).append("setupGrid(): Appropriate column count is: ").append(i).toString());
        if (i != mCurrentGridColumnCount)
        {
            mCurrentGridColumnCount = i;
            ((GridRecyclerView)mItemsView).setColumnCount(mCurrentGridColumnCount);
            ((GridRecyclerView)mItemsView).requestLayout();
            ((GridRecyclerView)mItemsView).postDelayed(new Runnable() {

                final ShelfGridPresenter this$0;

                public void run()
                {
                    ((GridRecyclerView)mItemsView).requestLayout();
                }

            
            {
                this$0 = ShelfGridPresenter.this;
                super();
            }
            }, 100L);
            updateAdapterItemCap();
        }
    }

    private boolean sortAndRefineAvailable()
    {
        return mMode == 1 || mMode == 0;
    }

    private void updateAdapterItemCap()
    {
        if (mAdapter == null);
    }

    private void updateSortAndRefineVisibility(boolean flag)
    {
        if (mRefineMenuItem != null)
        {
            mRefineMenuItem.setVisible(flag);
        }
        if (mSortMenuItem != null)
        {
            mSortMenuItem.setVisible(flag);
        }
    }

    protected int getAppropriateColumnCount()
    {
        return mActivity.getResources().getInteger(0x7f0d0002);
    }

    public BarcodeShelfHeaderView getBarcodeHeader()
    {
        return null;
    }

    protected int getContainerLayout()
    {
        return 0x7f040188;
    }

    protected void init(Activity activity)
    {
        super.init(activity);
        mHeader = (TextView)ViewUtil.inflate(activity, 0x7f040187);
        mHeader.setVisibility(8);
        setupGrid();
    }

    protected void initListView()
    {
        if (!isPopped())
        {
            mAdapter = new ShelfGridAdapter(mActivity);
            ((GridRecyclerView)mItemsView).setAdapter(mAdapter);
            ((GridRecyclerView)mItemsView).addHeaderView(mHeader);
            mLoader.setListener(new GridItemLoaderListener());
            mAdapter.setAndStartLoader(mLoader);
            wireListeners();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        setupGrid();
        mAdapter.notifyDataSetChanged();
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        mSortMenuItem = menu.findItem(0x7f100695);
        mRefineMenuItem = menu.findItem(0x7f100694);
        boolean flag;
        if (mAdapter.getItemCount() > 0 && sortAndRefineAvailable())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateSortAndRefineVisibility(flag);
        return false;
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsMenuItemSelected(menuitem, activity);

        case 2131756692: 
            menuitem = new Intent(mActivity, com/walmart/android/app/shop/ShopFilterActivity);
            activity = new ShopFilterManager();
            activity.setStoreID(mFilterManager.getStoreID());
            activity.setBrowseToken(mFilterManager.getBrowseToken());
            activity.setSearchQuery(mFilterManager.getSearchQuery());
            activity.setDepartment(mFilterManager.getDepartment());
            activity.setShelfDepartmentTitle(mFilterManager.getShelfDepartmentTitle());
            activity.setRefinements(mFilterManager.getRefinements());
            ShopFilterActivity.setFilterParams(activity);
            mActivity.startActivityForResult(menuitem, 100);
            mActivity.overridePendingTransition(0x7f05002c, 0x7f050033);
            return true;

        case 2131756693: 
            showDialog(1);
            break;
        }
        return true;
    }

    public void onPop()
    {
        super.onPop();
        if (mItemsView != null)
        {
            ((GridRecyclerView)mItemsView).setAdapter(null);
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
            mHeader.setVisibility(0);
            ((GridRecyclerView)mItemsView).setVisibility(0);
            mLoadingView.setVisibility(8);
            updateSortAndRefineVisibility(sortAndRefineAvailable());
        }
    }

    public void reloadData()
    {
        WLog.d(TAG, "reloadData()");
        super.reloadData();
        updateSortAndRefineVisibility(false);
    }





}
