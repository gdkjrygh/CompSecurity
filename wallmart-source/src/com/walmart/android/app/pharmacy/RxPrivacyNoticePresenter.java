// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.service.pharmacylegacy.HtmlContent;
import com.walmart.android.service.pharmacylegacy.PharmacyLegacyService;
import com.walmart.android.ui.Presenter;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RxPrivacyNoticePresenter extends Presenter
{

    private Activity mActivity;
    private ViewGroup mMainView;
    private final List mRequestsInFlight = new ArrayList();
    private ViewGroup mView;

    public RxPrivacyNoticePresenter(Activity activity)
    {
        mActivity = activity;
        mView = (ViewGroup)((LayoutInflater)activity.getSystemService("layout_inflater")).inflate(0x7f040146, null);
        mMainView = (ViewGroup)mView.findViewById(0x7f100472);
    }

    private void cancelRequestsInFlight()
    {
        for (Iterator iterator = mRequestsInFlight.iterator(); iterator.hasNext(); ((Request)iterator.next()).cancel()) { }
        mRequestsInFlight.clear();
    }

    private void hideLoading()
    {
        mView.findViewById(0x7f100473).setVisibility(8);
    }

    private void initWebView(HtmlContent htmlcontent)
    {
        WebView webview = new WebView(mActivity);
        webview.loadDataWithBaseURL("", htmlcontent.getContent(), "text/html", "utf-8", "");
        mMainView.addView(webview);
    }

    private void loadData()
    {
        Request request = Services.get().getPharmacyLegacyService().getPharmacyPrivacyNotice().addCallback(new CallbackSameThread(mActivity) {

            final RxPrivacyNoticePresenter this$0;

            public void onResultSameThread(Request request1, Result result)
            {
                mRequestsInFlight.remove(request1);
                hideLoading();
                if (result.successful() && result.hasData())
                {
                    initWebView((HtmlContent)result.getData());
                    return;
                }
                char c;
                if (result.hasError() && result.getError().connectionError())
                {
                    c = '\001';
                } else
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
                this$0 = RxPrivacyNoticePresenter.this;
                super(context);
            }
        });
        mRequestsInFlight.add(request);
    }

    private void trackPageView()
    {
        GoogleAnalytics.trackPageView("Pharmacy Privacy Notice");
    }

    public String getTitleText()
    {
        return "Privacy Notice";
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
        loadData();
        trackPageView();
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        trackPageView();
    }




}
