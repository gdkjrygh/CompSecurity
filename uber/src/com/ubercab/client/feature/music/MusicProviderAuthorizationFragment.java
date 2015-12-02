// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.rider.realtime.model.Client;
import czb;
import czj;
import dfp;
import djb;
import egf;
import egg;
import egx;
import egy;
import eio;
import ejs;
import hkr;
import l;

public class MusicProviderAuthorizationFragment extends czb
    implements android.content.DialogInterface.OnCancelListener
{

    public chp c;
    public cev d;
    public hkr e;
    private TunesProvider f;
    WebView mWebView;

    public MusicProviderAuthorizationFragment()
    {
    }

    static MusicProviderAuthorizationFragment a(TunesProvider tunesprovider)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.ubercab.MUSIC_PROVIDER", tunesprovider);
        tunesprovider = new MusicProviderAuthorizationFragment();
        tunesprovider.setArguments(bundle);
        return tunesprovider;
    }

    private void a()
    {
        mWebView.getSettings().setJavaScriptEnabled(true);
        Object obj = new WebViewClient() {

            final MusicProviderAuthorizationFragment a;

            public final void onPageFinished(WebView webview, String s)
            {
                if (a.isAdded())
                {
                    a.mWebView.setVisibility(0);
                    a.e();
                }
            }

            public final boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                return a.a(s);
            }

            
            {
                a = MusicProviderAuthorizationFragment.this;
                super();
            }
        };
        mWebView.setWebViewClient(((WebViewClient) (obj)));
        if (e.c() == null)
        {
            obj = null;
        } else
        {
            obj = e.c().getEmail();
        }
        obj = f.getAuthUrl(getResources(), ((String) (obj)));
        a(getString(0x7f070296), ((android.content.DialogInterface.OnCancelListener) (this)));
        mWebView.loadUrl(((String) (obj)));
        if ("rdio".equals(f.getId()))
        {
            c.a(l.dj);
        }
    }

    private void a(eio eio1)
    {
        eio1.a(this);
    }

    private eio b(dfp dfp)
    {
        return egx.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eio)czj);
    }

    final boolean a(String s)
    {
        if (s.startsWith(f.getAuthRedirectUri()))
        {
            s = f.getAuthorizationCode(s);
            if (s != null)
            {
                d.c(new egg(s));
            } else
            {
                d.c(new egf());
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        d.c(new ejs());
        mWebView.stopLoading();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        f = (TunesProvider)getArguments().getParcelable("com.ubercab.MUSIC_PROVIDER");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ac, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a();
    }
}
