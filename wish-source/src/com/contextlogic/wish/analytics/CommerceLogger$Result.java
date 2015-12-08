// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.analytics;


// Referenced classes of package com.contextlogic.wish.analytics:
//            CommerceLogger

public static final class value extends Enum
{

    private static final BRAINTREE_SDK_ERROR $VALUES[];
    public static final BRAINTREE_SDK_ERROR ADYEN_SDK_ERROR;
    public static final BRAINTREE_SDK_ERROR API_ERROR;
    public static final BRAINTREE_SDK_ERROR BALANCED_SDK_ERROR;
    public static final BRAINTREE_SDK_ERROR BRAINTREE_SDK_ERROR;
    public static final BRAINTREE_SDK_ERROR CUSTOMER_ID_TAKEN;
    public static final BRAINTREE_SDK_ERROR DECLINE_CVV;
    public static final BRAINTREE_SDK_ERROR DECLINE_FRAUD;
    public static final BRAINTREE_SDK_ERROR DECLINE_GENERAL;
    public static final BRAINTREE_SDK_ERROR DECLINE_ZIP;
    public static final BRAINTREE_SDK_ERROR EBANX_SDK_ERROR;
    public static final BRAINTREE_SDK_ERROR INVALID_FIELD_DATA;
    public static final BRAINTREE_SDK_ERROR INVALID_ZIP;
    public static final BRAINTREE_SDK_ERROR LONG_ZIP;
    public static final BRAINTREE_SDK_ERROR MISSING_FIELDS;
    public static final BRAINTREE_SDK_ERROR PROCESSING_ERROR;
    public static final BRAINTREE_SDK_ERROR SHIPPING_MISSING;
    public static final BRAINTREE_SDK_ERROR STRIPE_SDK_ERROR;
    public static final BRAINTREE_SDK_ERROR SUCCESS;
    private int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/contextlogic/wish/analytics/CommerceLogger$Result, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0, 1);
        DECLINE_CVV = new <init>("DECLINE_CVV", 1, 2);
        DECLINE_ZIP = new <init>("DECLINE_ZIP", 2, 3);
        DECLINE_GENERAL = new <init>("DECLINE_GENERAL", 3, 4);
        INVALID_ZIP = new <init>("INVALID_ZIP", 4, 5);
        LONG_ZIP = new <init>("LONG_ZIP", 5, 6);
        SHIPPING_MISSING = new <init>("SHIPPING_MISSING", 6, 7);
        PROCESSING_ERROR = new <init>("PROCESSING_ERROR", 7, 8);
        DECLINE_FRAUD = new <init>("DECLINE_FRAUD", 8, 9);
        CUSTOMER_ID_TAKEN = new <init>("CUSTOMER_ID_TAKEN", 9, 10);
        MISSING_FIELDS = new <init>("MISSING_FIELDS", 10, 11);
        INVALID_FIELD_DATA = new <init>("INVALID_FIELD_DATA", 11, 12);
        API_ERROR = new <init>("API_ERROR", 12, 13);
        STRIPE_SDK_ERROR = new <init>("STRIPE_SDK_ERROR", 13, 14);
        BALANCED_SDK_ERROR = new <init>("BALANCED_SDK_ERROR", 14, 44);
        EBANX_SDK_ERROR = new <init>("EBANX_SDK_ERROR", 15, 45);
        ADYEN_SDK_ERROR = new <init>("ADYEN_SDK_ERROR", 16, 46);
        BRAINTREE_SDK_ERROR = new <init>("BRAINTREE_SDK_ERROR", 17, 55);
        $VALUES = (new .VALUES[] {
            SUCCESS, DECLINE_CVV, DECLINE_ZIP, DECLINE_GENERAL, INVALID_ZIP, LONG_ZIP, SHIPPING_MISSING, PROCESSING_ERROR, DECLINE_FRAUD, CUSTOMER_ID_TAKEN, 
            MISSING_FIELDS, INVALID_FIELD_DATA, API_ERROR, STRIPE_SDK_ERROR, BALANCED_SDK_ERROR, EBANX_SDK_ERROR, ADYEN_SDK_ERROR, BRAINTREE_SDK_ERROR
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
