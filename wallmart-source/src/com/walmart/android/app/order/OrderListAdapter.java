// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.order;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmart.android.service.orderhistory.OrderHistoryResult;
import com.walmart.android.service.orderhistory.OrderHistoryService;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;

public class OrderListAdapter extends BaseAdapter
{
    static interface Listener
    {

        public abstract void onChanged();

        public abstract void onError(int i);
    }


    private static final String STATUS_CANCELED = "Canceled";
    private static final String STATUS_CHECK = "Check status";
    private static final String STATUS_DELIVERED = "Delivered";
    private static final String STATUS_EMAILED = "Emailed";
    private static final String STATUS_PICKED_UP = "Picked Up";
    private static final String STATUS_PROCESSING = "Processing";
    private static final String STATUS_REFUNDED = "Refunded";
    private static final String STATUS_SHIPPED = "Shipped";
    private static final String TAG = com/walmart/android/app/order/OrderListAdapter.getSimpleName();
    private static final String TAG_ENTRY_ITEM = "ITEM_ENTRY";
    private Context mContext;
    private LayoutInflater mInflater;
    private Listener mListener;
    private ArrayList mOrders;

    public OrderListAdapter(Context context)
    {
        mContext = context;
        mInflater = (LayoutInflater)mContext.getSystemService("layout_inflater");
        mOrders = new ArrayList();
    }

    private String getStatusFromShipments(com.walmart.android.service.orderhistory.OrderHistoryResult.Shipment ashipment[])
    {
        String s1 = "Check status";
        String s;
        if (ashipment.length == 1)
        {
            s = ashipment[0].getStatus();
        } else
        {
            s = s1;
            if (ashipment.length > 0)
            {
                String s2 = ashipment[0].getStatus();
                boolean flag = true;
                for (int i = 1; flag && i < ashipment.length; i++)
                {
                    if (!ashipment[i].getStatus().equals(s2))
                    {
                        flag = false;
                    }
                }

                s = s1;
                if (flag)
                {
                    return s2;
                }
            }
        }
        return s;
    }

    private void populateFields(View view, com.walmart.android.service.orderhistory.OrderHistoryResult.OrderSummary ordersummary)
    {
        ((TextView)view.findViewById(0x7f100301)).setText(mContext.getString(0x7f0902ab, new Object[] {
            ordersummary.getPurchaseDate()
        }));
        ((TextView)view.findViewById(0x7f100302)).setText(mContext.getString(0x7f0902ad, new Object[] {
            ordersummary.getId()
        }));
        view = (TextView)view.findViewById(0x7f100303);
        setStatusText(getStatusFromShipments(ordersummary.getShipments()), view);
    }

    private void setStatusText(String s, TextView textview)
    {
        Resources resources;
        int i;
        resources = mContext.getResources();
        i = resources.getColor(0x7f0f010c);
        if (!s.equals("Check status")) goto _L2; else goto _L1
_L1:
        i = resources.getColor(0x7f0f00f5);
_L4:
        textview.setText(s);
        textview.setTextColor(i);
        return;
_L2:
        if (s.equals("Processing"))
        {
            i = resources.getColor(0x7f0f00f5);
        } else
        if (s.equals("Shipped"))
        {
            i = resources.getColor(0x7f0f00f6);
        } else
        if (s.equals("Emailed"))
        {
            i = resources.getColor(0x7f0f0109);
        } else
        if (s.equals("Picked Up"))
        {
            i = resources.getColor(0x7f0f00f6);
        } else
        if (s.equals("Delivered"))
        {
            i = resources.getColor(0x7f0f00f6);
        } else
        if (s.equals("Refunded"))
        {
            i = resources.getColor(0x7f0f00f5);
        } else
        if (s.equals("Canceled"))
        {
            i = resources.getColor(0x7f0f00f4);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void clear()
    {
        mOrders.clear();
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return mOrders.size();
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public com.walmart.android.service.orderhistory.OrderHistoryResult.OrderSummary getOrderItem(int i)
    {
        com.walmart.android.service.orderhistory.OrderHistoryResult.OrderSummary ordersummary = null;
        if (i < mOrders.size())
        {
            ordersummary = (com.walmart.android.service.orderhistory.OrderHistoryResult.OrderSummary)mOrders.get(i);
        }
        return ordersummary;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null || view.getTag() != "ITEM_ENTRY")
        {
            view = mInflater.inflate(0x7f0400d9, viewgroup, false);
            view.setTag("ITEM_ENTRY");
        }
        populateFields(view, (com.walmart.android.service.orderhistory.OrderHistoryResult.OrderSummary)mOrders.get(i));
        return view;
    }

    public void loadItems()
    {
        Services.get().getOrderHistoryService().getOrderHistory(mOrders.size(), 50).addCallback(new CallbackSameThread(mContext) {

            final OrderListAdapter this$0;

            public void onResultSameThread(Request request, Result result)
            {
                if (!result.successful() || !result.hasData()) goto _L2; else goto _L1
_L1:
                WLog.d(OrderListAdapter.TAG, ((OrderHistoryResult)result.getData()).toString());
                request = ((OrderHistoryResult)result.getData()).getOrders();
                if (request == null) goto _L4; else goto _L3
_L3:
                int k = request.length;
                for (int i = 0; i < k; i++)
                {
                    result = request[i];
                    mOrders.add(result);
                }

                notifyDataSetChanged();
                if (mListener != null)
                {
                    mListener.onChanged();
                }
_L6:
                return;
_L4:
                WLog.w(OrderListAdapter.TAG, "Failure while requesting order history");
                if (mListener != null)
                {
                    mListener.onError(0x15f91);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L2:
                int j = AsyncCallbackWrapper.translateError(result).intValue();
                WLog.w(OrderListAdapter.TAG, (new StringBuilder()).append("Failure while requesting order history: ").append(j).toString());
                if (mListener != null)
                {
                    mListener.onError(j);
                    return;
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                this$0 = OrderListAdapter.this;
                super(context);
            }
        });
    }

    void setListener(Listener listener)
    {
        mListener = listener;
    }




}
