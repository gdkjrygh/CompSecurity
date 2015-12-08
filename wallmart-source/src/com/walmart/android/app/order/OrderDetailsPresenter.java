// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.order;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.OrderDetailsEvent;
import com.walmart.android.analytics.events.TrackOrderEvent;
import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.orderhistory.OrderDetailsResult;
import com.walmart.android.service.orderhistory.OrderHistoryService;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.PriceView;
import com.walmartlabs.utils.WLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public class OrderDetailsPresenter extends Presenter
{

    private static final int ELECTRONIC_DELIVERY = 3;
    private static final int SHIPPING = 1;
    private static final int STORE_PICKUP = 2;
    private static final String TAG = com/walmart/android/app/order/OrderDetailsPresenter.getSimpleName();
    private static final int UNKNOWN = 0;
    private static final SimpleDateFormat sFormattedDate;
    private static final SimpleDateFormat sPurchaseDateFormat;
    private Activity mActivity;
    private ArrayList mInFlightRequests;
    private com.walmart.android.service.orderhistory.OrderHistoryResult.OrderSummary mOrder;
    private String mOrderId;
    private String mPreviousTrackUrl;
    private ViewGroup mRootView;

    public OrderDetailsPresenter(Activity activity, com.walmart.android.service.orderhistory.OrderHistoryResult.OrderSummary ordersummary)
    {
        mInFlightRequests = new ArrayList();
        mOrder = ordersummary;
        init(activity, mOrder.getId());
    }

    public OrderDetailsPresenter(Activity activity, String s)
    {
        mInFlightRequests = new ArrayList();
        init(activity, s);
    }

    private View createItemView(com.walmart.android.service.orderhistory.OrderDetailsResult.Item item)
    {
        View view = ViewUtil.inflate(mActivity, 0x7f0400d8);
        ((TextView)ViewUtil.findViewById(view, 0x7f1002fb)).setText(item.getItemName());
        int i = item.getQuantity();
        if (i > 1)
        {
            TextView textview = (TextView)ViewUtil.findViewById(view, 0x7f1002fd);
            textview.setText(mActivity.getString(0x7f09029b, new Object[] {
                Integer.valueOf(i)
            }));
            textview.setVisibility(0);
        }
        String s = item.getStatus();
        if (!TextUtils.isEmpty(s))
        {
            TextView textview1 = (TextView)ViewUtil.findViewById(view, 0x7f1002fe);
            textview1.setText(s);
            textview1.setVisibility(0);
        }
        if (TextUtils.isEmpty(s) && i == 1)
        {
            ViewUtil.findViewById(view, 0x7f1002fc).setVisibility(8);
        }
        if (item.registry)
        {
            ViewUtil.findViewById(view, 0x7f1002ff).setVisibility(0);
        }
        s = item.getTrackUrl();
        if (!TextUtils.isEmpty(s))
        {
            mPreviousTrackUrl = s;
        }
        ((PriceView)ViewUtil.findViewById(view, 0x7f1002fa)).setPrice(item.getUnitPrice());
        return view;
    }

    private int getDeliveryType(OrderDetailsResult orderdetailsresult)
    {
        byte byte0 = 0;
        String s;
        if (orderdetailsresult.getShipToName() != null)
        {
            s = orderdetailsresult.getShipToName().toUpperCase(Locale.US);
        } else
        {
            s = null;
        }
        if (s != null && (s.startsWith("WALMART") || s.startsWith("WAL-MART") || s.startsWith("NEIGHBORHOOD")))
        {
            byte0 = 2;
        } else
        {
            if (s != null && s.startsWith("ELECTRONIC DELIVERY"))
            {
                return 3;
            }
            if (orderdetailsresult.getShipTo() != null)
            {
                return 1;
            }
        }
        return byte0;
    }

    private String getFormattedDate(String s)
    {
        String s1 = null;
        String s2 = sFormattedDate.format(sPurchaseDateFormat.parse(s));
        s1 = s2;
_L2:
        String s3 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s3 = s;
        }
        return s3;
        ParseException parseexception;
        parseexception;
        parseexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void init(Activity activity, String s)
    {
        mActivity = activity;
        mOrderId = s;
    }

    private void loadDetails(String s)
    {
        s = Services.get().getOrderHistoryService().getOrderDetails(s).addCallback(new CallbackSameThread(mActivity) {

            final OrderDetailsPresenter this$0;

            public void onResultSameThread(Request request, Result result)
            {
                mInFlightRequests.remove(request);
                if (isPopped())
                {
                    return;
                }
                if (result.successful() && result.hasData())
                {
                    mRootView.findViewById(0x7f1002f0).setVisibility(8);
                    mRootView.findViewById(0x7f1002df).setVisibility(0);
                    populateViews((OrderDetailsResult)result.getData());
                    return;
                } else
                {
                    WLog.w(OrderDetailsPresenter.TAG, "Failure while requesting order details.");
                    showDialog(AsyncCallbackWrapper.translateError(result).intValue());
                    return;
                }
            }

            
            {
                this$0 = OrderDetailsPresenter.this;
                super(context);
            }
        });
        mInFlightRequests.add(s);
    }

    private void populateViewFromAddress(View view, com.walmart.android.service.orderhistory.OrderDetailsResult.Address address, int i, int j)
    {
        Object obj = (TextView)ViewUtil.findViewById(view, i);
        TextView textview = (TextView)ViewUtil.findViewById(view, j);
        view = (TextView)ViewUtil.findViewById(view, 0x7f1002f3);
        if (address != null)
        {
            if (address.registry)
            {
                view.setVisibility(0);
                ((TextView) (obj)).setText(mActivity.getString(0x7f0902a3));
                textview.setVisibility(8);
                return;
            }
            ((TextView) (obj)).setText(address.getStreet());
            ((TextView) (obj)).setVisibility(0);
            view = address.getCity();
            obj = address.getState();
            address = address.getZip();
            StringBuilder stringbuilder = new StringBuilder();
            if (view != null)
            {
                stringbuilder.append(view).append(", ");
            }
            if (obj != null)
            {
                stringbuilder.append(((String) (obj))).append(" ");
            }
            if (address != null)
            {
                stringbuilder.append(address);
            }
            textview.setText(stringbuilder.toString());
            textview.setVisibility(0);
            return;
        } else
        {
            ((TextView) (obj)).setVisibility(8);
            textview.setVisibility(8);
            return;
        }
    }

    private void populateViews(OrderDetailsResult orderdetailsresult)
    {
        com.walmart.android.service.orderhistory.OrderDetailsResult.Item aitem[];
        Object obj;
        Object obj1;
        ViewGroup viewgroup;
        int i;
        int k;
        int l;
        obj = getFormattedDate(orderdetailsresult.getPurchaseDate());
        String s = ((String) (obj));
        if (mOrder != null)
        {
            s = ((String) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                s = getFormattedDate(mOrder.getPurchaseDate());
            }
        }
        ViewUtil.setText(0x7f1002e2, mRootView, s);
        ((TextView)ViewUtil.findViewById(mRootView, 0x7f1002e3)).setText(mActivity.getString(0x7f09029e, new Object[] {
            mOrderId
        }));
        com.walmart.android.service.orderhistory.OrderDetailsResult.Item aitem1[] = orderdetailsresult.getItems();
        aitem = aitem1;
        if (aitem1 == null)
        {
            aitem = new com.walmart.android.service.orderhistory.OrderDetailsResult.Item[0];
        }
        Arrays.sort(aitem, new Comparator() {

            final OrderDetailsPresenter this$0;

            public int compare(com.walmart.android.service.orderhistory.OrderDetailsResult.Item item1, com.walmart.android.service.orderhistory.OrderDetailsResult.Item item2)
            {
                byte byte0 = 0;
                if (TextUtils.isEmpty(item1.getTrackUrl()))
                {
                    if (!TextUtils.isEmpty(item2.getTrackUrl()))
                    {
                        byte0 = -1;
                    }
                    return byte0;
                }
                if (TextUtils.isEmpty(item2.getTrackUrl()))
                {
                    return 1;
                } else
                {
                    return item1.getTrackUrl().compareTo(item2.getTrackUrl());
                }
            }

            public volatile int compare(Object obj2, Object obj3)
            {
                return compare((com.walmart.android.service.orderhistory.OrderDetailsResult.Item)obj2, (com.walmart.android.service.orderhistory.OrderDetailsResult.Item)obj3);
            }

            
            {
                this$0 = OrderDetailsPresenter.this;
                super();
            }
        });
        viewgroup = (ViewGroup)ViewUtil.findViewById(mRootView, 0x7f1002ea);
        viewgroup.setVisibility(0);
        obj1 = null;
        mPreviousTrackUrl = null;
        i = 1;
        aitem1 = null;
        l = aitem.length;
        k = 0;
_L9:
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_532;
        }
        com.walmart.android.service.orderhistory.OrderDetailsResult.Item item = aitem[k];
        int j = i;
        View view;
        if (obj1 != null)
        {
            if (TextUtils.isEmpty(mPreviousTrackUrl))
            {
                j = i;
                if (!TextUtils.isEmpty(item.getTrackUrl()))
                {
                    j = 1;
                }
            } else
            {
                j = i;
                if (!mPreviousTrackUrl.equals(item.getTrackUrl()))
                {
                    j = 1;
                }
            }
        }
        if (j == 0) goto _L2; else goto _L1
_L1:
        aitem1 = ViewUtil.inflate(mActivity, 0x7f0400d7, viewgroup);
        viewgroup.addView(aitem1);
        obj1 = item.getTrackUrl();
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            ViewUtil.findViewById(aitem1, 0x7f1002f8).setVisibility(0);
            view = ViewUtil.findViewById(aitem1, 0x7f1002f9);
            view.setVisibility(0);
            view.setOnClickListener(new OnSingleClickListener(((String) (obj1))) {

                final OrderDetailsPresenter this$0;
                final String val$trackUrl;

                public void onSingleClick(View view1)
                {
                    view1 = new Intent("android.intent.action.VIEW", Uri.parse(trackUrl));
                    if (view1.resolveActivity(mActivity.getPackageManager()) != null)
                    {
                        mActivity.startActivity(view1);
                        MessageBus.getBus().post(new TrackOrderEvent());
                    }
                }

            
            {
                this$0 = OrderDetailsPresenter.this;
                trackUrl = s;
                super(final_presenter);
            }
            });
        } else
        {
            ViewUtil.findViewById(aitem1, 0x7f1002f8).setVisibility(8);
            ViewUtil.findViewById(aitem1, 0x7f1002f9).setVisibility(8);
        }
        j = 0;
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            i = 1;
        } else
        {
            i = getDeliveryType(orderdetailsresult);
        }
        i;
        JVM INSTR tableswitch 1 3: default 328
    //                   1 501
    //                   2 493
    //                   3 509;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_509;
