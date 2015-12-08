// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.b;

import android.content.Intent;
import android.util.Log;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.QRCodeScanActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.b:
//            c, e, b

public class a
{

    private final AtomicInteger a = new AtomicInteger(0);
    private final BaseWebViewActivity b;
    private String c;
    private String d;
    private String e;
    private final String f = "activitySource";
    private final String g = "timeoutSeconds";
    private final String h = "actionMethod";

    public a(BaseWebViewActivity basewebviewactivity)
    {
        c = null;
        d = null;
        e = null;
        b = basewebviewactivity;
    }

    static AtomicInteger a(a a1)
    {
        return a1.a;
    }

    private BaseWebViewActivity d()
    {
        return b;
    }

    private boolean e(String s)
    {
        return d().validNonce(s);
    }

    public String a()
    {
        return c;
    }

    public void a(String s)
    {
        Object obj = null;
        String s1 = "30";
        String as[] = s.substring(1, s.length() - 1).split(",");
        int j = as.length;
        int i = 0;
        s = ((String) (obj));
        while (i < j) 
        {
            String as1[] = as[i].split(":");
            as1[0] = as1[0].replace("\"", "").trim();
            as1[1] = as1[1].replace("\"", "").trim();
            String s2;
            if (as1[0].equals("activitySource"))
            {
                s2 = as1[1];
                c(s2);
                obj = s1;
            } else
            if (as1[0].equals("timeoutSeconds"))
            {
                obj = as1[1];
                s2 = s;
            } else
            {
                obj = s1;
                s2 = s;
                if (as1[0].equals("actionMethod"))
                {
                    d(as1[1]);
                    obj = s1;
                    s2 = s;
                }
            }
            i++;
            s1 = ((String) (obj));
            s = s2;
        }
        obj = new Intent(d(), com/wf/wellsfargomobile/QRCodeScanActivity);
        ((Intent) (obj)).putExtra("time_out_in_secs", Integer.parseInt(s1));
        ((Intent) (obj)).putExtra("activity_source", s);
        d().startActivityForResult(((Intent) (obj)), 110);
    }

    public void a(String s, WebView webview)
    {
        Object obj2 = null;
        Iterator iterator = (new c()).a(s).iterator();
        Object obj = null;
        Object obj1 = null;
        webview = null;
        s = obj2;
        while (iterator.hasNext()) 
        {
            Object obj3 = (e)iterator.next();
            String s1 = ((e) (obj3)).a();
            if (s1.equalsIgnoreCase("native://mba/"))
            {
                obj3 = ((e) (obj3)).c();
                webview = ((WebView) (obj));
                obj = obj1;
                obj1 = obj3;
            } else
            if (s1.equalsIgnoreCase("/nonce/"))
            {
                obj3 = ((e) (obj3)).c();
                obj1 = webview;
                webview = ((WebView) (obj));
                obj = obj3;
            } else
            if (s1.equalsIgnoreCase("/callback/"))
            {
                obj3 = ((e) (obj3)).c();
                obj = obj1;
                obj1 = webview;
                webview = ((WebView) (obj3));
            } else
            if (s1.equalsIgnoreCase("/data/"))
            {
                s = ((e) (obj3)).c();
                obj3 = webview;
                webview = ((WebView) (obj));
                obj = obj1;
                obj1 = obj3;
            } else
            {
                WebView webview1 = webview;
                webview = ((WebView) (obj));
                obj = obj1;
                obj1 = webview1;
            }
            obj3 = obj1;
            obj1 = obj;
            obj = webview;
            webview = ((WebView) (obj3));
        }
        if (!e(((String) (obj1))))
        {
            Log.e("MBAToNativeRequestMgr", "NativeRequestManager->handleRequest() - nonce not valid");
            return;
        } else
        {
            a(((String) (webview)), ((String) (obj)), s);
            return;
        }
    }

    public void a(String s, String s1, String s2)
    {
        if (a.get() > 0)
        {
            a.getAndIncrement();
            b.runOnUiThread(new b(this, s, s1, s2));
            return;
        } else
        {
            b(s, s1, s2);
            return;
        }
    }

    public String b()
    {
        return d;
    }

    public void b(String s)
    {
        c = s;
    }

    public void b(String s, String s1, String s2)
    {
        new JSONObject();
        new JSONObject();
        new JSONObject();
        if (s.equalsIgnoreCase("showQRCodeScanView"))
        {
            b(s1);
            a(s2);
        }
    }

    public String c()
    {
        return e;
    }

    public void c(String s)
    {
        d = s;
    }

    public void d(String s)
    {
        e = s;
    }
}
