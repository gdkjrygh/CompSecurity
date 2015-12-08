// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.weeklyad;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.utils.WLog;
import java.util.Map;

// Referenced classes of package com.walmart.android.app.weeklyad:
//            WeeklyAdPresenter

class val.progress extends WebViewClient
{

    final WeeklyAdPresenter this$0;
    final View val$progress;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        webview = (Long)WeeklyAdPresenter.access$400(WeeklyAdPresenter.this).get(s);
        if (webview != null)
        {
            WLog.d(WeeklyAdPresenter.access$500(), (new StringBuilder()).append("onPageFinished(): ").append(SystemClock.elapsedRealtime() - webview.longValue()).append(" ms waiting for ").append(s).toString());
        }
        val$progress.setVisibility(8);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        WeeklyAdPresenter.access$400(WeeklyAdPresenter.this).put(s, Long.valueOf(SystemClock.elapsedRealtime()));
        val$progress.setVisibility(0);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        DialogFactory.createAlertDialog(WeeklyAdPresenter.access$600(WeeklyAdPresenter.this).getString(0x7f09060c), WeeklyAdPresenter.access$600(WeeklyAdPresenter.this)).show();
        WeeklyAdPresenter.access$600(WeeklyAdPresenter.this).onBackPressed();
    }

    public void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s, String s1)
    {
        WLog.d(WeeklyAdPresenter.access$500(), (new StringBuilder()).append("onReceivedHttpAuthRequest(): host = ").append(s).append(", realm = ").append(s1).toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return WeeklyAdPresenter.access$300(WeeklyAdPresenter.this, s) || super.shouldOverrideUrlLoading(webview, s);
    }

    ()
    {
        this$0 = final_weeklyadpresenter;
        val$progress = View.this;
        super();
    }
}
