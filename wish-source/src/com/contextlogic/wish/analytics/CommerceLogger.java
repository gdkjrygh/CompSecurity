// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.analytics;

import com.contextlogic.wish.api.service.CommerceLogService;
import java.util.HashMap;

public class CommerceLogger
{
    public static final class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action NATIVE_GET_BRAINTREE_CLIENT_TOKEN;
        public static final Action NATIVE_SAVE_BILLING_INFO;
        public static final Action NATIVE_SAVE_SHIPPING_INFO;
        public static final Action NATIVE_SAVE_TABBED_BILLING_INFO;
        public static final Action UPDATE_BOLETO_BILLING_INFO;
        public static final Action UPDATE_BRAINTREE_BILLING_INFO;
        public static final Action UPDATE_FAMILY_BILLING_INFO;
        public static final Action UPDATE_OXXO_BILLING_INFO;
        public static final Action UPDATE_SHIPPING_INFO;
        public static final Action UPDATE_STRIPE_BILLING_INFO;
        private int value;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/contextlogic/wish/analytics/CommerceLogger$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        public int getValue()
        {
            return value;
        }

        static 
        {
            UPDATE_STRIPE_BILLING_INFO = new Action("UPDATE_STRIPE_BILLING_INFO", 0, 1);
            UPDATE_BRAINTREE_BILLING_INFO = new Action("UPDATE_BRAINTREE_BILLING_INFO", 1, 2);
            NATIVE_SAVE_SHIPPING_INFO = new Action("NATIVE_SAVE_SHIPPING_INFO", 2, 3);
            NATIVE_SAVE_BILLING_INFO = new Action("NATIVE_SAVE_BILLING_INFO", 3, 4);
            NATIVE_SAVE_TABBED_BILLING_INFO = new Action("NATIVE_SAVE_TABBED_BILLING_INFO", 4, 5);
            UPDATE_SHIPPING_INFO = new Action("UPDATE_SHIPPING_INFO", 5, 6);
            UPDATE_BOLETO_BILLING_INFO = new Action("UPDATE_BOLETO_BILLING_INFO", 6, 7);
            UPDATE_FAMILY_BILLING_INFO = new Action("UPDATE_FAMILY_BILLING_INFO", 7, 23);
            NATIVE_GET_BRAINTREE_CLIENT_TOKEN = new Action("NATIVE_GET_BRAINTREE_CLIENT_TOKEN", 8, 31);
            UPDATE_OXXO_BILLING_INFO = new Action("UPDATE_OXXO_BILLING_INFO", 9, 34);
            $VALUES = (new Action[] {
                UPDATE_STRIPE_BILLING_INFO, UPDATE_BRAINTREE_BILLING_INFO, NATIVE_SAVE_SHIPPING_INFO, NATIVE_SAVE_BILLING_INFO, NATIVE_SAVE_TABBED_BILLING_INFO, UPDATE_SHIPPING_INFO, UPDATE_BOLETO_BILLING_INFO, UPDATE_FAMILY_BILLING_INFO, NATIVE_GET_BRAINTREE_CLIENT_TOKEN, UPDATE_OXXO_BILLING_INFO
            });
        }

        private Action(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }

    public static final class Result extends Enum
    {

        private static final Result $VALUES[];
        public static final Result ADYEN_SDK_ERROR;
        public static final Result API_ERROR;
        public static final Result BALANCED_SDK_ERROR;
        public static final Result BRAINTREE_SDK_ERROR;
        public static final Result CUSTOMER_ID_TAKEN;
        public static final Result DECLINE_CVV;
        public static final Result DECLINE_FRAUD;
        public static final Result DECLINE_GENERAL;
        public static final Result DECLINE_ZIP;
        public static final Result EBANX_SDK_ERROR;
        public static final Result INVALID_FIELD_DATA;
        public static final Result INVALID_ZIP;
        public static final Result LONG_ZIP;
        public static final Result MISSING_FIELDS;
        public static final Result PROCESSING_ERROR;
        public static final Result SHIPPING_MISSING;
        public static final Result STRIPE_SDK_ERROR;
        public static final Result SUCCESS;
        private int value;

        public static Result valueOf(String s)
        {
            return (Result)Enum.valueOf(com/contextlogic/wish/analytics/CommerceLogger$Result, s);
        }

        public static Result[] values()
        {
            return (Result[])$VALUES.clone();
        }

        public int getValue()
        {
            return value;
        }

        static 
        {
            SUCCESS = new Result("SUCCESS", 0, 1);
            DECLINE_CVV = new Result("DECLINE_CVV", 1, 2);
            DECLINE_ZIP = new Result("DECLINE_ZIP", 2, 3);
            DECLINE_GENERAL = new Result("DECLINE_GENERAL", 3, 4);
            INVALID_ZIP = new Result("INVALID_ZIP", 4, 5);
            LONG_ZIP = new Result("LONG_ZIP", 5, 6);
            SHIPPING_MISSING = new Result("SHIPPING_MISSING", 6, 7);
            PROCESSING_ERROR = new Result("PROCESSING_ERROR", 7, 8);
            DECLINE_FRAUD = new Result("DECLINE_FRAUD", 8, 9);
            CUSTOMER_ID_TAKEN = new Result("CUSTOMER_ID_TAKEN", 9, 10);
            MISSING_FIELDS = new Result("MISSING_FIELDS", 10, 11);
            INVALID_FIELD_DATA = new Result("INVALID_FIELD_DATA", 11, 12);
            API_ERROR = new Result("API_ERROR", 12, 13);
            STRIPE_SDK_ERROR = new Result("STRIPE_SDK_ERROR", 13, 14);
            BALANCED_SDK_ERROR = new Result("BALANCED_SDK_ERROR", 14, 44);
            EBANX_SDK_ERROR = new Result("EBANX_SDK_ERROR", 15, 45);
            ADYEN_SDK_ERROR = new Result("ADYEN_SDK_ERROR", 16, 46);
            BRAINTREE_SDK_ERROR = new Result("BRAINTREE_SDK_ERROR", 17, 55);
            $VALUES = (new Result[] {
                SUCCESS, DECLINE_CVV, DECLINE_ZIP, DECLINE_GENERAL, INVALID_ZIP, LONG_ZIP, SHIPPING_MISSING, PROCESSING_ERROR, DECLINE_FRAUD, CUSTOMER_ID_TAKEN, 
                MISSING_FIELDS, INVALID_FIELD_DATA, API_ERROR, STRIPE_SDK_ERROR, BALANCED_SDK_ERROR, EBANX_SDK_ERROR, ADYEN_SDK_ERROR, BRAINTREE_SDK_ERROR
            });
        }

        private Result(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }


    public static final String EXTRA_INFO_AFFECTED_FIELDS = "affected_fields";
    public static final String EXTRA_INFO_ERROR_MESSAGE = "error_message";
    public static final String EXTRA_INFO_FROM_NAV_BAR = "from_nav_bar";

    public CommerceLogger()
    {
    }

    private static void logAction(boolean flag, Action action, Result result, HashMap hashmap)
    {
        (new CommerceLogService()).requestService(flag, action.getValue(), result.getValue(), hashmap, null, null);
    }

    public static void logError(Action action, Result result, HashMap hashmap)
    {
        logAction(false, action, result, hashmap);
    }

    public static void logSuccess(Action action, Result result, HashMap hashmap)
    {
        logAction(true, action, result, hashmap);
    }
}
