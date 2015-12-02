// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.baidu;

import android.app.ProgressDialog;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import chp;
import com.ubercab.payment.internal.vendor.baidu.model.BaiduWalletTokenData;
import e;

// Referenced classes of package com.ubercab.payment.internal.vendor.baidu:
//            BaiduAddActivity

final class a extends WebViewClient
{

    final BaiduAddActivity a;

    public final void onPageFinished(WebView webview, String s)
    {
        if (BaiduAddActivity.c(a).isShowing())
        {
            BaiduAddActivity.a(a).a(e.h);
            BaiduAddActivity.c(a).dismiss();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Object obj = Uri.parse(s);
        if ("api.uber.com.cn".equals(((Uri) (obj)).getHost()))
        {
            webview = BaiduAddActivity.a(((Uri) (obj)), "contract_no", BaiduAddActivity.h());
            s = BaiduAddActivity.a(((Uri) (obj)), "card_no", BaiduAddActivity.i());
            obj = BaiduAddActivity.a(((Uri) (obj)), "puresign_order_no", BaiduAddActivity.j());
            if (webview != null && s != null && obj != null)
            {
                webview = BaiduWalletTokenData.create(webview, s, ((String) (obj)));
                BaiduAddActivity.a(a, webview);
            } else
            {
                BaiduAddActivity.a(a).a(e.f);
                BaiduAddActivity.b(a);
            }
            return true;
        } else
        {
            return false;
        }
    }

    kenData(BaiduAddActivity baiduaddactivity)
    {
        a = baiduaddactivity;
        super();
    }
}
