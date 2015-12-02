// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.webclient.app;

import android.app.Activity;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.mobileapptracker.MobileAppTracker;
import com.security.class1.Class1;
import com.security.class3.Class3;
import com.ubercab.client.core.app.RiderApplication;
import cwt;
import dfp;
import hsl;
import hsn;
import hso;
import hsp;
import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class WebClientActivity extends Activity
    implements android.view.View.OnClickListener
{

    public MobileAppTracker a;
    public Class1 b;
    public Class3 c;
    private int d;
    private boolean e;
    private WebView f;
    private ImageView g;
    private ImageButton h;

    public WebClientActivity()
    {
    }

    private void a()
    {
        Object obj = getDir("database", 0).getPath();
        Object obj1 = f.getSettings();
        ((WebSettings) (obj1)).setDatabaseEnabled(true);
        ((WebSettings) (obj1)).setDomStorageEnabled(true);
        ((WebSettings) (obj1)).setJavaScriptEnabled(true);
        ((WebSettings) (obj1)).setGeolocationEnabled(true);
        ((WebSettings) (obj1)).setCacheMode(-1);
        ((WebSettings) (obj1)).setGeolocationDatabasePath(((String) (obj)));
        f.setScrollBarStyle(0x2000000);
        if (!hsn.b())
        {
            ((WebSettings) (obj1)).setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        }
        obj = new WebChromeClient() {

            final WebClientActivity a;

            public final void onGeolocationPermissionsShowPrompt(String s2, android.webkit.GeolocationPermissions.Callback callback)
            {
                callback.invoke(s2, true, false);
            }

            
            {
                a = WebClientActivity.this;
                super();
            }
        };
        obj1 = new WebViewClient() {

            final WebClientActivity a;

            public final boolean shouldOverrideUrlLoading(WebView webview, String s2)
            {
                if (!hsp.a(s2))
                {
                    a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s2)));
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = WebClientActivity.this;
                super();
            }
        };
        Object obj2 = cwt.f(this);
        HashMap hashmap = new HashMap();
        String s = a.getGoogleAdvertisingId();
        if (!TextUtils.isEmpty(s))
        {
            hashmap.put("googleAdvertisingId", s);
        }
        try
        {
            if (!TextUtils.isEmpty(((CharSequence) (obj2))))
            {
                hashmap.put("deviceImei", obj2);
            }
            String s1 = c.Method5();
            if (!TextUtils.isEmpty(s1))
            {
                hashmap.put("permId", s1);
            }
            s1 = b.Method5();
            if (!TextUtils.isEmpty(s1))
            {
                hashmap.put("authId", s1);
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror) { }
        catch (SecurityException securityexception) { }
        obj2 = new hsl(hsn.c(), ((String) (obj2)), hashmap) {

            final String a;
            final String b;
            final Map c;
            final WebClientActivity d;

            
            {
                d = WebClientActivity.this;
                a = s;
                b = s1;
                c = map;
                super(WebClientActivity.this);
            }
        };
        f.setWebChromeClient(((WebChromeClient) (obj)));
        f.setWebViewClient(((WebViewClient) (obj1)));
        f.addJavascriptInterface(obj2, "uberNative");
    }

    static void a(WebClientActivity webclientactivity)
    {
        webclientactivity.f();
    }

    private void a(String s)
    {
        s = String.format("javascript:%s.dispatchEvent('%s')", new Object[] {
            "Uber.Gateway", s
        });
        f.loadUrl(s);
    }

    private void b()
    {
        if (!h())
        {
            g();
            return;
        } else
        {
            f.loadUrl("https://m.uber.com");
            h.setVisibility(8);
            e();
            return;
        }
    }

    private void c()
    {
        String s = hsp.a(this);
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            CookieManager cookiemanager = CookieManager.getInstance();
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, 1);
            cookiemanager.setCookie("https://m.uber.com", hso.a("token", s, calendar.getTime()));
            d();
            return;
        }
    }

    private static void d()
    {
        CookieSyncManager cookiesyncmanager = CookieSyncManager.getInstance();
        if (cookiesyncmanager != null)
        {
            cookiesyncmanager.sync();
        }
    }

    private void e()
    {
        (new Timer()).schedule(new TimerTask() {

            final WebClientActivity a;

            public final void run()
            {
                a.runOnUiThread(new Runnable(this) {

                    final _cls4 a;

                    public final void run()
                    {
                        WebClientActivity.a(a.a);
                    }

            
            {
                a = _pcls4;
                super();
            }
                });
            }

            
            {
                a = WebClientActivity.this;
                super();
            }
        }, 45000L);
    }

    private void f()
    {
        if (e)
        {
            return;
        }
        f.stopLoading();
        if (d >= 3)
        {
            d = 0;
            g();
            return;
        } else
        {
            d = d + 1;
            b();
            return;
        }
    }

    private void g()
    {
        h.setVisibility(0);
    }

    private boolean h()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)getSystemService("connectivity")).getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnectedOrConnecting();
    }

    public void onBackPressed()
    {
        if (!e)
        {
            super.onBackPressed();
            return;
        } else
        {
            a("backbutton");
            return;
        }
    }

    public void onClick(View view)
    {
        b();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        CookieSyncManager.createInstance(this);
        setContentView(0x7f03021d);
        f = (WebView)findViewById(0x7f0e06a6);
        g = (ImageView)findViewById(0x7f0e06a7);
        h = (ImageButton)findViewById(0x7f0e06a8);
        h.setOnClickListener(this);
        ((RiderApplication)getApplication()).b().a(this);
        a();
        c();
        b();
    }

    protected void onPause()
    {
        super.onPause();
        d();
        a("pause");
        if (hsn.a())
        {
            f.onPause();
        }
    }

    protected void onResume()
    {
        super.onResume();
        d();
        if (hsn.a())
        {
            f.onResume();
        }
        a("resume");
    }
}
