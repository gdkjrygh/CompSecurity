// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.walmart.android.app.item.ItemPriceView;
import com.walmart.android.utils.ViewUtil;

public class InStoreView extends RelativeLayout
{

    private TextView mAisleFlagPrefix;
    private LinearLayout mAisleFlagsContainer;
    private TextView mAvailability;
    private View mInStoreMap;
    private View mOtherStoresAvailability;
    private ItemPriceView mPrice;
    private TextView mPricePerUnit;
    private View mProgressIndicator;
    private TextView mStoreDetails;

    public InStoreView(Context context)
    {
        super(context);
    }

    public InStoreView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public InStoreView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public InStoreView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    private static TextView createFlag(int i, int j, int k, String s, Context context)
    {
        TextView textview = new TextView(context);
        textview.setBackgroundResource(i);
        textview.setGravity(17);
        textview.setTextAppearance(context, 0x7f0b0049);
        textview.setTextColor(-1);
        textview.setPadding(j, k, j, k);
        textview.setText(s);
        return textview;
    }

    public void hideOtherStoresAvailability()
    {
        mOtherStoresAvailability.setVisibility(8);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mPrice = (ItemPriceView)ViewUtil.findViewById(this, 0x7f1001eb);
        mPricePerUnit = (TextView)ViewUtil.findViewById(this, 0x7f1001f1);
        mAvailability = (TextView)ViewUtil.findViewById(this, 0x7f1001f3);
        mStoreDetails = (TextView)ViewUtil.findViewById(this, 0x7f1001f4);
        mAisleFlagsContainer = (LinearLayout)ViewUtil.findViewById(this, 0x7f1001f6);
        mAisleFlagPrefix = (TextView)ViewUtil.findViewById(this, 0x7f1001f7);
        mOtherStoresAvailability = ViewUtil.findViewById(this, 0x7f1001f5);
        mProgressIndicator = ViewUtil.findViewById(this, 0x7f1001f8);
        mInStoreMap = ViewUtil.findViewById(this, 0x7f100183);
    }

    public void setAisleLocationsForDepartment(String as[], String s)
    {
        if (as != null && as.length > 0)
        {
            int j = Math.min(3, as.length);
            Object obj = getResources().getQuantityString(0x7f110004, j);
            mAisleFlagPrefix.setText(((CharSequence) (obj)));
            int k = ViewUtil.dpToPixels(8, getContext());
            int l = ViewUtil.dpToPixels(2, getContext());
            obj = new android.widget.LinearLayout.LayoutParams(-2, -2);
            obj.rightMargin = ViewUtil.dpToPixels(5, getContext());
            mAisleFlagsContainer.removeAllViews();
            for (int i = 0; i < j; i++)
            {
                TextView textview = createFlag(0x7f0201be, k, l, as[i], getContext());
                mAisleFlagsContainer.addView(textview, ((android.view.ViewGroup.LayoutParams) (obj)));
            }

            if (!TextUtils.isEmpty(s))
            {
                as = new TextView(getContext());
                as.setTextAppearance(getContext(), 0x7f0b0049);
                as.setText(getResources().getString(0x7f090178, new Object[] {
                    s
                }));
                mAisleFlagsContainer.addView(as);
            }
            mAisleFlagsContainer.setVisibility(0);
            return;
        } else
        {
            mAisleFlagsContainer.setVisibility(8);
            return;
        }
    }

    public void setAvailability(CharSequence charsequence)
    {
        mAvailability.setText(charsequence);
        TextView textview = mAvailability;
        byte byte0;
        if (TextUtils.isEmpty(charsequence))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public void setInStoreMapClickListener(android.view.View.OnClickListener onclicklistener)
    {
        mInStoreMap.setOnClickListener(onclicklistener);
    }

    public void setLoading(boolean flag)
    {
        if (flag)
        {
            mProgressIndicator.setVisibility(0);
            setPrice(null);
            setPricePerUnit(null);
            setAvailability(null);
            setStoreDetails(null);
            hideOtherStoresAvailability();
            return;
        } else
        {
            mProgressIndicator.setVisibility(8);
            return;
        }
    }

    public void setOtherStoresAvailabilityClickListener(android.view.View.OnClickListener onclicklistener)
    {
        mOtherStoresAvailability.setOnClickListener(onclicklistener);
    }

    public void setPrice(String s)
    {
        mPrice.setPrice(s);
        ItemPriceView itempriceview = mPrice;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        itempriceview.setVisibility(byte0);
    }

    public void setPriceAnimated(String s, Animation animation)
    {
        if (!mPrice.getPrice().equals(s))
        {
            setPrice(s);
            if (mPrice.getVisibility() == 0)
            {
                mPrice.startAnimation(animation);
            }
        }
    }

    public void setPricePerUnit(String s)
    {
        mPricePerUnit.setText(s);
        TextView textview = mPricePerUnit;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public void setPriceUnit(String s)
    {
        ItemPriceView itempriceview = mPrice;
        if (TextUtils.isEmpty(s))
        {
            s = null;
        }
        itempriceview.setUnit(s);
    }

    public void setStoreDetails(String s)
    {
        mStoreDetails.setText(s);
        TextView textview = mStoreDetails;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public void showInStoreMap(boolean flag)
    {
        int j = 0x7f1001f2;
        Object obj = mInStoreMap;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        obj = (android.widget.RelativeLayout.LayoutParams)mInStoreMap.getLayoutParams();
        if (mPricePerUnit.getVisibility() != 8)
        {
            i = 0x7f1001f1;
        } else
        {
            i = 0x7f1001f2;
        }
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(3, i);
        mInStoreMap.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = (android.widget.RelativeLayout.LayoutParams)mAvailability.getLayoutParams();
        i = j;
        if (flag)
        {
            i = 0x7f100183;
        }
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(3, i);
        if (flag)
        {
            i = 5;
        } else
        {
            i = 15;
        }
        obj.topMargin = ViewUtil.dpToPixels(i, getContext());
        mAvailability.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    public void showOtherStoresAvailability()
    {
        mOtherStoresAvailability.setVisibility(0);
    }
}
