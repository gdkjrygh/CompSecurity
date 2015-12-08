// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.data.TosSection;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TermsOfUsePresenter extends Presenter
{

    private static final long MIN_LOADING_TIME = 500L;
    private List mContent;
    private Context mContext;
    private Handler mHandler;
    private boolean mIsPopulated;
    private Runnable mPopulateRunnable;
    private long mPushedTime;
    private ViewGroup mView;

    public TermsOfUsePresenter(Context context)
    {
        mPopulateRunnable = new Runnable() {

            final TermsOfUsePresenter this$0;

            public void run()
            {
                populate();
            }

            
            {
                this$0 = TermsOfUsePresenter.this;
                super();
            }
        };
        mContext = context;
        mView = (ViewGroup)ViewUtil.inflate(context, 0x7f0401b6);
        mHandler = new Handler();
    }

    private boolean isPushed()
    {
        return mPushedTime != 0L;
    }

    private void populate()
    {
        ViewGroup viewgroup = (ViewGroup)ViewUtil.findViewById(mView, 0x7f1000bb);
        WebView webview;
        for (Iterator iterator = mContent.iterator(); iterator.hasNext(); viewgroup.addView(webview))
        {
            TosSection tossection = (TosSection)iterator.next();
            webview = new WebView(mContext.getApplicationContext());
            webview.setWebViewClient(new WebViewClient() {

                final TermsOfUsePresenter this$0;

                public boolean shouldOverrideUrlLoading(WebView webview1, String s)
                {
                    webview1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    webview1.setFlags(0x10000000);
                    try
                    {
                        mContext.startActivity(webview1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (WebView webview1) { }
                    return true;
                }

            
            {
                this$0 = TermsOfUsePresenter.this;
                super();
            }
            });
            webview.loadDataWithBaseURL("", (new StringBuilder()).append("<h3>").append(tossection.name).append("</h3>").append(tossection.content).toString(), "text/html", "utf-8", "");
        }

        mView.findViewById(0x7f1001bb).setVisibility(8);
        mIsPopulated = true;
        mContent = null;
    }

    private void populateDelayed(long l)
    {
        mHandler.postDelayed(mPopulateRunnable, l);
    }

    public String getTitleText()
    {
        return "Terms of Use";
    }

    public View getView()
    {
        return mView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        ViewGroup viewgroup = (ViewGroup)ViewUtil.findViewById(mView, 0x7f1000bb);
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < viewgroup.getChildCount(); i++)
        {
            arraylist.add((WebView)viewgroup.getChildAt(i));
        }

        viewgroup.removeAllViews();
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); ((WebView)iterator.next()).destroy()) { }
        mView = null;
        mContext = null;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        Services.get().getWalmartService().getTermsOfUse(new AsyncCallbackOnThread(mHandler) {

            final TermsOfUsePresenter this$0;

            public void onFailureSameThread(Integer integer, List list)
            {
                if (isPopped())
                {
                    return;
                } else
                {
                    (new com.walmart.android.ui.dialog.AlertDialog.Builder(mContext)).setTitle("Network Error").setMessage("No network. Try again later.").setCancelable(true).setPositiveButton("OK", null).show();
                    pop();
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (List)obj1);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((List)obj);
            }

            public void onSuccessSameThread(List list)
            {
                if (!isPopped())
                {
                    mContent = list;
                    if (isPushed())
                    {
                        if (System.currentTimeMillis() - mPushedTime >= 500L)
                        {
                            populate();
                            return;
                        } else
                        {
                            populateDelayed(500L - (System.currentTimeMillis() - mPushedTime));
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = TermsOfUsePresenter.this;
                super(handler);
            }
        });
    }

    protected void onPageView()
    {
        AnalyticsHelper.post(AnalyticsHelper.prepareTermsOfUsePageViewEvent());
    }

    public void onPop()
    {
        super.onPop();
        mHandler.removeCallbacks(mPopulateRunnable);
    }

    public void onPushed()
    {
        super.onPushed();
        mPushedTime = System.currentTimeMillis();
        if (!mIsPopulated && mContent != null)
        {
            populateDelayed(500L);
        }
    }




/*
    static List access$202(TermsOfUsePresenter termsofusepresenter, List list)
    {
        termsofusepresenter.mContent = list;
        return list;
    }

*/




}
