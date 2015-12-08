// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.d;

import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class f extends CookieManager
{

    private android.webkit.CookieManager a;

    public f()
    {
        this(null, null);
    }

    public f(CookieStore cookiestore, CookiePolicy cookiepolicy)
    {
        super(null, cookiepolicy);
        a = android.webkit.CookieManager.getInstance();
    }

    public Map get(URI uri, Map map)
    {
        if (uri == null || map == null)
        {
            throw new IllegalArgumentException("Argument is null");
        }
        map = uri.toString();
        uri = new HashMap();
        map = a.getCookie(map);
        if (map != null)
        {
            uri.put("Cookie", Arrays.asList(new String[] {
                map
            }));
        }
        return uri;
    }

    public CookieStore getCookieStore()
    {
        throw new UnsupportedOperationException();
    }

    public void put(URI uri, Map map)
    {
        if (uri != null && map != null)
        {
            uri = uri.toString();
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (String)iterator.next();
                if (obj != null && (((String) (obj)).equalsIgnoreCase("Set-Cookie2") || ((String) (obj)).equalsIgnoreCase("Set-Cookie")))
                {
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s = (String)((Iterator) (obj)).next();
                        a.setCookie(uri, s);
                    }
                }
            }
        }
    }
}
