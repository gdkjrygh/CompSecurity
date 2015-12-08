// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.h5;

import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

// Referenced classes of package com.jiubang.commerce.ad.h5:
//            H5AdActivity

class a extends WebViewClient
{

    final Activity a;
    final H5AdActivity b;

    a(H5AdActivity h5adactivity, Activity activity)
    {
        b = h5adactivity;
        a = activity;
        super();
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        Toast.makeText(a, (new StringBuilder()).append("Opps! ").append(s).toString(), 0).show();
    }
}
