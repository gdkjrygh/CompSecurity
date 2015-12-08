// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push;

import android.app.Activity;
import android.app.Dialog;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.ui.UIUtil;
import java.io.IOException;

public class GcmService extends IntentService
{

    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private static final String PREF_FILE = "GcmSettings";
    private static final String PROPERTY_APP_VERSION = "weatherAppVersion";
    private static final String PROPERTY_REG_ID = "gcmRegistrationId";
    private static final String SENDER_ID = "385394700893";
    private static final String SERVICE_TYPE = "service_type";
    private static final String TAG = "GcmService";
    private String regid;
    private ServiceType serviceType;

    public GcmService()
    {
        super("GcmService");
        regid = null;
        regid = getGcmRegistrationId(AbstractTwcApplication.getRootContext());
    }

    public static boolean checkPlayServices(Activity activity)
    {
        int i = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(activity);
        if (i != 0)
        {
            if (!GoogleApiAvailability.getInstance().isUserResolvableError(i))
            {
                Log.i("GcmService", "Google play services not supported on this device.");
            } else
            if (UIUtil.isAmazonMobile(activity))
            {
                Log.i("GcmService", "Play service not required in Amazon Devices");
            } else
            {
                GoogleApiAvailability.getInstance().getErrorDialog(activity, i, 9000).show();
                Log.i("GcmService", "Play service not available but recoverable");
            }
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean checkPlayServices(Context context)
    {
        int i = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (i != 0)
        {
            if (!GoogleApiAvailability.getInstance().isUserResolvableError(i))
            {
                Log.i("GcmService", "Google play services not supported on this device.");
            } else
            if (UIUtil.isAmazonMobile(context))
            {
                Log.i("GcmService", "Play service not required in Amazon Devices");
            } else
            {
                Log.i("GcmService", "Play service not available but recoverable");
            }
            return false;
        } else
        {
            return true;
        }
    }

    private static int getAppVersion(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Could not get package name: ").append(context).toString());
        }
        return i;
    }

    private static SharedPreferences getGCMPreferences(Context context)
    {
        return context.getSharedPreferences("GcmSettings", 0);
    }

    public static String getGcmRegistrationId(Context context)
    {
        SharedPreferences sharedpreferences = getGCMPreferences(context);
        String s1 = sharedpreferences.getString("gcmRegistrationId", null);
        String s = s1;
        if (s1 != null)
        {
            s = s1;
            if (sharedpreferences.getInt("weatherAppVersion", 0x80000000) != getAppVersion(context))
            {
                s = null;
            }
        }
        return s;
    }

    private String registerGcmClient()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        s = GoogleCloudMessaging.getInstance(AbstractTwcApplication.getRootContext()).register(new String[] {
            "385394700893"
        });
        saveGcmRegistrationId(AbstractTwcApplication.getRootContext(), s);
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    private static void saveGcmRegistrationId(Context context, String s)
    {
        SharedPreferences sharedpreferences = getGCMPreferences(context);
        int i = getAppVersion(context);
        context = sharedpreferences.edit();
        context.putString("gcmRegistrationId", s);
        context.putInt("weatherAppVersion", i);
        context.apply();
    }

    public static boolean startGcmService(ServiceType servicetype)
    {
        return startNewIntentService(servicetype);
    }

    private static boolean startNewIntentService(ServiceType servicetype)
    {
        Intent intent = new Intent(AbstractTwcApplication.getRootContext(), com/weather/Weather/push/GcmService);
        intent.putExtra("service_type", servicetype);
        AbstractTwcApplication.getRootContext().startService(intent);
        return true;
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null)
        {
            if ((intent = intent.getExtras()) != null)
            {
    /* block-local class not found */
    class ServiceType {}

                serviceType = (ServiceType)intent.get("service_type");
    /* block-local class not found */
    class GcmTask {}

                (new GcmTask(null)).execute(new Void[] {
                    null, null, null
                });
                return;
            }
        }
    }


/*
    static String access$102(GcmService gcmservice, String s)
    {
        gcmservice.regid = s;
        return s;
    }

*/
}
