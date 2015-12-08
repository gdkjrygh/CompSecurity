// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.walmart.android.app.moremenu:
//            TermsOfUsePresenter

class this._cls0 extends WebViewClient
{

    final TermsOfUsePresenter this$0;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
        webview.setFlags(0x10000000);
        try
        {
            TermsOfUsePresenter.access$000(TermsOfUsePresenter.this).startActivity(webview);
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview) { }
        return true;
    }

    ()
    {
        this$0 = TermsOfUsePresenter.this;
        super();
    }
}
