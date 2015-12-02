// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.facebook;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.ubercab.client.core.vendor.facebook:
//            FacebookAuthorizationFragment

final class a extends WebViewClient
{

    final FacebookAuthorizationFragment a;

    public final void onPageFinished(WebView webview, String s)
    {
        if (a.isResumed() && a.mContainerView != null)
        {
            a.e();
            a.mContainerView.setVisibility(0);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return a.d(s);
    }

    (FacebookAuthorizationFragment facebookauthorizationfragment)
    {
        a = facebookauthorizationfragment;
        super();
    }
}
