// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class b extends ae
{

    public b()
    {
    }

    public int a()
    {
        return 10;
    }

    public ac a(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        if (WFApp.d() && (s.contains("/accounts/") || s.contains("/transferandpay/") || s.contains("/mba/deposit/") || s.contains("/messaging/")))
        {
            basewebviewactivity.webviewProgressDialog.setVisibility(8);
        } else
        {
            basewebviewactivity.webviewProgressDialog.setVisibility(0);
        }
        basewebviewactivity.loading.setVisibility(0);
        basewebviewactivity = new ac();
        basewebviewactivity.a(true);
        return basewebviewactivity;
    }
}
