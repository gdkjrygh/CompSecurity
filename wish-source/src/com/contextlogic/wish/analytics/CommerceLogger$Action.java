// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.analytics;


// Referenced classes of package com.contextlogic.wish.analytics:
//            CommerceLogger

public static final class value extends Enum
{

    private static final UPDATE_OXXO_BILLING_INFO $VALUES[];
    public static final UPDATE_OXXO_BILLING_INFO NATIVE_GET_BRAINTREE_CLIENT_TOKEN;
    public static final UPDATE_OXXO_BILLING_INFO NATIVE_SAVE_BILLING_INFO;
    public static final UPDATE_OXXO_BILLING_INFO NATIVE_SAVE_SHIPPING_INFO;
    public static final UPDATE_OXXO_BILLING_INFO NATIVE_SAVE_TABBED_BILLING_INFO;
    public static final UPDATE_OXXO_BILLING_INFO UPDATE_BOLETO_BILLING_INFO;
    public static final UPDATE_OXXO_BILLING_INFO UPDATE_BRAINTREE_BILLING_INFO;
    public static final UPDATE_OXXO_BILLING_INFO UPDATE_FAMILY_BILLING_INFO;
    public static final UPDATE_OXXO_BILLING_INFO UPDATE_OXXO_BILLING_INFO;
    public static final UPDATE_OXXO_BILLING_INFO UPDATE_SHIPPING_INFO;
    public static final UPDATE_OXXO_BILLING_INFO UPDATE_STRIPE_BILLING_INFO;
    private int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/contextlogic/wish/analytics/CommerceLogger$Action, s);
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
        UPDATE_STRIPE_BILLING_INFO = new <init>("UPDATE_STRIPE_BILLING_INFO", 0, 1);
        UPDATE_BRAINTREE_BILLING_INFO = new <init>("UPDATE_BRAINTREE_BILLING_INFO", 1, 2);
        NATIVE_SAVE_SHIPPING_INFO = new <init>("NATIVE_SAVE_SHIPPING_INFO", 2, 3);
        NATIVE_SAVE_BILLING_INFO = new <init>("NATIVE_SAVE_BILLING_INFO", 3, 4);
        NATIVE_SAVE_TABBED_BILLING_INFO = new <init>("NATIVE_SAVE_TABBED_BILLING_INFO", 4, 5);
        UPDATE_SHIPPING_INFO = new <init>("UPDATE_SHIPPING_INFO", 5, 6);
        UPDATE_BOLETO_BILLING_INFO = new <init>("UPDATE_BOLETO_BILLING_INFO", 6, 7);
        UPDATE_FAMILY_BILLING_INFO = new <init>("UPDATE_FAMILY_BILLING_INFO", 7, 23);
        NATIVE_GET_BRAINTREE_CLIENT_TOKEN = new <init>("NATIVE_GET_BRAINTREE_CLIENT_TOKEN", 8, 31);
        UPDATE_OXXO_BILLING_INFO = new <init>("UPDATE_OXXO_BILLING_INFO", 9, 34);
        $VALUES = (new .VALUES[] {
            UPDATE_STRIPE_BILLING_INFO, UPDATE_BRAINTREE_BILLING_INFO, NATIVE_SAVE_SHIPPING_INFO, NATIVE_SAVE_BILLING_INFO, NATIVE_SAVE_TABBED_BILLING_INFO, UPDATE_SHIPPING_INFO, UPDATE_BOLETO_BILLING_INFO, UPDATE_FAMILY_BILLING_INFO, NATIVE_GET_BRAINTREE_CLIENT_TOKEN, UPDATE_OXXO_BILLING_INFO
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
