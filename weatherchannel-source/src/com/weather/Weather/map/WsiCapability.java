// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map;

import android.util.Log;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WsiCapability
{

    private static final String RADAR_LAYER = "0039";
    private static final SimpleDateFormat sdf;
    private String ciphers[];
    private String validTimes[];

    public WsiCapability(String s)
        throws JSONException
    {
        s = (new JSONObject(s)).getJSONArray("layers");
label0:
        for (int i = 0; i < s.length(); i++)
        {
            Object obj = s.getJSONObject(i);
            if (!((JSONObject) (obj)).getString("n").equals("0039"))
            {
                continue;
            }
            obj = ((JSONObject) (obj)).getJSONArray("v");
            int k = ((JSONArray) (obj)).length();
            validTimes = new String[k];
            ciphers = new String[k];
            int j = 0;
            do
            {
                if (j >= k)
                {
                    continue label0;
                }
                Object obj1 = ((JSONArray) (obj)).getJSONObject(j);
                String s1 = ((JSONObject) (obj1)).getString("t");
                obj1 = ((JSONObject) (obj1)).getString("c");
                if (s1 == null || obj1 == null)
                {
                    Log.e("DAL", "Could not find cipher and/or validTime in WSI Capability file.");
                    throw new JSONException("Could not find cipher and/or validTime in WSI Capability file.");
                }
                validTimes[j] = s1;
                ciphers[j] = ((String) (obj1));
                j++;
            } while (true);
        }

    }

    public String getCipher(int i)
    {
        String s1 = "";
        String s = s1;
        if (ciphers != null)
        {
            s = s1;
            if (i < ciphers.length)
            {
                s = ciphers[i];
            }
        }
        return s;
    }

    public String getFormattedValidTime(int i)
        throws ParseException
    {
        Object obj;
        synchronized (sdf)
        {
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            obj = sdf.parse(getValidTime(i));
            obj = DateFormat.getDateTimeInstance(2, 3).format(((java.util.Date) (obj)));
        }
        return ((String) (obj));
        exception;
        simpledateformat;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getValidTime(int i)
    {
        String s1 = "";
        String s = s1;
        if (validTimes != null)
        {
            s = s1;
            if (i < validTimes.length)
            {
                s = validTimes[i];
            }
        }
        return s;
    }

    static 
    {
        sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
    }
}
