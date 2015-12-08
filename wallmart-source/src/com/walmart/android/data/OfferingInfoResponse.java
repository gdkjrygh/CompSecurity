// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class OfferingInfoResponse
{
    public static class ProductInfo
    {

        public ItemRules itemRules[];
        public Product product;

        public ProductInfo()
        {
        }
    }

    public static class ProductInfo.ItemRules
    {

        private static final String OVERRIDE_LEVEL_CODE_2 = "2";
        private static final String OVERRIDE_LEVEL_CODE_3 = "3";
        private static final int RULE_ID_ACTIVATION = 45;
        private static final int RULE_ID_AGE_RANGE_QUESTION = 23;
        private static final int RULE_ID_BAR_CODE_REGISTRATION = 17;
        private static final int RULE_ID_EXTENDED_BARCODE = 12;
        private static final int RULE_ID_GREEN_DOT_INSTANT_ISSUE = 30;
        private static final int RULE_ID_GREEN_DOT_MONEYPAK = 31;
        private static final int RULE_ID_GROUP_QTY_LIMIT = 11;
        private static final int RULE_ID_ID_REQUIRED = 6;
        private static final int RULE_ID_ITEMS_SOLD_SEPARATELY = 7;
        private static final int RULE_ID_MIN_MAX_RANGE = 47;
        private static final int RULE_ID_OVERRIDE_REQUIRED = 9;
        private static final int RULE_ID_OVERRIDE_RESTRICTION = 24;
        private static final int RULE_ID_PHONE_CARDS = 3;
        private static final int RULE_ID_QUANTITY_LIMIT = 4;
        private static final int RULE_ID_REGISTER_LOCKDOWN = 40;
        private static final int RULE_ID_SHOPPING_CARD = 18;
        private static final int RULE_ID_SIRAS_REGISTRATION = 14;
        private static final int RULE_ID_VARIABLE_LOAD_VISA_GIFT_CARD = 46;
        private static final int RULE_ID_VISA_GIFT_CARD = 37;
        private static final int RULE_ID_WHACKY_TERBACKY = 22;
        public String ageToBuy;
        public String overrideLevelCode;
        public String posInfoQty_1;
        public String posInfoQty_2;
        public String posRuleId;

        public String getRestriction()
        {
            if (ageToBuy != null)
            {
                return "Age to buy";
            }
            if ("2".equals(overrideLevelCode) || "3".equals(overrideLevelCode))
            {
                return (new StringBuilder()).append("Override code ").append(overrideLevelCode).toString();
            }
            if (posRuleId != null)
            {
                return (new StringBuilder()).append("POS rule ").append(posRuleId).toString();
            } else
            {
                return "";
            }
        }

        public boolean isRestricted()
        {
            boolean flag = false;
            if (ageToBuy != null)
            {
                flag = true;
            } else
            {
                if ("2".equals(overrideLevelCode) || "3".equals(overrideLevelCode))
                {
                    return true;
                }
                if (posRuleId != null)
                {
                    int i;
                    try
                    {
                        i = Integer.parseInt(posRuleId);
                    }
                    catch (NumberFormatException numberformatexception)
                    {
                        Log.w(OfferingInfoResponse.TAG, "Unexpected POS Rule Id");
                        return false;
                    }
                    switch (i)
                    {
                    case 5: // '\005'
                    case 8: // '\b'
                    case 9: // '\t'
                    case 10: // '\n'
                    case 13: // '\r'
                    case 15: // '\017'
                    case 16: // '\020'
                    case 19: // '\023'
                    case 20: // '\024'
                    case 21: // '\025'
                    case 25: // '\031'
                    case 26: // '\032'
                    case 27: // '\033'
                    case 28: // '\034'
                    case 29: // '\035'
                    case 32: // ' '
                    case 33: // '!'
                    case 34: // '"'
                    case 35: // '#'
                    case 36: // '$'
                    case 38: // '&'
                    case 39: // '\''
                    case 41: // ')'
                    case 42: // '*'
                    case 43: // '+'
                    case 44: // ','
                    default:
                        return false;

                    case 3: // '\003'
                    case 4: // '\004'
                    case 6: // '\006'
                    case 7: // '\007'
                    case 11: // '\013'
                    case 12: // '\f'
                    case 14: // '\016'
                    case 17: // '\021'
                    case 18: // '\022'
                    case 22: // '\026'
                    case 23: // '\027'
                    case 24: // '\030'
                    case 30: // '\036'
                    case 31: // '\037'
                    case 37: // '%'
                    case 40: // '('
                    case 45: // '-'
                    case 46: // '.'
                    case 47: // '/'
                        return true;
                    }
                }
            }
            return flag;
        }

        public ProductInfo.ItemRules()
        {
        }
    }

    public static class ProductInfo.Product
    {

        public GlobalTradeItem globalTradeItems[];
        public String id;

        public ProductInfo.Product()
        {
        }
    }

    public static class ProductInfo.Product.GlobalTradeItem
    {

        public String description;
        public String gtin;

        public ProductInfo.Product.GlobalTradeItem()
        {
        }
    }

    public static class Status
    {

        public String code;
        public String description;

        public Status()
        {
        }
    }

    public static class TaxInfo
    {

        public String taxBucketPercentage;

        public TaxInfo()
        {
        }
    }


    private static final String TAG = com/walmart/android/data/OfferingInfoResponse.getSimpleName();
    public ProductInfo productInfo;
    public Status status;
    public TaxInfo taxInfo[];

    public OfferingInfoResponse()
    {
    }

    public List getRestrictionRules()
    {
        ArrayList arraylist = new ArrayList();
        if (productInfo != null && productInfo.itemRules != null)
        {
            ProductInfo.ItemRules aitemrules[] = productInfo.itemRules;
            int j = aitemrules.length;
            for (int i = 0; i < j; i++)
            {
                ProductInfo.ItemRules itemrules = aitemrules[i];
                if (itemrules.isRestricted())
                {
                    arraylist.add(itemrules.getRestriction());
                }
            }

        }
        return arraylist;
    }

    public double getTaxPercentage()
    {
        double d;
        double d1;
        d = 0.0D;
        d1 = d;
        if (taxInfo == null) goto _L2; else goto _L1
_L1:
        TaxInfo ataxinfo[];
        int i;
        int j;
        ataxinfo = taxInfo;
        j = ataxinfo.length;
        i = 0;
_L3:
        TaxInfo taxinfo;
        d1 = d;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        taxinfo = ataxinfo[i];
        d1 = Double.parseDouble(taxinfo.taxBucketPercentage);
        d += d1;
_L4:
        i++;
        if (true) goto _L3; else goto _L2
        NumberFormatException numberformatexception;
        numberformatexception;
        Log.e(TAG, (new StringBuilder()).append("Failed to parse tax percentage: ").append(taxinfo.taxBucketPercentage).toString());
          goto _L4
_L2:
        return d1;
    }

    public boolean isRestricted()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (productInfo == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (productInfo.itemRules == null) goto _L2; else goto _L3
_L3:
        ProductInfo.ItemRules aitemrules[];
        int i;
        int j;
        aitemrules = productInfo.itemRules;
        j = aitemrules.length;
        i = 0;
_L8:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L4
_L4:
        if (!aitemrules[i].isRestricted()) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        return flag;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }


}
