// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.weeklyad;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.app.item.ItemPriceView;
import com.walmart.android.service.weeklyad.WeeklyAdItem;
import com.walmart.android.service.weeklyad.WeeklyAdService;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.WalmartPrice;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class WeeklyAdStoreItemPresenter extends Presenter
{
    private static class Flags
    {

        private static final Map sPriceFlagToResourceIdMap = new HashMap() {

            
            {
                put("FREE SHIPPING", Integer.valueOf(0x7f0201bf));
                put("ROLLBACK", Integer.valueOf(0x7f0201bf));
                put("CLEARANCE", Integer.valueOf(0x7f0201bf));
                put("DARE TO COMPARE", Integer.valueOf(0x7f0201c0));
                put("SAME DAY DELIVERY", Integer.valueOf(0x7f0201bf));
                put("COMING SOON", Integer.valueOf(0x7f0201c1));
                put("WALMART EXCLUSIVE", Integer.valueOf(0x7f0201bf));
                put("PERSONALIZE IT", Integer.valueOf(0x7f0201c0));
                put("SPECIAL BUY", Integer.valueOf(0x7f0201c0));
                put("SAVE ON SHIPPING", Integer.valueOf(0x7f0201bf));
                put("REBATE AVAILABLE", Integer.valueOf(0x7f0201bf));
                put("AS ADVERTISED", Integer.valueOf(0x7f0201c1));
                put("AWARD WINNING", Integer.valueOf(0x7f0201c1));
                put("NEW", Integer.valueOf(0x7f0201c1));
                put("NEW ITEM", Integer.valueOf(0x7f0201c1));
                put("CERTIFIED ITEM", Integer.valueOf(0x7f0201c0));
                put("AS SEEN ON TV", Integer.valueOf(0x7f0201c0));
            }
        };

        public static int getResourceIdForFlag(String s)
        {
            if (!TextUtils.isEmpty(s))
            {
                s = (Integer)sPriceFlagToResourceIdMap.get(s.toUpperCase(Locale.US));
                if (s != null)
                {
                    return s.intValue();
                }
            }
            return 0x7f0201bf;
        }


        private Flags()
        {
        }
    }


    private static final String TAG = com/walmart/android/app/weeklyad/WeeklyAdStoreItemPresenter.getSimpleName();
    private Activity mActivity;
    private Request mRequest;
    private View mView;
    private String mWeeklyItemId;

    public WeeklyAdStoreItemPresenter(Activity activity, String s)
    {
        mActivity = activity;
        mWeeklyItemId = s;
        setTitleText(mActivity.getString(0x7f0901ca));
    }

    private void init(final WeeklyAdItem model)
    {
        Picasso.with(mActivity).load(model.getImageUrl()).error(0x7f020342).tag(TAG).into((ImageView)ViewUtil.findViewById(mView, 0x7f10004b), new Callback() {

            final WeeklyAdStoreItemPresenter this$0;
            final WeeklyAdItem val$model;

            public void onError()
            {
                setModel(model);
            }

            public void onSuccess()
            {
                setModel(model);
            }

            
            {
                this$0 = WeeklyAdStoreItemPresenter.this;
                model = weeklyaditem;
                super();
            }
        });
    }

    private void setDisplayContent(boolean flag)
    {
        boolean flag1 = false;
        View view = ViewUtil.findViewById(mView, 0x7f100614);
        int i;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        view = ViewUtil.findViewById(mView, 0x7f100074);
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void setModel(WeeklyAdItem weeklyaditem)
    {
        ViewUtil.setText(0x7f10004f, mView, weeklyaditem.getName());
        Object obj = (TextView)ViewUtil.findViewById(mView, 0x7f10060b);
        Object obj1 = weeklyaditem.getValidityPeriodDisplayString();
        ((TextView) (obj)).setText(((CharSequence) (obj1)));
        Object obj2;
        String s;
        int i;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = ViewUtil.findViewById(mView, 0x7f10060d);
        obj1 = (ItemPriceView)ViewUtil.findViewById(mView, 0x7f1000a8);
        obj2 = weeklyaditem.getDisplayPrice();
        s = weeklyaditem.getPricePrefix();
        ((ItemPriceView) (obj1)).setPrice((new StringBuilder()).append(s).append(" ").append(((String) (obj2))).toString());
        ((TextView)ViewUtil.findViewById(mView, 0x7f10060f)).setText(weeklyaditem.getPriceSuffix());
        if (!TextUtils.isEmpty(((CharSequence) (obj2))) && ((ItemPriceView) (obj1)).getWalmartPrice().isValid())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        obj = ViewUtil.findViewById(mView, 0x7f100610);
        obj2 = (TextView)ViewUtil.findViewById(mView, 0x7f10031c);
        obj1 = weeklyaditem.getDescription();
        ((TextView) (obj2)).setText(((CharSequence) (obj1)));
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj2)).setVisibility(i);
        obj2 = (TextView)ViewUtil.findViewById(mView, 0x7f100611);
        s = weeklyaditem.getDisclaimer();
        ((TextView) (obj2)).setText(s);
        if (TextUtils.isEmpty(s))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj2)).setVisibility(i);
        if (TextUtils.isEmpty(((CharSequence) (obj1))) && TextUtils.isEmpty(s))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        obj = (LinearLayout)ViewUtil.findViewById(mView, 0x7f100613);
        obj1 = weeklyaditem.getSpecs();
        if (!((List) (obj1)).isEmpty())
        {
            i = 0;
            for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext();)
            {
                Pair pair = (Pair)iterator.next();
                View view = LayoutInflater.from(mActivity).inflate(0x7f0401da, ((ViewGroup) (obj)), false);
                if (i % 2 == 0)
                {
                    view.setBackgroundColor(mActivity.getResources().getColor(0x7f0f0031));
                }
                ((TextView)ViewUtil.findViewById(view, 0x7f100616)).setText((CharSequence)pair.first);
                ((TextView)ViewUtil.findViewById(view, 0x7f100617)).setText((CharSequence)pair.second);
                ((LinearLayout) (obj)).addView(view);
                i++;
            }

        }
        if (!((List) (obj1)).isEmpty())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((LinearLayout) (obj)).setVisibility(i);
        obj = weeklyaditem.getFeatures();
        obj1 = (LinearLayout)ViewUtil.findViewById(mView, 0x7f100612);
        if (!((List) (obj)).isEmpty())
        {
            TextView textview;
            for (Iterator iterator1 = ((List) (obj)).iterator(); iterator1.hasNext(); ((LinearLayout) (obj1)).addView(textview))
            {
                String s1 = (String)iterator1.next();
                textview = (TextView)ViewUtil.findViewById(LayoutInflater.from(mActivity).inflate(0x7f0401d9, ((ViewGroup) (obj1)), false), 0x7f100615);
                textview.setText(s1);
            }

        }
        if (!((List) (obj)).isEmpty())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((LinearLayout) (obj1)).setVisibility(i);
        weeklyaditem = weeklyaditem.getSaleStory();
        obj = (TextView)ViewUtil.findViewById(mView, 0x7f10060c);
        ((TextView) (obj)).setText(weeklyaditem);
        ((TextView) (obj)).setBackgroundResource(Flags.getResourceIdForFlag(weeklyaditem));
        if (TextUtils.isEmpty(weeklyaditem))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        setDisplayContent(true);
    }

    public View getView()
    {
        return mView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        if (mRequest != null)
        {
            mRequest.cancel();
            mRequest = null;
        }
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        mRequest = Services.get().getWeeklyAdService().getWeeklyAdItem(mWeeklyItemId).addCallback(new CallbackSameThread() {

            final WeeklyAdStoreItemPresenter this$0;

            public void onResultSameThread(Request request, Result result)
            {
                super.onResultSameThread(request, result);
                if (result.successful() && result.hasData())
                {
                    init((WeeklyAdItem)result.getData());
                    return;
                } else
                {
                    pop();
                    DialogFactory.showDialog(2, mActivity);
                    return;
                }
            }

            
            {
                this$0 = WeeklyAdStoreItemPresenter.this;
                super();
            }
        });
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        mView = LayoutInflater.from(mActivity).inflate(0x7f0401d8, viewgroup, false);
    }

    public void onPop()
    {
        super.onPop();
        if (mRequest != null)
        {
            mRequest.cancel();
        }
    }





}
