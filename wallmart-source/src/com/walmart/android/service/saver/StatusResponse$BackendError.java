// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.service.saver:
//            StatusResponse

public static class errors
{
    public static class Error
    {

        public String category;
        public String code;
        public String description;
        public String severity;

        public Error()
        {
        }
    }

    public static interface ErrorCodes
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


    public List errors;
    public String status;

    public ErrorCodes()
    {
        errors = new ArrayList();
    }
}
