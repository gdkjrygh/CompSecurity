// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend.location;

import android.net.TrafficStats;
import android.net.Uri;
import android.util.Log;
import com.google.gson.reflect.TypeToken;
import com.weather.commons.ups.backend.UpsConstants;
import com.weather.dal2.TwcDataServer;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.util.net.HttpRequest;
import java.util.List;
import java.util.Locale;

public class AddressValidationRequest
{
    private static final class LazyHolder
    {

        private static final AddressValidationRequest INSTANCE = new AddressValidationRequest();



        private LazyHolder()
        {
        }
    }


    private static final TypeToken MAP_POINT_LIST_TYPE = new TypeToken() {

    };
    private static final String TAG = "AddressValidationRequest";
    private static final int TIME_OUT = 15000;
    private static final String query = "/wxd/mappoint/%s?api=%s";

    private AddressValidationRequest()
    {
    }


    private static String buildUrl(String s)
    {
        s = String.format(Locale.US, "/wxd/mappoint/%s?api=%s", new Object[] {
            Uri.encode(s), TwcDataServer.getApiKey()
        });
        return (new StringBuilder()).append(UpsConstants.DSX_SERVER).append(s).toString();
    }

    private List fetch(String s)
    {
        String s1;
        String s2;
        List list;
        list = null;
        s2 = null;
        s1 = null;
        TrafficStats.setThreadStatsTag(61442);
        s = HttpRequest.get(s).useCaches(true).header("Cache-Control", "no-cache").acceptJson().acceptGzipEncoding().trustAllHosts().readTimeout(15000).connectTimeout(15000).uncompress(true);
        s1 = s;
        s2 = s;
        if (!s.ok())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        s1 = s;
        s2 = s;
        list = (List)JsonObjectMapper.fromJson(s.body(), MAP_POINT_LIST_TYPE.getType());
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        TrafficStats.clearThreadStatsTag();
        return list;
        s;
        s2 = s1;
        Log.e("AddressValidationRequest", s.getMessage(), s);
        if (s1 != null)
        {
            try
            {
                s1.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        TrafficStats.clearThreadStatsTag();
        return null;
        s;
        if (s2 != null)
        {
            try
            {
                s2.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw s;
    }

    public static AddressValidationRequest getInstance()
    {
        return LazyHolder.INSTANCE;
    }

    public List syncFetch(String s)
    {
        return fetch(buildUrl(s));
    }

}
