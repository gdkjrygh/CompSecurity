// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import java.io.File;
import java.util.Map;

// Referenced classes of package com.urbanairship.widget:
//            UAWebViewClient

public class UAWebView extends WebView
{

    private static final String CACHE_DIRECTORY = "urbanairship";
    private String currentClientAuthRequestUrl;
    private WebViewClient webViewClient;

    public UAWebView(Context context)
    {
        super(context);
        if (!isInEditMode())
        {
            init();
        }
    }

    public UAWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (!isInEditMode())
        {
            init();
        }
    }

    public UAWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (!isInEditMode())
        {
            init();
        }
    }

    private String getCachePath()
    {
        File file = new File(UAirship.shared().getApplicationContext().getCacheDir(), "urbanairship");
        if (!file.exists())
        {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    WebViewClient getWebViewClient()
    {
        return webViewClient;
    }

    void init()
    {
        WebSettings websettings = getSettings();
        if (android.os.Build.VERSION.SDK_INT >= 7)
        {
            websettings.setAppCacheEnabled(true);
            websettings.setAppCachePath(getCachePath());
            websettings.setDomStorageEnabled(true);
        }
        websettings.setAllowFileAccess(true);
        websettings.setJavaScriptEnabled(true);
        websettings.setCacheMode(-1);
        initializeView();
        populateCustomJavascriptInterfaces();
    }

    protected void initializeView()
    {
    }

    public void loadData(String s, String s1, String s2)
    {
        onPreLoad();
        super.loadData(s, s1, s2);
    }

    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
    {
        onPreLoad();
        super.loadDataWithBaseURL(s, s1, s2, s3, s4);
    }

    public void loadUrl(String s)
    {
        onPreLoad();
        super.loadUrl(s);
    }

    public void loadUrl(String s, Map map)
    {
        onPreLoad();
        super.loadUrl(s, map);
    }

    final void onPreLoad()
    {
        if (getWebViewClient() == null)
        {
            Logger.info("No web view client set, setting a default UAWebViewClient for landing page view.");
            setWebViewClient(new UAWebViewClient());
        }
        if (currentClientAuthRequestUrl != null && getWebViewClient() != null && (getWebViewClient() instanceof UAWebViewClient))
        {
            ((UAWebViewClient)getWebViewClient()).removeAuthRequestCredentials(currentClientAuthRequestUrl);
            currentClientAuthRequestUrl = null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            int i = getScrollY();
            int j = getScrollX();
            onScrollChanged(j, i, j, i);
        }
        return super.onTouchEvent(motionevent);
    }

    protected void populateCustomJavascriptInterfaces()
    {
    }

    void setClientAuthRequest(String s, String s1, String s2)
    {
        if (s != null)
        {
            currentClientAuthRequestUrl = s;
            if (getWebViewClient() != null && (getWebViewClient() instanceof UAWebViewClient))
            {
                ((UAWebViewClient)getWebViewClient()).addAuthRequestCredentials(Uri.parse(s).getHost(), s1, s2);
                return;
            }
        }
    }

    public void setWebViewClient(WebViewClient webviewclient)
    {
        if (!(webviewclient instanceof UAWebViewClient))
        {
            Logger.warn("The web view client should extend UAWebViewClient to support urban airship url overrides and triggering actions from.");
        }
        webViewClient = webviewclient;
        super.setWebViewClient(webviewclient);
    }
}
