// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.walmart.android.app.main:
//            UpgradeActivity

class this._cls0 extends WebViewClient
{

    final UpgradeActivity this$0;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        findViewById(0x7f100083).setVisibility(8);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return false;
    }

    ()
    {
        this$0 = UpgradeActivity.this;
        super();
    }
}
