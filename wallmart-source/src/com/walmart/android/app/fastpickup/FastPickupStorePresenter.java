// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.app.fastpickup:
//            FastPickupPresenter, FastPickupUtil

public class FastPickupStorePresenter extends Presenter
{
    private static class Adapter extends BaseAdapter
    {

        private final Context mContext;
        private List mData;

        private void setViewProperties(int i, View view)
        {
            view = (ViewHolder)view.getTag();
            if (mData != null)
            {
                com.walmart.android.data.FastPickupOrder.Store store = (com.walmart.android.data.FastPickupOrder.Store)mData.get(i);
                if (store != null)
                {
                    String as[] = store.getAddressLines();
                    ((ViewHolder) (view)).title.setText(as[0]);
                    ((ViewHolder) (view)).addrLine1.setText(as[1]);
                    ((ViewHolder) (view)).addrLine2.setText(as[2]);
                }
            }
        }

        public int getCount()
        {
            return mData.size();
        }

        public Object getItem(int i)
        {
            return mData.get(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = ViewUtil.inflate(mContext, 0x7f04005e, viewgroup);
                view1.setTag(new ViewHolder((TextView)view1.findViewById(0x7f100131), (TextView)view1.findViewById(0x7f100132), (TextView)view1.findViewById(0x7f100133)));
            }
            setViewProperties(i, view1);
            return view1;
        }

        public void setData(List list)
        {
            WLog.d(FastPickupStorePresenter.TAG, (new StringBuilder()).append("setData() new data: ").append(list).toString());
            mData = list;
            notifyDataSetChanged();
        }

        private Adapter(Context context)
        {
            mData = new ArrayList();
            mContext = context;
        }

    }

    private static class Adapter.ViewHolder
    {

        public TextView addrLine1;
        public TextView addrLine2;
        public TextView title;

        public Adapter.ViewHolder(TextView textview, TextView textview1, TextView textview2)
        {
            title = textview;
            addrLine1 = textview1;
            addrLine2 = textview2;
        }
    }


    private static final String TAG = com/walmart/android/app/fastpickup/FastPickupStorePresenter.getSimpleName();
    private final Activity mActivity;
    private Adapter mAdapter;
    private View mRootView;

    public FastPickupStorePresenter(Activity activity)
    {
        mActivity = activity;
        setTitleText(mActivity.getString(0x7f09010a));
    }

    public View getView()
    {
        WLog.d(TAG, "getView()");
        if (mRootView != null)
        {
            ListView listview = (ListView)ViewUtil.findViewById(mRootView, 0x7f100134);
            if (listview.getHeaderViewsCount() <= 0)
            {
                View view = LayoutInflater.from(mActivity).inflate(0x7f040059, listview, false);
                listview.addHeaderView(view);
                ((TextView)ViewUtil.findViewById(view, 0x7f100128)).setText(0x7f09010e);
                listview.addHeaderView(LayoutInflater.from(mActivity).inflate(0x7f04005d, listview, false));
                listview.setOnItemClickListener(new OnItemSingleClickListener(this) {

                    final FastPickupStorePresenter this$0;

                    public void onItemSingleClick(AdapterView adapterview, View view1, int i, long l)
                    {
                        boolean flag = true;
                        if (l >= 0L)
                        {
                            i = 1;
                        } else
                        {
                            i = 0;
                        }
                        if (l >= (long)mAdapter.getCount())
                        {
                            flag = false;
                        }
                        if ((i & flag) != 0)
                        {
                            adapterview = ((com.walmart.android.data.FastPickupOrder.Store)mAdapter.getItem((int)l)).number;
                            WLog.d(FastPickupStorePresenter.TAG, (new StringBuilder()).append("onItemClick() storeId=").append(adapterview).toString());
                            view1 = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("expressStoreSelect")).putString("storeId", adapterview);
                            MessageBus.getBus().post(view1);
                            pushPresenter(new FastPickupPresenter(mActivity, adapterview));
                        }
                    }

            
            {
                this$0 = FastPickupStorePresenter.this;
                super(presenter);
            }
                });
                mAdapter = new Adapter(mActivity);
                listview.setAdapter(mAdapter);
            }
        }
        return mRootView;
    }

    public void onBeforePush()
    {
        WLog.i(TAG, "onBeforePush()");
        super.onBeforePush();
        MessageBus.getBus().register(this);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f04005f);
        }
    }

    public void onFastPickupReady(FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
        WLog.d(TAG, "onFastPickupOrderReadyEvent() ");
        if (fastpickuporderreadyevent.orders == null) goto _L2; else goto _L1
_L1:
        fastpickuporderreadyevent = fastpickuporderreadyevent.orders.getStores();
        if (fastpickuporderreadyevent.size() <= 1) goto _L4; else goto _L3
_L3:
        WLog.d(TAG, (new StringBuilder()).append("onFastPickupOrderReadyEvent() ").append(fastpickuporderreadyevent.size()).append(", ").append(fastpickuporderreadyevent).toString());
        mAdapter.setData(fastpickuporderreadyevent);
_L6:
        return;
_L4:
        if (isTop())
        {
            pushAndReplacePresenter(new FastPickupPresenter(mActivity));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (isTop())
        {
            MessageBus.getBus().post(new CloseFragmentEvent());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onNewIntentAsTop(Intent intent)
    {
        WLog.i(TAG, "onNewIntentAsTop()");
        super.onNewIntentAsTop(intent);
    }

    public void onNewTop()
    {
        WLog.i(TAG, "onNewPop()");
        super.onNewTop();
    }

    protected void onPageView()
    {
        FastPickupUtil.sendPageViewEvent("check in : pick store");
    }

    public void onPop()
    {
        super.onPop();
        WLog.i(TAG, "onPop()");
        MessageBus.getBus().unregister(this);
    }





}
