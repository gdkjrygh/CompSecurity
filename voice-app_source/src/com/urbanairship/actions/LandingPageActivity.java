// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.util.ManifestUtils;
import com.urbanairship.util.UAStringUtil;
import com.urbanairship.widget.LandingPageWebView;
import com.urbanairship.widget.UAWebViewClient;

public class LandingPageActivity extends Activity
{

    public static final String LANDING_PAGE_BACKGROUND_COLOR = "com.urbanairship.LANDING_PAGE_BACKGROUND_COLOR";
    private static final long LANDING_PAGE_RETRY_DELAY_MS = 20000L;
    public static final String LANDING_PAGE_VIEW_KEY = "com.urbanairship.action.LANDING_PAGE_VIEW";
    public static final String PARENT_ACTIVITY_KEY = "android.support.PARENT_ACTIVITY";
    private Integer error;
    private Handler handler;
    private ActivityInfo info;
    private String url;
    private LandingPageWebView webView;
    private int webViewBackgroundColor;

    public LandingPageActivity()
    {
        error = null;
        webViewBackgroundColor = -1;
    }

    private View createDefaultLandingPageView()
    {
        FrameLayout framelayout = new FrameLayout(this);
        Object obj = new LandingPageWebView(this);
        ((LandingPageWebView) (obj)).setId(0x102000c);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutparams.gravity = 17;
        framelayout.addView(((View) (obj)), layoutparams);
        obj = new ProgressBar(this);
        ((ProgressBar) (obj)).setIndeterminate(true);
        ((ProgressBar) (obj)).setId(0x102000d);
        layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 17;
        framelayout.addView(((View) (obj)), layoutparams);
        return framelayout;
    }

    private void crossFade(View view, final View out)
    {
        if (android.os.Build.VERSION.SDK_INT < 12)
        {
            if (view != null)
            {
                view.setVisibility(0);
            }
            if (out != null)
            {
                out.setVisibility(8);
            }
        } else
        {
            if (view != null)
            {
                view.animate().alpha(1.0F).setDuration(200L);
            }
            if (out != null)
            {
                out.animate().alpha(0.0F).setDuration(200L).setListener(new AnimatorListenerAdapter() {

                    final LandingPageActivity this$0;
                    final View val$out;

                    public void onAnimationEnd(Animator animator)
                    {
                        out.setVisibility(8);
                    }

            
            {
                this$0 = LandingPageActivity.this;
                out = view;
                super();
            }
                });
                return;
            }
        }
    }

