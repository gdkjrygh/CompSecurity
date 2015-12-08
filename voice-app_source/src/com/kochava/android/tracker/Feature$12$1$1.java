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
//            WebAdView, Feature

class this._cls2
    implements android.view.tener
{

    final ion this$2;

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

    adWebview()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/kochava/android/tracker/Feature$12

/* anonymous class */
    class Feature._cls12 extends Thread
    {

        final Feature this$0;
        final WebView val$adWebview;
        final Activity val$context;
        final int val$height;
        final int val$width;

        public void run()
        {
            Object obj;
            final String clickUrl;
            Object obj1;
            clickUrl = "";
            obj1 = context.getPackageManager();
            char ac[];
            Matcher matcher;
            int i;
            try
            {
                obj = ((PackageManager) (obj1)).getApplicationInfo(Feature.access$3700(Feature.this), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = null;
            }
            if (obj != null)
            {
                obj = ((PackageManager) (obj1)).getApplicationLabel(((android.content.pm.ApplicationInfo) (obj)));
            } else
            {
                obj = "(unknown)";
            }
            obj = (String)(String)obj;
            obj1 = Feature.access$200(false);
            if (Feature.access$3800() == null || Feature.access$3800().trim().isEmpty())
            {
                Feature.access$3802("bidder.kochava.com");
            }
            obj1 = ((HttpClient) (obj1)).execute(new HttpGet((new StringBuilder()).append("https://").append(Feature.access$3800()).append("/adserver/request/").append("?w=").append(width).append("&h=").append(height).append("&odin=").append(Feature.access$3900(Feature.this)).append("&aid=").append(Feature.access$500()).append("&an=").append(((String) (obj))).append("&av=").append("Android20150511").append(Feature.versionExtension).append("&kochava_device_id=").append(Feature.access$1800()).toString())).getEntity();
            obj = clickUrl;
            if (obj1 == null) goto _L2; else goto _L1
_L1:
            obj = new InputStreamReader(((HttpEntity) (obj1)).getContent(), "ISO-8859-1");
            obj1 = new StringBuilder();
            ac = new char[1024];
_L5:
            i = ((Reader) (obj)).read(ac);
            if (i == -1) goto _L4; else goto _L3
_L3:
            ((StringBuilder) (obj1)).append(ac, 0, i);
              goto _L5
            obj;
_L8:
            if (obj.getClass().equals(javax/net/ssl/SSLException))
            {
                Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(obj).toString());
                Feature.access$1500(((Exception) (obj)));
            } else
            {
                Logging.LogError((new StringBuilder()).append("Problem grabbing ad: ").append(((IOException) (obj)).getMessage()).toString());
            }
            ((IOException) (obj)).printStackTrace();
            obj = clickUrl;
_L2:
            clickUrl = "";
            obj1 = "";
            Logging.Log((new StringBuilder()).append("Response:").append(((String) (obj))).toString());
            matcher = Pattern.compile("href='(.*?)'").matcher(((CharSequence) (obj)));
            if (matcher.find())
            {
                clickUrl = matcher.group(1);
            }
            matcher = Pattern.compile("src='(.*?)'").matcher(((CharSequence) (obj)));
            obj = obj1;
            if (matcher.find())
            {
                obj = matcher.group(1);
            }
            obj = ((Feature._cls12._cls1) (obj)). new Feature._cls12._cls1();
            context.runOnUiThread(((Runnable) (obj)));
            return;
_L4:
            obj = ((StringBuilder) (obj1)).toString();
              goto _L2
            obj;
_L6:
            Logging.LogError((new StringBuilder()).append("Problem grabbing ad: ").append(((NoSuchAlgorithmException) (obj)).getMessage()).toString());
            ((NoSuchAlgorithmException) (obj)).printStackTrace();
            obj = clickUrl;
              goto _L2
            obj;
              goto _L6
            obj;
            if (true) goto _L8; else goto _L7
_L7:
        }

            
            {
                this$0 = final_feature;
                context = activity;
                width = i;
                height = j;
                adWebview = WebView.this;
                super();
            }
    }


    // Unreferenced inner class com/kochava/android/tracker/Feature$12$1

/* anonymous class */
    class Feature._cls12._cls1 extends Thread
    {

        final Feature._cls12 this$1;
        final String val$clickUrl;
        final String val$fAdUrl;

        public void run()
        {
            adWebview.setVerticalScrollBarEnabled(false);
            adWebview.setHorizontalScrollBarEnabled(false);
            adWebview.getSettings().setBuiltInZoomControls(false);
            adWebview.setOnTouchListener(new Feature._cls12._cls1._cls1());
            adWebview.getSettings().setJavaScriptEnabled(true);
            Logging.Log((new StringBuilder()).append("Loading add ").append(fAdUrl).toString());
            adWebview.loadUrl(fAdUrl);
        }

            
            {
                this$1 = final__pcls12;
                clickUrl = s;
                fAdUrl = String.this;
                super();
            }
    }

}
