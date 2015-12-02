// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.facebook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.ButterKnife;
import cev;
import cic;
import czb;
import czj;
import dfp;
import djb;
import dwb;
import dwc;
import dwe;
import dwg;
import l;

public class FacebookAuthorizationFragment extends czb
{

    public cev c;
    private String d;
    View mContainerView;
    WebView mWebView;

    public FacebookAuthorizationFragment()
    {
    }

    public static FacebookAuthorizationFragment a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("url", s);
        s = new FacebookAuthorizationFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a()
    {
        mWebView.getSettings().setJavaScriptEnabled(true);
        WebViewClient webviewclient = new WebViewClient() {

            final FacebookAuthorizationFragment a;

            public final void onPageFinished(WebView webview, String s)
            {
                if (a.isResumed() && a.mContainerView != null)
                {
                    a.e();
                    a.mContainerView.setVisibility(0);
                }
            }

            public final boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                return a.d(s);
            }

            
            {
                a = FacebookAuthorizationFragment.this;
                super();
            }
        };
        mWebView.setWebViewClient(webviewclient);
        b(getString(0x7f070258));
        mWebView.loadUrl(d);
    }

    private void a(dwe dwe1)
    {
        dwe1.a(this);
    }

    private dwe b(dfp dfp)
    {
        return dwb.a().a(new djb(this)).a(dfp).a();
    }

    private static String e(String s)
    {
        s = g(s);
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = s[i];
            if (s1.startsWith("access_token"))
            {
                return s1.split("=")[1];
            }
        }

        return null;
    }

    private static long f(String s)
    {
        s = g(s);
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = s[i];
            if (s1.startsWith("expires_in"))
            {
                return Long.parseLong(s1.split("=")[1]);
            }
        }

        return 0L;
    }

    private static String[] g(String s)
    {
        return s.split("\\?|#|&");
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dwe)czj);
    }

    final boolean d(String s)
    {
        if (s.startsWith("https://www.facebook.com/connect/login_success.html#access_token"))
        {
            String s1 = e(s);
            long l1 = f(s);
            c.c(new dwg(s1, l1));
            return true;
        }
        if (s.startsWith("https://www.facebook.com/connect/login_success.html?error=access_denied"))
        {
            c.c(new dwg());
            return true;
        } else
        {
            return false;
        }
    }

    public final cic f()
    {
        return l.hc;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            d = bundle.getString("url");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030038, viewgroup, false);
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
        a();
    }
}
