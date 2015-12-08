// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.android.pharmacy.service.PharmacyServiceSettings;

// Referenced classes of package com.walmart.android.config:
//            ServiceConfigChangedEvent

public class WalmartPharmacyServiceSettings
    implements PharmacyServiceSettings
{

    public static final String DEBUG_PHARMACY_SERVER_SETTING = "pharmacy_server_setting";
    public static final int DEFAULT_SERVICE_MODE = 0;
    private static final String SERVER_OPTIONS_STRING_ARRAY[] = {
        "Production", "Staging", "API-E5", "API-E7", "API-E8"
    };
    public static final int SERVICE_MODE_API_E5 = 2;
    public static final int SERVICE_MODE_API_E7 = 3;
    public static final int SERVICE_MODE_API_E8 = 4;
    public static final int SERVICE_MODE_PRODUCTION = 0;
    public static final int SERVICE_MODE_STAGING = 1;
    private static final String SHARED_PREF = "debug_prefs";
    private final String mBaseUrl;
    private final String mSecureBaseUrl = "https://api-e8.mobile.walmart.com/";

    public WalmartPharmacyServiceSettings(Context context)
    {
        switch (0)
        {
        case 3: // '\003'
        default:
            mBaseUrl = "http://api-e7.mobile.walmart.com/";
            mSecureBaseUrl = "https://api-e7.mobile.walmart.com/";
            return;

        case 0: // '\0'
            mBaseUrl = "http://api.mobile.walmart.com/";
            mSecureBaseUrl = "https://api.mobile.walmart.com/";
            return;

        case 1: // '\001'
            mBaseUrl = "http://api-staging.mobile.walmart.com/";
            mSecureBaseUrl = "https://api-staging.mobile.walmart.com/";
            return;

        case 2: // '\002'
            mBaseUrl = "http://api-e5.mobile.walmart.com/";
            mSecureBaseUrl = "https://api-e5.mobile.walmart.com/";
            return;

        case 4: // '\004'
            mBaseUrl = "http://api-e8.mobile.walmart.com/";
            break;
        }
    }

    private static int loadServiceMode(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("pharmacy_server_setting", 0);
    }

    public static void showServerSelectDialog(Activity activity)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setTitle("Select pharmacy server");
        String as[] = SERVER_OPTIONS_STRING_ARRAY;
        int i = loadServiceMode(activity);
        builder.setSingleChoiceItems(as, i, new android.content.DialogInterface.OnClickListener(i, activity) {

            final Activity val$activity;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    WalmartPharmacyServiceSettings.storeValue(activity, "pharmacy_server_setting", j);
                    MessageBus.getBus().post(new ServiceConfigChangedEvent());
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                activity = activity1;
                super();
            }
        });
        builder.show();
    }

    private static void storeValue(Context context, String s, int i)
    {
        context.getSharedPreferences("debug_prefs", 0).edit().putInt(s, i).apply();
    }

    public String getBaseUrl()
    {
        return mBaseUrl;
    }

    public String getSecureBaseUrl()
    {
        return mSecureBaseUrl;
    }


}
