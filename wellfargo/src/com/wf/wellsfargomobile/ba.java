// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.http.SslError;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.util.SendAndForgetRequestService;
import com.wf.wellsfargomobile.util.d;
import com.wf.wellsfargomobile.util.o;
import com.wf.wellsfargomobile.util.v;
import com.wf.wellsfargomobile.webview.b;
import com.wf.wellsfargomobile.webview.c.ab;
import com.wf.wellsfargomobile.webview.c.ac;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseWebViewActivity, bc, bb, bd, 
//            WFApp

public class ba extends WebViewClient
{

    private final BaseWebViewActivity a;
    private PriorityQueue b;
    private final ExecutorService c = Executors.newCachedThreadPool();

    public ba(BaseWebViewActivity basewebviewactivity, PriorityQueue priorityqueue)
    {
        a = basewebviewactivity;
        b = priorityqueue;
    }

    static BaseWebViewActivity a(ba ba1)
    {
        return ba1.a;
    }

    private boolean a(String s)
    {
        return !s.contains("/accounts/accountList.action");
    }

    private long b(String s)
    {
        return 60000L;
    }

    static ExecutorService b(ba ba1)
    {
        return ba1.c;
    }

    private void c(String s)
    {
        if (!a(s))
        {
            return;
        } else
        {
            int i = a.e();
            s = new bc(this, b(s), i, new bb(this, s));
            a.runOnUiThread(new bd(this, s));
            return;
        }
    }

    public void onLoadResource(WebView webview, String s)
    {
    }

    public void onPageFinished(WebView webview, String s)
    {
        Iterator iterator;
        a.d();
        iterator = b.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ab ab1 = (ab)iterator.next();
        if (!ab1.a(a).matcher(s).matches() || ab1.a_(a, webview, s).a()) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (a.inSession.booleanValue() && a.h && !s.contains("data:text/html"))
        {
            a.h = false;
            a.webview.clearHistory();
            String as[];
            String as1[];
            int j;
            int k;
            int l;
            if (o.a("saveUsername") == Boolean.TRUE)
            {
                WFApp.K();
            } else
            {
                WFApp.O();
            }
            webview = new Intent("update_logon");
            LocalBroadcastManager.getInstance(a).sendBroadcast(webview);
        }
        webview = WFApp.z().getCookie(s);
        if (webview != null && !"".equals(webview))
        {
            webview = webview.split(";");
            k = webview.length;
            for (int i = 0; i < k; i++)
            {
                as = webview[i].split("=");
                if (!"WFBFPCOOKIE".equals(as[0].trim()))
                {
                    continue;
                }
                as = as[1].split(",");
                l = as.length;
                for (j = 0; j < l; j++)
                {
                    as1 = as[j].split(":");
                    if ("fpAltType".equals(as1[0].trim()))
                    {
                        com.wf.wellsfargomobile.WFApp.a(d.a(as1[1]));
                    }
                }

            }

        }
        a.c();
        if (a.k && System.currentTimeMillis() - a.m >= 0x493e0L)
        {
            a.m = System.currentTimeMillis();
            webview = new Intent(a, com/wf/wellsfargomobile/util/SendAndForgetRequestService);
            webview.putExtra("KEY_SEND_FORGET_URL", a.l);
            a.startService(webview);
        }
        if (!(new URL(s)).getPath().startsWith(a.getString(0x7f080172))) goto _L3; else goto _L5
_L5:
        a.b();
        return;
        webview;
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        c(s);
        bitmap = b.iterator();
        ab ab1;
        do
        {
            if (!bitmap.hasNext())
            {
                break;
            }
            ab1 = (ab)bitmap.next();
        } while (!ab1.a(a).matcher(s).matches() || ab1.a(a, webview, s).a());
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        a.d();
        s = new b(i, s, s1);
        for (s1 = b.iterator(); s1.hasNext();)
        {
            ab ab1 = (ab)s1.next();
            Pattern pattern = ab1.a(a);
            if (!TextUtils.isEmpty(webview.getUrl()) && pattern.matcher(webview.getUrl()).matches() && !ab1.a(a, webview, s).a())
            {
                return;
            }
        }

        a.isWalletSignOn();
        switch (i)
        {
        default:
            webview = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (webview != null && webview.isConnected())
            {
                a.returnWithError(a.getString(0x7f0800b2), (new StringBuilder()).append(a.getString(0x7f0800ae)).append(" [").append(i).append("]").toString(), 1, 0x7f0200fb);
                return;
            } else
            {
                a.returnWithError(a.getString(0x7f0800b2), (new StringBuilder()).append(a.getString(0x7f0800af)).append(" [").append(i).append("]").toString(), 1, 0x7f0200fb);
                return;
            }

        case -8: 
            a.returnWithError(a.getString(0x7f0800b2), a.getString(0x7f0800b1), 1, 0x7f0200fb);
            return;
        }
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        a.d();
        sslerrorhandler = new b(sslerrorhandler, sslerror);
        sslerror = b.iterator();
        ab ab1;
        Pattern pattern;
        do
        {
            if (!sslerror.hasNext())
            {
                break;
            }
            ab1 = (ab)sslerror.next();
            pattern = ab1.a(a);
        } while (TextUtils.isEmpty(webview.getUrl()) || !pattern.matcher(webview.getUrl()).matches() || ab1.a(a, webview, sslerrorhandler).a());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, WebResourceRequest webresourcerequest)
    {
        String s = webresourcerequest.getUrl().toString();
        if (v.a(s))
        {
            return super.shouldInterceptRequest(webview, webresourcerequest);
        }
        String as[] = com.wf.wellsfargomobile.a.a.l();
        String as1[] = webview.getContext().getResources().getStringArray(0x7f0d0001);
        String as2[] = webview.getContext().getResources().getStringArray(0x7f0d0000);
        String as3[] = com.wf.wellsfargomobile.a.a.n();
        if (v.a(s, WFApp.e(), as, false, as1, as2, as3))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        webview = super.shouldInterceptRequest(webview, webresourcerequest);
        return webview;
        webview;
        return v.c();
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        if (v.a(s))
        {
            return super.shouldInterceptRequest(webview, s);
        }
        String as[] = com.wf.wellsfargomobile.a.a.l();
        String as1[] = webview.getContext().getResources().getStringArray(0x7f0d0001);
        String as2[] = webview.getContext().getResources().getStringArray(0x7f0d0000);
        String as3[] = com.wf.wellsfargomobile.a.a.n();
        if (v.a(s, WFApp.e(), as, false, as1, as2, as3))
        {
            break MISSING_BLOCK_LABEL_81;
        }
        webview = super.shouldInterceptRequest(webview, s);
        return webview;
        webview;
        return v.c();
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (ab)iterator.next();
            if (((ab) (obj)).a(a).matcher(s).matches())
            {
                obj = ((ab) (obj)).b(a, webview, s);
                if (!((ac) (obj)).a())
                {
                    return ((ac) (obj)).b();
                }
            }
        }

        return false;
    }
}
