// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions;
import com.walmart.android.service.pharmacylegacy.PharmacyLegacyService;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.RecyclerItemSingleClickListener;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            PharmacyFourDollarAdapter, RxFourDollarCategoryPresenter

public class PharmacyFourDollarPresenter extends Presenter
{

    private Activity mActivity;
    private FourDollarPrescriptions mFourDollarPrescriptions;
    private final List mRequestsInFlight = new ArrayList();
    private View mView;

    public PharmacyFourDollarPresenter(Activity activity)
    {
        mActivity = activity;
        mView = LayoutInflater.from(mActivity).inflate(0x7f040145, null);
    }

    private void cancelRequestsInFlight()
    {
        for (Iterator iterator = mRequestsInFlight.iterator(); iterator.hasNext(); ((Request)iterator.next()).cancel()) { }
        mRequestsInFlight.clear();
    }

    private com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions.DrugList getDrugListForCategory(String s)
    {
        com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions.DrugList adruglist[] = mFourDollarPrescriptions.getDrugList();
        int j = adruglist.length;
        for (int i = 0; i < j; i++)
        {
            com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions.DrugList druglist = adruglist[i];
            if (s.equals(druglist.getCategory()))
            {
                return druglist;
            }
        }

        return null;
    }

    private void initListView()
    {
        PharmacyFourDollarAdapter pharmacyfourdollaradapter = new PharmacyFourDollarAdapter(mActivity, mFourDollarPrescriptions.getCategories());
        ListRecyclerView listrecyclerview = (ListRecyclerView)mView.findViewById(0x7f100470);
        listrecyclerview.setAdapter(pharmacyfourdollaradapter);
        listrecyclerview.setOnItemClickListener(new RecyclerItemSingleClickListener(this) {

            final PharmacyFourDollarPresenter this$0;

            public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
            {
                basicviewholder = mFourDollarPrescriptions.getCategories()[i];
                basicviewholder = new RxFourDollarCategoryPresenter(mActivity, getDrugListForCategory(basicviewholder));
                pushPresenter(basicviewholder);
            }

            
            {
                this$0 = PharmacyFourDollarPresenter.this;
                super(presenter);
            }
        });
    }

    private void loadFourDollarPrescriptions()
    {
        Request request = Services.get().getPharmacyLegacyService().getFourDollarPrescriptions().addCallback(new CallbackSameThread(mActivity) {

            final PharmacyFourDollarPresenter this$0;

            public void onResultSameThread(Request request1, Result result)
            {
                char c = '\001';
                mRequestsInFlight.remove(request1);
                if (result.successful() && result.hasData())
                {
                    mFourDollarPrescriptions = (FourDollarPrescriptions)result.getData();
                    initListView();
                    showList(true);
                    return;
                }
                if (!result.hasError() || !result.getError().connectionError())
                {
                    c = '\0';
                }
                if (c != 0)
                {
                    c = '\u0258';
                } else
                {
                    c = '\u0384';
                }
                DialogFactory.showDialog(c, mActivity);
            }

            
            {
                this$0 = PharmacyFourDollarPresenter.this;
                super(context);
            }
        });
        mRequestsInFlight.add(request);
    }

    private void showList(boolean flag)
    {
        boolean flag1 = false;
        View view = mView.findViewById(0x7f100471);
        int i;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        view = mView.findViewById(0x7f100470);
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void trackPageView()
    {
        GoogleAnalytics.trackPageView("Pharmacy Medications");
    }

    public String getScreenName()
    {
        return "Rx:$4 Refills";
    }

    public String getTitleText()
    {
        return "$4 Prescriptions";
    }

    public View getView()
    {
        return mView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        cancelRequestsInFlight();
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        trackPageView();
    }

    public void onBeforePush()
    {
        loadFourDollarPrescriptions();
        trackPageView();
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        trackPageView();
    }



/*
    static FourDollarPrescriptions access$002(PharmacyFourDollarPresenter pharmacyfourdollarpresenter, FourDollarPrescriptions fourdollarprescriptions)
    {
        pharmacyfourdollarpresenter.mFourDollarPrescriptions = fourdollarprescriptions;
        return fourdollarprescriptions;
    }

*/






}
