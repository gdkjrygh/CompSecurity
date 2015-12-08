// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.walmart.android.analytics.GoogleAnalytics;

// Referenced classes of package com.walmart.android.app.account:
//            LoginPresenter

class this._cls0
    implements android.view.ner
{

    final LoginPresenter this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(mActivity.getString(0x7f090127)));
        if (view.resolveActivity(mActivity.getPackageManager()) != null)
        {
            mActivity.startActivity(view);
            GoogleAnalytics.trackEvent("Account", "Forgot Password", LoginPresenter.access$400(LoginPresenter.this));
        }
    }

    ()
    {
        this$0 = LoginPresenter.this;
        super();
    }
}
