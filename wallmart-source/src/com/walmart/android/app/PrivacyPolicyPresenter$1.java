// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.walmart.android.app:
//            PrivacyPolicyPresenter

class this._cls0 extends WebViewClient
{

    final PrivacyPolicyPresenter this$0;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        PrivacyPolicyPresenter.access$000(PrivacyPolicyPresenter.this).findViewById(0x7f1001bb).setVisibility(8);
        PrivacyPolicyPresenter.access$100(PrivacyPolicyPresenter.this).setVisibility(0);
    }

    ()
    {
        this$0 = PrivacyPolicyPresenter.this;
        super();
    }
}
