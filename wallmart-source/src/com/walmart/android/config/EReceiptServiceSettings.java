// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ereceipt.service.EReceiptManager;

// Referenced classes of package com.walmart.android.config:
//            ServiceConfigChangedEvent

public class EReceiptServiceSettings
{

    private static final String DEBUG_ERECEIPT_SERVER_SETTING = "ereceipt_server_setting";
    public static final int DEFAULT_SERVICE_MODE = 0;
    private static String PROD_KEY = "OwfR0Ch1wWgAmqgi5gh3Cw==";
    private static String QA_KEY = "VnVkdUdpcm9WdWR1R2lybw==";
    private static final String SERVER_OPTIONS_STRING_ARRAY[] = {
        "Prod", "receipts-stg0", "store-stg1.mobile", "Non Auth Production", "Non Auth Test"
    };
    public static final int SERVICE_MODE_LEGACY_PRODUCTION = 3;
    public static final int SERVICE_MODE_LEGACY_TEST = 4;
    public static final int SERVICE_MODE_PRODUCTION = 0;
    public static final int SERVICE_MODE_RECEIPTS_STG0 = 1;
    public static final int SERVICE_MODE_STORE_STG1_MOBILE = 2;
    private static final String SHARED_PREF = "debug_prefs";
    private final String mKey;
    private final String mSecureBaseUrl;
    private final int mServiceMode = 0;

    public EReceiptServiceSettings(Context context)
    {
        switch (mServiceMode)
        {
        default:
            mSecureBaseUrl = "https://store.mobile.walmart.com";
            mKey = PROD_KEY;
            return;

        case 1: // '\001'
            mSecureBaseUrl = "https://receipts-stg0.walmart.com";
            mKey = QA_KEY;
            return;

        case 2: // '\002'
            mSecureBaseUrl = "https://store-stg1.mobile.walmart.com";
            mKey = QA_KEY;
            return;

        case 3: // '\003'
            mSecureBaseUrl = "https://receipts.walmart.com";
            mKey = PROD_KEY;
            return;

        case 4: // '\004'
            mSecureBaseUrl = "http://receipts.walmartlabs.com";
            break;
        }
        mKey = QA_KEY;
    }

    public static int loadServiceMode(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("ereceipt_server_setting", 1);
    }

    public static void showEReceiptServerSelectDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Select eReceipt server");
        String as[] = SERVER_OPTIONS_STRING_ARRAY;
        int i = loadServiceMode(context);
        builder.setSingleChoiceItems(as, i, new android.content.DialogInterface.OnClickListener(i, context) {

            final Context val$context;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    EReceiptServiceSettings.storeValue(context, "ereceipt_server_setting", j);
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

    public String getKey()
    {
        return mKey;
    }

    public String getSecureBaseUrl()
    {
        return mSecureBaseUrl;
    }


}
