// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.fromguava.c;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class al
{

    public final List a;
    public final Map b;
    public final int c;

    private al(String s, Map map, int i)
    {
        this(Collections.singletonList(s), map, i);
    }

    private al(List list, Map map, int i)
    {
        a = Collections.unmodifiableList((List)com.google.android.apps.youtube.common.fromguava.c.a(list, "videoIds can not be null"));
        boolean flag;
        if (!a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "videoIds cannot be empty");
        b = Collections.unmodifiableMap((Map)com.google.android.apps.youtube.common.fromguava.c.a(map, "params can not be null"));
        c = i;
    }

    private static int a(Uri uri, Map map)
    {
        String s = (String)map.get("t");
        map = s;
        if (s == null)
        {
            uri = Uri.decode(uri.getEncodedFragment());
            map = s;
            if (!TextUtils.isEmpty(uri))
            {
                String as1[] = uri.split("&");
                int j = as1.length;
                int i = 0;
                uri = s;
                do
                {
                    map = uri;
                    if (i >= j)
                    {
                        break;
                    }
                    String as[] = as1[i].split("=");
                    map = uri;
                    if (as.length == 2)
                    {
                        map = uri;
                        if ("t".equals(as[0]))
                        {
                            map = as[1];
                        }
                    }
                    i++;
                    uri = map;
                } while (true);
            }
        }
        return a(((String) (map)));
    }

    private static int a(String s)
    {
        if (s == null)
        {
            return 0;
        }
        int j = s.indexOf("h");
        String s1;
        int i;
        int k;
        if (j >= 0)
        {
            i = m.b(s.substring(0, j), 0) * 0x36ee80 + 0;
            s1 = s.substring(j + 1);
        } else
        {
            i = 0;
            s1 = s;
        }
        k = s1.indexOf("m");
        j = i;
        s = s1;
        if (k >= 0)
        {
            j = i + m.b(s1.substring(0, k), 0) * 60000;
            s = s1.substring(k + 1);
        }
        s1 = s;
        if (s.endsWith("s"))
        {
            s1 = s.substring(0, s.length() - 1);
        }
        return (int)(m.a(s1, 0.0F) * 1000F) + j;
    }

    public static al a(Uri uri)
    {
        Object obj = uri;
        if ("https".equals(uri.getScheme()))
        {
            obj = uri.buildUpon().scheme("http").build();
        }
        if ("vnd.youtube".equals(((Uri) (obj)).getScheme()))
        {
            String s = ((Uri) (obj)).getSchemeSpecificPart();
            uri = s;
            if (s.startsWith("//"))
            {
                uri = s.substring(2);
            }
            int i = uri.indexOf('?');
            if (i > 0)
            {
                uri = uri.substring(0, i);
            }
            obj = b(((Uri) (obj)));
            return new al(uri, ((Map) (obj)), a((String)((Map) (obj)).get("t")));
        }
        if ("youtu.be".equalsIgnoreCase(((Uri) (obj)).getHost()))
        {
            uri = ((Uri) (obj)).getPathSegments();
            if (uri.isEmpty() || TextUtils.isEmpty((CharSequence)uri.get(0)))
            {
                throw new ParseException((new StringBuilder("No video id in the Uri path: ")).append(obj).toString(), 0);
            } else
            {
                Map map = b(((Uri) (obj)));
                return new al(uri.subList(0, 1), a(map), a(((Uri) (obj)), map));
            }
        }
        uri = ((Uri) (obj)).getPath();
        String s1 = ((Uri) (obj)).getFragment();
        if (uri.startsWith("/watch") || uri.startsWith("/movie"))
        {
            return c(((Uri) (obj)));
        }
        if (uri.startsWith("/get_video"))
        {
            uri = b(((Uri) (obj)));
            s1 = (String)uri.get("video_id");
            if (!TextUtils.isEmpty(s1))
            {
                return new al(s1, a(((Map) (uri))), a(((Uri) (obj)), ((Map) (uri))));
            } else
            {
                throw new ParseException((new StringBuilder("No id found in the uri: ")).append(obj).toString(), 0);
            }
        }
        if (uri.startsWith("/v/"))
        {
            return d(((Uri) (obj)));
        }
        if (uri.startsWith("/e/") || uri.startsWith("/embed/"))
        {
            return new al(((Uri) (obj)).getLastPathSegment(), b(((Uri) (obj))), a(((Uri) (obj)).getQueryParameter("start")));
        }
        if (s1 != null && (s1.startsWith("/watch") || s1.startsWith("watch")))
        {
            uri = ((Uri) (obj)).getFragment();
            return c(Uri.parse(((Uri) (obj)).buildUpon().encodedPath(uri).fragment("").build().toString()));
        } else
        {
            throw new ParseException("Unrecognised URI", 0);
        }
    }

    private static Map a(Map map)
    {
        map = new HashMap(map);
        map.remove("v");
        map.remove("video_id");
        map.remove("video_ids");
        map.remove("feature");
        return map;
    }

    private static Map b(Uri uri)
    {
        if (uri.isOpaque())
        {
            return Collections.emptyMap();
        }
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = uri.getQueryParameterNames().iterator(); iterator.hasNext(); hashmap.put(s, uri.getQueryParameter(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private static al c(Uri uri)
    {
        Map map = b(uri);
        String s = (String)map.get("v");
        String s2 = (String)map.get("video_ids");
        Object obj = s;
        if (TextUtils.isEmpty(s))
        {
            obj = s;
            if (TextUtils.isEmpty(s2))
            {
                obj = uri.getPathSegments();
                int i = ((List) (obj)).indexOf("watch");
                if (i < 0)
                {
                    throw new ParseException((new StringBuilder("No /watch/ part in the Uri: ")).append(uri).toString(), 0);
                }
                if (i + 1 >= ((List) (obj)).size())
                {
                    throw new ParseException((new StringBuilder("No id found in the Uri: ")).append(uri).toString(), 0);
                }
                String s1 = (String)((List) (obj)).get(i + 1);
                obj = s1;
                if (TextUtils.isEmpty(s1))
                {
                    throw new ParseException((new StringBuilder("No video id in the Uri: ")).append(uri).toString(), 0);
                }
            }
        }
        if (s2 == null)
        {
            return new al(((String) (obj)), a(map), a(uri, map));
        } else
        {
            return new al(Arrays.asList(s2.split(",")), a(map), a(uri, map));
        }
    }

    private static al d(Uri uri)
    {
        uri = uri.getLastPathSegment().split("&");
        String s = uri[0];
        HashMap hashmap = new HashMap();
        for (int i = 1; i < uri.length; i++)
        {
            String as[] = uri[i].split("=");
            if (as.length == 2)
            {
                hashmap.put(as[0], as[1]);
            }
        }

        return new al(s, hashmap, a((String)hashmap.get("start")));
    }
}
