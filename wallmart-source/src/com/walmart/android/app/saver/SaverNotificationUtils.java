// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SaverNotificationUtils
{

    private static final SimpleDateFormat ERECEIPT_SERVICE_FORMAT;
    public static final String EXTRA_AMOUNT_SAVED = "EXTRA_AMOUNT";
    public static final String EXTRA_DATE = "EXTRA_DATE";
    public static final String EXTRA_ERECEIPT_SUBMITTED_SAVER = "EXTRA_ERECEIPT_SUBMITTED_SAVER";
    public static final String GCM_PARAM_AMOUNT_SAVED = "amount-saved";
    public static final String GCM_PARAM_DATE = "date";
    public static final String GCM_PARAM_ERECEIPT_SUBMITTED_SAVER = "submittedToSC";
    public static final String GCM_PARAM_MESSAGE = "text";
    private static final String SAVER_NOTIFICATION_COUNTER_PREF = "SAVER_NOTIFICATION_COUNTER_PREF";
    private static final String SAVER_NOTIFICATION_PREFS = "SAVER_NOTIFICATION_PREFS";

    public SaverNotificationUtils()
    {
    }

    public static void clearNotification(Context context, String s)
    {
        ((NotificationManager)context.getSystemService("notification")).cancel(s, 0);
    }

    public static int getGCMAmountSaved(Intent intent)
    {
        int i;
        try
        {
            i = Integer.parseInt(intent.getStringExtra("amount-saved"));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return -1;
        }
        return i;
    }

    public static String getGCMDate(Intent intent)
    {
        try
        {
            intent = getLocalDate(ERECEIPT_SERVICE_FORMAT.parse(intent.getStringExtra("date")));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public static String getLocalDate(Intent intent)
    {
        String s = null;
        if (intent != null)
        {
            s = intent.getStringExtra("EXTRA_DATE");
        }
        return s;
    }

    public static String getLocalDate(Bundle bundle)
    {
        String s = null;
        if (bundle != null)
        {
            s = bundle.getString("EXTRA_DATE");
        }
        return s;
    }

    public static String getLocalDate(Date date)
    {
        try
        {
            date = EReceiptsContractUtil.LOCAL_DATE_FORMAT.format(date);
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            return null;
        }
        return date;
    }

    public static int getNextRequestCode(Context context)
    {
        context = context.getSharedPreferences("SAVER_NOTIFICATION_PREFS", 0);
        int i = context.getInt("SAVER_NOTIFICATION_COUNTER_PREF", 0) + 1;
        context = context.edit();
        context.putInt("SAVER_NOTIFICATION_COUNTER_PREF", i);
        context.apply();
        return i;
    }

    public static String getReceiptId(Intent intent)
    {
        String s = null;
        if (intent != null)
        {
            s = intent.getStringExtra("EXTRA_TC_NUMBER");
        }
        return s;
    }

    public static String getReceiptId(Bundle bundle)
    {
        String s = null;
        if (bundle != null)
        {
            s = bundle.getString("EXTRA_TC_NUMBER");
        }
        return s;
    }

    public static boolean isNotificationIntent(Intent intent)
    {
        return intent != null && intent.getStringExtra("EXTRA_TC_NUMBER") != null;
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

    static 
    {
        ERECEIPT_SERVICE_FORMAT = new SimpleDateFormat("yyyyMMdd", Locale.US);
    }
}
