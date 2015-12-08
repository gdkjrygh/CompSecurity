// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.c;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class p
{

    public static Uri a(Uri uri, Map map)
    {
        Object obj = uri.getQueryParameterNames();
        android.net.Uri.Builder builder = uri.buildUpon();
        builder.query("");
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s1 = (String)((Iterator) (obj)).next();
            if (!map.containsKey(s1))
            {
                builder.appendQueryParameter(s1, uri.getQueryParameter(s1));
            }
        } while (true);
        String s;
        for (uri = map.keySet().iterator(); uri.hasNext(); builder.appendQueryParameter(s, (String)map.get(s)))
        {
            s = (String)uri.next();
        }

        return builder.build();
    }

    public static Uri a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public static String a(Uri uri)
    {
        if (uri == null)
        {
            return null;
        } else
        {
            return uri.toString();
        }
    }

    public static Uri b(String s)
    {
        return g(f(s));
    }

    public static boolean b(Uri uri)
    {
        return "127.0.0.1".equals(uri.getHost()) || "localhost".equals(uri.getHost());
    }

    public static String c(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        uri = uri.getPathSegments();
        if (uri.size() < 2)
        {
            return null;
        }
        if ("feeds".equals(uri.get(0)) && "api".equals(uri.get(1)) && ("users".equals(uri.get(2)) || "channels".equals(uri.get(2))))
        {
            return (String)uri.get(3);
        } else
        {
            return (String)uri.get(1);
        }
    }

    public static String c(String s)
    {
        s = f(s);
        g(s);
        return s;
    }

    public static String d(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            String s1;
            String s2;
            Object obj;
            try
            {
                obj = Uri.parse(s);
                s1 = ((Uri) (obj)).getHost();
                s2 = ((Uri) (obj)).getQueryParameter("v");
                obj = ((Uri) (obj)).getScheme();
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                return s;
            }
            if (s1 != null && s1.contains("youtube.com") && !TextUtils.isEmpty(s2))
            {
                return (new android.net.Uri.Builder()).scheme(((String) (obj))).authority("youtu.be").appendPath(s2).build().toString();
            }
        }
        return s;
    }

    public static String e(String s)
    {
        return String.format("http://www.youtube.com/watch?v=%1$s", new Object[] {
            s
        });
    }

    private static String f(String s)
    {
        Object obj = Uri.parse(s);
        try
        {
            new URI(s);
        }
        catch (URISyntaxException urisyntaxexception1)
        {
            String s1;
            try
            {
                s1 = Uri.encode(((Uri) (obj)).getEncodedAuthority(), "%,;:$&+=@[]");
                String s3 = Uri.encode(((Uri) (obj)).getEncodedPath(), "%,;:$&+=/@");
                String s5 = Uri.encode(((Uri) (obj)).getEncodedQuery(), "%,;:$&+=/[]@?");
                s1 = ((Uri) (obj)).buildUpon().encodedAuthority(s1).encodedPath(s3).encodedQuery(s5).build().toString();
                new URI(s1);
            }
            catch (URISyntaxException urisyntaxexception2)
            {
                try
                {
                    String s2 = Uri.encode(((Uri) (obj)).getEncodedAuthority(), ",;:$&+=@[]");
                    String s4 = Uri.encode(((Uri) (obj)).getEncodedPath(), ",;:$&+=/@");
                    String s6 = Uri.encode(((Uri) (obj)).getEncodedQuery(), ",;:$&+=/@[]?");
                    obj = ((Uri) (obj)).buildUpon().encodedAuthority(s2).encodedPath(s4).encodedQuery(s6).build().toString();
                    new URI(((String) (obj)));
                }
                catch (URISyntaxException urisyntaxexception)
                {
                    return Uri.encode(s, ":/");
                }
                return ((String) (obj));
            }
            return s1;
        }
        return s;
    }

    private static Uri g(String s)
    {
        s = Uri.parse(s);
        if (!s.isAbsolute())
        {
            throw new MalformedURLException("Uri must have an absolute scheme");
        } else
        {
            return s;
        }
    }
}
