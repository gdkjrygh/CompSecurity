// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            PopupActivity, MainActivity

class this._cls1 extends WebViewClient
{

    final Activity this$1;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.contains("emopenwebview"))
        {
            if (s.contains("emopenwebview=1"))
            {
                webview = new Intent(_fld0, com/nbcuni/nbc/thevoice/PopupActivity);
                Bundle bundle = new Bundle();
                bundle.putBoolean("nav", false);
                bundle.putString("key", s);
                webview.putExtras(bundle);
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
        if (s.contains("www.facebook.com") && s.contains("dialog/oauth"))
        {
            webview = new Intent(_fld0, com/nbcuni/nbc/thevoice/PopupActivity);
            Bundle bundle1 = new Bundle();
            bundle1.putBoolean("nav", false);
            bundle1.putString("key", s);
            webview.putExtras(bundle1);
            startActivity(webview);
            return true;
        }
        if (s.startsWith("market://"))
        {
            MainActivity.access$23(_fld0, s);
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
            webview = new Intent(_fld0, com/nbcuni/nbc/thevoice/PopupActivity);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("nav", true);
            bundle2.putString("key", s.substring(s.indexOf(":") + 1));
            webview.putExtras(bundle2);
            startActivity(webview);
            return true;
        }
        if (s.startsWith("popup"))
        {
            webview = new Intent(_fld0, com/nbcuni/nbc/thevoice/PopupActivity);
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("nav", false);
            bundle3.putString("key", s.substring(s.indexOf(":") + 1));
            webview.putExtras(bundle3);
            startActivity(webview);
            return true;
        } else
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            startActivity(webview);
            return true;
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$13

/* anonymous class */
    class MainActivity._cls13 extends WebChromeClient
    {

        final MainActivity this$0;

        public boolean onConsoleMessage(ConsoleMessage consolemessage)
        {
            return true;
        }

        public boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
        {
            webview = new WebView(getApplicationContext());
            webview.setWebViewClient(new MainActivity._cls13._cls1());
            ((android.webkit.WebView.WebViewTransport)message.obj).setWebView(webview);
            message.sendToTarget();
            return true;
        }

        public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
        {
            (new android.app.AlertDialog.Builder(webview.getContext())).setMessage(s1).setCancelable(true).show();
            jsresult.confirm();
            return true;
        }

        public boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
        {
            jsresult.confirm();
            return true;
        }

        public boolean onJsConfirm(WebView webview, String s, String s1, final JsResult result)
        {
            (new android.app.AlertDialog.Builder(MainActivity.access$8(MainActivity.this), 4)).setTitle("Dialog").setMessage(s1).setPositiveButton(0x104000a, new MainActivity._cls13._cls2()).setNegativeButton(0x1040000, new MainActivity._cls13._cls3()).create();
            return super.onJsConfirm(webview, s, s1, result);
        }

        public boolean onJsPrompt(WebView webview, String s, String s1, String s2, final JsPromptResult result)
        {
            webview = LayoutInflater.from(MainActivity.access$8(MainActivity.this)).inflate(0x7f03000e, null);
            ((TextView)webview.findViewById(0x7f09004b)).setText(s1);
            (new android.app.AlertDialog.Builder(MainActivity.access$8(MainActivity.this), 4)).setTitle("Dialog").setView(webview).setPositiveButton(0x104000a, new MainActivity._cls13._cls4()).setNegativeButton(0x1040000, new MainActivity._cls13._cls5()).setOnCancelListener(new MainActivity._cls13._cls6()).show();
            return true;
        }

        public void onProgressChanged(WebView webview, int i)
        {
            setProgress(i * 1000);
        }


            
            {
                this$0 = MainActivity.this;
                super();
            }

        // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$13$2

/* anonymous class */
        class MainActivity._cls13._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final MainActivity._cls13 this$1;
            private final JsResult val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                result.confirm();
            }

                    
                    {
                        this$1 = MainActivity._cls13.this;
                        result = jsresult;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$13$3

/* anonymous class */
        class MainActivity._cls13._cls3
            implements android.content.DialogInterface.OnClickListener
        {

            final MainActivity._cls13 this$1;
            private final JsResult val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                result.cancel();
            }

                    
                    {
                        this$1 = MainActivity._cls13.this;
                        result = jsresult;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$13$4

/* anonymous class */
        class MainActivity._cls13._cls4
            implements android.content.DialogInterface.OnClickListener
        {

            final MainActivity._cls13 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

                    
                    {
                        this$1 = MainActivity._cls13.this;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$13$5

/* anonymous class */
        class MainActivity._cls13._cls5
            implements android.content.DialogInterface.OnClickListener
        {

            final MainActivity._cls13 this$1;
            private final JsPromptResult val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                result.cancel();
            }

                    
                    {
                        this$1 = MainActivity._cls13.this;
                        result = jspromptresult;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$13$6

/* anonymous class */
        class MainActivity._cls13._cls6
            implements android.content.DialogInterface.OnCancelListener
        {

            final MainActivity._cls13 this$1;
            private final JsPromptResult val$result;

            public void onCancel(DialogInterface dialoginterface)
            {
                result.cancel();
            }

                    
                    {
                        this$1 = MainActivity._cls13.this;
                        result = jspromptresult;
                        super();
                    }
        }

    }

}
