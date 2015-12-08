// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.config.SaverServiceSettings;
import com.walmart.android.data.AppConfig;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Services;
import java.math.BigInteger;

public class SaverUtils
{

    private static final String CODE_39 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/%+";

    public SaverUtils()
    {
    }

    public static String barcodeToTc(String s)
    {
        if (s != null)
        {
            char ac[] = s.toCharArray();
            if (ac.length > 0)
            {
                ac[0] = (char)(ac[0] - 17);
                s = BigInteger.ONE;
                BigInteger biginteger = BigInteger.ZERO;
                BigInteger biginteger1 = BigInteger.valueOf(43L);
                for (int i = ac.length - 1; i >= 0; i--)
                {
                    int k = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/%+".indexOf(ac[i]);
                    if (k == -1)
                    {
                        return "";
                    }
                    biginteger = biginteger.add(s.multiply(BigInteger.valueOf(k)));
                    s = s.multiply(biginteger1);
                }

                s = biginteger.toString();
                if (s.length() > 2)
                {
                    int j = Integer.parseInt(s.substring(0, 2));
                    if (j >= 0 && j <= s.length() - 2)
                    {
                        return s.substring(s.length() - j);
                    }
                }
            }
        }
        return "";
    }

    public static String createBluebirdLinkFailureCallbackUrl(Activity activity)
    {
        return createUrl(activity, 0x7f090481);
    }

    public static String createBluebirdLinkSuccessCallbackUrl(Activity activity)
    {
        return createUrl(activity, 0x7f090482);
    }

    public static String createBluebirdRegistrationCallbackUrl(Activity activity)
    {
        return createUrl(activity, 0x7f090483);
    }

    public static Intent createSignInIntent(Activity activity)
    {
        int i = 1;
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig == null || !appconfig.eReceiptPhoneRegDisabled)
        {
            i = 1 | 0x10;
        }
        activity = new Intent(activity, com/walmart/android/app/account/AccountActivity);
        activity.putExtra("mode", i);
        activity.putExtra("from", "eReceipts");
        activity.putExtra("sign_in_title_text", 0x7f090539);
        return activity;
    }

    private static String createUrl(Activity activity, int i)
    {
        android.net.Uri.Builder builder = Uri.parse(Services.get().getSaverServiceSettings().getSecureBaseUrl()).buildUpon();
        builder.path(activity.getString(i));
        return builder.toString();
    }
}
