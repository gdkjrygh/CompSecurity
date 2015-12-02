// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import czb;
import czj;
import dfp;
import djb;
import etc;
import etd;
import etv;
import eul;
import ijg;
import l;
import n;
import org.apache.http.util.EncodingUtils;

public class PaytmAddFundsWebViewFragment extends czb
{

    public chp c;
    public cev d;
    private int e;
    private String f;
    private String g;
    ProgressBar mProgressBar;
    WebView mWebView;

    public PaytmAddFundsWebViewFragment()
    {
    }

    static PaytmAddFundsWebViewFragment a(int i, String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("source", i);
        bundle.putString("post_data", s1);
        bundle.putString("url", s);
        s = new PaytmAddFundsWebViewFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a(etv etv1)
    {
        etv1.a(this);
    }

    private etv b(dfp dfp)
    {
        return etc.a().a(new djb(this)).a(dfp).a();
    }

    private void g()
    {
        mWebView.getSettings().setJavaScriptEnabled(true);
        WebViewClient webviewclient = new WebViewClient() {

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

            
            {
                a = PaytmAddFundsWebViewFragment.this;
                super();
            }
        };
        mWebView.setWebViewClient(webviewclient);
        if (g != null)
        {
            if (f != null)
            {
                mWebView.postUrl(g, EncodingUtils.getBytes(f, "base64"));
                return;
            } else
            {
                mWebView.loadUrl(g);
                return;
            }
        } else
        {
            mProgressBar.setVisibility(8);
            c(getString(0x7f070220));
            return;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((etv)czj);
    }

    public final boolean a()
    {
        if (mWebView.canGoBack())
        {
            mWebView.goBack();
            return true;
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        switch (e)
        {
        default:
            return;

        case 1: // '\001'
            c.a(n.gt);
            return;

        case 2: // '\002'
            c.a(n.cC);
            return;

        case 3: // '\003'
            c.a(n.n);
            break;
        }
    }

    public final cic f()
    {
        l l1 = l.jw;
        switch (e)
        {
        default:
            return l1;

        case 1: // '\001'
            return l.hn;

        case 2: // '\002'
            return l.em;

        case 3: // '\003'
            return l.Q;
        }
    }

    public void onCreate(Bundle bundle)
    {
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            e = bundle1.getInt("source");
            f = bundle1.getString("post_data");
            g = bundle1.getString("url");
        }
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030119, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        g();
    }
}
