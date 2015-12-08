// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import java.util.ArrayList;
import java.util.List;

public class StatusResponse
{
    public static class BackendError
    {

        public List errors;
        public String status;

        public BackendError()
        {
            errors = new ArrayList();
        }
    }

    public static class BackendError.Error
    {

        public String category;
        public String code;
        public String description;
        public String severity;

        public BackendError.Error()
        {
        }
    }

    public static interface BackendError.ErrorCodes
    {

        public static final int CUSTOMER_NOT_FOUND = 1116;
        public static final int INSUFFICIENT_FUNDS = 1112;
        public static final int INVALID_DATE_FORMAT = 1120;
        public static final int INVALID_RECEIPT_NUMBER = 1119;
        public static final int INVALID_REQUEST = 1101;
        public static final int INVALID_REQUEST_TRY_AGAIN = 1111;
        public static final int MONTHLY_LIMIT_REACHED = 1123;
        public static final int NO_ERROR = 0;
        public static final int NO_GEO_FOR_STORE = 1102;
        public static final int NO_RECEIPTS = 2115;
        public static final int NO_SAVER_SUMMARY = 2110;
        public static final int RECEIPT_ALREADY_PROCESSING = 1117;
        public static final int RECEIPT_ALREADY_SUBMITTED = 1118;
        public static final int RECEIPT_NOT_FOUND = 2116;
        public static final int RECEIPT_NOT_IN_SAVER = 1122;
        public static final int RECEIPT_TOO_OLD = 1121;
        public static final int TRY_AGAIN = 1114;
        public static final int UNABLE_PROCESS_REQUEST = 5110;
        public static final int UNKNOWN_ERROR = 1;
        public static final int WEEKLY_LIMIT_REACHED = 1124;
    }


    public BackendError backendError;
    public String error;
    public String message;
    public String reason;
    public int statusCode;

    public StatusResponse()
    {
    }

    public int getErrorCode()
    {
        if (backendError != null && backendError.errors != null && !backendError.errors.isEmpty())
        {
            BackendError.Error error1 = (BackendError.Error)backendError.errors.get(0);
            int i;
            try
            {
                i = Integer.parseInt(error1.code);
            }
            catch (Exception exception)
            {
                return 1;
            }
            return i;
        } else
        {
            return statusCode;
        }
    }
}
