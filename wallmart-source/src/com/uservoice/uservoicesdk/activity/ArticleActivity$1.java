// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ArticleActivity

class this._cls0 extends WebViewClient
{

    final ArticleActivity this$0;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        findViewById(com.uservoice.uservoicesdk.ction).setVisibility(0);
    }

    ()
    {
        this$0 = ArticleActivity.this;
        super();
    }
}
