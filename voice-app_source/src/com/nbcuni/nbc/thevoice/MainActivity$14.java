// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity, PopupActivity

class this._cls0 extends WebViewClient
{

    final MainActivity this$0;

    private WebResourceResponse getUtf8EncodedCssWebResourceResponse(InputStream inputstream)
    {
        return new WebResourceResponse("text/css", "UTF-8", inputstream);
    }

    public void onPageFinished(WebView webview, String s)
    {
        MainActivity.access$14(MainActivity.this).loadUrl((new StringBuilder("javascript: window.nativeWrapper = window.nativeWrapper || {}; window.nativeWrapper.os= \"Android\"; window.nativeWrapper.name=\"")).append(getString(0x7f080049)).append("\"; window.nativeWrapper.osVersion=\"").append(MainActivity.access$24(MainActivity.this)).append("\"; window.nativeWrapper.version=\"").append(VERSION).append("\"; window.nativeWrapper.deviceModel=\"").append(getDeviceModel()).append("\"; window.nativeWrapper.capabilities= ['").append(MainActivity.access$25(MainActivity.this)).append("']; window.nativeWrapper.pushEnabled=").append(MainActivity.access$13(MainActivity.this).getBoolean("push", true)).append("; window.nativeWrapper.serverUrl=\"").append(backendUrl).append("\"; window.nativeWrapper.timeZone=\"").append(getTimeZone()).append("\"; window.nativeWrapper.gatekeeperTimestamp=\"").append(gatekeeperTimestamp).append("\"; window.nativeWrapper.gatekeeperResponse=JSON.parse('").append(backendResponse).append("');").toString());
        MainActivity.access$14(MainActivity.this).loadUrl("javascript: window.nativeWrapper.sendMessage = function(messageObject) {NBCHandler.parseMessageObject(JSON.stringify(messageObject));}");
        MainActivity.access$14(MainActivity.this).loadUrl("javascript: if(nativeWrapper.onMessage){ nativeWrapper.onMessage(JSON.parse('{\"type\":\"Event\",\"subject\":\"BridgeReady\"}'))}");
        if (backendUrl != null)
        {
            String s1 = (new StringBuilder("{\"type\":\"Event\",\"subject\":\"GatekeeperReady\",\"payload\":{\"gatekeeperTimestamp\":\"")).append(gatekeeperTimestamp).append("\", \"gatekeeperResponse\":").append(backendResponse).append("}}").toString();
            MainActivity.access$14(MainActivity.this).loadUrl((new StringBuilder("javascript: if(nativeWrapper.onMessage){ nativeWrapper.onMessage(JSON.parse('")).append(s1).append("'))}").toString());
        }
        super.onPageFinished(webview, s);
        if (MainActivity.access$26(MainActivity.this) != null)
        {
            MainActivity.access$26(MainActivity.this).cancel();
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        MainActivity.access$27(MainActivity.this, new CountDownTimer(10000L, 1000L) {

            final MainActivity._cls14 this$1;

            public void onFinish()
            {
                String s1 = getString(0x7f080062);
                Toast.makeText(MainActivity.access$8(this$0), s1, 0).show();
            }

            public void onTick(long l)
            {
            }

            
            {
                this$1 = MainActivity._cls14.this;
                super(l, l1);
            }
        });
        MainActivity.access$26(MainActivity.this).start();
        super.onPageStarted(webview, s, bitmap);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        Log.e("WebLog", (new StringBuilder("eCode: ")).append(i).append(" desc: ").append(s).toString());
        if (MainActivity.access$26(MainActivity.this) != null)
        {
            MainActivity.access$26(MainActivity.this).cancel();
        }
        if (i == -2 && getConnectionStatus(MainActivity.access$8(MainActivity.this)))
        {
            MainActivity.access$14(MainActivity.this).loadUrl("about:blank");
            MainActivity.access$14(MainActivity.this).setVisibility(8);
            showDNSDialog();
        }
        super.onReceivedError(webview, i, s, s1);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        if (!s.contains("/") || s.endsWith("/"))
        {
            return super.shouldInterceptRequest(webview, s);
        }
        Object obj = s.substring(s.lastIndexOf("/") + 1);
        if (assets.contains(obj))
        {
            WebResourceResponse webresourceresponse;
            try
            {
                webresourceresponse = getUtf8EncodedCssWebResourceResponse(new FileInputStream(new File((new StringBuilder()).append(getCacheDir()).append("/").append(((String) (obj))).toString())));
            }
            catch (IOException ioexception1)
            {
                try
                {
                    obj = getUtf8EncodedCssWebResourceResponse(getAssets().open(((String) (obj))));
                }
                catch (IOException ioexception)
                {
                    return super.shouldInterceptRequest(webview, s);
                }
                return ((WebResourceResponse) (obj));
            }
            return webresourceresponse;
        } else
        {
            return super.shouldInterceptRequest(webview, s);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.contains("nissanoffthestage"))
        {
            webview = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
            Bundle bundle = new Bundle();
            bundle.putBoolean("nav", false);
            bundle.putString("key", s);
            webview.putExtras(bundle);
            startActivity(webview);
            return true;
        }
        if (s.contains("emopenwebview"))
        {
            if (s.contains("emopenwebview=1"))
            {
                webview = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
                Bundle bundle1 = new Bundle();
                bundle1.putBoolean("nav", false);
                bundle1.putString("key", s);
                webview.putExtras(bundle1);
                startActivity(webview);
                return true;
            }
            if (s.contains("emopenwebview=0"))
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                startActivity(webview);
                return true;
            }
        }
        if (s.contains("www.facebook.com") && s.contains("dialog/feed"))
        {
            handleFacebookShare(s);
            return true;
        }
        if (s.contains(".facebook.com") && s.contains("dialog/share"))
        {
            handleFacebookShare(s);
            return true;
        }
        if (s.contains(".facebook.com") && s.contains("dialog") && s.contains("feed"))
        {
            handleFacebookShare(s);
            return true;
        }
        if (s.contains(".facebook.com") && s.contains("dialog") && s.contains("share"))
        {
            handleFacebookShare(s);
            return true;
        }
        if (s.contains("www.facebook.com") && s.contains("dialog/oauth"))
        {
            webview = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("nav", false);
            bundle2.putString("key", s);
            webview.putExtras(bundle2);
            startActivity(webview);
            return true;
        }
        if (s.startsWith("market://"))
        {
            MainActivity.access$23(MainActivity.this, s);
            return true;
        }
        if (s.contains("twitter.com"))
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            startActivity(Intent.createChooser(webview, "Tweet!"));
            return true;
        }
        if (s.startsWith("sms:"))
        {
            int i = s.indexOf(":");
            int j = s.indexOf("?");
            int k = s.indexOf("=");
            webview = s.substring(i + 1, j);
            s = s.substring(k + 1);
            webview = new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder("smsto:")).append(webview).toString()));
            webview.putExtra("sms_body", s);
            startActivity(webview);
            return true;
        }
        if (s.startsWith("popup-nav"))
        {
            webview = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("nav", true);
            bundle3.putString("key", s.substring(s.indexOf(":") + 1));
            webview.putExtras(bundle3);
            startActivity(webview);
            return true;
        }
        if (s.startsWith("popup"))
        {
            webview = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("nav", false);
            bundle4.putString("key", s.substring(s.indexOf(":") + 1));
            webview.putExtras(bundle4);
            startActivity(webview);
            return true;
        }
        if (s.startsWith("mailto") || s.startsWith("tel:"))
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            startActivity(webview);
            return true;
        }
        if (!s.startsWith(MainActivity.access$17(MainActivity.this)))
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            startActivity(webview);
            return true;
        } else
        {
            return false;
        }
    }


    _cls1.this._cls1()
    {
        this$0 = MainActivity.this;
        super();
    }
}
