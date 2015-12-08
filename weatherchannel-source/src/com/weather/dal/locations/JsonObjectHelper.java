// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import android.util.Log;
import com.google.common.base.Preconditions;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonObjectHelper
{

    private static final String TAG = "JsonObjectHelper";
    private final JSONObject object;

    public JsonObjectHelper(JSONObject jsonobject)
    {
        Preconditions.checkNotNull(jsonobject);
        object = jsonobject;
    }

    public BigDecimal getBigDecimal(String s)
    {
        Preconditions.checkNotNull(s);
        return getBigDecimal(s, null);
    }

    public BigDecimal getBigDecimal(String s, BigDecimal bigdecimal)
    {
        Preconditions.checkNotNull(s);
        s = object.optString(s);
        if (s.isEmpty())
        {
            return bigdecimal;
        } else
        {
            return new BigDecimal(s);
        }
    }

    public Integer getInt(String s)
    {
        Preconditions.checkNotNull(s);
        return getInt(s, null);
    }

    public Integer getInt(String s, Integer integer)
    {
        Preconditions.checkNotNull(s);
        int i;
        try
        {
            i = object.getInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("JsonObjectHelper", s.toString());
            return integer;
        }
        return Integer.valueOf(i);
    }

    public Long getLong(String s)
    {
        Preconditions.checkNotNull(s);
        return getLong(s, null);
    }

    public Long getLong(String s, Long long1)
    {
        Preconditions.checkNotNull(s);
        long l;
        try
        {
            l = object.getLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("JsonObjectHelper", s.toString());
            return long1;
        }
        return Long.valueOf(l);
    }

    public String getString(String s)
    {
        Preconditions.checkNotNull(s);
        return getString(s, null);
    }

    public String getString(String s, String s1)
    {
        Preconditions.checkNotNull(s);
        s = object.optString(s);
        if (s.isEmpty())
        {
            return s1;
        } else
        {
            return s;
        }
    }
}