    private boolean launchParentActivity()
    {
        String s = null;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            s = info.parentActivityName;
        }
        String s1 = s;
        if (s == null)
        {
            s1 = s;
            if (info.metaData != null)
            {
                s1 = info.metaData.getString("android.support.PARENT_ACTIVITY");
            }
        }
        if (s1 == null)
        {
            Logger.warn("Parent activity is not defined for action activity.");
            return false;
        }
        try
        {
            Logger.info("Launching parent activity.");
            Intent intent = new Intent();
            intent.setClassName(this, s1);
            startActivity(intent);
        }
        catch (Exception exception)
        {
            Logger.error("Failed to launch parent activity.  Make sure the android.support.PARENT_ACTIVITY metadata value and parentActivityName attribute are set for the landing page activityin the AndroidManifest.xml");
            return false;
        }
        return true;
    }

    private void restartActivity(Uri uri, Bundle bundle)
    {
        Logger.info("Relaunching activity");
        finish();
        uri = (new Intent()).setClass(this, getClass()).setData(uri).setFlags(0x10000000);
        if (bundle != null)
        {
            uri.putExtras(bundle);
        }
        startActivity(uri);
    }

    protected void loadLandingPage()
    {
        loadLandingPage(0L);
    }

    protected void loadLandingPage(long l)
    {
        if (webView == null)
        {
            return;
        }
        webView.stopLoading();
        if (l > 0L)
        {
            handler.postAtTime(new Runnable() {

                final LandingPageActivity this$0;

                public void run()
                {
                    loadLandingPage(0L);
                }

            
            {
                this$0 = LandingPageActivity.this;
                super();
            }
            }, url, SystemClock.uptimeMillis() + l);
            return;
        }
        Logger.info((new StringBuilder()).append("Loading landing page: ").append(url).toString());
        if (webViewBackgroundColor != -1)
        {
            webView.setBackgroundColor(webViewBackgroundColor);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                webView.setLayerType(1, null);
            }
        }
        error = null;
        webView.loadUrl(getIntent().getDataString());
    }

    public void onCloseButtonClick(View view)
    {
        finish();
    }

    public final void onCreate(final Bundle progressBar)
    {
        super.onCreate(progressBar);
        Intent intent = getIntent();
        if (intent == null)
        {
            Logger.warn("Started Action Activity with null intent");
            finish();
            return;
        }
        info = ManifestUtils.getActivityInfo(getClass());
        if (info.metaData == null)
        {
            progressBar = new Bundle();
        } else
        {
            progressBar = info.metaData;
        }
        webViewBackgroundColor = progressBar.getInt("com.urbanairship.LANDING_PAGE_BACKGROUND_COLOR", -1);
        url = getIntent().getDataString();
        handler = new Handler();
        if (UAStringUtil.isEmpty(url))
        {
            Logger.warn("No landing page url to load.");
            finish();
            return;
        }
        if (isTaskRoot() && launchParentActivity())
        {
            restartActivity(intent.getData(), intent.getExtras());
            return;
        }
        int i = progressBar.getInt("com.urbanairship.action.LANDING_PAGE_VIEW", -1);
        if (i != -1)
        {
            setContentView(i);
        } else
        {
            setContentView(createDefaultLandingPageView());
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            progressBar = getActionBar();
            if (progressBar != null)
            {
                progressBar.setDisplayOptions(4, 4);
            }
        }
        webView = (LandingPageWebView)findViewById(0x102000c);
        progressBar = (ProgressBar)findViewById(0x102000d);
        if (webView != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                webView.setAlpha(0.0F);
            } else
            {
                webView.setVisibility(4);
            }
            webView.setWebViewClient(new UAWebViewClient() {

                final LandingPageActivity this$0;
                final ProgressBar val$progressBar;

                public void onPageFinished(WebView webview, String s)
                {
                    super.onPageFinished(webview, s);
                    if (error != null)
                    {
                        switch (error.intValue())
                        {
                        default:
                            error = null;
                            webView.loadData("", "text/html", null);
                            return;

                        case -8: 
                        case -6: 
                        case -1: 
                            loadLandingPage(20000L);
                            break;
                        }
                        return;
                    }
                    if (webViewBackgroundColor != -1)
                    {
                        webView.setBackgroundColor(webViewBackgroundColor);
                    }
                    crossFade(webView, progressBar);
                }

                public void onReceivedError(WebView webview, int j, String s, String s1)
                {
                    if (s1 != null && s1.equals(getIntent().getDataString()))
                    {
                        Logger.error((new StringBuilder()).append("Failed to load landing page ").append(s1).append(" with error ").append(j).append(" ").append(s).toString());
                        error = Integer.valueOf(j);
                    }
                }

            
            {
                this$0 = LandingPageActivity.this;
                progressBar = progressbar;
                super();
            }
            });
            return;
        } else
        {
            Logger.error("A LandingPageWebView with id android.R.id.primary is not defined in the custom layout.  Unable to show the landing page.");
            finish();
            return;
        }
    }

    public void onNewIntent(Intent intent)
    {
        Logger.info("New intent received for landing page activity");
        restartActivity(intent.getData(), intent.getExtras());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return false;
        }
    }

    public void onPause()
    {
        super.onPause();
        if (android.os.Build.VERSION.SDK_INT >= 11 && webView != null)
        {
            webView.onPause();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (android.os.Build.VERSION.SDK_INT >= 11 && webView != null)
        {
            webView.onResume();
        }
    }

    protected void onStart()
    {
        super.onStart();
        UAirship.shared().getAnalytics().activityStarted(this);
        loadLandingPage();
    }

    protected void onStop()
    {
        super.onStop();
        UAirship.shared().getAnalytics().activityStopped(this);
        webView.stopLoading();
        handler.removeCallbacksAndMessages(url);
    }



/*
    static Integer access$002(LandingPageActivity landingpageactivity, Integer integer)
    {
        landingpageactivity.error = integer;
        return integer;
    }

*/



}
