// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

public final class UrlUtils
{

    public static final String UTF8 = "UTF8";

    private UrlUtils()
    {
    }

    public static TreeMap getQueryParams(String s, boolean flag)
    {
        TreeMap treemap = new TreeMap();
        if (s != null)
        {
            s = s.split("&");
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                String as[] = s[i].split("=");
                if (as.length == 2)
                {
                    if (flag)
                    {
                        treemap.put(urlDecode(as[0]), urlDecode(as[1]));
                    } else
                    {
                        treemap.put(as[0], as[1]);
                    }
                } else
                if (!TextUtils.isEmpty(as[0]))
                {
                    if (flag)
                    {
                        treemap.put(urlDecode(as[0]), "");
                    } else
                    {
                        treemap.put(as[0], "");
                    }
                }
                i++;
            }
        }
        return treemap;
    }

    public static TreeMap getQueryParams(URI uri, boolean flag)
    {
        return getQueryParams(uri.getRawQuery(), flag);
    }

    public static String percentEncode(String s)
    {
        if (s == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        s = urlEncode(s);
        int j = s.length();
        int i = 0;
        while (i < j) 
        {
            char c = s.charAt(i);
            if (c == '*')
            {
                stringbuilder.append("%2A");
            } else
            if (c == '+')
            {
                stringbuilder.append("%20");
            } else
            if (c == '%' && i + 2 < j && s.charAt(i + 1) == '7' && s.charAt(i + 2) == 'E')
            {
                stringbuilder.append('~');
                i += 2;
            } else
            {
                stringbuilder.append(c);
            }
            i++;
        }
        return stringbuilder.toString();
    }

    public static String urlDecode(String s)
    {
        if (s == null)
        {
            return "";
        }
        try
        {
            s = URLDecoder.decode(s, "UTF8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s.getMessage(), s);
        }
        return s;
    }

    public static String urlEncode(String s)
    {
        if (s == null)
        {
            return "";
        }
        try
        {
            s = URLEncoder.encode(s, "UTF8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s.getMessage(), s);
        }
        return s;
    }
}
