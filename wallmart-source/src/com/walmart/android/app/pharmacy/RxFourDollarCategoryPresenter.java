// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.ui.recycler.ListRecyclerView;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            RxFourDollarAdapter

public class RxFourDollarCategoryPresenter extends Presenter
{

    private Context mContext;
    private com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions.DrugList mDrugList;
    private LayoutInflater mLayoutInflater;
    private View mView;

    public RxFourDollarCategoryPresenter(Context context, com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions.DrugList druglist)
    {
        mContext = context;
        mDrugList = druglist;
        mLayoutInflater = (LayoutInflater)mContext.getSystemService("layout_inflater");
        mView = mLayoutInflater.inflate(0x7f040141, null);
        initListView();
    }

    private void initListView()
    {
        ListRecyclerView listrecyclerview = (ListRecyclerView)mView.findViewById(0x7f10046c);
        listrecyclerview.setAdapter(new RxFourDollarAdapter(mContext, mDrugList.getDrugList()));
        listrecyclerview.addFooterView(mLayoutInflater.inflate(0x7f040143, null));
    }

    private void trackPageView()
    {
        GoogleAnalytics.trackPageView("Pharmacy Medications List");
    }

    public String getTitleText()
    {
        return mDrugList.getCategory();
    }

    public View getView()
    {
        return mView;
    }

    public void onBeforePoppedTo()
    {
        trackPageView();
    }

    public void onBeforePush()
    {
        trackPageView();
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        trackPageView();
    }
}
