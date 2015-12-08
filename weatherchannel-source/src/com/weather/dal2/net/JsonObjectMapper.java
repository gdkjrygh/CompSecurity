// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.net;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import org.json.JSONException;

// Referenced classes of package com.weather.dal2.net:
//            IntTypeAdapter, LongTypeAdapter, DoubleTypeAdapter, FloatTypeAdapter

public final class JsonObjectMapper
{

    private static final Gson defaultMapper;

    private JsonObjectMapper()
    {
    }

    public static Object fromJson(String s, Class class1)
        throws JSONException
    {
        try
        {
            s = ((String) (defaultMapper.fromJson(s, class1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException(s.toString());
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        throw new JSONException("Unable to parse json for unknown reason");
        return s;
    }

    public static Object fromJson(String s, Type type)
        throws JSONException
    {
        try
        {
            s = ((String) (defaultMapper.fromJson(s, type)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException(s.toString());
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        throw new JSONException("Unable to parse json for unknown reason");
        return s;
    }

    public static String toJson(Object obj)
    {
        return defaultMapper.toJson(obj);
    }

    static 
    {
        GsonBuilder gsonbuilder = new GsonBuilder();
        gsonbuilder.registerTypeAdapter(java/lang/Integer, new IntTypeAdapter());
        gsonbuilder.registerTypeAdapter(java/lang/Long, new LongTypeAdapter());
        gsonbuilder.registerTypeAdapter(java/lang/Double, new DoubleTypeAdapter());
        gsonbuilder.registerTypeAdapter(java/lang/Float, new FloatTypeAdapter());
        defaultMapper = gsonbuilder.create();
    }
}
