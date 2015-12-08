// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.text.TextUtils;
import com.google.gson.Gson;

// Referenced classes of package com.braintreepayments.api.models:
//            AndroidPayConfiguration, AnalyticsConfiguration, PayPalConfiguration

public class Configuration
{

    private AnalyticsConfiguration mAnalyticsConfiguration;
    private AndroidPayConfiguration mAndroidPayConfiguration;
    private String mChallenges[];
    private String mClientApiUrl;
    private String mMerchantAccountId;
    private String mMerchantId;
    private PayPalConfiguration mPayPalConfiguration;
    private boolean mPaypalEnabled;
    private boolean mThreeDSecureEnabled;
    private String mVenmo;

    public Configuration()
    {
    }

    public static Configuration fromJson(String s)
    {
        return (Configuration)(new Gson()).fromJson(s, com/braintreepayments/api/models/Configuration);
    }

    private boolean isChallengePresent(String s)
    {
        if (mChallenges != null && mChallenges.length > 0)
        {
            String as[] = mChallenges;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                if (as[i].equals(s))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public AnalyticsConfiguration getAnalytics()
    {
        return mAnalyticsConfiguration;
    }

    public AndroidPayConfiguration getAndroidPay()
    {
        if (mAndroidPayConfiguration == null)
        {
            return new AndroidPayConfiguration();
        } else
        {
            return mAndroidPayConfiguration;
        }
    }

    public String getClientApiUrl()
    {
        return mClientApiUrl;
    }

    public String getMerchantAccountId()
    {
        return mMerchantAccountId;
    }

    public String getMerchantId()
    {
        return mMerchantId;
    }

    public PayPalConfiguration getPayPal()
    {
        return mPayPalConfiguration;
    }

    public String getVenmoState()
    {
        if (mVenmo == null)
        {
            return "off";
        } else
        {
            return mVenmo;
        }
    }

    public boolean isAnalyticsEnabled()
    {
        return mAnalyticsConfiguration != null && !TextUtils.isEmpty(mAnalyticsConfiguration.getUrl());
    }

    public boolean isCvvChallengePresent()
    {
        return isChallengePresent("cvv");
    }

    public boolean isPayPalEnabled()
    {
        return mPaypalEnabled && mPayPalConfiguration != null;
    }

    public boolean isPostalCodeChallengePresent()
    {
        return isChallengePresent("postal_code");
    }

    public boolean isThreeDSecureEnabled()
    {
        return mThreeDSecureEnabled;
    }
}
