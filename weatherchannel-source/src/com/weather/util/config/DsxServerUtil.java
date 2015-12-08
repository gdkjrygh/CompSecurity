// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;

import com.google.common.collect.ImmutableMap;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class DsxServerUtil
{

    public static final String DSX_DEV = "dsx-dev";
    public static final String DSX_INT = "dsx-int";
    public static final String DSX_PROD = "dsx";
    public static final String DSX_SECURE_DEV = "dsx-dev-secure";
    public static final String DSX_SECURE_INT = "dsx-int-secure";
    public static final String DSX_SECURE_PROD = "dsx-secure";
    public static final String DSX_SECURE_STAGE = "dsx-stage-secure";
    public static final String DSX_SECURE_STATIC = "dsx-static-secure.qc.aws";
    private static final Map DSX_SERVER;
    private static final Map DSX_SERVER_DEFAULT = ImmutableMap.of("{DSX_SERVER}", "dsx", "{DSX_SERVER_SECURE}", "dsx-secure");
    public static final String DSX_STAGE = "dsx-stage";
    public static final String DSX_STATIC = "dsx-static.qc.aws";
    public static final String DX_SERVER_KEY = "{DSX_SERVER}";
    public static final String DX_SERVER_SECURE_KEY = "{DSX_SERVER_SECURE}";

    private DsxServerUtil()
    {
    }

    public static String appendDsxServer(String s)
    {
        return appendDsxServer(s, TwcPrefs.getInstance());
    }

    static String appendDsxServer(String s, Prefs prefs)
    {
        Object obj;
label0:
        {
            obj = s;
            if (s == null)
            {
                break label0;
            }
            Iterator iterator = DSX_SERVER.entrySet().iterator();
            do
            {
                obj = s;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj = (java.util.Map.Entry)iterator.next();
            } while (!s.contains((CharSequence)((java.util.Map.Entry) (obj)).getKey()));
            obj = s.replace((CharSequence)((java.util.Map.Entry) (obj)).getKey(), prefs.getString((Enum)((java.util.Map.Entry) (obj)).getValue(), (String)DSX_SERVER_DEFAULT.get(((java.util.Map.Entry) (obj)).getKey())));
        }
        return ((String) (obj));
    }

    static 
    {
        DSX_SERVER = ImmutableMap.of("{DSX_SERVER}", com.weather.util.prefs.TwcPrefs.Keys.DSX_SERVER, "{DSX_SERVER_SECURE}", com.weather.util.prefs.TwcPrefs.Keys.DSX_SERVER_SECURE);
    }
}
