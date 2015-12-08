// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            PopupActivity

class this._cls0 extends WebViewClient
{

    final PopupActivity this$0;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        PopupActivity.access$9().loadUrl("javascript: window.nativeWrapper = window.nativeWrapper || {};");
        PopupActivity.access$9().loadUrl("javascript: window.nativeWrapper.sendMessage = function(messageObject) {PopupHandler.parseMessageObject(JSON.stringify(messageObject));}");
        PopupActivity.access$9().loadUrl("javascript: window.nativeWrapper.sendMessage({\"type\":\"Event\",\"subject\":\"HandleLS\",\"payload\":{\"localStorage\": window.localStorage.age_gate }});");
        sendMessageToJS("{\"type\":\"Event\",\"subject\":\"BridgeReady\"}");
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        boolean flag1 = true;
        if (!s.contains("nissanoffthestage")) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        if (!s.contains("emopenwebview"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (s.contains("emopenwebview=1"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s.contains("emopenwebview=0"))
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            startActivity(webview);
            PopupActivity.access$9().stopLoading();
            return true;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        if (s.startsWith("http://www.nbc.com/the-voice") && s.contains("votenow=null"))
        {
            finish();
            return true;
        }
        if (s.startsWith("market://"))
        {
            webview = new Intent("android.intent.action.VIEW");
            webview.setData(Uri.parse(s));
            startActivity(webview);
            return true;
        }
        if (s.contains("&therecanbeonly=one") && !s.contains("facebook.com"))
        {
            finish();
            return true;
        }
        if (s.contains("&code") && s.contains(sharedPreferences.getString("votenowURL", ".votenow.tv")))
        {
            Object obj = s.substring(s.indexOf("code") + 5, s.length());
            authTokenFB = ((String) (obj));
            obj = sharedPreferences.edit();
            ((android.content.s.Editor) (obj)).putString("fbAuthToken", authTokenFB);
            ((android.content.s.Editor) (obj)).commit();
        }
        if (s.contains("twitter.com"))
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            startActivity(Intent.createChooser(webview, "Tweet!"));
            return true;
        }
        if (!s.contains("facebook.com") && !PopupActivity.access$15(PopupActivity.this) && (s.contains(".nbcuniversal.com/privacy/") || s.contains(".nbcuni.com/privacy/") || s.contains("www.nbc.com") || s.contains("//nbc.com") || s.contains("play.google.com") || s.contains("itunes.") || s.contains("sprint.com")))
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            startActivity(webview);
            return true;
        }
        if (s.contains("apps.facebook.com") || s.contains("facebook.com/NBCTheVoice"))
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            startActivity(webview);
            return true;
        }
        if (s.startsWith(getString(0x7f08004c)))
        {
            finish();
        }
        webview.loadUrl(s);
        if (s.startsWith("close-popup:"))
        {
            finish();
        }
        if (s.startsWith("mailto"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!s.startsWith("tel:")) goto _L4; else goto _L5
_L5:
        webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
        startActivity(webview);
        PopupActivity.access$9().stopLoading();
        return true;
    }

    ()
    {
        this$0 = PopupActivity.this;
        super();
    }
}
