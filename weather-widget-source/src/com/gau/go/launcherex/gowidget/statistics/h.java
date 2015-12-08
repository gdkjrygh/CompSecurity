// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.Context;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.e.a;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            w

public class h
{

    public static String a(Context context)
    {
        StringBuffer stringbuffer = new StringBuffer("http://goupdate.3g.cn/GOClientData/DR");
        stringbuffer.append("?package_name=").append("com.gau.go.launcherex.gowidget.weatherwidget").append("&channel_name=").append(w.f(context)).append("&version_code=").append(w.e(context)).append("&version_name=").append(com.gau.go.launcherex.gowidget.statistics.w.c(context));
        context = stringbuffer.toString();
        c.a("CYN", context);
        return context;
    }

    public static String a(Context context, boolean flag)
    {
        int i = 0;
        if (flag)
        {
            i = 1;
        }
        StringBuffer stringbuffer = new StringBuffer("http://goupdate.3g.cn/GOClientData/DR");
        stringbuffer.append("?is_response_json=").append(i).append("&package_name=").append("com.gau.go.launcherex.gowidget.weatherwidget").append("&channel_name=").append(w.f(context)).append("&version_code=").append(w.e(context)).append("&version_name=").append(com.gau.go.launcherex.gowidget.statistics.w.c(context));
        context = stringbuffer.toString();
        c.a("CYN", context);
        return context;
    }

    public static boolean a(String s, Context context)
    {
        Object obj;
        int i;
        boolean flag1;
        boolean flag3 = false;
        boolean flag2 = false;
        if (s == null || "".equals(s))
        {
            return false;
        }
        Object obj1;
        URL url;
        boolean flag;
        try
        {
            url = new URL(a(context));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((MalformedURLException) (obj)).printStackTrace();
            url = null;
        }
        flag1 = flag3;
        if (url == null) goto _L2; else goto _L1
_L1:
        i = 0;
_L3:
        flag1 = flag3;
        if (i >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (HttpURLConnection)url.openConnection();
        ((HttpURLConnection) (obj)).setDoOutput(true);
        ((HttpURLConnection) (obj)).setDoInput(true);
        ((HttpURLConnection) (obj)).setRequestMethod("POST");
        ((HttpURLConnection) (obj)).setUseCaches(false);
        ((HttpURLConnection) (obj)).setInstanceFollowRedirects(true);
        ((HttpURLConnection) (obj)).setConnectTimeout(30000);
        ((HttpURLConnection) (obj)).setReadTimeout(30000);
        ((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        ((HttpURLConnection) (obj)).connect();
        obj1 = new DataOutputStream(((HttpURLConnection) (obj)).getOutputStream());
        ((DataOutputStream) (obj1)).writeBytes(s);
        ((DataOutputStream) (obj1)).flush();
        ((DataOutputStream) (obj1)).close();
        if (((HttpURLConnection) (obj)).getResponseCode() != 200)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        obj1 = ((HttpURLConnection) (obj)).getInputStream();
        flag = flag2;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        flag = b(com.jiubang.goweather.e.a.a(((java.io.InputStream) (obj1))), context);
        flag1 = flag;
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            return flag;
        }
        break; /* Loop/switch isn't completed */
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
_L4:
        i++;
        if (true) goto _L3; else goto _L2
        Object obj3;
        obj3;
        Object obj2 = null;
_L9:
        obj = obj2;
        ((JSONException) (obj3)).printStackTrace();
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
        }
          goto _L4
        obj3;
        obj2 = null;
_L8:
        obj = obj2;
        ((SocketTimeoutException) (obj3)).printStackTrace();
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
        }
          goto _L4
        obj3;
        obj2 = null;
_L7:
        obj = obj2;
        ((Exception) (obj3)).printStackTrace();
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
        }
          goto _L4
        s;
        obj = null;
_L6:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L6; else goto _L5
_L5:
        obj3;
        obj2 = obj;
          goto _L7
        obj3;
        obj2 = obj;
          goto _L8
        obj3;
        obj2 = obj;
          goto _L9
_L2:
        return flag1;
          goto _L4
    }

    public static boolean a(String s, Context context, boolean flag)
    {
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag1 = false;
        flag2 = flag1;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!"".equals(s)) goto _L4; else goto _L3
