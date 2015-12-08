// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.aws.auth;

import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.io.IOUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AwsCredentials
{

    private static final String ACCESS = "access";
    private static final String ENDPOINT = "endpoint";
    private static final String FORMAT_KEY = "%s:%s";
    public static final AwsCredentials INSTANCE = new AwsCredentials();
    private static final String SECRET = "secret";
    private static final String USER = "user";
    private final Map credentials = new HashMap();

    private AwsCredentials()
    {
    }

    private void load()
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray(IOUtil.getStringFromFile(AbstractTwcApplication.getRootContext(), com.weather.dal2.R.raw.aws));
        int i = 0;
        for (int j = jsonarray.length(); i < j; i++)
        {
            Object obj = jsonarray.getJSONObject(i);
            String s = ((JSONObject) (obj)).getString("endpoint");
            String s1 = ((JSONObject) (obj)).getString("user");
            String s2 = ((JSONObject) (obj)).getString("access");
            obj = ((JSONObject) (obj)).getString("secret");
    /* block-local class not found */
    class Credentials {}

            credentials.put(String.format("%s:%s", new Object[] {
                s, s1
            }), new Credentials(s2, ((String) (obj)), null));
        }

    }

    public Credentials get(String s, String s1)
    {
        if (credentials.isEmpty())
        {
            try
            {
                load();
            }
            catch (JSONException jsonexception)
            {
                LogUtil.method("AwsCredentials", LoggingMetaTags.TWC_DSX_LOG, "Error loading Raw file with credentials: %s", new Object[] {
                    jsonexception.getMessage()
                });
            }
        }
        return (Credentials)credentials.get(String.format("%s:%s", new Object[] {
            s, s1
        }));
    }

}
