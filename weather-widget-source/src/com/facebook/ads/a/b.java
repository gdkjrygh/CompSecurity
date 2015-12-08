// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{

    private String a;
    private Map b;
    private int c;

    public b(String s, Map map, int i)
    {
        a = s;
        b = map;
        c = i;
    }

    public static b a(long l, a a1)
    {
        long l1 = System.currentTimeMillis();
        HashMap hashmap = new HashMap();
        hashmap.put("Time", String.valueOf(l1 - l));
        hashmap.put("AdAction", String.valueOf(a1.f));
        return new b("bounceback", hashmap, (int)(l1 / 1000L));
    }

    public static b a(Exception exception)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ex", exception.getClass().getSimpleName());
        hashmap.put("ex_msg", exception.getMessage());
        return new b("error", hashmap, (int)(System.currentTimeMillis() / 1000L));
    }

    public JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("name", a);
            jsonobject.put("data", new JSONObject(b));
            jsonobject.put("time", c);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    private class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a g[];
        int f;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/facebook/ads/a/b$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("OPEN_STORE", 0, 0);
            b = new a("OPEN_LINK", 1, 1);
            c = new a("XOUT", 2, 2);
            d = new a("OPEN_URL", 3, 3);
            e = new a("SHOW_INTERSTITIAL", 4, 4);
            g = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i, int j)
        {
            super(s, i);
            f = j;
        }
    }

}
