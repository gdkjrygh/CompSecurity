// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.analytics.AnalyticsPageView;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter

public class EReceiptReturnPresenter extends Presenter
{

    private static final String TAG = com/walmartlabs/ereceipt/EReceiptListPresenter.getSimpleName();
    private Context mContext;
    private ViewGroup mRootView;
    private String mTcNumber;

    public EReceiptReturnPresenter(Context context, String s)
    {
        mContext = context;
        mTcNumber = s;
        setTitleText(context.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_return_title));
    }

    private String getReturnString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(mTcNumber))
        {
            int k = mTcNumber.length();
            int j = 0;
            for (int i = 4; i < k; i += 4)
            {
                stringbuilder.append(mTcNumber, j, i);
                stringbuilder.append('\n');
                j = i;
            }

            stringbuilder.append(mTcNumber, j, k);
        }
        return stringbuilder.toString();
    }

    public View getView()
    {
        return mRootView;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(mContext, com.walmartlabs.android.ereceipt.R.layout.ereceipt_return_layout, viewgroup);
            ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.tc_number, mRootView, getReturnString());
        }
    }

    protected void onPageView()
    {
        MessageBus.getBus().post(new AnalyticsPageView("TC Number"));
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "TC Number").putString("section", "Saver").putString("subCategory", "Receipt");
        MessageBus.getBus().post(builder);
    }

}
