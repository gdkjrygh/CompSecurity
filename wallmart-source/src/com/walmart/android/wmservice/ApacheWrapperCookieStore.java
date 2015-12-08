// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.support.v4.util.LruCache;
import com.walmartlabs.utils.WLog;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie2;

public class ApacheWrapperCookieStore
    implements CookieStore
{

    private static final boolean LOG_COOKIES = false;
    private static final String TAG = com/walmart/android/wmservice/ApacheWrapperCookieStore.getSimpleName();
    private final LruCache mConversionObjectPool = new LruCache(50);
    private final java.net.CookieStore mJavaCookieStore;

    public ApacheWrapperCookieStore(java.net.CookieStore cookiestore)
    {
        mJavaCookieStore = cookiestore;
    }

    static HttpCookie apache2JavaCookie(Cookie cookie)
    {
        HttpCookie httpcookie = new HttpCookie(cookie.getName(), cookie.getValue());
        httpcookie.setComment(cookie.getComment());
        httpcookie.setCommentURL(cookie.getCommentURL());
        httpcookie.setDomain(cookie.getDomain());
        httpcookie.setPath(cookie.getPath());
        httpcookie.setSecure(cookie.isSecure());
        httpcookie.setVersion(cookie.getVersion());
        Date date = cookie.getExpiryDate();
        if (date != null)
        {
            httpcookie.setMaxAge((date.getTime() - System.currentTimeMillis()) / 1000L);
        } else
        {
            httpcookie.setMaxAge(-1L);
        }
        cookie = cookie.getPorts();
        if (cookie != null)
        {
            httpcookie.setPortlist(StringUtils.join(cookie, ','));
            return httpcookie;
        } else
        {
            httpcookie.setPortlist(null);
            return httpcookie;
        }
    }

    static BasicClientCookie2 java2ApacheCookie(HttpCookie httpcookie, BasicClientCookie2 basicclientcookie2)
    {
        String s = httpcookie.getName();
        String s1 = httpcookie.getValue();
        long l;
        if (basicclientcookie2 != null && basicclientcookie2.getName().equals(s))
        {
            basicclientcookie2.setValue(httpcookie.getValue());
        } else
        {
            basicclientcookie2 = new BasicClientCookie2(s, s1);
        }
        basicclientcookie2.setComment(httpcookie.getComment());
        basicclientcookie2.setCommentURL(httpcookie.getCommentURL());
        basicclientcookie2.setDomain(httpcookie.getDomain());
        basicclientcookie2.setPath(httpcookie.getPath());
        basicclientcookie2.setPorts(parsePortList(httpcookie.getPortlist()));
        basicclientcookie2.setSecure(httpcookie.getSecure());
        basicclientcookie2.setVersion(httpcookie.getVersion());
        l = httpcookie.getMaxAge();
        if (l >= 0L)
        {
            basicclientcookie2.setExpiryDate(new Date(System.currentTimeMillis() + 1000L * l));
            return basicclientcookie2;
        } else
        {
            basicclientcookie2.setExpiryDate(null);
            return basicclientcookie2;
        }
    }

    static int[] parsePortList(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        s = s.split(",");
        ArrayList arraylist = new ArrayList(s.length);
        int j = s.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = s[i];
            int ai[];
            try
            {
                arraylist.add(Integer.valueOf(s1.trim()));
            }
            catch (NumberFormatException numberformatexception) { }
            i++;
        }
        ai = new int[arraylist.size()];
        i = 0;
        s = ai;
        if (i < ai.length)
        {
            ai[i] = ((Integer)arraylist.get(i)).intValue();
            i++;
            break MISSING_BLOCK_LABEL_69;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void addCookie(Cookie cookie)
    {
        cookie = apache2JavaCookie(cookie);
        mJavaCookieStore.add(null, cookie);
    }

    public void clear()
    {
        WLog.d(TAG, "clear");
        mConversionObjectPool.evictAll();
        mJavaCookieStore.removeAll();
    }

    public boolean clearExpired(Date date)
    {
        WLog.d(TAG, "clearExpired");
        return false;
    }

    public List getCookies()
    {
        System.currentTimeMillis();
        Object obj = mJavaCookieStore.getCookies();
        if (!((List) (obj)).isEmpty())
        {
            ArrayList arraylist = new ArrayList(((List) (obj)).size());
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                obj = arraylist;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (HttpCookie)iterator.next();
                BasicClientCookie2 basicclientcookie2 = (BasicClientCookie2)mConversionObjectPool.get(obj);
                boolean flag;
                if (basicclientcookie2 != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                basicclientcookie2 = java2ApacheCookie(((HttpCookie) (obj)), basicclientcookie2);
                if (!flag)
                {
                    mConversionObjectPool.put(obj, basicclientcookie2);
                }
                arraylist.add(basicclientcookie2);
            } while (true);
        } else
        {
            obj = Collections.emptyList();
        }
        return ((List) (obj));
    }

}
