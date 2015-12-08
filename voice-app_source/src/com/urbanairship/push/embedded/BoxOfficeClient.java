// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.embedded;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.urbanairship.push.PushPreferences;
import com.urbanairship.restclient.Request;
import com.urbanairship.restclient.Response;
import com.urbanairship.util.Device;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.UUID;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

public class BoxOfficeClient
{
    public static class BoxOfficeException extends Exception
    {

        private static final long serialVersionUID = 1L;

        public BoxOfficeException(String s)
        {
            super(s);
        }
    }

    public static class FatalBoxOfficeException extends BoxOfficeException
    {

        private static final long serialVersionUID = 1L;

        public FatalBoxOfficeException(String s)
        {
            super(s);
        }
    }

    public static class FirstRunForbiddenException extends FatalBoxOfficeException
    {

        private static final long serialVersionUID = 1L;

        public FirstRunForbiddenException(String s)
        {
            super(s);
        }
    }


    private static String ANDROID_LIB_VERSION_PREFIX = "android-lib-";
    private static final String APID_PREFERENCE_KEY = "com.urbanairship.preferences.apid";
    private static final String SHARED_PREFERENCES_NAME = "com.urbanairship.preferences";

    public BoxOfficeClient()
    {
    }

    private String generateApid()
        throws BoxOfficeException
    {
        String s = UUID.randomUUID().toString();
        Logger.debug((new StringBuilder()).append("Generating APID: ").append(s).toString());
        PushPreferences pushpreferences = PushManager.shared().getPreferences();
        android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString("com.urbanairship.preferences.apid", s);
        if (editor.commit() && pushpreferences.setPushId(s))
        {
            return s;
        } else
        {
            throw new BoxOfficeException("The APID was invalid or failed to save.");
        }
    }

    private String getAPID()
        throws BoxOfficeException
    {
        PushPreferences pushpreferences = PushManager.shared().getPreferences();
        String s = pushpreferences.getPushId();
        if (s != null)
        {
            return s;
        }
        s = getSharedPreferences().getString("com.urbanairship.preferences.apid", null);
        if (s != null && pushpreferences.setPushId(s))
        {
            Logger.debug((new StringBuilder()).append("Restored APID: ").append(s).append(" from shared preferences.").toString());
            return s;
        } else
        {
            return generateApid();
        }
    }

    private SharedPreferences getSharedPreferences()
    {
        return UAirship.shared().getApplicationContext().getSharedPreferences("com.urbanairship.preferences", 0);
    }

    private void setRequestHeaders(Request request)
    {
        request.setHeader("X-UA-Device-Family", "Android");
        request.setHeader("X-UA-Device-Model", Build.MODEL);
        request.setHeader("X-UA-OS-Version", android.os.Build.VERSION.RELEASE);
        request.setHeader("X-UA-Lib-Version", (new StringBuilder()).append(ANDROID_LIB_VERSION_PREFIX).append(UAirship.getVersion()).toString());
        request.setHeader("X-UA-Package-Name", UAirship.getPackageName());
        request.setHeader("X-UA-Transport", "GCM");
        request.setHeader("X-UA-Sent-At", (new DecimalFormat("0.000")).format((double)System.currentTimeMillis() / 1000D));
        request.setHeader("X-UA-App-Key", UAirship.shared().getAirshipConfigOptions().getAppKey());
        if (UAirship.shared().getAirshipConfigOptions().analyticsEnabled)
        {
            request.setHeader("X-UA-Device-ID", Device.getHashedDeviceId());
        }
    }

    public String firstRun()
        throws BoxOfficeException
    {
        Object obj;
        Object obj2;
        Logger.info("Performing BoxOffice firstRun.");
        obj2 = getAPID();
        obj = new ArrayList();
        ((ArrayList) (obj)).add(new BasicNameValuePair("package", UAirship.getPackageName()));
        ((ArrayList) (obj)).add(new BasicNameValuePair("apid", ((String) (obj2))));
        obj2 = new Request("POST", (new StringBuilder()).append(Config.BoxOffice.url).append("/firstrun").toString());
        obj = new UrlEncodedFormEntity(((java.util.List) (obj)), "UTF-8");
        try
        {
            ((Request) (obj2)).setEntity(((org.apache.http.HttpEntity) (obj)));
            break MISSING_BLOCK_LABEL_97;
        }
        catch (UnsupportedEncodingException unsupportedencodingexception) { }
          goto _L1
        obj1;
_L1:
        throw new BoxOfficeException("Failed to post to /firstrun; UTF-8 unsupported!");
        setRequestHeaders(((Request) (obj2)));
        obj2 = ((Request) (obj2)).execute();
        Object obj1 = PushManager.shared().getPreferences();
        if (obj2 == null)
        {
            throw new BoxOfficeException("Failed to post to /firstrun; request failed");
        }
        int i = ((Response) (obj2)).status();
        if (i == 409)
        {
            ((PushPreferences) (obj1)).setPushId(null);
            throw new BoxOfficeException("Unrecoverable firstrun state. Clearing APID.");
        }
        if (i == 403)
        {
            throw new FirstRunForbiddenException((new StringBuilder()).append("Failed to post to firstrun; forbidden. Reason:\n").append(((Response) (obj2)).body()).toString());
        }
        if (i == 200)
        {
            obj2 = ((Response) (obj2)).body().trim();
            if (((PushPreferences) (obj1)).setPushSecret(((String) (obj2))))
            {
                return ((String) (obj2));
            } else
            {
                throw new BoxOfficeException("Failed to post to /firstrun; The secret was invalid or failed to save.");
            }
        } else
        {
            throw new BoxOfficeException((new StringBuilder()).append("Failed to post to /firstrun: ").append(i).append(". Check your airship configuration, particularly your app key and secret.").toString());
        }
    }

}
