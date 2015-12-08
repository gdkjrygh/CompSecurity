// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.app.storelocator.LocationUtil;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.fastpickup.FastPickupManager;
import com.walmartlabs.utils.WLog;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.walmart.android.app.fastpickup:
//            FastPickupAdapter, FastPickupUtil

public class FastPickupPresenter extends Presenter
{
    private class ButtonViewWrapper
    {

        private final Button mButton;
        private String mStoreId;
        private final TextView mTitle;
        private final TextView mViewText;
        final FastPickupPresenter this$0;

        public void set(String s, FastPickupOrderReadyEvent fastpickuporderreadyevent)
        {
            mStoreId = s;
            if (fastpickuporderreadyevent.isCheckedIn(s))
            {
                mButton.setVisibility(8);
                mTitle.setVisibility(8);
                mViewText.setVisibility(0);
                mViewText.setText(0x7f090112);
                return;
            }
            if (LocationUtil.isLocationServicesEnabled(mActivity))
            {
                if (!fastpickuporderreadyevent.isInStore() || !s.equals(fastpickuporderreadyevent.storeId))
                {
                    mButton.setVisibility(8);
                    mTitle.setVisibility(8);
                    mViewText.setVisibility(0);
                    mViewText.setText(mActivity.getResources().getQuantityString(0x7f110001, fastpickuporderreadyevent.orders.getCount(s)));
                    return;
                } else
                {
                    mButton.setVisibility(0);
                    mTitle.setVisibility(0);
                    mTitle.setText(mActivity.getResources().getString(0x7f090115));
                    mViewText.setVisibility(8);
                    return;
                }
            } else
            {
                mButton.setVisibility(0);
                mTitle.setVisibility(0);
                String as[] = fastpickuporderreadyevent.orders.getStoreAddress(s);
                mTitle.setText(mActivity.getResources().getQuantityString(0x7f110002, fastpickuporderreadyevent.orders.getCount(s), new Object[] {
                    as[1]
                }));
                mViewText.setVisibility(8);
                return;
            }
        }



        public ButtonViewWrapper(View view)
        {
            this.this$0 = FastPickupPresenter.this;
            super();
            mTitle = (TextView)ViewUtil.findViewById(view, 0x7f100125);
            mButton = (Button)ViewUtil.findViewById(view, 0x7f100126);
            AsyncCallback asynccallback = new _cls1();
            mButton.setOnClickListener(asynccallback. new _cls2());
            mViewText = (TextView)ViewUtil.findViewById(view, 0x7f100127);
        }
    }

    private class HeaderViewWrapper
    {

        private final ImageView mImage;
        private final TextView mTitle;
        final FastPickupPresenter this$0;

        public void set(String s, FastPickupOrderReadyEvent fastpickuporderreadyevent)
        {
            if (fastpickuporderreadyevent.isCheckedIn(s))
            {
                mTitle.setText(0x7f090117);
                mImage.setImageResource(0x7f020116);
                return;
            }
            mImage.setImageResource(0x7f020119);
            if (LocationUtil.isLocationServicesEnabled(mActivity))
            {
                if (!fastpickuporderreadyevent.isInStore() || !s.equals(fastpickuporderreadyevent.storeId))
                {
                    s = fastpickuporderreadyevent.orders.getStoreAddress(s);
                    mTitle.setText(mActivity.getString(0x7f090116, new Object[] {
                        s[1]
                    }));
                    return;
                } else
                {
                    mTitle.setText(0x7f090118);
                    return;
                }
            } else
            {
                mTitle.setText(0x7f090118);
                return;
            }
        }

        public HeaderViewWrapper(View view)
        {
            this$0 = FastPickupPresenter.this;
            super();
            mTitle = (TextView)ViewUtil.findViewById(view, 0x7f100128);
            mImage = (ImageView)ViewUtil.findViewById(view, 0x7f100129);
        }
    }

    private class StoreViewWrapper
    {

        private TextView mAddrline1;
        private TextView mAddrline2;
        private TextView mTitle;
        final FastPickupPresenter this$0;

        public void set(String s, FastPickupOrder fastpickuporder)
        {
            s = fastpickuporder.getStoreAddress(s);
            mTitle.setText(s[0]);
            mAddrline1.setText(s[1]);
            mAddrline2.setText(s[2]);
        }

