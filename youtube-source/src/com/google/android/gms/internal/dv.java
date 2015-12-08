// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.internal:
//            ec, ea, dz, dy, 
//            dx, dw, db, do, 
//            bp, ee

public class dv extends WebChromeClient
{

    private final db a;

    public dv(db db1)
    {
        a = db1;
    }

    private static boolean a(Context context, String s, String s1, String s2, JsResult jsresult, JsPromptResult jspromptresult, boolean flag)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(s);
        if (flag)
        {
            s = new LinearLayout(context);
            s.setOrientation(1);
            jsresult = new TextView(context);
            jsresult.setText(s1);
            context = new EditText(context);
            context.setText(s2);
            s.addView(jsresult);
            s.addView(context);
            builder.setView(s).setPositiveButton(0x104000a, new ec(jspromptresult, context)).setNegativeButton(0x1040000, new ea(jspromptresult)).setOnCancelListener(new dz(jspromptresult)).create().show();
            return true;
        } else
        {
            builder.setMessage(s1).setPositiveButton(0x104000a, new dy(jsresult)).setNegativeButton(0x1040000, new dx(jsresult)).setOnCancelListener(new dw(jsresult)).create().show();
            return true;
        }
    }

    protected final void a(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        bp bp1 = a.c();
        if (bp1 == null)
        {
            com.google.android.gms.internal.do.d("Could not get ad overlay when showing custom view.");
            customviewcallback.onCustomViewHidden();
            return;
        } else
        {
            bp1.a(view, customviewcallback);
            bp1.a(i);
            return;
        }
    }

    public final void onCloseWindow(WebView webview)
    {
        if (!(webview instanceof db))
        {
            com.google.android.gms.internal.do.d("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        webview = ((db)webview).c();
        if (webview == null)
        {
            com.google.android.gms.internal.do.d("Tried to close an AdWebView not associated with an overlay.");
            return;
        } else
        {
            webview.a();
            return;
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        String s = (new StringBuilder("JS: ")).append(consolemessage.message()).append(" (").append(consolemessage.sourceId()).append(":").append(consolemessage.lineNumber()).append(")").toString();
        ee.a[consolemessage.messageLevel().ordinal()];
        JVM INSTR tableswitch 1 5: default 96
    //                   1 106
    //                   2 124
    //                   3 131
    //                   4 131
    //                   5 138;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        com.google.android.gms.internal.do.b(s);
_L7:
        return super.onConsoleMessage(consolemessage);
_L2:
        if (com.google.android.gms.internal.do.a(6))
        {
            Log.e("Ads", s);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.gms.internal.do.d(s);
        continue; /* Loop/switch isn't completed */
_L4:
        com.google.android.gms.internal.do.b(s);
        continue; /* Loop/switch isn't completed */
_L5:
        com.google.android.gms.internal.do.a(s);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
    {
        android.webkit.WebView.WebViewTransport webviewtransport = (android.webkit.WebView.WebViewTransport)message.obj;
        webview = new WebView(webview.getContext());
        webview.setWebViewClient(a.e());
        webviewtransport.setWebView(webview);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        long l3;
        l3 = 0x500000L - l2;
        if (l3 <= 0L)
        {
            quotaupdater.updateQuota(l);
            return;
        }
        if (l != 0L) goto _L2; else goto _L1
_L1:
        if (l1 > l3 || l1 > 0x100000L)
        {
            l1 = 0L;
        }
_L4:
        quotaupdater.updateQuota(l1);
        return;
_L2:
        if (l1 != 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = Math.min(Math.min(0x20000L, l3) + l, 0x100000L);
_L5:
        l1 = l2;
        if (true) goto _L4; else goto _L3
_L3:
        l2 = l;
        if (l1 <= Math.min(0x100000L - l, l3))
        {
            l2 = l + l1;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final void onHideCustomView()
    {
        bp bp1 = a.c();
        if (bp1 == null)
        {
            com.google.android.gms.internal.do.d("Could not get ad overlay when hiding custom view.");
            return;
        } else
        {
            bp1.c();
            return;
        }
    }

    public final boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(webview.getContext(), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(webview.getContext(), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(webview.getContext(), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        return a(webview.getContext(), s, s1, s2, null, jspromptresult, true);
    }

    public final void onReachedMaxAppCacheSize(long l, long l1, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        l = 0x20000L + l;
        if (0x500000L - l1 < l)
        {
            quotaupdater.updateQuota(0L);
            return;
        } else
        {
            quotaupdater.updateQuota(l);
            return;
        }
    }

    public final void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        a(view, -1, customviewcallback);
    }
}
