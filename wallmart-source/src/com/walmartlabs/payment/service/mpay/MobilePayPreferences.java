// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.mpay;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Base64;
import com.walmartlabs.payment.service.payment.Transaction;
import com.walmartlabs.utils.WLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

public class MobilePayPreferences
{

    private static final String FILE_PREF = "mpay_preferences";
    private static final String PREF_LAST_TRANSACTION = "LAST_TRANSACTION";
    private static final String PREF_MANUALLY_ENABLED = "MANUALLY_ENABLED";
    private static final String PREF_PAY_AVAILABLE = "PAY_AVAILABLE";
    private static final String PREF_SAVER_ANNOUNCEMENT = "SAVER_ANNOUNCEMENT";
    private static final String TAG = com/walmartlabs/payment/service/mpay/MobilePayPreferences.getSimpleName();

    public MobilePayPreferences()
    {
    }

    public static void clearSavedTransaction(Context context)
    {
        context.getSharedPreferences("mpay_preferences", 0).edit().putString("LAST_TRANSACTION", null).apply();
    }

    public static Transaction getSavedTransaction(Context context)
    {
        Parcel parcel;
        String s;
        parcel = null;
        s = context.getSharedPreferences("mpay_preferences", 0).getString("LAST_TRANSACTION", null);
        context = parcel;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        parcel = Parcel.obtain();
        context = Base64.decode(s, 0);
        parcel.unmarshall(context, 0, context.length);
        parcel.setDataPosition(0);
        context = new Transaction(parcel);
        parcel.recycle();
        return context;
        context;
        parcel.recycle();
        throw context;
    }

    public static boolean hasAnnouncedInSaver(Context context)
    {
        return context.getSharedPreferences("mpay_preferences", 0).getBoolean("SAVER_ANNOUNCEMENT", false);
    }

    public static boolean isMobilePayAvailable(Context context)
    {
        return context.getSharedPreferences("mpay_preferences", 0).getBoolean("PAY_AVAILABLE", false);
    }

    public static boolean isMobilePayManuallyEnabled(Context context)
    {
        return context.getSharedPreferences("mpay_preferences", 0).getBoolean("MANUALLY_ENABLED", false);
    }

    public static void setAnnouncedInSaver(Context context, boolean flag)
    {
        context.getSharedPreferences("mpay_preferences", 0).edit().putBoolean("SAVER_ANNOUNCEMENT", flag).apply();
    }

    public static void setMobilePayAvailable(Context context, boolean flag)
    {
        context.getSharedPreferences("mpay_preferences", 0).edit().putBoolean("PAY_AVAILABLE", flag).apply();
    }

    public static void setMobilePayManuallyEnabled(Context context, boolean flag)
    {
        context.getSharedPreferences("mpay_preferences", 0).edit().putBoolean("MANUALLY_ENABLED", flag).apply();
    }

    public static void setSavedTransaction(Context context, Transaction transaction)
    {
        Transaction transaction1;
        Object obj;
        Parcel parcel;
        parcel = Parcel.obtain();
        obj = null;
        transaction1 = obj;
        transaction.writeToParcel(parcel, 0);
        transaction1 = obj;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        transaction1 = obj;
        IOUtils.write(parcel.marshall(), bytearrayoutputstream);
        transaction1 = obj;
        transaction = Base64.encodeToString(bytearrayoutputstream.toByteArray(), 0);
        transaction1 = transaction;
        bytearrayoutputstream.close();
        parcel.recycle();
_L2:
        if (transaction != null)
        {
            context.getSharedPreferences("mpay_preferences", 0).edit().putString("LAST_TRANSACTION", transaction).apply();
        }
        return;
        transaction;
        WLog.e(TAG, (new StringBuilder()).append("Could not write parcel to output stream: ").append(transaction.getMessage()).toString());
        parcel.recycle();
        transaction = transaction1;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        parcel.recycle();
        throw context;
    }

}
