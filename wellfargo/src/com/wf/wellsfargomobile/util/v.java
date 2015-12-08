// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.util:
//            w, t

public class v
{

    public static void a()
    {
        WFApp.A();
    }

    public static void a(Context context)
    {
        (new w(context)).execute(new Void[] {
            null, null, null
        });
    }

    public static void a(WebView webview, Context context)
    {
        webview = webview.getSettings();
        webview.setSaveFormData(false);
        webview.setSavePassword(false);
        webview.setAllowFileAccess(false);
        webview.setPluginState(android.webkit.WebSettings.PluginState.OFF);
        webview.setSupportMultipleWindows(true);
        a(context);
    }

    public static void a(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = WFApp.g.getSharedPreferences("native_bridge_prefs", 0).edit();
        editor.putString(s, s1);
        editor.apply();
    }

    public static boolean a(String s)
    {
        return s.startsWith("data:");
    }

    public static boolean a(String s, String s1, String as[], boolean flag, String as1[], String as2[], String as3[])
    {
        int i;
        boolean flag2;
        boolean flag6 = true;
        boolean flag1;
        for (flag1 = false; s.toLowerCase(Locale.US).startsWith("javascript:") || s.toLowerCase(Locale.US).startsWith("native:");)
        {
            return false;
        }

        URL url;
        String s2;
        int j;
        boolean flag3;
        boolean flag5;
        try
        {
            url = new URL(s);
            s2 = url.getHost();
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            flag = flag6;
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
        flag3 = true;
_L19:
        if (i >= j) goto _L2; else goto _L1
_L1:
        flag2 = flag3;
        if (s2.endsWith(as[i]))
        {
            flag3 = false;
        }
          goto _L3
_L2:
        flag5 = flag3;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag5 = flag3;
        flag2 = flag3;
        if (!"https".equals(url.getProtocol()))
        {
            flag5 = true;
        }
        flag3 = flag5;
        if (flag5)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        flag2 = flag5;
        try
        {
            as = url.getQuery();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            flag = flag2;
            continue; /* Loop/switch isn't completed */
        }
        flag3 = flag5;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        flag3 = flag5;
        flag2 = flag5;
        if (as.contains("launchMode=ext"))
        {
            flag3 = true;
        }
        flag = flag3;
        if (flag3) goto _L5; else goto _L4
_L4:
        flag = flag3;
        flag2 = flag3;
        if (!"tablet".equals(s1)) goto _L5; else goto _L6
_L6:
        flag2 = flag3;
        j = as1.length;
        i = 0;
_L20:
label0:
        {
            flag = flag3;
            if (i < j)
            {
                flag2 = flag3;
                break label0;
            }
        }
_L5:
        flag4 = flag;
        if (flag) goto _L8; else goto _L7
_L7:
        flag4 = flag;
        flag2 = flag;
        if ("tablet".equals(s1)) goto _L8; else goto _L9
_L9:
        flag2 = flag;
        j = as2.length;
        i = ((flag1) ? 1 : 0);
_L21:
        flag4 = flag;
        if (i >= j) goto _L8; else goto _L10
_L10:
        flag2 = flag;
        if (s.equals(as2[i]))
        {
            flag = true;
        }
        break MISSING_BLOCK_LABEL_418;
_L8:
        if (flag4 || as3 == null) goto _L12; else goto _L11
_L11:
        flag2 = flag4;
        if (as3.length != 2) goto _L12; else goto _L13
_L13:
        s = as3[0];
        if (s == null) goto _L12; else goto _L14
_L14:
        flag2 = flag4;
        if (!s.equals(s2)) goto _L12; else goto _L15
_L15:
        s = as3[1];
        if (s == null) goto _L12; else goto _L16
_L16:
        flag2 = flag4;
        flag = url.getPath().contains(s);
        if (!flag) goto _L12; else goto _L17
_L17:
        flag = flag6;
_L18:
        return flag;
_L12:
        flag = flag4;
        if (true) goto _L18; else goto _L3
_L3:
        i++;
          goto _L19
        boolean flag4;
        if (s.equals(as1[i]))
        {
            flag3 = true;
        }
        i++;
          goto _L20
        i++;
          goto _L21
    }

    public static String b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("WFAppId", com.wf.wellsfargomobile.a.a.i());
            jsonobject.put("nativeApp", WFApp.af());
            jsonobject.put("hasCamera", WFApp.n().toString());
            jsonobject.put("WFAppVersion", (new StringBuilder()).append("4.6.108 ").append(com.wf.wellsfargomobile.a.a.g()).toString());
            jsonobject.put("appStore", com.wf.wellsfargomobile.a.a.h());
            jsonobject.put("manufacturer", Build.MANUFACTURER);
            jsonobject.put("modelNumber", Build.MODEL);
            jsonobject.put("modelName", Build.DEVICE);
            jsonobject.put("carrier", Build.BRAND);
            jsonobject.put("osVersion", android.os.Build.VERSION.RELEASE);
            jsonobject.put("fingerprint", Build.FINGERPRINT);
            jsonobject.put("mode", WFApp.e());
        }
        catch (JSONException jsonexception) { }
        return jsonobject.toString();
    }

    public static boolean b(String s)
    {
        s = (new URL(s)).getQuery();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        boolean flag = s.contains("exitMsgDisp=N");
        if (flag)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_30;
        s;
        return true;
    }

    public static WebResourceResponse c()
    {
        WebResourceResponse webresourceresponse;
        try
        {
            webresourceresponse = new WebResourceResponse("text/css", "UTF-8", new ByteArrayInputStream("Access Denied".getBytes("UTF-8")));
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return webresourceresponse;
    }

    public static String c(String s)
    {
        return WFApp.g.getSharedPreferences("native_bridge_prefs", 0).getString(s, "");
    }

    public static boolean d(String s)
    {
        return s != null && s.startsWith(com.wf.wellsfargomobile.a.a.b());
    }
}
