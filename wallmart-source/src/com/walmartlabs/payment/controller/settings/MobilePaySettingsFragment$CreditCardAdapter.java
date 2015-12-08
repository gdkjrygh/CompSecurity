// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.view.OneLineCreditCardView;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            MobilePaySettingsFragment

private static class <init> extends BaseAdapter
{

    private final Activity mActivity;
    private final List mCards;

    public int getCount()
    {
        return mCards.size();
    }

    public Object getItem(int i)
    {
        return mCards.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = ViewUtil.inflate(mActivity, com.walmartlabs.android.payment.CardAdapter.mActivity, viewgroup, false);
        }
        ((OneLineCreditCardView)view1).setCreditCard((CreditCard)getItem(i));
        return view1;
    }

    private (Activity activity, List list)
    {
        mActivity = activity;
        mCards = list;
    }

    mCards(Activity activity, List list, mCards mcards)
    {
        this(activity, list);
    }
}
