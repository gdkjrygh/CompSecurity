// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.baidu;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
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
import dvr;
import dvv;
import dvw;
import dvx;

public class BaiduAuthorizationFragment extends czb
{

    public cev c;
    private String d;
    private String e;
    View mContainerView;
    WebView mWebView;

    public BaiduAuthorizationFragment()
    {
    }

    public static BaiduAuthorizationFragment a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("arg_redirect_uri", s);
        s = new BaiduAuthorizationFragment();
        s.setArguments(bundle);
        return s;
    }

    private static String a(String s, String s1)
    {
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            return Uri.parse(s).getQueryParameter(s1);
        } else
        {
            return null;
        }
    }

    private void a(dvr dvr1)
    {
        dvr1.a(this);
    }

    private dvr b(dfp dfp)
    {
        return dvv.a().a(dfp).a(new djb(this)).a();
    }

    private void b()
    {
        mWebView.getSettings().setJavaScriptEnabled(true);
        WebViewClient webviewclient = new WebViewClient() {

            final BaiduAuthorizationFragment a;

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
                a.d(s);
                return super.shouldOverrideUrlLoading(webview, s);
            }

            
            {
                a = BaiduAuthorizationFragment.this;
                super();
            }
        };
        mWebView.setWebViewClient(webviewclient);
        mWebView.loadUrl(e);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dvr)czj);
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

    final void d(String s)
    {
        if (s.startsWith(d))
        {
            s = a(s, "code");
            cev cev1 = c;
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cev1.c(dvx.a(s, flag));
        }
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            d = bundle.getString("arg_redirect_uri");
            e = getString(0x7f0706b2, new Object[] {
                getString(0x7f0706b1), d
            });
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030037, viewgroup, false);
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
        b();
    }
}
