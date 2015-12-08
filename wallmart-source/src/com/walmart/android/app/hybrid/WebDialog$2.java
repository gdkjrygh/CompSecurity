// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.app.Dialog;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebDialog

class this._cls0 extends WebViewClient
{

    final WebDialog this$0;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        getDialog().show();
    }

    ()
    {
        this$0 = WebDialog.this;
        super();
    }
}
