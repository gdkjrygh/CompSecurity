// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.order;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;

// Referenced classes of package com.walmart.android.app.order:
//            OrderListAdapter, OrderDetailsPresenter

public class OrderListPresenter extends Presenter
{

    public static final String TAG = com/walmart/android/app/order/OrderListPresenter.getSimpleName();
    private Activity mActivity;
    private boolean mHasBeenClicked;
    private OrderListAdapter mListAdapter;
    private boolean mListInitialized;
    private ListView mListView;
    private View mLoadingView;
    private final OrderListAdapter.Listener mOrderListAdapterListener = new OrderListAdapter.Listener() {

        final OrderListPresenter this$0;

        public void onChanged()
        {
            mLoadingView.setVisibility(8);
            if (mListAdapter.getCount() == 0)
            {
                initNoOrders();
            } else
            if (!mListInitialized)
            {
                initListView();
                return;
            }
        }

        public void onError(int i)
        {
            showDialog(i);
            mLoadingView.setVisibility(8);
        }

            
            {
                this$0 = OrderListPresenter.this;
                super();
            }
    };
    private ViewGroup mViewGroup;

    public OrderListPresenter(Activity activity)
    {
        mActivity = activity;
        mViewGroup = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f0400da);
        mListView = (ListView)mViewGroup.findViewById(0x7f100306);
        mListAdapter = new OrderListAdapter(mActivity);
        mLoadingView = mViewGroup.findViewById(0x7f100308);
        setTitleText(mActivity.getString(0x7f0902af));
        wireListeners();
    }

    private void initListView()
    {
        if (!isPopped())
        {
            mViewGroup.findViewById(0x7f100305).setVisibility(0);
            mViewGroup.findViewById(0x7f100307).setVisibility(8);
            mListView.setAdapter(mListAdapter);
            mListInitialized = true;
        }
    }

    private void initNoOrders()
    {
        mViewGroup.findViewById(0x7f100307).setVisibility(0);
        mViewGroup.findViewById(0x7f100305).setVisibility(8);
    }

    private void wireListeners()
    {
        mListAdapter.setListener(mOrderListAdapterListener);
        mListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final OrderListPresenter this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (!mHasBeenClicked)
                {
                    adapterview = mListAdapter.getOrderItem(i);
                    adapterview = new OrderDetailsPresenter(mActivity, adapterview);
                    pushPresenter(adapterview);
                    mHasBeenClicked = true;
                }
            }

            
            {
                this$0 = OrderListPresenter.this;
                super();
            }
        });
    }

    public View getView()
    {
        return mViewGroup;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mHasBeenClicked = false;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        reloadData();
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 90002: 
            return DialogFactory.onCreateDialog(600, mActivity);

        case 90003: 
            return DialogFactory.onCreateDialog(503, mActivity);
        }
    }

    protected void onPageView()
    {
        AnalyticsHelper.post(AnalyticsHelper.prepareOrdersPageViewEvent());
        GoogleAnalytics.trackPageView("Track Order");
    }

    public void onPop()
    {
        super.onPop();
        if (mListView != null)
        {
            mListView.setOnItemClickListener(null);
        }
        if (mListAdapter != null)
        {
            mListAdapter.setListener(null);
        }
        mListView = null;
        mActivity = null;
        mViewGroup = null;
        mLoadingView = null;
        mListAdapter = null;
    }

    public void reloadData()
    {
        if (!isPopped())
        {
            mListAdapter.clear();
            mLoadingView.setVisibility(0);
            Authentication authentication = Services.get().getAuthentication();
            if (authentication.hasCredentials())
            {
                authentication.renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                    final OrderListPresenter this$0;

                    public void onFailure(int i)
                    {
                        showDialog(0x15f93);
                        mLoadingView.setVisibility(8);
                    }

                    public void onSuccess()
                    {
                        mListAdapter.loadItems();
                    }

            
            {
                this$0 = OrderListPresenter.this;
                super();
            }
                });
                return;
            }
        }
    }










/*
    static boolean access$602(OrderListPresenter orderlistpresenter, boolean flag)
    {
        orderlistpresenter.mHasBeenClicked = flag;
        return flag;
    }

*/



}
