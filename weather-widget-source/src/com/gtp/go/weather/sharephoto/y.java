// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            TermsAndPrivacyActivity

class y extends WebChromeClient
{

    final TermsAndPrivacyActivity a;

    y(TermsAndPrivacyActivity termsandprivacyactivity)
    {
        a = termsandprivacyactivity;
        super();
    }

    public void onConsoleMessage(String s, int i, String s1)
    {
    }

    public void onProgressChanged(WebView webview, int i)
    {
        super.onProgressChanged(webview, i);
        if (i == 100)
        {
            TermsAndPrivacyActivity.a(a).setVisibility(8);
            TermsAndPrivacyActivity.b(a).setVisibility(8);
            return;
        } else
        {
            TermsAndPrivacyActivity.a(a).setText((new StringBuilder()).append(i).append("%").toString());
            return;
        }
    }
}