_L3:
        i = j;
_L7:
        if (i != 0)
        {
            ViewUtil.setText(0x7f1002f1, aitem1, i);
        }
        if (orderdetailsresult.getShipTo() != null)
        {
            ViewUtil.findViewById(aitem1, 0x7f1002f2).setVisibility(0);
            ((TextView)aitem1.findViewById(0x7f1002f4)).setText(orderdetailsresult.getShipToName());
            populateViewFromAddress(aitem1, orderdetailsresult.getShipTo(), 0x7f1002f5, 0x7f1002f6);
        } else
        {
            ViewUtil.findViewById(aitem1, 0x7f1002f2).setVisibility(8);
        }
_L2:
        obj1 = createItemView(item);
        ((ViewGroup)ViewUtil.findViewById(aitem1, 0x7f1002f7)).addView(((View) (obj1)));
        i = 0;
        k++;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f0902a0;
          goto _L7
_L4:
        i = 0x7f090298;
          goto _L7
        i = 0x7f090299;
          goto _L7
        setSummaryText((TextView)ViewUtil.findViewById(mRootView, 0x7f1002e4), orderdetailsresult.getSubTotal());
        setSummaryText((TextView)ViewUtil.findViewById(mRootView, 0x7f1002e6), orderdetailsresult.getAdjustmentTotal());
        setSummaryText((TextView)ViewUtil.findViewById(mRootView, 0x7f1002e7), orderdetailsresult.getShippingTotal());
        setSummaryText((TextView)ViewUtil.findViewById(mRootView, 0x7f1002e8), orderdetailsresult.getTaxTotal());
        ((PriceView)ViewUtil.findViewById(mRootView, 0x7f1002e9)).setPrice(orderdetailsresult.getTotal());
        TextView textview = (TextView)ViewUtil.findViewById(mRootView, 0x7f1002ee);
        Activity activity = mActivity;
        String s1;
        if (orderdetailsresult.getPaymentType() != null)
        {
            s1 = orderdetailsresult.getPaymentType();
        } else
        {
            s1 = "";
        }
        textview.setText(activity.getString(0x7f09029f, new Object[] {
            s1
        }));
        ((TextView)ViewUtil.findViewById(mRootView, 0x7f1002ef)).setText(orderdetailsresult.getCcNumber());
        ((TextView)ViewUtil.findViewById(mRootView, 0x7f1002eb)).setText(orderdetailsresult.getBillToName());
        populateViewFromAddress(mRootView, orderdetailsresult.getBillTo(), 0x7f1002ec, 0x7f1002ed);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void setSummaryText(TextView textview, String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.startsWith("-$"))
            {
                s1 = (new StringBuilder()).append('(').append(s.substring(1)).append(')').toString();
            }
        }
        textview.setText(s1);
    }

    public String getTitleText()
    {
        return "Order Details";
    }

    public View getView()
    {
        return mRootView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        for (Iterator iterator = mInFlightRequests.iterator(); iterator.hasNext(); ((Request)iterator.next()).cancel()) { }
        mInFlightRequests.clear();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        if (!TextUtils.isEmpty(mOrderId))
        {
            loadDetails(mOrderId);
        }
        MessageBus.getBus().post(new OrderDetailsEvent());
    }

    protected Dialog onCreateDialog(int i)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder1;
        switch (i)
        {
        default:
            com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
            builder.setMessage(0x7f09029a).setCancelable(false).setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

                final OrderDetailsPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    pop();
                }

            
            {
                this$0 = OrderDetailsPresenter.this;
                super();
            }
            });
            return builder.create();

        case 90002: 
            builder1 = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
            break;
        }
        builder1.setMessage(mActivity.getString(0x7f090282)).setCancelable(false).setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final OrderDetailsPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                pop();
            }

            
            {
                this$0 = OrderDetailsPresenter.this;
                super();
            }
        });
        return builder1.create();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f0400d6, viewgroup);
        }
    }

    protected void onPageView()
    {
        GoogleAnalytics.trackPageView("Track Order Details");
        AnalyticsHelper.post(AnalyticsHelper.prepareOrderDetailsPageViewEvent());
    }

    public void onPop()
    {
        super.onPop();
        mActivity = null;
        mRootView = null;
        mOrder = null;
    }

    static 
    {
        sFormattedDate = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        sPurchaseDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
    }








}
