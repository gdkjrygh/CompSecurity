// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.about;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czb;
import czj;
import dfp;
import djb;
import dxz;
import dya;
import dyd;
import l;

public class WebViewFragment extends czb
{

    private String c;
    private String d;
    private cic e;
    ProgressBar mProgressBarLoading;
    WebView mWebView;

    public WebViewFragment()
    {
        e = czb.a;
    }

    public static WebViewFragment a(String s, String s1)
    {
        return a(s, s1, null);
    }

    public static WebViewFragment a(String s, String s1, cic cic1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putString("url", s1);
        if (cic1 != null)
        {
            bundle.putString("analytics", cic1.name());
        }
        s = new WebViewFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a()
    {
        mWebView.getSettings().setJavaScriptEnabled(true);
        WebViewClient webviewclient = new WebViewClient() {

            final WebViewFragment a;

            public final void onPageFinished(WebView webview, String s)
            {
                if (a.isResumed())
                {
                    a.mProgressBarLoading.setVisibility(8);
                }
            }

            public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
            {
                if (a.isResumed())
                {
                    a.mProgressBarLoading.setVisibility(0);
                }
            }

            public final boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                if (s.startsWith("https://"))
                {
                    a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = WebViewFragment.this;
                super();
            }
        };
        mWebView.setWebViewClient(webviewclient);
        mWebView.loadUrl(d);
    }

    private void a(dyd dyd1)
    {
        dyd1.a(this);
    }

    private dyd b(dfp dfp)
    {
        return dxz.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dyd)czj);
    }

    public final cic f()
    {
        return e;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        d().b().a(c);
    }

    public void onCreate(Bundle bundle)
    {
        Object obj = getArguments();
        if (obj != null)
        {
            c = ((Bundle) (obj)).getString("title");
            d = ((Bundle) (obj)).getString("url");
            obj = ((Bundle) (obj)).getString("analytics");
            if (obj != null)
            {
                e = l.valueOf(((String) (obj)));
            }
        }
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030029, viewgroup, false);
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
