// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            dn, dk

public final class dj
{

    private static final Object a = new Object();
    private static boolean b = true;
    private static String c;
    private static boolean d = false;

    public static int a()
    {
        return android.os.Build.VERSION.SDK_INT < 9 ? 0 : 6;
    }

    static String a(Context context)
    {
        return b(context);
    }

    private static String a(Context context, String s)
    {
label0:
        {
            synchronized (a)
            {
                if (c == null)
                {
                    break label0;
                }
                context = c;
            }
            return context;
        }
        if (android.os.Build.VERSION.SDK_INT < 17) goto _L2; else goto _L1
_L1:
        c = WebSettings.getDefaultUserAgent(context);
_L4:
        context = (new StringBuilder()).append(c).append(" (Mobile; ").append(s).append(")").toString();
        c = context;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
_L2:
        if (dn.b())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        dn.a.post(new dk(context));
_L5:
        context = c;
        if (context != null) goto _L4; else goto _L3
_L3:
        a.wait();
          goto _L5
        context;
        context = c;
        obj;
        JVM INSTR monitorexit ;
        return context;
        c = b(context);
          goto _L4
    }

    public static String a(Readable readable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        CharBuffer charbuffer = CharBuffer.allocate(2048);
        do
        {
            int i = readable.read(charbuffer);
            if (i != -1)
            {
                charbuffer.flip();
                stringbuilder.append(charbuffer, 0, i);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    public static String a(String s)
    {
        return Uri.parse(s).buildUpon().query(null).build().toString();
    }

    private static JSONArray a(Collection collection)
    {
        JSONArray jsonarray = new JSONArray();
        for (collection = collection.iterator(); collection.hasNext(); a(jsonarray, collection.next())) { }
        return jsonarray;
    }

    private static JSONObject a(Bundle bundle)
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); a(jsonobject, s, bundle.get(s)))
        {
            s = (String)iterator.next();
        }

        return jsonobject;
    }

    public static JSONObject a(Map map)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(jsonobject, s, map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new JSONException((new StringBuilder("Could not convert map to JSON: ")).append(map.getMessage()).toString());
        }
        return jsonobject;
    }

    public static void a(Context context, String s, WebSettings websettings)
    {
        websettings.setUserAgentString(a(context, s));
    }

    public static void a(Context context, String s, boolean flag, HttpURLConnection httpurlconnection)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", a(context, s));
        httpurlconnection.setUseCaches(false);
    }

    public static void a(WebView webview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            webview.onPause();
        }
    }

    private static void a(JSONArray jsonarray, Object obj)
    {
        if (obj instanceof Bundle)
        {
            jsonarray.put(a((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonarray.put(a((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            jsonarray.put(a((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            obj = ((Object) ((Object[])obj));
            JSONArray jsonarray1 = new JSONArray();
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                a(jsonarray1, obj[i]);
            }

            jsonarray.put(jsonarray1);
            return;
        } else
        {
            jsonarray.put(obj);
            return;
        }
    }

    private static void a(JSONObject jsonobject, String s, Object obj)
    {
        if (obj instanceof Bundle)
        {
            jsonobject.put(s, a((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonobject.put(s, a((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            if (s == null)
            {
                s = "null";
            }
            jsonobject.put(s, a((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            jsonobject.put(s, a(((Collection) (Arrays.asList((Object[])obj)))));
            return;
        } else
        {
            jsonobject.put(s, obj);
            return;
        }
    }

    public static boolean a(PackageManager packagemanager, String s, String s1)
    {
        return packagemanager.checkPermission(s1, s) == 0;
    }

    public static boolean a(ClassLoader classloader, Class class1, String s)
    {
        boolean flag;
        try
        {
            flag = class1.isAssignableFrom(Class.forName(s, false, classloader));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            return false;
        }
        return flag;
    }

    public static int b()
    {
        return android.os.Build.VERSION.SDK_INT < 9 ? 1 : 7;
    }

    private static String b(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    static String b(String s)
    {
        c = s;
        return s;
    }

    public static void b(WebView webview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            webview.onResume();
        }
    }

    static Object c()
    {
        return a;
    }

}
