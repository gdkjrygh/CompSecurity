// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.GooglePlay;
import com.walmartlabs.utils.FileUtils;

public class UpgradeActivity extends Activity
{

    public static final String EXTRA_UNSUPPORTED = "extra_unsupported";
    public static final String EXTRA_URL = "extra_url";
    public static final String MWEB_URL = "http://m.walmart.com";
    private boolean mHasTrackedPageView;
    private boolean mIsUnsupported;

    public UpgradeActivity()
    {
    }

    private String getWebViewContent()
    {
        String s;
        if (mIsUnsupported)
        {
            s = "new_version_available_unsupported.html";
        } else
        {
            s = "new_version_available_force.html";
        }
        return FileUtils.getFileAsString(this, s);
    }

    private void trackPageView(boolean flag)
    {
        if (!mHasTrackedPageView)
        {
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "App Upgrade Notice").putString("upgradeType", "force");
            Object obj;
            if (flag)
            {
                obj = "upgrade";
            } else
            {
                obj = "dismiss";
            }
            obj = builder.putString("optionselected", ((String) (obj)));
            MessageBus.getBus().post(obj);
            mHasTrackedPageView = true;
        }
    }

    public void finish()
    {
        trackPageView(false);
        super.finish();
        kill();
    }

    void kill()
    {
        (new Handler()).postDelayed(new Runnable() {

            final UpgradeActivity this$0;

            public void run()
            {
                Process.killProcess(Process.myPid());
            }

            
            {
                this$0 = UpgradeActivity.this;
                super();
            }
        }, 300L);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0401bb);
        mIsUnsupported = getIntent().getBooleanExtra("extra_unsupported", false);
        bundle = (WebView)findViewById(0x7f1005d8);
        Object obj = bundle.getSettings();
        ((WebSettings) (obj)).setSavePassword(false);
        ((WebSettings) (obj)).setSaveFormData(false);
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        ((WebSettings) (obj)).setSupportZoom(false);
        bundle.setScrollBarStyle(0x2000000);
        bundle.setWebViewClient(new WebViewClient() {

            final UpgradeActivity this$0;

            public void onPageFinished(WebView webview, String s)
            {
                super.onPageFinished(webview, s);
                findViewById(0x7f100083).setVisibility(8);
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                return false;
            }

            
            {
                this$0 = UpgradeActivity.this;
                super();
            }
        });
        obj = getIntent().getStringExtra("extra_url");
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            bundle.loadUrl(((String) (obj)));
        } else
        if (!TextUtils.isEmpty(getWebViewContent()))
        {
            bundle.loadData(getWebViewContent(), "text/html", "utf-8");
        } else
        {
            finish();
        }
        bundle = (Button)findViewById(0x7f100094);
        if (mIsUnsupported)
        {
            bundle.setText(getString(0x7f0905a9));
        } else
        {
            bundle.setText(getString(0x7f0905a8));
        }
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final UpgradeActivity this$0;

            public void onClick(View view)
            {
                if (mIsUnsupported)
                {
                    view = new Intent("android.intent.action.VIEW", Uri.parse("http://m.walmart.com"));
                    if (view.resolveActivity(getPackageManager()) != null)
                    {
                        startActivity(view);
                    }
                } else
                {
                    new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.walmart.android"));
                    if (GooglePlay.isAvailable(UpgradeActivity.this))
                    {
                        trackPageView(true);
                        GooglePlay.launch(UpgradeActivity.this);
                        return;
                    }
                }
            }

            
            {
                this$0 = UpgradeActivity.this;
                super();
            }
        });
    }


}
