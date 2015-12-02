// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.ubercab.payment.internal.vendor.airtel.Airtel2faActivity;

public final class gum extends WebViewClient
{

    private Airtel2faActivity a;
    private Uri b;

    public gum(Airtel2faActivity airtel2faactivity, Uri uri)
    {
        a = airtel2faactivity;
        b = uri;
    }

    private static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
        if (!a.isFinishing())
        {
            Airtel2faActivity.a(a).setVisibility(8);
        }
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (!a.isFinishing())
        {
            Airtel2faActivity.a(a).setVisibility(0);
        }
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        if (!a.isFinishing())
        {
            Airtel2faActivity.a(a).setVisibility(8);
            Airtel2faActivity.a(a, 0);
        }
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
        if (!a.isFinishing())
        {
            Airtel2faActivity.a(a).setVisibility(8);
            Airtel2faActivity.a(a, 0);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        int i = 0;
        if (!a.isFinishing()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (s == null || s.isEmpty())
        {
            Airtel2faActivity.a(a, 0);
            return true;
        }
        webview = Uri.parse(s);
        if (webview == null || !a(webview.getScheme(), b.getScheme()) || !a(webview.getHost(), b.getHost()) || !a(Integer.valueOf(webview.getPort()), Integer.valueOf(b.getPort())) || !a(webview.getPath(), b.getPath())) goto _L1; else goto _L3
_L3:
        s = webview.getQueryParameter("success");
        int j = Integer.parseInt(s);
        i = j;
_L5:
        if (i != 1)
        {
            webview = webview.getQueryParameter("error");
            if (webview != null)
            {
                cwm.a(a, webview);
            }
        }
        Airtel2faActivity.a(a, i);
        return true;
        s;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
