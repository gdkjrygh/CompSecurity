// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.RelativeLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.kochava.android.tracker:
//            Global, Feature

public class WebAdView extends Activity
{
    private class MyPictureListener
        implements android.webkit.WebView.PictureListener
    {

        final WebAdView this$0;

        public void onNewPicture(WebView webview, Picture picture)
        {
            if (mDialog.isShowing())
            {
                mDialog.dismiss();
            }
        }

        private MyPictureListener()
        {
            this$0 = WebAdView.this;
            super();
        }

    }


    Activity activity;
    boolean finishedLoad;
    ProgressDialog mDialog;
    boolean startLoad;

    public WebAdView()
    {
        startLoad = false;
        finishedLoad = false;
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        mDialog.dismiss();
        if (Global.DEBUG)
        {
            Log.i("KochavaAds", "Back pressed.");
        }
        if (Feature.appContext.getResources().getIdentifier("slide_down", "anim", getPackageName()) != 0)
        {
            overridePendingTransition(Feature.appContext.getResources().getIdentifier("stay", "anim", getPackageName()), Feature.appContext.getResources().getIdentifier("slide_down", "anim", getPackageName()));
            return;
        } else
        {
            overridePendingTransition(0, 0x10a0003);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        activity = this;
        Object obj = getIntent().getExtras().getString("URL");
        bundle = new WebView(this);
        bundle.loadUrl(((String) (obj)));
        bundle.getSettings().setJavaScriptEnabled(true);
        bundle.getSettings().setBuiltInZoomControls(true);
        bundle.setPictureListener(new MyPictureListener());
        bundle.setWebViewClient(new WebViewClient() {

            final WebAdView this$0;

            public void onPageStarted(WebView webview, String s, Bitmap bitmap)
            {
                super.onPageStarted(webview, s, bitmap);
                if (Global.DEBUG)
                {
                    Log.i("KochavaAds", (new StringBuilder()).append("onPageStart Url = ").append(s).toString());
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                if (Global.DEBUG)
                {
                    Log.i("KochavaAds", (new StringBuilder()).append("shouldOverrideUrlLoading Url = ").append(s).toString());
                }
                if (s.contains("market://"))
                {
                    webview = "";
                    s = Pattern.compile("\\?p=(.*)").matcher(s);
                    if (s.find())
                    {
                        webview = s.group(1);
                    }
                    if (Global.DEBUG)
                    {
                        Log.i("KochavaAds", (new StringBuilder()).append("LOADING: https://market.android.com/details?id=").append(webview).toString());
                    }
                    s = new Intent("android.intent.action.VIEW");
                    s.setData(Uri.parse((new StringBuilder()).append("https://market.android.com/details?id=").append(webview).toString()));
                    activity.startActivity(s);
                    activity.finish();
                    return true;
                } else
                {
                    webview.loadUrl(s);
                    return true;
                }
            }

            
            {
                this$0 = WebAdView.this;
                super();
            }
        });
        requestWindowFeature(1);
        obj = new RelativeLayout(this);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((RelativeLayout) (obj)).setPadding(10, 10, 10, 10);
        Button button = new Button(this);
        button.setText("Close");
        button.setBackgroundColor(0xff000000);
        button.setTextColor(-1);
        button.setPadding(7, 3, 7, 5);
        ShapeDrawable shapedrawable = new ShapeDrawable(new RoundRectShape(new float[] {
            0.0F, 0.0F, 0.0F, 0.0F, 5F, 5F, 0.0F, 0.0F
        }, null, null));
        shapedrawable.setPadding(7, 3, 7, 5);
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(new int[0], shapedrawable);
        button.setBackgroundDrawable(statelistdrawable);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final WebAdView this$0;

            public void onClick(View view)
            {
                onBackPressed();
            }

            
            {
                this$0 = WebAdView.this;
                super();
            }
        });
        if (bundle.getParent() != null)
        {
            ((ViewGroup)bundle.getParent()).removeView(bundle);
        }
        ((RelativeLayout) (obj)).addView(bundle);
        ((RelativeLayout) (obj)).addView(button);
        setContentView(((View) (obj)), layoutparams);
        mDialog = new ProgressDialog(this);
        mDialog.setCancelable(true);
        mDialog.setCanceledOnTouchOutside(false);
        mDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final WebAdView this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                if (Global.DEBUG)
                {
                    Log.i("KochavaAds", "Back pressed during loading dialog.");
                }
                activity.onBackPressed();
            }

            
            {
                this$0 = WebAdView.this;
                super();
            }
        });
        mDialog.setMessage("Loading...");
        mDialog.show();
    }
}
