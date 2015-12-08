// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.net.Uri;
import android.util.Log;
import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;

// Referenced classes of package com.walmart.android.wmservice:
//            Services, WalmartNetService

public class Util
{

    private static final String COOKIE_ATTRIBUTE_DELIMITER = ";";
    public static final String DEFAULT_COOKIE_DOMAIN = ".walmart.com";
    private static final String TAG = com/walmart/android/wmservice/Util.getSimpleName();

    public Util()
    {
    }

    public static void clearWebCookie(String s)
    {
        CookieManager.getInstance().setCookie(".walmart.com", (new StringBuilder()).append(s).append("=").append(";").append("expires=Fri, 01-Jan-1970 00:00:00 GMT").append(";").append("Max-Age=0").toString());
    }

    public static void clearWebViewCookies()
    {
        CookieManager.getInstance().removeAllCookie();
    }

    public static String getCID(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Cookie cookie = (Cookie)list.next();
            if ("CID".equals(cookie.getName()))
            {
                return cookie.getValue();
            }
        }

        return null;
    }

    private static BasicClientCookie getClientCookie(String s, Map map)
    {
label0:
        {
            Object obj = null;
            String as[] = getCookieKeyValues(s.trim());
            s = obj;
            if (as == null)
            {
                break label0;
            }
            if (map != null)
            {
                s = obj;
                if (map.containsKey(as[0]))
                {
                    break label0;
                }
            }
            s = new BasicClientCookie(as[0], as[1]);
            s.setDomain(".walmart.com");
            s.setPath("/");
        }
        return s;
    }

    private static String[] getCookieKeyValues(String s)
    {
        String as[];
label0:
        {
            as = null;
            int i = s.indexOf("=");
            if (i >= 0)
            {
                as = new String[2];
                as[0] = s.substring(0, i);
                if (s.length() <= i + 1)
                {
                    break label0;
                }
                as[1] = s.substring(i + 1, s.length());
            }
            return as;
        }
        as[1] = "";
        return as;
    }

    public static String getCustomerId(List list)
    {
        list = list.iterator();
_L2:
        Object obj;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Cookie)list.next();
        if (!"com.wm.customer".equals(((Cookie) (obj)).getName()))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((Cookie) (obj)).getValue();
        String as[] = Uri.decode(((String) (obj))).split("~~");
        if (as == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i;
        if (as.length <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = as[0].indexOf('.');
        if (i < 0)
        {
            return as[0];
        }
        String s = as[0].substring(i + 1);
        return s;
        Exception exception;
        exception;
        Log.e("Service.Util", String.format(Locale.US, "failed to parse cookie: %s", new Object[] {
            obj
        }), exception);
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public static void passCookiesToNative()
    {
        boolean flag = false;
        CookieManager cookiemanager = CookieManager.getInstance();
        String s = cookiemanager.getCookie("http://.walmart.com");
        HashMap hashmap = new HashMap();
        if (s != null)
        {
            String as[] = s.split(";");
            int k = as.length;
            for (int i = 0; i < k; i++)
            {
                BasicClientCookie basicclientcookie = getClientCookie(as[i], null);
                if (basicclientcookie != null)
                {
                    hashmap.put(basicclientcookie.getName(), basicclientcookie);
                }
            }

        }
        as = cookiemanager.getCookie("https://.walmart.com");
        if (as != null)
        {
            ArrayList arraylist = new ArrayList();
            String as1[] = as.split(";");
            int l = as1.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                BasicClientCookie basicclientcookie1 = getClientCookie(as1[j], hashmap);
                if (basicclientcookie1 != null)
                {
                    basicclientcookie1.setSecure(true);
                    arraylist.add(basicclientcookie1);
                }
            }

            arraylist.addAll(hashmap.values());
            Services.get().getWalmartService().addCookies(arraylist, true);
        }
    }

    public static void passCookiesToNative(String as[])
    {
        String s = CookieManager.getInstance().getCookie(".walmart.com");
        if (s != null)
        {
            ArrayList arraylist = new ArrayList();
            HashMap hashmap = new HashMap();
            String as1[] = s.split(";");
            int k = as1.length;
            for (int i = 0; i < k; i++)
            {
                String as2[] = getCookieKeyValues(as1[i].trim());
                hashmap.put(as2[0], as2[1]);
            }

            k = as.length;
            for (int j = 0; j < k; j++)
            {
                Object obj = as[j];
                String s1 = (String)hashmap.get(obj);
                if (s1 != null)
                {
                    obj = new BasicClientCookie(((String) (obj)), s1);
                    ((BasicClientCookie) (obj)).setDomain(".walmart.com");
                    ((BasicClientCookie) (obj)).setPath("/");
                    arraylist.add(obj);
                }
            }

            Services.get().getWalmartService().addCookies(arraylist, false);
        }
    }

    private static void printCookies(String as[])
    {
        for (int i = 0; i < as.length; i++)
        {
            as[i] = as[i].trim();
        }

        Arrays.sort(as);
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            String s = as[j];
            Log.i(TAG, (new StringBuilder()).append("WEB -> NATIVE: ").append(s).toString());
        }

    }

}
