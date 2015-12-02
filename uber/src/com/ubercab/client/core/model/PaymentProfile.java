// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.RewardInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.ubercab.client.core.model:
//            RewardInfo

public class PaymentProfile
    implements com.ubercab.rider.realtime.model.PaymentProfile
{

    public static final String CARD_USE_CASE_BUSINESS = "business";
    public static final String CARD_USE_CASE_PERSONAL = "personal";
    public static final PaymentProfile GOOGLE_WALLET = new PaymentProfile("Google Wallet", "FAKE-GOOGLE-WALLET-UUID");
    String accountName;
    String billingCountryIso2;
    String billingZip;
    long cardExpirationEpoch;
    String cardNumber;
    String cardType;
    com.ubercab.client.core.model.RewardInfo rewardInfo;
    String status;
    String tokenType;
    String useCase;
    String uuid;

    public PaymentProfile()
    {
        cardExpirationEpoch = 0L;
        accountName = "";
        billingCountryIso2 = "";
        billingZip = "";
        cardNumber = "";
        cardType = "";
        status = "";
        tokenType = "";
        useCase = "";
        uuid = "";
    }

    private PaymentProfile(String s, String s1)
    {
        cardExpirationEpoch = 0L;
        accountName = "";
        billingCountryIso2 = "";
        billingZip = "";
        cardNumber = "";
        cardType = "";
        status = "";
        tokenType = "";
        useCase = "";
        uuid = "";
        cardType = s;
        uuid = s1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PaymentProfile)obj;
            if (cardExpirationEpoch != ((PaymentProfile) (obj)).cardExpirationEpoch)
            {
                return false;
            }
            if (accountName == null ? ((PaymentProfile) (obj)).accountName != null : !accountName.equals(((PaymentProfile) (obj)).accountName))
            {
                return false;
            }
            if (billingCountryIso2 == null ? ((PaymentProfile) (obj)).billingCountryIso2 != null : !billingCountryIso2.equals(((PaymentProfile) (obj)).billingCountryIso2))
            {
                return false;
            }
            if (billingZip == null ? ((PaymentProfile) (obj)).billingZip != null : !billingZip.equals(((PaymentProfile) (obj)).billingZip))
            {
                return false;
            }
            if (cardNumber == null ? ((PaymentProfile) (obj)).cardNumber != null : !cardNumber.equals(((PaymentProfile) (obj)).cardNumber))
            {
                return false;
            }
            if (cardType == null ? ((PaymentProfile) (obj)).cardType != null : !cardType.equals(((PaymentProfile) (obj)).cardType))
            {
                return false;
            }
            if (rewardInfo == null ? ((PaymentProfile) (obj)).rewardInfo != null : !rewardInfo.equals(((PaymentProfile) (obj)).rewardInfo))
            {
                return false;
            }
            if (status == null ? ((PaymentProfile) (obj)).status != null : !status.equals(((PaymentProfile) (obj)).status))
            {
                return false;
            }
            if (tokenType == null ? ((PaymentProfile) (obj)).tokenType != null : !tokenType.equals(((PaymentProfile) (obj)).tokenType))
            {
                return false;
            }
            if (useCase == null ? ((PaymentProfile) (obj)).useCase != null : !useCase.equals(((PaymentProfile) (obj)).useCase))
            {
                return false;
            }
            if (uuid == null ? ((PaymentProfile) (obj)).uuid != null : !uuid.equals(((PaymentProfile) (obj)).uuid))
            {
                return false;
            }
        }
        return true;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public String getBillingCountryIso2()
    {
        return billingCountryIso2;
    }

    public String getBillingZip()
    {
        return billingZip;
    }

    public long getCardExpirationEpoch()
    {
        return cardExpirationEpoch;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public String getCardType()
    {
        return cardType;
    }

    public String getExpirationMonth()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MM");
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpledateformat.format(new Date(cardExpirationEpoch));
    }

    public String getExpirationMonthFormatted()
    {
        return getExpirationMonth();
    }

    public String getExpirationYear()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yy", Locale.getDefault());
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpledateformat.format(new Date(cardExpirationEpoch));
    }

    public String getExpirationYearFormatted()
    {
        return getExpirationYear();
    }

    public com.ubercab.client.core.model.RewardInfo getRewardInfo()
    {
        return rewardInfo;
    }

    public volatile RewardInfo getRewardInfo()
    {
        return getRewardInfo();
    }

    public String getStatus()
    {
        return status;
    }

    public String getTokenDisplayName()
    {
        return getAccountName();
    }

    public String getTokenType()
    {
        return tokenType;
    }

    public String getUseCase()
    {
        return useCase;
    }

    public String getUuid()
    {
        return uuid;
    }

    public int hashCode()
    {
        int j2 = 0;
        int k2 = (int)(cardExpirationEpoch ^ cardExpirationEpoch >>> 32);
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (accountName != null)
        {
            i = accountName.hashCode();
        } else
        {
            i = 0;
        }
        if (billingCountryIso2 != null)
        {
            j = billingCountryIso2.hashCode();
        } else
        {
            j = 0;
        }
        if (billingZip != null)
        {
            k = billingZip.hashCode();
        } else
        {
            k = 0;
        }
        if (cardNumber != null)
        {
            l = cardNumber.hashCode();
        } else
        {
            l = 0;
        }
        if (cardType != null)
        {
            i1 = cardType.hashCode();
        } else
        {
            i1 = 0;
        }
        if (rewardInfo != null)
        {
            j1 = rewardInfo.hashCode();
        } else
        {
            j1 = 0;
        }
        if (status != null)
        {
            k1 = status.hashCode();
        } else
        {
            k1 = 0;
        }
        if (tokenType != null)
        {
            l1 = tokenType.hashCode();
        } else
        {
            l1 = 0;
        }
        if (useCase != null)
        {
            i2 = useCase.hashCode();
        } else
        {
            i2 = 0;
        }
        if (uuid != null)
        {
            j2 = uuid.hashCode();
        }
        return (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + k2 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j2;
    }

}
