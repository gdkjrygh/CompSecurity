// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import java.util.ArrayList;

// Referenced classes of package com.walmart.android.service.saver:
//            ReceiptsSummaryResponse

public static class RedeemMethod
{
    public static class RedeemMethod
    {

        public static final String TYPE_BLUEBIRD = "AMEX Bluebird";
        public static final String TYPE_GIFT_CARD = "eGiftCard";
        public boolean preferred;
        public String type;

        public RedeemMethod()
        {
        }
    }


    public String amexLinkUrl;
    public String amexRegisterUrl;
    public int bluebirdRedeemableCents;
    public boolean canRedeemNowAMEX;
    public boolean canRedeemNowGiftCard;
    public boolean enableAMEXLink;
    public boolean enableAMEXRegister;
    public boolean hasSaverGiftCard;
    public ArrayList redeemMethods;
    public int redeemableCents;
    public int redeemedCents;
    public int tcLeftCount;

    public boolean canRedeemNow()
    {
        return canRedeemNowGiftCard || canRedeemNowAMEX;
    }

    public boolean isAmexLinkEnabled()
    {
        return enableAMEXLink && amexLinkUrl != null;
    }

    public boolean isAmexRegisterEnabled()
    {
        return enableAMEXRegister && amexRegisterUrl != null;
    }

    public boolean isBlueBirdLinked()
    {
        return amexLinkUrl == null && amexRegisterUrl == null;
    }

    public RedeemMethod()
    {
    }
}
