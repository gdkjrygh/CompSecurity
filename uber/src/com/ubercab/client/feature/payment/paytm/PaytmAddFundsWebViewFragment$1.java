// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import cev;
import eul;
import ijg;

// Referenced classes of package com.ubercab.client.feature.payment.paytm:
//            PaytmAddFundsWebViewFragment

final class a extends WebViewClient
{

    final PaytmAddFundsWebViewFragment a;

    public final void onPageFinished(WebView webview, String s)
    {
        if (a.isResumed())
        {
            a.mProgressBar.setVisibility(8);
        }
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (a.isResumed())
        {
            a.mProgressBar.setVisibility(0);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        if (s.equals("https://secure.paytm.in/oltp-web/cancelTransaction"))
        {
            a.d.c(new eul(false, null));
        }
        return super.shouldInterceptRequest(webview, s);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
label0:
        {
            if (s.startsWith("https://native.uber.com/add_funds_response"))
            {
                if (!s.contains("TXN_SUCCESS"))
                {
                    break label0;
                }
                a.d.c(new eul(true, null));
            }
            return false;
        }
        s = Uri.parse(s);
        if (s.isHierarchical())
        {
            webview = s.getQueryParameter("RESPCODE");
            s = s.getQueryParameter("RESPMSG");
            ijg.a(String.format("Paytm webview error: %s, %s", new Object[] {
                webview, s
            }), new Object[0]);
            a.d.c(new eul(false, s));
            return false;
        } else
        {
            a.d.c(new eul(false, null));
            return false;
        }
    }

    (PaytmAddFundsWebViewFragment paytmaddfundswebviewfragment)
    {
        a = paytmaddfundswebviewfragment;
        super();
    }
}
