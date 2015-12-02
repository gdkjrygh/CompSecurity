// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.zaakpay;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import chp;
import e;
import gsg;
import gzf;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.ubercab.payment.internal.vendor.zaakpay:
//            ZaakpayWebViewActivity

final class b extends gzf
{

    final Pattern a;
    final Pattern b;
    final ZaakpayWebViewActivity c;

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (!c.isFinishing() && ZaakpayWebViewActivity.a(c).isShowing())
        {
            ZaakpayWebViewActivity.a(c).dismiss();
        }
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        if (a.matcher(s).matches())
        {
            c.a.a(e.ao);
            c.setResult(-1);
            c.finish();
        } else
        if (b.matcher(s).matches())
        {
            c.a.a(e.an);
            webview = null;
            s = Uri.parse(s);
            if (s.isHierarchical())
            {
                webview = s.getQueryParameter("responseDescription");
            }
            s = webview;
            if (TextUtils.isEmpty(webview))
            {
                s = c.getString(gsg.ub__payment_error_verifying_card);
            }
            Toast.makeText(c, s, 1).show();
            c.finish();
            return;
        }
    }

    (ZaakpayWebViewActivity zaakpaywebviewactivity, Pattern pattern, Pattern pattern1)
    {
        c = zaakpaywebviewactivity;
        a = pattern;
        b = pattern1;
        super();
    }
}
