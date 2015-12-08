// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.kochava.android.util.Logging;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.kochava.android.tracker:
//            Feature, WebAdView

class val.adWebview extends Thread
{

    final Feature this$0;
    final WebView val$adWebview;
    final Activity val$context;
    final int val$height;
    final int val$width;

    public void run()
    {
        final Object fAdUrl;
        final String clickUrl;
        Object obj;
        clickUrl = "";
        obj = val$context.getPackageManager();
        char ac[];
        Matcher matcher;
        int i;
        try
        {
            fAdUrl = ((PackageManager) (obj)).getApplicationInfo(Feature.access$3700(Feature.this), 0);
        }
        // Misplaced declaration of an exception variable
        catch (final Object fAdUrl)
        {
            fAdUrl = null;
        }
        if (fAdUrl != null)
        {
            fAdUrl = ((PackageManager) (obj)).getApplicationLabel(((android.content.pm.ApplicationInfo) (fAdUrl)));
        } else
        {
            fAdUrl = "(unknown)";
        }
        fAdUrl = (String)(String)fAdUrl;
        obj = Feature.access$200(false);
        if (Feature.access$3800() == null || Feature.access$3800().trim().isEmpty())
        {
            Feature.access$3802("bidder.kochava.com");
        }
        obj = ((HttpClient) (obj)).execute(new HttpGet((new StringBuilder()).append("https://").append(Feature.access$3800()).append("/adserver/request/").append("?w=").append(val$width).append("&h=").append(val$height).append("&odin=").append(Feature.access$3900(Feature.this)).append("&aid=").append(Feature.access$500()).append("&an=").append(((String) (fAdUrl))).append("&av=").append("Android20150511").append(Feature.versionExtension).append("&kochava_device_id=").append(Feature.access$1800()).toString())).getEntity();
        fAdUrl = clickUrl;
        if (obj == null) goto _L2; else goto _L1
_L1:
        fAdUrl = new InputStreamReader(((HttpEntity) (obj)).getContent(), "ISO-8859-1");
        obj = new StringBuilder();
        ac = new char[1024];
_L5:
        i = ((Reader) (fAdUrl)).read(ac);
        if (i == -1) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj)).append(ac, 0, i);
          goto _L5
        fAdUrl;
_L8:
        if (fAdUrl.getClass().equals(javax/net/ssl/SSLException))
        {
            Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(fAdUrl).toString());
            Feature.access$1500(((Exception) (fAdUrl)));
        } else
        {
            Logging.LogError((new StringBuilder()).append("Problem grabbing ad: ").append(((IOException) (fAdUrl)).getMessage()).toString());
        }
        ((IOException) (fAdUrl)).printStackTrace();
        fAdUrl = clickUrl;
_L2:
        clickUrl = "";
        obj = "";
        Logging.Log((new StringBuilder()).append("Response:").append(((String) (fAdUrl))).toString());
        matcher = Pattern.compile("href='(.*?)'").matcher(((CharSequence) (fAdUrl)));
        if (matcher.find())
        {
            clickUrl = matcher.group(1);
        }
        matcher = Pattern.compile("src='(.*?)'").matcher(((CharSequence) (fAdUrl)));
        fAdUrl = obj;
        if (matcher.find())
        {
            fAdUrl = matcher.group(1);
        }
        fAdUrl = new Thread() {

            final Feature._cls12 this$1;
            final String val$clickUrl;
            final String val$fAdUrl;

            public void run()
            {
                adWebview.setVerticalScrollBarEnabled(false);
                adWebview.setHorizontalScrollBarEnabled(false);
                adWebview.getSettings().setBuiltInZoomControls(false);
                adWebview.setOnTouchListener(new android.view.View.OnTouchListener() {

                    final _cls1 this$2;

                    public boolean onTouch(View view, MotionEvent motionevent)
                    {
                        int i = (int)motionevent.getRawX();
                        int j = (int)motionevent.getRawY();
                        int ai[] = new int[2];
                        view.getLocationOnScreen(ai);
                        int k = ai[0];
                        int l = view.getWidth();
                        int i1 = ai[1];
                        int j1 = view.getHeight();
                        if (motionevent.getAction() == 1 && i > ai[0] && i < k + l && j > ai[1] && j < i1 + j1)
                        {
                            view = new Intent(context, com/kochava/android/tracker/WebAdView);
                            motionevent = new Bundle();
                            motionevent.putString("URL", clickUrl);
                            view.putExtras(motionevent);
                            context.startActivity(view);
                            if (context.getResources().getIdentifier("slide_up", "anim", context.getPackageName()) != 0)
                            {
                                context.overridePendingTransition(context.getResources().getIdentifier("slide_up", "anim", context.getPackageName()), context.getResources().getIdentifier("stay", "anim", context.getPackageName()));
                            } else
                            {
                                context.overridePendingTransition(0x10a0002, 0x10a0001);
                            }
                        }
                        return true;
                    }

            
            {
                this$2 = _cls1.this;
                super();
            }
                });
                adWebview.getSettings().setJavaScriptEnabled(true);
                Logging.Log((new StringBuilder()).append("Loading add ").append(fAdUrl).toString());
                adWebview.loadUrl(fAdUrl);
            }

            
            {
                this$1 = Feature._cls12.this;
                clickUrl = s;
                fAdUrl = s1;
                super();
            }
        };
        val$context.runOnUiThread(((Runnable) (fAdUrl)));
        return;
_L4:
        fAdUrl = ((StringBuilder) (obj)).toString();
          goto _L2
        fAdUrl;
_L6:
        Logging.LogError((new StringBuilder()).append("Problem grabbing ad: ").append(((NoSuchAlgorithmException) (fAdUrl)).getMessage()).toString());
        ((NoSuchAlgorithmException) (fAdUrl)).printStackTrace();
        fAdUrl = clickUrl;
          goto _L2
        fAdUrl;
          goto _L6
        fAdUrl;
        if (true) goto _L8; else goto _L7
_L7:
    }

    _cls1.val.fAdUrl()
    {
        this$0 = final_feature;
        val$context = activity;
        val$width = i;
        val$height = j;
        val$adWebview = WebView.this;
        super();
    }
}
