// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.json;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.weather.util.log.LogUtil;
import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsonUtil
{

    private static final Pattern JSON_LINE_SEPARATOR = Pattern.compile("\n");

    private JsonUtil()
    {
    }

    public static Map getFieldsAsStringMap(JSONObject jsonobject, String s, Map map)
    {
        Preconditions.checkNotNull(s);
        jsonobject = jsonobject.optJSONObject(s);
        if (jsonobject == null)
        {
            return map;
        }
        s = ImmutableMap.builder();
        map = jsonobject.keys();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            String s1 = (String)map.next();
            String s2 = jsonobject.optString(s1);
            if (s2 != null)
            {
                s.put(s1, s2);
            }
        } while (true);
        return s.build();
    }

    public static Map getFieldsAsStringObjectMap(JSONObject jsonobject, String s, Map map)
    {
        Preconditions.checkNotNull(s);
        jsonobject = jsonobject.optJSONObject(s);
        if (jsonobject == null)
        {
            return map;
        }
        s = ImmutableMap.builder();
        map = jsonobject.keys();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            String s1 = (String)map.next();
            Object obj = jsonobject.opt(s1);
            if (!JSONObject.NULL.equals(obj))
            {
                s.put(s1, obj);
            }
        } while (true);
        return s.build();
    }

    public static List getKeys(String s)
    {
        ArrayList arraylist = new ArrayList();
        try
        {
            for (s = (new JSONObject(s)).keys(); s.hasNext(); arraylist.add(s.next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return arraylist;
    }

    public static JSONArray insertObjectIntoArray(JSONArray jsonarray, int i, Object obj)
        throws JSONException
    {
        int k = jsonarray.length();
        Preconditions.checkPositionIndex(i, k);
        JSONArray jsonarray1 = new JSONArray();
        for (int j = 0; j < k; j++)
        {
            if (j == i)
            {
                jsonarray1.put(obj);
            }
            jsonarray1.put(jsonarray.get(j));
        }

        if (i == k)
        {
            jsonarray1.put(obj);
        }
        return jsonarray1;
    }

    public static void logPretty(String s, Iterable iterable, String s1)
    {
        if (!LogUtil.isLoggable(iterable, 3)) goto _L2; else goto _L1
_L1:
        Object obj = (new GsonBuilder()).setPrettyPrinting().create();
        String as[];
        int j;
        obj = ((Gson) (obj)).toJson((new JsonParser()).parse(s1));
        as = JSON_LINE_SEPARATOR.split(((CharSequence) (obj)));
        j = as.length;
        int i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        LogUtil.d(s, iterable, as[i], new Object[0]);
        i++;
        if (true) goto _L3; else goto _L2
        JsonSyntaxException jsonsyntaxexception;
        jsonsyntaxexception;
        LogUtil.d(s, iterable, "can't pretty print.", new Object[] {
            jsonsyntaxexception
        });
        LogUtil.d(s, iterable, (new StringBuilder()).append("uglyJson=").append(s1).toString(), new Object[0]);
_L2:
    }

    public static String validateAndGetString(JSONObject jsonobject, String s)
        throws ValidationException, JSONException
    {
        jsonobject = ((JSONObject) (jsonobject.get(s)));
        Validation.validateClass(java/lang/String, s, jsonobject);
        return jsonobject.toString();
    }

}
