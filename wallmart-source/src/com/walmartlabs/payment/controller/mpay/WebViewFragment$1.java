// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            WebViewFragment

class val.rootView extends WebViewClient
{

    final WebViewFragment this$0;
    final View val$rootView;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        ViewUtil.findViewById(val$rootView, com.walmartlabs.android.payment.gment._cls1.val.rootView).setVisibility(8);
        WebViewFragment.access$000(WebViewFragment.this).setVisibility(0);
    }

    ()
    {
        this$0 = final_webviewfragment;
        val$rootView = View.this;
        super();
    }
}
