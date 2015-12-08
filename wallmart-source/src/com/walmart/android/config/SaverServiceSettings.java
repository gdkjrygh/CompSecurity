// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ereceipt.service.EReceiptManager;

// Referenced classes of package com.walmart.android.config:
//            ServiceConfigChangedEvent

public class SaverServiceSettings
{

    private static final String DEBUG_SAVER_SERVER_SETTING = "saver_server_setting";
    public static final int DEFAULT_SERVICE_MODE = 0;
    private static final String SERVER_OPTIONS_STRING_ARRAY[] = {
        "Production", "Dev - Prod acc", "Dev - Stg acc", "Stg0", "Stg1", "Stg2"
    };
    public static final int SERVICE_MODE_DEV_PROD = 1;
    public static final int SERVICE_MODE_DEV_STAGING = 2;
    public static final int SERVICE_MODE_PRODUCTION = 0;
    public static final int SERVICE_MODE_STG0 = 3;
    public static final int SERVICE_MODE_STG1 = 4;
    public static final int SERVICE_MODE_STG2 = 5;
    private static final String SHARED_PREF = "debug_prefs";
    private final String mSecureBaseUrl;

    public SaverServiceSettings(Context context)
    {
        switch (0)
        {
        default:
            mSecureBaseUrl = "https://store.mobile.walmart.com";
            return;

        case 1: // '\001'
            mSecureBaseUrl = "https://esaver.mobile.walmart.com:4333";
            return;

        case 2: // '\002'
            mSecureBaseUrl = "https://esaver.mobile.walmart.com:4334";
            return;

        case 3: // '\003'
            mSecureBaseUrl = "https://store-stg0.mobile.walmart.com";
            return;

        case 4: // '\004'
            mSecureBaseUrl = "https://store-stg1.mobile.walmart.com";
            return;

        case 5: // '\005'
            mSecureBaseUrl = "https://store-stg2.mobile.walmart.com";
            break;
        }
    }

    public static int loadServiceMode(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("saver_server_setting", 0);
    }

    public static void showSaverServerSelectDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Select Saver server");
        String as[] = SERVER_OPTIONS_STRING_ARRAY;
        int i = loadServiceMode(context);
        builder.setSingleChoiceItems(as, i, new android.content.DialogInterface.OnClickListener(i, context) {

            final Context val$context;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    SaverServiceSettings.storeValue(context, "saver_server_setting", j);
                    EReceiptManager.get().clearAllReceipts(new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                        final _cls1 this$0;

                        public void onResult(Boolean boolean1)
                        {
                            MessageBus.getBus().post(new ServiceConfigChangedEvent());
                        }

                        public volatile void onResult(Object obj)
                        {
                            onResult((Boolean)obj);
                        }

            
            {
                this$0 = _cls1.this;
                super();
            }
                    });
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                context = context1;
                super();
            }
        });
        builder.show();
    }

    private static void storeValue(Context context, String s, int i)
    {
        context.getSharedPreferences("debug_prefs", 0).edit().putInt(s, i).apply();
    }

    public String getFaqUrl(String s)
    {
        android.net.Uri.Builder builder = Uri.parse(getSecureBaseUrl()).buildUpon();
        builder.appendEncodedPath("/appConfig/sc-faq.html");
        if (!TextUtils.isEmpty(s))
        {
            builder.fragment(s);
        }
        return builder.build().toString();
    }

    public String getSecureBaseUrl()
    {
        return mSecureBaseUrl;
    }


}
