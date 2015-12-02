// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.model;

import android.content.res.Resources;
import android.os.Parcelable;
import android.text.TextUtils;
import gsg;
import java.util.Locale;

// Referenced classes of package com.ubercab.payment.model:
//            Shape_PaymentProfile

public abstract class PaymentProfile
    implements Parcelable
{

    public static final String USE_CASE_PERSONAL = "Personal";

    public PaymentProfile()
    {
    }

    public static Builder builder()
    {
        return Builder.create();
    }

    private static String convertUseCase(Resources resources, String s)
    {
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 40
    //                   -1146830912: 80
    //                   443164224: 66;
           goto _L3 _L4 _L5
_L3:
        byte0;
        JVM INSTR tableswitch 0 1: default 64
    //                   0 94
    //                   1 102;
           goto _L2 _L6 _L7
_L2:
        return s;
_L5:
        if (s.equals("personal"))
        {
            byte0 = 0;
        }
          goto _L3
_L4:
        if (s.equals("business"))
        {
            byte0 = 1;
        }
          goto _L3
_L6:
        return resources.getString(gsg.ub__payment_personal);
_L7:
        return resources.getString(gsg.ub__payment_business);
    }

    private static PaymentProfile create()
    {
        return new Shape_PaymentProfile();
    }

    public abstract String getAccountName();

    public abstract String getBillingCountryIso2();

    public abstract String getBillingZip();

    public abstract long getCardExpirationEpoch();

    public abstract String getCardNumber();

    public abstract String getCardType();

    public String getDisplayName(Resources resources)
    {
        String s2 = getTokenType();
        if (!TextUtils.isEmpty(s2)) goto _L2; else goto _L1
_L1:
        resources = null;
_L15:
        return resources;
_L2:
        byte byte0 = -1;
        s2.hashCode();
        JVM INSTR lookupswitch 9: default 104
    //                   -1414960566: 187
    //                   -995205389: 232
    //                   -920235116: 262
    //                   -523793033: 294
    //                   -384049774: 172
    //                   3046195: 217
    //                   106444065: 247
    //                   825497556: 278
    //                   1702338205: 202;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_294;
_L13:
        switch (byte0)
        {
        default:
            String s = getTokenDisplayName();
            resources = s;
            if (TextUtils.isEmpty(s))
            {
                return s2;
            }
            break;

        case 0: // '\0'
            return resources.getString(gsg.ub__payment_airtel);

        case 1: // '\001'
            return resources.getString(gsg.ub__payment_alipay);

        case 2: // '\002'
            return resources.getString(gsg.ub__payment_baidu_wallet);

        case 3: // '\003'
            return resources.getString(gsg.ub__payment_cash);

        case 4: // '\004'
            return resources.getString(gsg.ub__payment_paypal);

        case 5: // '\005'
            return resources.getString(gsg.ub__payment_paytm);

        case 6: // '\006'
            if ("Google Wallet".equals(getCardType()))
            {
                return resources.getString(gsg.ub__payment_google_wallet);
            }
            // fall through

        case 7: // '\007'
        case 8: // '\b'
            String s1 = "";
            String s3 = convertUseCase(resources, getUseCase());
            resources = s1;
            if (!TextUtils.isEmpty(s3))
            {
                resources = (new StringBuilder()).append("").append(String.format("%s ", new Object[] {
                    s3
                })).toString();
            }
            return (new StringBuilder()).append(resources).append(String.format("\u2022\u2022\u2022\u2022 %s", new Object[] {
                getCardNumber()
            })).toString();
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (s2.equals("airtel_money"))
        {
            byte0 = 0;
        }
          goto _L13
_L4:
        if (s2.equals("alipay"))
        {
            byte0 = 1;
        }
          goto _L13
_L12:
        if (s2.equals("baidu_wallet"))
        {
            byte0 = 2;
        }
          goto _L13
_L9:
        if (s2.equals("cash"))
        {
            byte0 = 3;
        }
          goto _L13
_L5:
        if (s2.equals("paypal"))
        {
            byte0 = 4;
        }
          goto _L13
_L10:
        if (s2.equals("paytm"))
        {
            byte0 = 5;
        }
          goto _L13
_L6:
        if (s2.equals("braintree"))
        {
            byte0 = 6;
        }
          goto _L13
_L11:
        if (s2.equals("lianlian"))
        {
            byte0 = 7;
        }
          goto _L13
        if (s2.equals("zaakpay"))
        {
            byte0 = 8;
        }
          goto _L13
        if (true) goto _L15; else goto _L14
_L14:
    }

    public abstract String getExpirationMonthFormatted();

    public abstract String getExpirationYearFormatted();

    public abstract String getStatus();

    public Status getStatusEnum()
    {
        Object obj;
        try
        {
            obj = getStatus();
        }
        catch (Exception exception)
        {
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        obj = (Status)Enum.valueOf(com/ubercab/payment/model/PaymentProfile$Status, ((String) (obj)).toUpperCase(Locale.US));
        return ((Status) (obj));
        return null;
    }

    public abstract String getTokenDisplayName();

    public abstract String getTokenType();

    public abstract String getUseCase();

    public abstract String getUuid();

    abstract PaymentProfile setAccountName(String s);

    abstract PaymentProfile setBillingCountryIso2(String s);

    abstract PaymentProfile setBillingZip(String s);

    abstract PaymentProfile setCardExpirationEpoch(long l);

    abstract PaymentProfile setCardNumber(String s);

    abstract PaymentProfile setCardType(String s);

    abstract PaymentProfile setExpirationMonthFormatted(String s);

    abstract PaymentProfile setExpirationYearFormatted(String s);

    abstract PaymentProfile setStatus(String s);

    abstract PaymentProfile setTokenDisplayName(String s);

    abstract PaymentProfile setTokenType(String s);

    abstract PaymentProfile setUseCase(String s);

    abstract PaymentProfile setUuid(String s);


    private class Builder
    {

        static Builder create()
        {
            return new Shape_PaymentProfile_Builder();
        }

        public PaymentProfile build()
        {
            return PaymentProfile.create().setAccountName(getAccountName()).setCardExpirationEpoch(getCardExpirationEpoch()).setBillingCountryIso2(getBillingCountryIso2()).setBillingZip(getBillingZip()).setCardNumber(getCardNumber()).setCardType(getCardType()).setTokenDisplayName(getTokenDisplayName()).setTokenType(getTokenType()).setUseCase(getUseCase()).setUuid(getUuid()).setStatus(getStatus());
        }

        public abstract String getAccountName();

        public abstract String getBillingCountryIso2();

        public abstract String getBillingZip();

        public abstract long getCardExpirationEpoch();

        public abstract String getCardNumber();

        public abstract String getCardType();

        public abstract String getStatus();

        public abstract String getTokenDisplayName();

        public abstract String getTokenType();

        public abstract String getUseCase();

        public abstract String getUuid();

        public abstract Builder setAccountName(String s);

        public abstract Builder setBillingCountryIso2(String s);

        public abstract Builder setBillingZip(String s);

        public abstract Builder setCardExpirationEpoch(long l);

        public abstract Builder setCardNumber(String s);

        public abstract Builder setCardType(String s);

        public abstract Builder setStatus(String s);

        public abstract Builder setTokenDisplayName(String s);

        public abstract Builder setTokenType(String s);

        public abstract Builder setUseCase(String s);

        public abstract Builder setUuid(String s);

        public Builder()
        {
        }
    }


    /* member class not found */
    class Status {}

}
