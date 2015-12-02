// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.zaakpay;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import chp;
import com.ubercab.payment.internal.inject.PaymentActivityWithInjection;
import com.ubercab.payment.internal.vendor.zaakpay.model.ChargeBillErrorResponse;
import e;
import gjz;
import gsg;
import gst;
import gzd;
import gze;
import gzf;
import gzj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class ZaakpayWebViewActivity extends PaymentActivityWithInjection
{

    public chp a;
    private ChargeBillErrorResponse b;
    private ProgressDialog c;
    private WebView d;
    private gzf e;

    public ZaakpayWebViewActivity()
    {
    }

    static ProgressDialog a(ZaakpayWebViewActivity zaakpaywebviewactivity)
    {
        return zaakpaywebviewactivity.c;
    }

    public static final Intent a(Context context, ChargeBillErrorResponse chargebillerrorresponse)
    {
        context = new Intent(context, com/ubercab/payment/internal/vendor/zaakpay/ZaakpayWebViewActivity);
        context.putExtra("extra_charge_bill_error_response", chargebillerrorresponse);
        return context;
    }

    private void a(gzj gzj1)
    {
        gzj1.a(this);
    }

    private gzj d()
    {
        return gzd.a().a(new gst(getApplication())).a();
    }

    protected final volatile void a(Object obj)
    {
        a((gzj)obj);
    }

    protected final Object c()
    {
        return d();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = (ChargeBillErrorResponse)getIntent().getParcelableExtra("extra_charge_bill_error_response");
        gjz.a(b);
        d = new WebView(this);
        e = new gzf(Pattern.compile(b.getSuccessPattern()), Pattern.compile(b.getFailurePattern())) {

            final Pattern a;
            final Pattern b;
            final ZaakpayWebViewActivity c;

            public final void onPageFinished(WebView webview, String s2)
            {
                super.onPageFinished(webview, s2);
                if (!c.isFinishing() && ZaakpayWebViewActivity.a(c).isShowing())
                {
                    ZaakpayWebViewActivity.a(c).dismiss();
                }
            }

            public final void onPageStarted(WebView webview, String s2, Bitmap bitmap)
            {
                super.onPageStarted(webview, s2, bitmap);
                if (a.matcher(s2).matches())
                {
                    c.a.a(e.ao);
                    c.setResult(-1);
                    c.finish();
                } else
                if (b.matcher(s2).matches())
                {
                    c.a.a(e.an);
                    webview = null;
                    s2 = Uri.parse(s2);
                    if (s2.isHierarchical())
                    {
                        webview = s2.getQueryParameter("responseDescription");
                    }
                    s2 = webview;
                    if (TextUtils.isEmpty(webview))
                    {
                        s2 = c.getString(gsg.ub__payment_error_verifying_card);
                    }
                    Toast.makeText(c, s2, 1).show();
                    c.finish();
                    return;
                }
            }

            
            {
                c = ZaakpayWebViewActivity.this;
                a = pattern;
                b = pattern1;
                super();
            }
        };
        d.setWebViewClient(e);
        d.getSettings().setJavaScriptEnabled(true);
        if (b.getHttpMethod().equals("GET"))
        {
            bundle = Uri.parse(b.getUrl()).buildUpon();
            String s;
            for (Iterator iterator = b.getData().keySet().iterator(); iterator.hasNext(); bundle.appendQueryParameter(s, (String)b.getData().get(s)))
            {
                s = (String)iterator.next();
            }

            d.loadUrl(bundle.build().toString());
        } else
        if (b.getHttpMethod().equals("POST"))
        {
            bundle = new ArrayList();
            String s1;
            for (Iterator iterator1 = b.getData().keySet().iterator(); iterator1.hasNext(); bundle.add(new BasicNameValuePair(s1, (String)b.getData().get(s1))))
            {
                s1 = (String)iterator1.next();
            }

            d.postUrl(b.getUrl(), URLEncodedUtils.format(bundle, "UTF-8").getBytes());
        } else
        {
            throw new RuntimeException((new StringBuilder("Unsupported Zaakpay web auth HTTP method: ")).append(b.getHttpMethod()).toString());
        }
        setContentView(d);
        c = new ProgressDialog(this);
        c.setTitle(getString(gsg.ub__payment_loading));
        c.setIndeterminate(true);
        c.setCancelable(false);
        c.show();
    }

    protected void onPause()
    {
        super.onPause();
        if (c != null && c.isShowing())
        {
            c.dismiss();
        }
    }

    protected void onResume()
    {
        super.onResume();
        a.a(e.am);
        if (e.a() && !c.isShowing())
        {
            c.show();
        }
    }
}
