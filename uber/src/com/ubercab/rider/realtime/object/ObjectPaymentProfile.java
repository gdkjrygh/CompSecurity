// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.PaymentProfile;
import hmh;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectPaymentProfile

abstract class ObjectPaymentProfile
    implements hmh
{

    public static final PaymentProfile GOOGLE_WALLET = createGoogleWalletPaymentProfile();

    ObjectPaymentProfile()
    {
    }

    private static PaymentProfile createGoogleWalletPaymentProfile()
    {
        Shape_ObjectPaymentProfile shape_objectpaymentprofile = new Shape_ObjectPaymentProfile();
        shape_objectpaymentprofile.setCardType("Google Wallet");
        shape_objectpaymentprofile.setUuid("FAKE-GOOGLE-WALLET-UUID");
        return shape_objectpaymentprofile;
    }

    public String getExpirationMonthFormatted()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MM");
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpledateformat.format(new Date(getCardExpirationEpoch()));
    }

    public String getExpirationYearFormatted()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yy");
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpledateformat.format(new Date(getCardExpirationEpoch()));
    }

}