        private StoreViewWrapper(View view)
        {
            this$0 = FastPickupPresenter.this;
            super();
            mTitle = (TextView)ViewUtil.findViewById(view, 0x7f10012e);
            mAddrline1 = (TextView)ViewUtil.findViewById(view, 0x7f10012f);
            mAddrline2 = (TextView)ViewUtil.findViewById(view, 0x7f100130);
        }

    }


    private static final int DIALOG_NETWORK_ERROR = 1;
    private static final int DIALOG_UNKNOWN_ERROR = 0;
    private static final String TAG = com/walmart/android/app/fastpickup/FastPickupPresenter.getSimpleName();
    private final Activity mActivity;
    private final FastPickupAdapter mAdapter;
    private ButtonViewWrapper mButtonViewWrapper;
    private HeaderViewWrapper mHeaderViewWrapper;
    private View mRootView;
    private final String mStoreId;
    private StoreViewWrapper mStoreViewWrapper;

    public FastPickupPresenter(Activity activity)
    {
        this(activity, null);
    }

    public FastPickupPresenter(Activity activity, String s)
    {
        mActivity = activity;
        mStoreId = s;
        setTitleText(mActivity.getString(0x7f09010a));
        activity = getManager().getFastPickupOrderReadyEvent();
        mAdapter = new FastPickupAdapter(mActivity, ((FastPickupOrderReadyEvent) (activity)).orders, getCurrentStoreId(activity));
    }

    private String getCurrentStoreId(FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
        String s;
        if (!TextUtils.isEmpty(mStoreId))
        {
            s = mStoreId;
        } else
        {
            String s1 = fastpickuporderreadyevent.storeId;
            s = s1;
            if (TextUtils.isEmpty(s1))
            {
                s = s1;
                if (fastpickuporderreadyevent.orders != null)
                {
                    fastpickuporderreadyevent = fastpickuporderreadyevent.orders.getStores();
                    s = s1;
                    if (fastpickuporderreadyevent.size() == 1)
                    {
                        return ((com.walmart.android.data.FastPickupOrder.Store)fastpickuporderreadyevent.get(0)).number;
                    }
                }
            }
        }
        return s;
    }

    private FastPickupManager getManager()
    {
        return Services.get().getFastPickupManager();
    }

    public View getView()
    {
        if (mRootView != null)
        {
            ExpandableListView expandablelistview = (ExpandableListView)ViewUtil.findViewById(mRootView, 0x7f100124);
            if (expandablelistview.getHeaderViewsCount() <= 0)
            {
                View view = LayoutInflater.from(mActivity).inflate(0x7f040059, expandablelistview, false);
                mHeaderViewWrapper = new HeaderViewWrapper(view);
                expandablelistview.addHeaderView(view);
                view = LayoutInflater.from(mActivity).inflate(0x7f040058, expandablelistview, false);
                mButtonViewWrapper = new ButtonViewWrapper(view);
                expandablelistview.addHeaderView(view);
                view = ViewUtil.inflate(mActivity, 0x7f04005c, expandablelistview);
                mStoreViewWrapper = new StoreViewWrapper(view);
                expandablelistview.addHeaderView(view);
            }
            expandablelistview.setAdapter(mAdapter);
        }
        return mRootView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
    }

    public void onBeforePush()
    {
        WLog.i(TAG, "onBeforePush()");
        super.onBeforePush();
        MessageBus.getBus().register(this);
    }

