// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.app.ProgressDialog;
import android.util.Log;
import android.webkit.WebView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebPresenter

class val.returnUrl
    implements com.walmart.android.wmservice.AuthCallback
{

    final WebPresenter this$0;
    final ProgressDialog val$progressDialog;
    final String val$returnUrl;

    public void onFailure(int i)
    {
        Log.e(WebPresenter.access$000(), "renewSessionAndGoToReturnUrl() Unable to renew session");
        val$progressDialog.dismiss();
    }

    public void onSuccess()
    {
        WLog.d(WebPresenter.access$000(), "Successfully renewed session. Setting cookies and loading return URL.");
        val$progressDialog.dismiss();
        WebPresenter.access$1600(WebPresenter.this);
        WebPresenter.access$1200(WebPresenter.this).loadUrl(val$returnUrl);
    }

    uthCallback()
    {
        this$0 = final_webpresenter;
        val$progressDialog = progressdialog;
        val$returnUrl = String.this;
        super();
    }
}
