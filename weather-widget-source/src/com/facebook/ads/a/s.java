// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdSettings;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// Referenced classes of package com.facebook.ads.a:
//            ag, o, r

public class s
{

    private static String a = null;

    public static String a()
    {
        String s1 = AdSettings.getUrlPrefix();
        if (ag.a(s1))
        {
            return "https://www.facebook.com/";
        } else
        {
            return String.format("https://www.%s.facebook.com", new Object[] {
                s1
            });
        }
    }

    private static String a(Context context)
    {
        return WebSettings.getDefaultUserAgent(context);
    }

    public static String a(Context context, o o1)
    {
        if (o.b == o1)
        {
            return System.getProperty("http.agent");
        }
        if (a == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                a = a(context);
            } else
            {
                try
                {
                    a = a(context, "android.webkit.WebSettings", "android.webkit.WebView");
                }
                // Misplaced declaration of an exception variable
                catch (o o1)
                {
                    try
                    {
                        a = a(context, "android.webkit.WebSettingsClassic", "android.webkit.WebViewClassic");
                    }
                    // Misplaced declaration of an exception variable
                    catch (o o1)
                    {
                        context = new WebView(context.getApplicationContext());
                        a = context.getSettings().getUserAgentString();
                        context.destroy();
                    }
                }
            }
        }
        return a;
    }

    private static String a(Context context, String s1, String s2)
    {
        Class class1 = Class.forName(s1);
        s1 = class1.getDeclaredConstructor(new Class[] {
            android/content/Context, Class.forName(s2)
        });
        s1.setAccessible(true);
        s2 = class1.getMethod("getUserAgentString", new Class[0]);
        context = (String)s2.invoke(s1.newInstance(new Object[] {
            context, null
        }), new Object[0]);
        s1.setAccessible(false);
        return context;
        context;
        s1.setAccessible(false);
        throw context;
    }

    public static void a(WebView webview)
    {
        if (android.os.Build.VERSION.SDK_INT > 11)
        {
            webview.onPause();
            return;
        }
        try
        {
            android/webkit/WebView.getMethod("onPause", new Class[0]).invoke(webview, new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            return;
        }
    }

    public static void a(WebView webview, WebViewClient webviewclient, r r)
    {
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setSupportZoom(false);
        webview.setHorizontalScrollBarEnabled(false);
        webview.setHorizontalScrollbarOverlay(false);
        webview.setVerticalScrollBarEnabled(false);
        webview.setVerticalScrollbarOverlay(false);
        webview.addJavascriptInterface(r, "AdControl");
        webview.setWebViewClient(webviewclient);
    }

}
