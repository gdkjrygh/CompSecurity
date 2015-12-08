// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.facebook.ads.a.b;
import com.facebook.ads.a.c;
import com.facebook.ads.a.r;
import com.facebook.ads.a.s;
import com.facebook.ads.a.v;
import com.facebook.ads.a.y;
import com.facebook.ads.a.z;

public class InterstitialAdActivity extends Activity
{

    private static final int AD_WEBVIEW_ID = 0x186a1;
    private static final int CLOSE_BUTTON_ID = 0x186a2;
    private static final int CLOSE_BUTTON_SIZE_DP = 60;
    private static final String DATA_MODEL_KEY = "dataModel";
    private static final String LAST_REQUESTED_ORIENTATION_KEY = "lastRequestedOrientation";
    private static final int ORIENTATION_REVERSE_LANDSCAPE = 8;
    private static final int ORIENTATION_REVERSE_PORTRAIT = 9;
    private static final String TAG = com/facebook/ads/InterstitialAdActivity.getSimpleName();
    private long actionTime;
    private com.facebook.ads.a.b.a actionType;
    private z adHandler;
    private WebView adWebView;
    private v closeButton;
    private long createTime;
    private y dataModel;
    private int displayHeight;
    private int displayWidth;
    private String interstitialID;
    private boolean isRestart;
    private int lastRequestedOrientation;

    public InterstitialAdActivity()
    {
        isRestart = false;
    }

