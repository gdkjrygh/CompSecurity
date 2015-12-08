// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.weather.dal2.net.Receiver;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.news.provider:
//            CachingWeatherNodesImageFetcher

private static class <init>
    implements Receiver
{

    private final Receiver weatherNodeImageReceiver;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(String s, Object obj)
    {
        Object obj1;
        try
        {
            s = Files.toString(new File(s), Charsets.UTF_8);
            obj1 = (new JSONObject(CachingWeatherNodesImageFetcher.access$100().matcher(s).replaceAll(""))).optJSONObject("variants");
            s = ((JSONObject) (obj1)).optString("bw3grid");
            obj1 = ((JSONObject) (obj1)).optString("9");
            if (!s.isEmpty())
            {
                weatherNodeImageReceiver.onCompletion(s, obj);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            weatherNodeImageReceiver.onError(s, obj);
            return;
        }
        if (!((String) (obj1)).isEmpty())
        {
            weatherNodeImageReceiver.onCompletion(obj1, obj);
            return;
        }
        weatherNodeImageReceiver.onError(new Throwable("Empty url found for map and image specified variants"), obj);
        return;
    }

    public void onError(Throwable throwable, Object obj)
    {
        weatherNodeImageReceiver.onError(throwable, obj);
    }

    private (Receiver receiver)
    {
        weatherNodeImageReceiver = receiver;
    }

    weatherNodeImageReceiver(Receiver receiver, weatherNodeImageReceiver weathernodeimagereceiver)
    {
        this(receiver);
    }
}
