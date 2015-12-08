// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.ServiceException;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class EReceiptNotificationUtils
{

    private static final String ERECEIPT_NOTIFICATION_COUNTER_PREF = "ERECEIPT_NOTIFICATION_COUNTER_PREF";
    private static final String ERECEIPT_NOTIFICATION_PREFS = "ERECEIPT_NOTIFICATION_PREFS";
    public static final String EXTRA_FROM_SCANNER = "EXTRA_FROM_SCANNER";
    private static final String EXTRA_RECEIPT_DATA_KEY = "receipt";
    public static final String EXTRA_RECEIPT_ID = "EXTRA_RECEIPT_ID";
    public static final String EXTRA_RECEIPT_URL_VALUE = "walmart://ereceipts";
    public static final String EXTRA_STORE_ID = "EXTRA_STORE_ID";

    public EReceiptNotificationUtils()
    {
    }

    public static void clearNotification(Context context, String s)
    {
        ((NotificationManager)context.getSystemService("notification")).cancel(s, 0);
    }

    public static com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt getEReceipt(Intent intent)
    {
        return jsonToReceipt(intent.getStringExtra("receipt"));
    }

    public static String getEReceiptId(Intent intent)
    {
        String s = null;
        if (intent != null)
        {
            s = intent.getStringExtra("EXTRA_RECEIPT_ID");
        }
        return s;
    }

    public static String getEReceiptId(Bundle bundle)
    {
        String s = null;
        if (bundle != null)
        {
            s = bundle.getString("EXTRA_RECEIPT_ID");
        }
        return s;
    }

    public static int getNextRequestCode(Context context)
    {
        context = context.getSharedPreferences("ERECEIPT_NOTIFICATION_PREFS", 0);
        int i = context.getInt("ERECEIPT_NOTIFICATION_COUNTER_PREF", 0) + 1;
        context = context.edit();
        context.putInt("ERECEIPT_NOTIFICATION_COUNTER_PREF", i);
        context.apply();
        return i;
    }

    public static String getStoreId(Intent intent)
    {
        String s = null;
        if (intent != null)
        {
            s = intent.getStringExtra("EXTRA_STORE_ID");
        }
        return s;
    }

    public static String getStoreId(Bundle bundle)
    {
        String s = null;
        if (bundle != null)
        {
            s = bundle.getString("EXTRA_STORE_ID");
        }
        return s;
    }

    public static boolean isFromScanner(Intent intent)
    {
        boolean flag = false;
        if (intent != null)
        {
            flag = intent.getBooleanExtra("EXTRA_FROM_SCANNER", false);
        }
        return flag;
    }

    public static boolean isFromScanner(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("EXTRA_FROM_SCANNER");
        }
        return flag;
    }

    public static boolean isNotificationIntent(Intent intent)
    {
        return intent != null && intent.getStringExtra("EXTRA_RECEIPT_ID") != null;
    }

    private static com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt jsonToReceipt(String s)
    {
        Object obj = null;
        if (s != null)
        {
            obj = new JsonMapper();
            try
            {
                obj = (com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)((JsonMapper) (obj)).readValue(s, com/walmartlabs/ereceipt/service/EReceiptsResponse$Receipt);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
        }
        return ((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt) (obj));
    }

    public static void showNotification(String s, Context context, Notification notification)
    {
        if (s == null)
        {
            return;
        } else
        {
            ((NotificationManager)context.getSystemService("notification")).notify(s, 0, notification);
            return;
        }
    }
}