    private void loadAdFromIntentOrSavedState(Intent intent, Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("dataModel"))
        {
            dataModel = y.a(bundle.getBundle("dataModel"));
            if (dataModel != null)
            {
                adWebView.loadDataWithBaseURL(s.a(), dataModel.c(), "text/html", "utf-8", null);
            }
            lastRequestedOrientation = bundle.getInt("lastRequestedOrientation", -1);
            interstitialID = bundle.getString("adInterstitialUniqueId");
            isRestart = true;
        } else
        {
            displayWidth = intent.getIntExtra("displayWidth", 0);
            displayHeight = intent.getIntExtra("displayHeight", 0);
            interstitialID = intent.getStringExtra("adInterstitialUniqueId");
            dataModel = y.b(intent);
            if (dataModel != null)
            {
                adHandler.a(dataModel);
                adWebView.loadDataWithBaseURL(s.a(), dataModel.c(), "text/html", "utf-8", null);
                return;
            }
        }
    }

    private void sendBroadcastForEvent(String s1)
    {
        s1 = new Intent((new StringBuilder()).append(s1).append(":").append(interstitialID).toString());
        LocalBroadcastManager.getInstance(this).sendBroadcast(s1);
    }

    private void setScreenOrientation(int i, int j)
    {
        if (j >= i)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = ((WindowManager)getSystemService("window")).getDefaultDisplay().getRotation();
        if (i != 0)
        {
            switch (j)
            {
            default:
                setRequestedOrientation(1);
                return;

            case 1: // '\001'
            case 2: // '\002'
                setRequestedOrientation(9);
                break;
            }
            return;
        }
        switch (j)
        {
        default:
            setRequestedOrientation(0);
            return;

        case 2: // '\002'
        case 3: // '\003'
            setRequestedOrientation(8);
            break;
        }
    }

    public void finish()
    {
        adHandler.c();
        adWebView.loadUrl("about:blank");
        adWebView.clearCache(true);
        sendBroadcastForEvent("com.facebook.ads.interstitial.dismissed");
        c.a(b.a(createTime, com.facebook.ads.a.b.a.c));
        super.finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        createTime = System.currentTimeMillis();
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        RelativeLayout relativelayout = new RelativeLayout(this);
        adWebView = new WebView(this);
        adWebView.setId(0x186a1);
        adWebView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        s.a(adWebView, new a(null), new r());
        relativelayout.addView(adWebView);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("useNativeCloseButton", false))
        {
            closeButton = new v(this);
            closeButton.setId(0x186a2);
            Object obj = getResources().getDisplayMetrics();
            obj = new android.widget.RelativeLayout.LayoutParams((int)(((DisplayMetrics) (obj)).density * 60F), (int)(((DisplayMetrics) (obj)).density * 60F));
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
            closeButton.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            closeButton.setOnClickListener(new _cls1());
            relativelayout.addView(closeButton);
        }
        adHandler = new z(adWebView, new _cls2(), 1000L, this);
        setContentView(relativelayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        loadAdFromIntentOrSavedState(intent, bundle);
        sendBroadcastForEvent("com.facebook.ads.interstitial.displayed");
        adHandler.h();
    }

    public void onRestart()
    {
        super.onRestart();
        isRestart = true;
    }

    public void onResume()
    {
        super.onResume();
        if (actionTime > 0L && actionType != null)
        {
            c.a(b.a(actionTime, actionType));
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (dataModel != null)
        {
            bundle.putBundle("dataModel", dataModel.i());
        }
        bundle.putInt("lastRequestedOrientation", lastRequestedOrientation);
        bundle.putString("adInterstitialUniqueId", interstitialID);
    }

    public void onStart()
    {
        super.onStart();
        if (isRestart) goto _L2; else goto _L1
_L1:
        setScreenOrientation(displayWidth, displayHeight);
_L4:
        isRestart = false;
        return;
_L2:
        if (lastRequestedOrientation >= 0)
        {
            setRequestedOrientation(lastRequestedOrientation);
            lastRequestedOrientation = -1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setRequestedOrientation(int i)
    {
        lastRequestedOrientation = i;
        super.setRequestedOrientation(i);
    }





/*
    static com.facebook.ads.a.b.a access$302(InterstitialAdActivity interstitialadactivity, com.facebook.ads.a.b.a a)
    {
        interstitialadactivity.actionType = a;
        return a;
    }

*/


/*
    static long access$402(InterstitialAdActivity interstitialadactivity, long l)
    {
        interstitialadactivity.actionTime = l;
        return l;
    }

*/


    private class a extends WebViewClient
    {

        final InterstitialAdActivity a;

        public void onLoadResource(WebView webview, String s1)
        {
            a.adHandler.f();
        }

        public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            if (p.a())
            {
                sslerrorhandler.proceed();
                return;
            } else
            {
                sslerrorhandler.cancel();
                return;
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            webview = Uri.parse(s1);
            if ("fbad".equals(webview.getScheme()) && "close".equals(webview.getAuthority()))
            {
                a.finish();
            } else
            {
                a.sendBroadcastForEvent("com.facebook.ads.interstitial.clicked");
                webview = com.facebook.ads.a.a.b.a(a, webview);
                if (webview != null)
                {
                    try
                    {
                        a.actionType = webview.a();
                        a.actionTime = System.currentTimeMillis();
                        webview.a(null);
                    }
                    // Misplaced declaration of an exception variable
                    catch (WebView webview)
                    {
                        Log.e(InterstitialAdActivity.TAG, "Error executing action", webview);
                        return true;
                    }
                    return true;
                }
            }
            return true;
        }

        private a()
        {
            a = InterstitialAdActivity.this;
            super();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final InterstitialAdActivity a;

        public void onClick(View view)
        {
            a.finish();
        }

        _cls1()
        {
            a = InterstitialAdActivity.this;
            super();
        }
    }


    private class _cls2
        implements com.facebook.ads.a.f.a
    {

        final InterstitialAdActivity a;

        public boolean a()
        {
            return true;
        }

        public void b()
        {
        }

        public void c()
        {
            a.sendBroadcastForEvent("com.facebook.ads.interstitial.impression.logged");
        }

        public boolean d()
        {
            return false;
        }

        _cls2()
        {
            a = InterstitialAdActivity.this;
            super();
        }
    }

}
