// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.google;

import android.net.Uri;
import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.net.ParsingSimpleHttpGetRequest;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONException;

// Referenced classes of package com.weather.dal2.google:
//            AddressList

public abstract class GoogleApiConnection extends ParsingSimpleHttpGetRequest
{

    private static final String BASE_URL = "http://maps.googleapis.com";
    private static final String PATH = "/maps/api/geocode/json";
    private static final String QUERY = "%s=%s&sensor=false";
    private static final String TAG = "GoogleApiConnection";

    public GoogleApiConnection()
    {
    }

    private static String buildUrl(String s, String s1)
    {
        s = String.format(Locale.US, "%s=%s&sensor=false", new Object[] {
            s, Uri.encode(s1)
        });
        s = (new StringBuilder()).append("/maps/api/geocode/json?").append(s).toString();
        s = (new StringBuilder()).append("http://maps.googleapis.com").append(s).toString();
        LogUtil.d("GoogleApiConnection", LoggingMetaTags.TWC_DAL, "URL: %s", new Object[] {
            s
        });
        return s;
    }

    protected void asyncFetch(String s, String s1, Receiver receiver, Object obj)
    {
        asyncFetch(buildUrl(s, s1), com/weather/dal2/google/AddressList, false, obj, receiver);
    }

    protected AddressList fetch(String s, String s1)
        throws DalException, IOException, JSONException
    {
        return (AddressList)fetch(buildUrl(s, s1), com/weather/dal2/google/AddressList, false);
    }
}