    protected Dialog onCreateDialog(int i)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
        builder.setCancelable(true);
        builder.setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final FastPickupPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                pop();
            }

            
            {
                this$0 = FastPickupPresenter.this;
                super();
            }
        });
        builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final FastPickupPresenter this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                pop();
            }

            
            {
                this$0 = FastPickupPresenter.this;
                super();
            }
        });
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            builder.setMessage(0x7f090282);
            return builder.create();

        case 0: // '\0'
            builder.setMessage(0x7f090284);
            return builder.create();
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f040057);
        }
    }

    public void onFastPickupReady(FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
        WLog.d(TAG, (new StringBuilder()).append("onFastPickupReady() store=").append(mStoreId).append(" : ").append(fastpickuporderreadyevent).toString());
        String s = getCurrentStoreId(fastpickuporderreadyevent);
        WLog.d(TAG, (new StringBuilder()).append("onFastPickupOrderReadyEvent() local storeId=").append(mStoreId).append(" selected store=").append(s).toString());
        if (fastpickuporderreadyevent.orders != null && !TextUtils.isEmpty(s) && fastpickuporderreadyevent.orders.getCount(s) > 0)
        {
            mHeaderViewWrapper.set(s, fastpickuporderreadyevent);
            mButtonViewWrapper.set(s, fastpickuporderreadyevent);
            mStoreViewWrapper.set(s, fastpickuporderreadyevent.orders);
            mAdapter.setData(s, fastpickuporderreadyevent.orders);
        } else
        if (isTop())
        {
            MessageBus.getBus().post(new CloseFragmentEvent());
            return;
        }
    }

    protected void onPageView()
    {
        FastPickupOrderReadyEvent fastpickuporderreadyevent = getManager().getFastPickupOrderReadyEvent();
        String s1 = getCurrentStoreId(fastpickuporderreadyevent);
        String s = "check in";
        if (fastpickuporderreadyevent.isCheckedIn(s1))
        {
            s = "check in : confirmation";
        }
        FastPickupUtil.sendPageViewEvent(s);
    }








    // Unreferenced inner class com/walmart/android/app/fastpickup/FastPickupPresenter$ButtonViewWrapper$1

/* anonymous class */
    class ButtonViewWrapper._cls1
        implements AsyncCallback
    {

        final ButtonViewWrapper this$1;
        final FastPickupPresenter val$this$0;

        public int getID()
        {
            return 0;
        }

        public void onCancelled()
        {
            mButton.setEnabled(true);
        }

        public void onFailure(Integer integer, FastPickupOrderReadyEvent fastpickuporderreadyevent)
        {
            int i = 1;
            WLog.d(FastPickupPresenter.TAG, (new StringBuilder()).append("onFailure(): ").append(integer).toString());
            mButton.setEnabled(true);
            if (isPopped())
            {
                return;
            }
            int j = FastPickupUtil.translateErrorCode(integer);
            integer = _fld0;
            if (j != 0x15f92)
            {
                i = 0;
            }
            integer.showDialog(i);
        }

        public volatile void onFailure(Object obj, Object obj1)
        {
            onFailure((Integer)obj, (FastPickupOrderReadyEvent)obj1);
        }

        public void onSuccess(FastPickupOrderReadyEvent fastpickuporderreadyevent)
        {
            if (fastpickuporderreadyevent != null && fastpickuporderreadyevent.orders != null)
            {
                Object obj;
                for (fastpickuporderreadyevent = fastpickuporderreadyevent.orders.getOrderIds(mStoreId).iterator(); fastpickuporderreadyevent.hasNext(); MessageBus.getBus().post(obj))
                {
                    obj = (String)fastpickuporderreadyevent.next();
                    obj = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("expressPrepareOrder")).putString("storeId", mStoreId).putString("orderId", ((String) (obj)));
                }

            }
            mButton.setEnabled(true);
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((FastPickupOrderReadyEvent)obj);
        }

        public void setID(int i)
        {
        }

            
            {
                this$1 = final_buttonviewwrapper;
                this$0 = FastPickupPresenter.this;
                super();
            }
    }


    // Unreferenced inner class com/walmart/android/app/fastpickup/FastPickupPresenter$ButtonViewWrapper$2

/* anonymous class */
    class ButtonViewWrapper._cls2
        implements android.view.View.OnClickListener
    {

        final ButtonViewWrapper this$1;
        final AsyncCallback val$callback;
        final FastPickupPresenter val$this$0;

        public void onClick(View view)
        {
            WLog.d(FastPickupPresenter.TAG, "onClick()");
            if (getManager().checkin(mStoreId, callback))
            {
                FastPickupUtil.sendPageViewEvent("check in : confirmation");
                view.setEnabled(false);
            }
        }

            
            {
                this$1 = final_buttonviewwrapper;
                this$0 = fastpickuppresenter;
                callback = AsyncCallback.this;
                super();
            }
    }

}