_L3:
        flag2 = flag1;
_L2:
        return flag2;
_L4:
        int i;
        Object obj;
        URL url;
        try
        {
            url = new URL(a(context, flag));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            url = null;
        }
        flag2 = flag1;
        if (url == null) goto _L2; else goto _L5
_L5:
        i = 0;
        flag1 = flag3;
_L7:
        flag2 = flag1;
        if (i >= 3) goto _L2; else goto _L6
_L6:
        context = (HttpURLConnection)url.openConnection();
        context.setDoOutput(true);
        context.setDoInput(true);
        context.setRequestMethod("POST");
        context.setUseCaches(false);
        context.setInstanceFollowRedirects(true);
        context.setConnectTimeout(30000);
        context.setReadTimeout(30000);
        context.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        context.connect();
        obj = new DataOutputStream(context.getOutputStream());
        ((DataOutputStream) (obj)).writeBytes(s);
        ((DataOutputStream) (obj)).flush();
        ((DataOutputStream) (obj)).close();
        if (context.getResponseCode() != 200)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj = context.getInputStream();
        flag3 = flag1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj = com.jiubang.goweather.e.a.a(((java.io.InputStream) (obj)));
        flag3 = flag1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        flag2 = (new JSONObject(((String) (obj)))).getString("upload_status").equalsIgnoreCase("OK");
        flag3 = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        c.a("CYN", "\u7EDF\u8BA1\u4E0A\u4F20\u6210\u529F(JSON)");
        flag3 = true;
        flag2 = flag3;
        if (context != null)
        {
            context.disconnect();
            return flag3;
        }
          goto _L2
        if (context != null)
        {
            context.disconnect();
        }
_L8:
        i++;
          goto _L7
        Object obj2;
        obj2;
        Object obj1;
        obj1 = null;
        flag2 = flag1;
_L13:
        context = ((Context) (obj1));
        ((JSONException) (obj2)).printStackTrace();
        flag1 = flag2;
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            flag1 = flag2;
        }
          goto _L8
        obj2;
        obj1 = null;
        flag2 = flag1;
_L12:
        context = ((Context) (obj1));
        ((SocketTimeoutException) (obj2)).printStackTrace();
        flag1 = flag2;
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            flag1 = flag2;
        }
          goto _L8
        obj2;
        obj1 = null;
        flag2 = flag1;
_L11:
        context = ((Context) (obj1));
        ((Exception) (obj2)).printStackTrace();
        flag1 = flag2;
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            flag1 = flag2;
        }
          goto _L8
        s;
        context = null;
_L10:
        if (context != null)
        {
            context.disconnect();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L10; else goto _L9
_L9:
        obj2;
        flag2 = flag1;
        obj1 = context;
          goto _L11
        obj2;
        flag2 = true;
        obj1 = context;
          goto _L11
        obj2;
        flag2 = flag1;
        obj1 = context;
          goto _L12
        obj2;
        flag2 = true;
        obj1 = context;
          goto _L12
        obj2;
        flag2 = flag1;
        obj1 = context;
          goto _L13
        obj2;
        flag2 = true;
        obj1 = context;
          goto _L13
    }

    private static boolean b(String s, Context context)
    {
        if (s != null)
        {
            c.a("CYN", s);
            if (s.equalsIgnoreCase("OK"))
            {
                c.a("CYN", "\u7EDF\u8BA1\u4E0A\u4F20\u6210\u529F(\u975EJSON)");
                return true;
            }
            if ((new JSONObject(s)).getString("upload_status").equalsIgnoreCase("OK"))
            {
                c.a("CYN", "\u7EDF\u8BA1\u4E0A\u4F20\u6210\u529F(JSON)");
                return true;
            }
        }
        return false;
    }
}
